package com.revature.jsonservlet;

import com.revature.model.servlet.RequestHelper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * JSON javascript object notaion
 *  used to transmit data in a platform independent way
 *      key value pairs
 * not a javascipt object
 *
 * (backgound in js  {}is an object)
 *                  []is an array)
 *                  "" is an string)
 * examples of jsons
 * {
 *     "child1":
 *             {
 *                 "grandchild1":35
 *                 "grandchild2": barnicles
 *                 "grandchild3": hello
 *             }
 *     "child2": 50
 * }
 * Another ex of a JSON
 * [35, "barnicles", 78]
 *  Basically, an array is a valid JSON
 *
 *
 *
 * example of xml
 * <xml>
 *     <child1>
 *         <grandchild1>35</grandchild1>
 *         <grandchild2>barnicles</grandchild2>
 *         <grandchild3> hollo </grandchild3>
 *     </child1>
 *     <child2> 50 </child2>
 * </xml>
 */

public class JsonMasterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.getRequestDispatcher(("String").process(req)).forward(req,resp);
        JsonRequestHelper.process(req,resp);
        //resp.getWriter().write("in get");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.getWriter().write("in post");
        //req.getRequestDispatcher(RequestHelper.process(req)).forward(req,resp);
        JsonRequestHelper.process(req,resp);
    }
}
