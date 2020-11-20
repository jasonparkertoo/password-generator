package info.jasonparker.password.resources;

import info.jasonparker.password.service.PasswordService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/password")
public class PasswordResource {

    private final PasswordService service = new PasswordService();

    @GET
    @Path("/{length}")
    public Response getPasswordWithDefaultRules(@PathParam("length") int length) {
        String pwd = service.getPassword(length);
        return Response.ok(pwd).build();
    }
}
