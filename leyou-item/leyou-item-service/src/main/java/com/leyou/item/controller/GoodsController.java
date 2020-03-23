package com.leyou.item.controller;

import com.leyou.commmon.pojo.PageResult;
import com.leyou.item.bo.SpuBo;
import com.leyou.item.pojo.*;
import com.leyou.item.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/22.
 */
@Controller
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping("spu/page")
    public ResponseEntity<PageResult<SpuBo>> querySpuByPage(
            @RequestParam(value = "key",required = false) String key,
            @RequestParam(value = "saleable",required = false) Boolean saleable,
            @RequestParam(value = "page",defaultValue = "1") Integer page,
            @RequestParam(value = "rows",defaultValue = "5") Integer rows
    ){
        PageResult<SpuBo> result=this.goodsService.querySpuByPage(key,saleable,page,rows);
        if (result==null|| CollectionUtils.isEmpty(result.getItems())){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(result);
    }
    @PostMapping("goods")
    public ResponseEntity<Void> saveGoods(@RequestBody SpuBo spuBo){
        this.goodsService.saveGoods(spuBo);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @GetMapping("spu/detail/{spuId}")
    public ResponseEntity<SpuDetail> querySpudetailBySpuId(@PathVariable("spuId")Long spuId){
        SpuDetail spuDetail= this.goodsService.querySpuDetailBySpuId(spuId);
        if (spuDetail==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(spuDetail);
    }
    @GetMapping("sku/list")
    public ResponseEntity<List<Sku>> querySkusBySpuId(@RequestParam("id")Long spuId){
        List<Sku> skus=this.goodsService.querySkusBySpuId(spuId);
        if (CollectionUtils.isEmpty(skus)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(skus);
    }
    @PutMapping("goods")
    public ResponseEntity<Void> updateGoods(@RequestBody SpuBo spuBo){
        this.goodsService.updateGoods(spuBo);
        return ResponseEntity.noContent().build();
    }

}
