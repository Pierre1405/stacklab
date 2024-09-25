package com.stacklabs.gateway

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.fail

@SpringBootTest
class GatewayApplicationTests {

	@Test
	fun contextLoads() {
	}	@Test
	fun failedTest() {
		fail("Test failed")
	}

}
