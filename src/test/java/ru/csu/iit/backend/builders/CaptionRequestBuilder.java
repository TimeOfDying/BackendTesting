package ru.csu.iit.backend.builders;

import io.restassured.specification.RequestSpecification;

public class CaptionRequestBuilder {

    private RequestSpecification requestSpecification;

    public CaptionRequestBuilder(RequestSpecification requestSpecification) {
        this.requestSpecification = requestSpecification;
    }

    public CaptionRequestBuilder getFields(String... fields) {
        requestSpecification.body(fields);
        return this;
    }

    public RequestSpecification build() {

        return requestSpecification;
    }


}
