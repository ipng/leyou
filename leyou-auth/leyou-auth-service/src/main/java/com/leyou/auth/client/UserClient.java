package com.leyou.auth.client;

import com.leyou.user.api.UserApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by Enzo Cotter on 2020/5/1.
 */
@FeignClient("user-service")
public interface UserClient extends UserApi {
}
