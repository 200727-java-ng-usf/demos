package com.revature.bobcat;

import com.revature.bobcat.handlers.RootHandler;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class AppDriver {

	public static void main(String[] args) {

		try {
			HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
			System.out.println("Revature Bobcat server started on port 8080");
			server.createContext("/", new RootHandler());

			server.createContext("/favicon.ico", exchange -> {
				exchange.sendResponseHeaders(404, 0);
				try(OutputStream outputStream = exchange.getResponseBody()){
				    outputStream.write(null);
				}

			});

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

			server.start();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
