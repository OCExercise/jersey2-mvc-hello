package org.opencorrelate.exercise.jersey.hello.services;

import org.glassfish.jersey.server.mvc.Viewable;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("/")
public class HelloService
{

    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response doGet(
            @Context ServletContext servletContext,
            @Context HttpServletRequest req

    )
    {
        Map<String, String> model = new HashMap<String, String>() {
            {
                put("name", servletContext.getInitParameter("hello.name"));
            }
        };

        return Response.ok(new Viewable("/index.jsp", model)).build();
    }


    
}
