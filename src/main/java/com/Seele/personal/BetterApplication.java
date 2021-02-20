package com.Seele.personal;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.time.Duration;
import java.time.Instant;

@SpringBootApplication
@ComponentScan(basePackages = {"com.Seele.personal"})
@MapperScan("com.Seele.personal.dao")
public class BetterApplication {

	private static final Logger log = LoggerFactory.getLogger(BetterApplication.class);

	public static void main(String[] args) {
		Instant start = Instant.now();
		SpringApplication.run(BetterApplication.class, args);
		log.info("=== BetterApplication start success! cost time {} ms", Duration.between(start, Instant.now()).toMillis());
	}

}
