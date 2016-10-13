package com.zchao;

import org.glassfish.jersey.servlet.ServletContainer;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Created by haozhichao on 2016/10/13.
 */

@WebServlet(
        initParams = @WebInitParam(name = "jersey.config.server.provider.packages", value = "com.zchao"),
        urlPatterns = "webapi/*",
        loadOnStartup = 1
)
public class AirServlet extends ServletContainer {
}
