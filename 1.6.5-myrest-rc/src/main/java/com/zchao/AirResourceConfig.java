package com.zchao;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * Created by haozhichao on 2016/10/13.
 */
@ApplicationPath("/webapi/*")
public class AirResourceConfig extends ResourceConfig {

    public AirResourceConfig() {
        packages("com.zchao");
    }
}
