package com.bsoftgroup.springcloudmanagementproperties.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("connection")   //prefix: connection.url
@Getter
@Setter
@NoArgsConstructor
@ToString
public class DataSourceConfig {

    //Use properties retrieved for Config Server properties (see application.yml)

    private String driverClassname;
    private String url;
    private String username;
    private String password;

}
