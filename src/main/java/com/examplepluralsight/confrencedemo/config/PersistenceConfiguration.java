package com.examplepluralsight.confrencedemo.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//setting env variable using java code
@Configuration
public class PersistenceConfiguration {
//	@Bean
//	public DataSource dataSource() {
//		DataSourceBuilder builder = DataSourceBuilder.create();
//		builder.url("jdbc:postgresql://localhost:5432/postgres");
//		System.out.println("My custom datasource bean has been initialized and set");
//		return builder.build();
//	}

}
