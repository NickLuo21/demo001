package com.nick.restful;

import com.nick.model.DemoEntity;
import com.nick.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Nick on 2017/3/11.
 */
@Path("/demo")
public class DemoResource {

    @Autowired
    private DemoService demoService;

    @GET
    @Path("/users")
    @Produces(MediaType.APPLICATION_JSON)
    public List<DemoEntity> getAllUsers()
    {
//        return Response.ok(entities).build();
//        demoService = (DemoService) SpringApplicationContext.getBean("demoService");
        List<DemoEntity> entities = demoService.getAllEntities();
        return entities;
    }

    @GET
    @Path("/user/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public DemoEntity getUserById(@PathParam("id") String id)
    {
        DemoEntity entity = demoService.getEntityById(Long.valueOf(id));
        return entity;
    }
}
