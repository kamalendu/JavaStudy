package org.selfstudy.javastudy.java11.httpclient;

import lombok.extern.java.Log;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

@Log
public class HttpClientCodeAsync {
    private static HttpClient client = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(10))
            .followRedirects(HttpClient.Redirect.ALWAYS)
            .build();
    private static final List<URI> URIS = Stream.of(
            "https://www.google.com/",
            "https://www.github.com/",
            "https://www.ebay.com/",
            "http://www.lalatemp.com/"
    ).map(URI::create).collect(toList());
    public static void main(String[] args){
        CompletableFuture[] futures = URIS.stream().map(HttpClientCodeAsync::verifyUri).toArray(CompletableFuture[]::new);
        CompletableFuture.allOf(futures).join();
    }
    private static CompletableFuture<Void> verifyUri(URI uri){
        HttpRequest request = HttpRequest.newBuilder().timeout(Duration.ofSeconds(5)).uri(uri).build();
        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::statusCode)
                .thenApply(statusCode -> statusCode==200)
                .exceptionally( __ -> false)
                .thenAccept(valid -> {
                    if(valid){
                        log.info("Good URI: "+uri);
                    }else{
                        log.info("Bad URI: "+uri);
                    }
                });
    }
}
