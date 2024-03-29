package com.sungjoonhong.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import lombok.Data;

@Configuration
@PropertySources({
    @PropertySource( value = "file:/Users/hong/Desktop/Joon/env/config.properties", ignoreResourceNotFound = true ),
    @PropertySource( value = "file:${user.home}/env/config.properties", ignoreResourceNotFound = true)
})
public @Data class GlobalPropertySource {

	@Value("${spring.datasource.driverClassName}")
    private String driverClassName;
    
    @Value("${spring.datasource.url}")
    private String url;
    
    @Value("${spring.datasource.username}")
    private String username;
    
    @Value("${spring.datasource.password}")
    private String password;
 
//    public String getDriverClassName() {
//        return driverClassName;
//    }
// 
//    public String getUrl() {
//        return url;
//    }
// 
//    public String getUsername() {
//        return username;
//    }
// 
//    public String getPassword() {
//        return password;
//    }


}
