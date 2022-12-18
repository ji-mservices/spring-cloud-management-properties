package com.bsoftgroup.springcloudmanagementproperties.controller;

import com.bsoftgroup.springcloudmanagementproperties.config.DataSourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConnectionDataController {

    @Autowired
    private DataSourceConfig dataSourceConfig;  //Create a connection fabric previously configured

    //Expose the configuration retrieved for Config Server
    @GetMapping(path = "connection-data")
    public DataSourceConfig getConnectionData() {
        return dataSourceConfig;
    }
}
