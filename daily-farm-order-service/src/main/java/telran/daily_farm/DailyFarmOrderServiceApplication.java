package telran.daily_farm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableFeignClients

@EnableScheduling
public class DailyFarmOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DailyFarmOrderServiceApplication.class, args);
	}

}
