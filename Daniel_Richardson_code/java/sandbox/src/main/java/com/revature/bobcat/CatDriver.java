package com.revature.bobcat;

import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public class CatDriver {

    public static void main(String[] args) {
        try{
            HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
            System.out.println("Server started on 8080");
            server.createContext("/", new RootHandler());

            server.start();

        } catch(Exception e){

        }



    }
}
