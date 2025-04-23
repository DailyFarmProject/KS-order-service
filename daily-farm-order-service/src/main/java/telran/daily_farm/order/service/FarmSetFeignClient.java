package telran.daily_farm.order.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import telran.daily_farm.order.api.dto.FarmSetRequestForCancelOrderDto;
import telran.daily_farm.order.api.dto.FarmSetRequestForOrderDto;
import telran.daily_farm.order.api.dto.FarmSetResponseForOrderDto;


@FeignClient(name = "daily-farm")
public interface FarmSetFeignClient {

	@PutMapping("/farm-set/order")
	FarmSetResponseForOrderDto decreaseStock(@RequestBody FarmSetRequestForOrderDto request);
	
	@PutMapping("/farm-set/cancel_order")
	void increaseStock(@RequestBody FarmSetRequestForCancelOrderDto request);
}
