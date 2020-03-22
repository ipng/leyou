package com.leyou.item.mapper;

import com.leyou.item.pojo.Category;
import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by Enzo Cotter on 2020/3/10.
 */
public interface CategoryMapper extends Mapper<Category>, SelectByIdListMapper<Category,Long> {
}
