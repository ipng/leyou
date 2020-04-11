package com.leyou.goods.client;

import com.leyou.item.api.GoodsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by Enzo Cotter on 2020/4/5.
 */
@FeignClient(value = "item-service")
public interface GoodsClient extends GoodsApi {

}
