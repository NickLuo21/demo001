package com.nick.restful;

import com.nick.model.DemoEntity;
import com.nick.service.DemoService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Nick on 2017/3/11.
 */
@Path("/demo")
@Api(value = "users", description = "Endpoint for User specific operations")
public class DemoResource {

    @Autowired
    private DemoService demoService;

    @GET
    @Path("/users")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Returns all user details", notes = "Returns all user details.", response = DemoEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful retrieval of user entity", response = DemoEntity.class),
            @ApiResponse(code = 404, message = "User with given uuid does not exist"),
            @ApiResponse(code = 500, message = "Internal server error") }
    )
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
    @ApiOperation(value = "Returns user details", notes = "Returns user details.", response = DemoEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful retrieval of user entity", response = DemoEntity.class),
            @ApiResponse(code = 404, message = "User with given uuid does not exist"),
            @ApiResponse(code = 500, message = "Internal server error") }
    )
    public DemoEntity getUserById(@ApiParam(value = "userId") @PathParam("id") String id)
    {
        DemoEntity entity = demoService.getEntityById(Long.valueOf(id));
        return entity;
    }
}
