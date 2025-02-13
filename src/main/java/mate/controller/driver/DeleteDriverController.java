package mate.controller.driver;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mate.lib.Injector;
import mate.service.DriverService;

public class DeleteDriverController extends HttpServlet {
    private static final Injector injector =
            Injector.getInstance("mate");
    private final DriverService driverService =
            (DriverService) injector.getInstance(DriverService.class);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        Long id = Long.valueOf(req.getParameter("id"));
        driverService.delete(id);
    }
}
