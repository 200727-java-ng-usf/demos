package com.revature;

import com.sun.net.httpserver.HttpHandler;

public class AppDriver {

    try {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        System.out.println("Revature Bobcat server started on port 8080");
        server.createContext("/", new RootHandler());
        server.createContext("/local-anon-class", new HttpHandler() {
            @Override
            public void handle(HttpExchange httpExchange) throws IOException {
                System.out.println(httpExchange.getRequestMethod() + " request received at: " + httpExchange.getRequestURI());
                String responseContent = "<h1>Request received and processed! Here's the response! Btw: this was handled by a local anon class</h1>";
                httpExchange.sendResponseHeaders(200, responseContent.length());
                try (OutputStream outputStream = httpExchange.getResponseBody()) {
                    outputStream.write(responseContent.getBytes());
                }
            }
        });
        server.createContext("/lambda", httpExchange -> {
            System.out.println(httpExchange.getRequestMethod() + " request received at: " + httpExchange.getRequestURI());
            String responseContent = "<h1>Request received and processed! Here's the response! Btw: this was processed by a lambda expression!</h1>";
            httpExchange.sendResponseHeaders(200, responseContent.length());
            try (OutputStream outputStream = httpExchange.getResponseBody()) {
                outputStream.write(responseContent.getBytes());
            }
        });
    } catch (Exception e) {
        e.printStackTrace();
    }
}
