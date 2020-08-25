package com.revature.bobcat.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class Roothandler implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {

        System.out.println(httpExchange.getRequestMethod()
                + " request received at: " + httpExchange.getRequestURI());

        String responseContent = " <h1> Request received !</1";
        httpExchange.sendResponseHeaders(200,responseContent.length());


        try(OutputStream outputStream = httpExchange.getResponseBody()) {

            outputStream.write(responseContent.getBytes());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
