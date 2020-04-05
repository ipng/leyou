package com.leyou.item.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
/**
 * Created by Enzo Cotter on 2020/4/5.
 */

@RequestMapping("category")
public interface CategoryApi {

    @GetMapping("names")
    public List<String> queryNameByIds(@RequestParam("ids") List<Long> ids);
}
