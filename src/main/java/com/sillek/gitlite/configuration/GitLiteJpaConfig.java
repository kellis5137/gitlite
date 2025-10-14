//jdbc.driverClassName=org.h2.Driver
//spring.application.name=gitlite
//spring.datasource.url=jdbc:h2:mem:myDb;DB_CLOSE_DELAY=-1;NON_KEYWORDS=KEY,VALUE
//spring.datasource.driver-class-name=org.h2.Driver
//spring.jpa.hibernate.ddl-auto=create
//spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
//spring.jpa.show-sql=true
package com.sillek.gitlite.configuration;
//
//import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.AbstractDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class GitLiteJpaConfig {

    @Autowired
    private Environment env;

    @Bean
    public AbstractDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.password"));

        return dataSource;
    }

}