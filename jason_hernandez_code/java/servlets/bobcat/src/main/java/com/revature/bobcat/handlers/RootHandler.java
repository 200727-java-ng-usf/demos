package com.revature.bobcat.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class RootHandler implements HttpHandler {

    public void handle(HttpExchange httpExchange) throws IOException {
        System.out.println();
        String responseContent = "<h1>R";
        httpExchange.sendResponseHeaders(200, responseContent.length());

        try (OutputStream outputStream = httpExchange.getResponseBody()) {
            outputStream.write()
        }
    }
}
