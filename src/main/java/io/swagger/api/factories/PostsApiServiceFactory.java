package io.swagger.api.factories;

import io.swagger.api.PostsApiService;
import io.swagger.api.impl.PostsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-11-07T12:35:50.314Z")
public class PostsApiServiceFactory {
    private final static PostsApiService service = new PostsApiServiceImpl();

    public static PostsApiService getPostsApi() {
        return service;
    }
}
