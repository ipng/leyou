package com.leyou.item.controller;

import com.leyou.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Enzo Cotter on 2020/3/10.
 */
@Controller
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
}
