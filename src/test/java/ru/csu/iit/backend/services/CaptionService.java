package ru.csu.iit.backend.services;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import ru.csu.iit.backend.builders.CaptionRequestBuilder;

import java.util.Properties;

import static io.restassured.RestAssured.given;

public class CaptionService extends BaseService {


    public CaptionService(Properties properties, String id) {
        super(properties,id);

    }

    public CaptionRequestBuilder request() {
        return new CaptionRequestBuilder(baseRequest());
    }

    public String execute(RequestSpecification requestSpecification) {
        return requestSpecification.post().then()
                .extract()
                .body().asString();
    }
}
