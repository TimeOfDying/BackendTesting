package ru.csu.iit.backend.tests;

import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import ru.csu.iit.backend.services.CountService;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class getCountTest extends BaseTest {

    @Test(groups = "models")
    public void getCountOfRows() {
        String id = getDatasetId();
        CountService countService = new CountService(properties, id);
        RequestSpecification requestSpecification = countService.request()
                .build();
        String countOfRows = countService.execute(requestSpecification);

        assertThat(countOfRows, containsString("214734"));

    }
}
