package info.jasonparker.password;

import info.jasonparker.password.exceptions.PasswordExceptionMapper;
import info.jasonparker.password.resources.PasswordResource;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

public class PasswordApp extends ResourceConfig {
    public PasswordApp() {
        register(PasswordExceptionMapper.class);
        register(PasswordResource.class);
        packages(true, "info.jasonparker");
    }

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ServletContextHandler ctx = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);

        ctx.setContextPath("/");
        server.setHandler(ctx);

        ServletHolder servletHolder = ctx.addServlet(ServletContainer.class, "/api/v1/*");
        servletHolder.setInitOrder(1);
        servletHolder.setInitParameter("jersey.config.server.provider.packages",
                                       "info.jasonparker.password");

        server.start();
        server.join();
    }
}
