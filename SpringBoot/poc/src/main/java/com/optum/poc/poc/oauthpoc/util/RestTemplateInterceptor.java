package com.optum.poc.poc.oauthpoc.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;

/**
 * Interceptor class to log all request/response objects for api calls.
 */
public class RestTemplateInterceptor implements ClientHttpRequestInterceptor {
    private static final Logger LOGGER = LoggerFactory.getLogger(RestTemplateInterceptor.class);

    @Override
    public ClientHttpResponse intercept(HttpRequest httpRequest, byte[] bytes,
                                        ClientHttpRequestExecution clientHttpRequestExecution) throws IOException {

        if (httpRequest.getHeaders() != null && httpRequest.getHeaders().get(HttpHeaders.AUTHORIZATION) == null) {
            httpRequest.getHeaders().add(HttpHeaders.AUTHORIZATION, "Bearer ekxien3pfn235dlkj3f03ng" );
        }
        logRequest(httpRequest, bytes);
        ClientHttpResponse response = clientHttpRequestExecution.execute(httpRequest, bytes);
        logResponse(response);
        return response;
    }

    private static void logResponse(ClientHttpResponse response) throws IOException {
        String responseBody = StreamUtils.copyToString(response.getBody(), Charset.defaultCharset());
        LOGGER.info("Status code  : {} , Status text : {} ", response.getStatusCode(), response.getStatusText());
        LOGGER.debug("Response Body: {}", responseBody);

    }

    private static void logRequest(HttpRequest httpRequest, byte[] bytes) {
        String payload = new String(bytes, Charset.defaultCharset());
        LOGGER.info("URI : {}, Method : {}, Headers : {}", httpRequest.getURI(),
                httpRequest.getMethod(), httpRequest.getHeaders());
        LOGGER.debug("request Body : {}", payload);

    }

}
