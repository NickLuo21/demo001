package com.nick;

import com.nick.restful.DemoResource;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Nick on 2017/3/11.
 */
public class DemoApplication extends Application {

    private Set<Object> singletons = new HashSet<>();

    public DemoApplication() {
        singletons.add(new DemoResource());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
