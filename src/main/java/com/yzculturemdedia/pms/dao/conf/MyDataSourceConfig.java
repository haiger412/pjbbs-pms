package com.yzculturemdedia.pms.dao.conf;
import javax.sql.DataSource;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration 
public class MyDataSourceConfig {
   public DataSource datasource(Environment env) {
	   HikariDataSource ds = new HikariDataSource();
	   ds.setJdbcUrl(env.getProperty("spring.datasource.url"));
	   ds.setUsername(env.getProperty("spring.datasource.username"));
	   ds.setPassword( env.getProperty( "spring.datasource.password"));
	   ds.setDriverClassName( env.getProperty( "spring.datasource.driver-class-name"));
	   ds.setMaximumPoolSize(Integer.valueOf( env.getProperty("spring.datasource.max-pool-size") ));
	   System.out.println("过来");
	   return ds;
   }
}
