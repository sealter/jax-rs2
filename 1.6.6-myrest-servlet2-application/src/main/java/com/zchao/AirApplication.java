package com.zchao;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by haozhichao on 2016/10/13.
 */
public class AirApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> set = new HashSet<>();
        set.add(MyResource.class);
        return set;
    }
}
