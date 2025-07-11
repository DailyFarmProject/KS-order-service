package telran.daily_farm.order.controller;


import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import telran.daily_farm.order.api.dto.CreateOrderRequestDto;
import telran.daily_farm.order.api.dto.CreateOrderResponseDto;
import telran.daily_farm.order.service.OrderService;


import static telran.daily_farm.order.api.OrderServiceApiConstants.*;


@RestController
@Slf4j
@RequiredArgsConstructor
public class OrderController {

	private final OrderService orderServise;

	    
   // @PreAuthorize("hasRole('ROLE_CUSTOMER')")
	@PostMapping(CREATE_ORDER)
	public ResponseEntity<CreateOrderResponseDto> createOrder(@Valid @RequestBody CreateOrderRequestDto request
//			,@AuthenticationPrincipal UserDetailsWithId user, @RequestHeader("Authorization") String token
			) {
		
		log.info("new service start");
		CreateOrderResponseDto response = orderServise.createOrder(request.getFarmSetId(), request.getCustomerId()); // , user.getId()
		
		log.info("Order controller: response ( sum - {} , link - {}", response.getSumOfOrder(), response.getPaymentLink());
		
		return  ResponseEntity.ok(response);
	}
	@GetMapping("/order/test")
	public String test() {
		return "Order service is working through Gateway!";
	}

}
