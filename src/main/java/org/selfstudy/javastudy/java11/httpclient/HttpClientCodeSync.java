package org.selfstudy.javastudy.java11.httpclient;

import lombok.extern.java.Log;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

@Log
public class HttpClientCodeSync {

    private static final HttpClient HTTP_CLIENT = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();

    public static void main(String[] args){
        HttpResponse<String> httpResponse = null;
        try{
            String uri = "https://postman-echo.com/get";
            HttpRequest httpRequest = HttpRequest.newBuilder(new URI(uri+"?foo1=bar1&foo2=bar2")).build();
            httpResponse = HTTP_CLIENT.send(httpRequest,HttpResponse.BodyHandlers.ofString());
        }catch (Exception ex){
            log.severe("Exception occured: "+ex.getMessage());
        }
        log.info("Response Code: "+httpResponse.statusCode());
        log.info("Response Header: "+httpResponse.headers());
        log.info("Response Body: "+httpResponse.body());
    }
}

