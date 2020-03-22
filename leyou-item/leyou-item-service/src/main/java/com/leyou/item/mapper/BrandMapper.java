package com.leyou.item.mapper;


import com.leyou.item.pojo.Brand;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/15.
 */
public interface BrandMapper extends Mapper<Brand> {
    @Insert("INSERT INTO tb_category_brand (category_id,brand_id) VALUES (#{cid},#{bid})")
    void insertCategoryAndBrand(@Param("cid") Long cid, @Param("bid") Long bid);
    @Select("SELECT * FROM tb_brand a INNER JOIN tb_category_brand b ON a.id=b.brand_id WHERE b.category_id=#{cid}")
    List<Brand> selectBrandsByCid(Long cid);
}
