package com.revature.bobcat.handler;

import javax.xml.ws.spi.http.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLOutput;

public class RootHandler {

    public void handle(HttpExchange httpExchange) throws IOException {
        System.out.println(httpExchange.getRequestMethod() + "request recieved at: " + httpExchange.getRequestURI());
        String responseContent = "<h1> Request recieved and processed! Heres the response</h1>";
        //httpExchange.sendResponseHeaders(200, responseContent.length());

        try (OutputStream outputStream = httpExchange.getResponseBody()){

        }
    }
}
