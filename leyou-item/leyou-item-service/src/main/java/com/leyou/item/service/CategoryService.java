package com.leyou.item.service;

import com.leyou.item.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Enzo Cotter on 2020/3/10.
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
}
