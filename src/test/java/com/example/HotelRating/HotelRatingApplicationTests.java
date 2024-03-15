package com.example.HotelRating;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")

class HotelRatingApplicationTests {

	@Test
	void contextLoads(Application Context) {
		assertThat(context).isNotNull();
	}

}
