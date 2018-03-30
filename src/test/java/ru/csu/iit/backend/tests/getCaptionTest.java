package ru.csu.iit.backend.tests;

import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import ru.csu.iit.backend.services.CaptionService;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class getCaptionTest extends BaseTest {

    @Test(groups = "models")
    public void getCaptionQuery()
    {
        String id = getDatasetId();
        CaptionService captionService = new CaptionService(properties, id);
        RequestSpecification requestSpecification = captionService.request()
                .getFields("Caption")
                .build();

        String captionOfDataset =  captionService.execute(requestSpecification);
        assertThat(captionOfDataset, containsString("Адресный реестр объектов недвижимости города Москвы"));
    }
}
