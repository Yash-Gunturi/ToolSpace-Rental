/**
 * 
 */
package com.toolspace.web.spring;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

/**
 * Yash Gunturi
 */
@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
public class SpringConfig {
	
	@Autowired
	DataSource datasource;
	
	@Bean
	public JdbcTemplate jdbcTemplate() throws SQLException {
	    final JdbcTemplate template = new JdbcTemplate();
	    template.setDataSource(datasource);
	    template.afterPropertiesSet();
	    return template;
	}
	
}
