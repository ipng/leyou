package com.leyou.item.api;

import com.leyou.item.pojo.Brand;
import org.springframework.web.bind.annotation.*;
/**
 * Created by Enzo Cotter on 2020/4/5.
 */

@RequestMapping("brand")
public interface BrandApi {

    @GetMapping("/{id}")
    public Brand queryBrandByid(@PathVariable Long id);

}