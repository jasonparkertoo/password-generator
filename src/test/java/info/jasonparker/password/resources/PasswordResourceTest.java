package info.jasonparker.password.resources;

import info.jasonparker.password.exceptions.PasswordExceptionMapper;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

import static org.junit.Assert.assertEquals;

public class PasswordResourceTest extends JerseyTest {

    @Override
    protected Application configure() {
        ResourceConfig rc = new ResourceConfig();
        rc.register(PasswordExceptionMapper.class);
        rc.register(PasswordResource.class);
        return rc;
    }

    @Test
    public void givenARequestForARandomPassword_whenTheLengthGivenIsNotValid_thenA400IsReturned() {
        int length = 11;
        Response res = target("password/" + length).request().get();

        int expectedStatus = 400;
        int actualStatus = res.getStatus();

        assertEquals("Should return 400 Bad Request", expectedStatus, actualStatus);
    }

    @Test
    public void givenARequestForARandomPassword_whenTheLengthGivenIsValid_thenA200IsReturned() {
        int length = 12;
        Response res = target("password/" + length).request().get();

        int expectedStatus = 200;
        int actualStatus = res.getStatus();

        assertEquals("Should return 200 OK", expectedStatus, actualStatus);
    }
}