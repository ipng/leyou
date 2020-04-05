package com.leyou.search.client;

import com.leyou.item.api.SpecificationApi;
import org.springframework.cloud.openfeign.FeignClient;
/**
 * Created by Enzo Cotter on 2020/4/5.
 */
@FeignClient("item-service")
public interface SpecificationClient extends SpecificationApi {
}
