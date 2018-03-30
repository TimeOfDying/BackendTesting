package ru.csu.iit.backend.services;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.util.Properties;

import static io.restassured.RestAssured.given;

public class BaseService {
    private final RequestSpecification spec;
    private Properties properties;

    public BaseService(Properties properties, String... id) {
        String ID = "";
        if(id.length>0) ID=id[0]+"/";

        this.properties = properties;
        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri(properties.getProperty("base_uri"))
                .setBasePath(properties.getProperty("base_path") + ID)
                .addFilter(new ResponseLoggingFilter())
                .addFilter(new RequestLoggingFilter())
                .addQueryParam("api_key", properties.getProperty("api_key"))
                .build();
    }

    protected RequestSpecification baseRequest() {
        return given().spec(spec);
    }
}
