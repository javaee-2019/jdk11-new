package com.shanmu2020.jdk11.httpapi;

import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.ByteBuffer;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Flow;

public class HttpTest {
    @Test
    public void test5() throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://www.baidu.com/"))
                .build();
        HttpClient client = HttpClient.newHttpClient();
        // 同步
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        // 异步
        CompletableFuture<HttpResponse<String>> sendAsync = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
        //这里会阻塞
        HttpResponse<String> response1 = sendAsync.get();
        System.out.println(response1.body());
    }

    @Test
    public void test31() throws Exception {
        HttpRequest.BodyPublisher bodyPublisher = HttpRequest.BodyPublishers
                .ofString("{ 我是body }");
        HttpRequest request = HttpRequest.newBuilder().POST(bodyPublisher).uri(URI.create("")).build();
        HttpClient httpClient = HttpClient.newHttpClient();
        httpClient.send(request,HttpResponse.BodyHandlers.ofString());
    }
}
