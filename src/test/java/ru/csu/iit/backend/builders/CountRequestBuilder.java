package ru.csu.iit.backend.builders;

import io.restassured.specification.RequestSpecification;

public class CountRequestBuilder {

    private RequestSpecification requestSpecification;

    public CountRequestBuilder(RequestSpecification requestSpecification) {
        this.requestSpecification = requestSpecification;
    }

    public RequestSpecification build() {

        return requestSpecification;
    }

}
