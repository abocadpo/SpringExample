package com.abocado.spring.ex.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages="com.abocado.spring.ex.*")
public class DatabaseConfig {
	
	
	
}
