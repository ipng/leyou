package com.leyou.item.controller;

import com.leyou.item.pojo.Category;
import com.leyou.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/10.
 */
@Controller
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 由父节点的ID查询子节点
     * @param pid
     * @return
     */
    @GetMapping("list")
    public ResponseEntity<List<Category>> queryNamesByIds(@RequestParam(value="pid",defaultValue = "0") Long pid) {

            if(pid == null||pid < 0){
//                400
//                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
                return ResponseEntity.badRequest().build();
            }
            List<Category> categories= this.categoryService.queryCategoriesByPid(pid);
            if(CollectionUtils.isEmpty(categories)){
//                404
//                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
                return ResponseEntity.notFound().build();
            }
//            200
            return ResponseEntity.ok(categories);

    }
}
