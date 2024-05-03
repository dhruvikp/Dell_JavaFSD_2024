package com.simplilearn.jdk11;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class HttpClientExample {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();

		HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://jsonplaceholder.typicode.com/posts/1"))
				.build();

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		System.out.println(response.body());

		CompletableFuture<HttpResponse<String>> futureResponse = client.sendAsync(request,
				HttpResponse.BodyHandlers.ofString());

		futureResponse.thenAccept(res -> System.out.println(res.body()));

	}
}
