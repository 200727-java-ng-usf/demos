package com.revature.bobcat;

import com.revature.bobcat.handlers.Roothandler;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class AppDriver {
    public static void main(String[] args) {

        try {

            HttpServer server = HttpServer.create(new InetSocketAddress(8080),0);
            System.out.println("Revature Bobcat server started on port 8080");

            server.createContext("/",new Roothandler());

            server.createContext("/local-anon-class", new HttpHandler() {
                @Override
                public void handle(HttpExchange httpExchange) throws IOException {
                    System.out.println(httpExchange.getRequestMethod()
                            + " request received at: " + httpExchange.getRequestURI());

                    String responseContent = " <h1> Request received I also received this one!</1";
                    httpExchange.sendResponseHeaders(200,responseContent.length());


                    try(OutputStream outputStream = httpExchange.getResponseBody()) {

                        outputStream.write(responseContent.getBytes());
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            });

            server.start();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
