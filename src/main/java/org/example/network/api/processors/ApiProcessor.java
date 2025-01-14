package org.example.network.api.processors;

import com.sun.net.httpserver.HttpExchange;
import org.example.network.api.ApiRequest;
import org.example.network.api.response.ApiResponse;

public abstract class ApiProcessor {
    public int priority = 1;
    public abstract boolean matches(ApiRequest request);
    public abstract ApiResponse process(ApiRequest request, HttpExchange exchange);
}