package telran.daily_farm.order.api.dto;



import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CreateOrderRequestDto {
	
	@NotNull
	private UUID farmSetId;
	
	@NotNull
	private UUID customerId;
}
