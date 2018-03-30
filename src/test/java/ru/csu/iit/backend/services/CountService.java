package ru.csu.iit.backend.services;
import io.restassured.specification.RequestSpecification;
import ru.csu.iit.backend.builders.CountRequestBuilder;

import java.util.Properties;


public class CountService extends BaseService{

    public CountService(Properties properties, String id) {
        super(properties,id);
    }

    public CountRequestBuilder request() {
        return new CountRequestBuilder(baseRequest());
    }

    public String execute(RequestSpecification requestSpecification) {
        return requestSpecification.get("count").then()
                .extract()
                .body().asString();
    }
}
