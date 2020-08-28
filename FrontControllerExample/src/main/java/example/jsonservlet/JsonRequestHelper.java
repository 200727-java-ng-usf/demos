package example.jsonservlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import example.controller.DannyBoyController;
import example.controller.MarsController;
import example.model.SuperVillain;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JsonRequestHelper {

    public static void process(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        System.out.println(req.getRequestURI());

        // prune ending of URI string and put into a select statement?

        switch(req.getRequestURI()) {
            case "/anotherexample/json/dannyboy":
                DannyBoyController.dannyFinder(req, resp);
                break;
            case "/anotherexample/json/mars":
                MarsController.marsFinder(req, resp);
            default:
                SuperVillain nullVill = new SuperVillain(null, null, 0);
                resp.getWriter().write(new ObjectMapper().writeValueAsString(nullVill));
        }
    }

}
