package com.leyou.goods.controller;

import com.leyou.goods.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by Enzo Cotter on 2020/4/6.
 */
@Controller
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @Autowired
    private GoodsHtmlService goodsHtmlService;
    @GetMapping("item/{id}.html")
    public String toItemPage(Model model, @PathVariable("id")Long id){
    Map<String,Object> map =this.goodsService.loadData(id);
    model.addAllAttributes(map);
    this.goodsHtmlService.createHtml(id);
        return "item";
    }
}
