package com.leyou.goods.client;

import com.leyou.item.api.BrandApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by Enzo Cotter on 2020/4/5.
 */

@FeignClient("item-service")
public interface BrandClient extends BrandApi {
}
