package com.fast.core.order.feignclient;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.fast.account.api.AccountApi;

@FeignClient(AccountApi.SERVICE_HOSTNAME)
public interface AccountApiFeignClient extends AccountApi{

}
