package com.leyou.search.repository;

import com.leyou.search.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by Enzo Cotter on 2020/4/5.
 */
public interface GoodsRepository extends ElasticsearchRepository<Goods,Long> {
}
