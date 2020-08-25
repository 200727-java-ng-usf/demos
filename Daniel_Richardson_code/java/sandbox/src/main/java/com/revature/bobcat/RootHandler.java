package com.revature.bobcat;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class RootHandler implements HttpHandler {


    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        System.out.println(httpExchange.getRequestMethod() + " from " + httpExchange.getRequestURI());
        String responseContent = "Yep.";
        System.out.println("");
        httpExchange.sendResponseHeaders(200, responseContent.length());
        OutputStream outputStream = httpExchange.getResponseBody();
        outputStream.write(responseContent.getBytes());

    }
}
