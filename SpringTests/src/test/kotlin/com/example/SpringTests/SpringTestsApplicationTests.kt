package com.example.SpringTests

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringTestsApplicationTests(@Autowired val restTemplate: TestRestTemplate) {

	@Test
	fun `Assert title, content and status code`() {
		val entity = restTemplate.getForEntity<String>("/")
		assertThat(entity.body).contains("index1")
	}

}
