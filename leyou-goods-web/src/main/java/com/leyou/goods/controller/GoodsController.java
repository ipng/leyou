package com.leyou.goods.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Enzo Cotter on 2020/4/6.
 */
@Controller
public class GoodsController {
    @GetMapping("item/{id}.html")
    public String toItemPage(Model model, @PathVariable("id")Long id){

        return "item";
    }
}
