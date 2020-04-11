package com.leyou.item.api;

import com.leyou.commmon.pojo.PageResult;
import com.leyou.item.bo.SpuBo;
import com.leyou.item.pojo.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Created by Enzo Cotter on 2020/4/5.
 */

@Controller
public interface GoodsApi {
    @GetMapping("/spu/page")
    public PageResult<SpuBo> querySpuBoByPage(
            @RequestParam(value = "key", required = false) String key,
            @RequestParam(value = "saleable", required = false) Boolean saleable,
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "5") Integer rows
    );

    @PostMapping("/goods")
    public void saveGoods(@RequestBody SpuBo spuBo);

    @GetMapping("/spu/detail/{id}")
    public SpuDetail querySpuDetailBySpuId(@PathVariable Long id);


    @GetMapping("/sku/list")
    public List<Sku> querySkusBySpuId(@RequestParam Long id);

    @PutMapping("/goods")
    public void updateGoods(@RequestBody SpuBo spuBo);

    @GetMapping("{id}")
    public Spu querySpuById(@PathVariable("id")Long id);
}