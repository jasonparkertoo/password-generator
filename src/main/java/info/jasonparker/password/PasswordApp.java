package info.jasonparker.password;

import info.jasonparker.password.exceptions.PasswordExceptionMapper;
import info.jasonparker.password.resources.PasswordResource;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api/v1")
public class PasswordApp extends ResourceConfig {
    public PasswordApp() {
        register(PasswordExceptionMapper.class);
        register(PasswordResource.class);
        packages(true, "info.jasonparker");
    }
}
