package api;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.FilterHolder;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class JettyServer {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");

        // Добавляем сервлеты
        context.addServlet(new ServletHolder(new HelloServlet()), "/hello");
        context.addServlet(new ServletHolder(new AnotherApiServlet()), "/api/another");
        context.addServlet(new ServletHolder(new GetCity()), "/api/getCity");

        // Добавляем CORS-фильтр
        FilterHolder corsFilterHolder = new FilterHolder(new CORSFilter());
        context.addFilter(corsFilterHolder, "/*", null);

        server.setHandler(context);

        server.start();
        server.join();
    }
}
