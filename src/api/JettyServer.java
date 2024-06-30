package api;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class JettyServer {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");

        // Добавляем свой сервлет
        context.addServlet(new ServletHolder(new HelloServlet()), "/hello");

        server.setHandler(context);

        server.start();
        server.join();
    }
}
