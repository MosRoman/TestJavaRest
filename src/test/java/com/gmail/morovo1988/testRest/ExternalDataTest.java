package com.gmail.morovo1988.testRest;

import com.gmail.morovo1988.testRest.external.ExternalData;
import java.io.IOException;
import org.junit.Test;

public class ExternalDataTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnExceptionWhenIncorectUrl() throws IOException {
        String api = "";
        ExternalData externalData= new ExternalData();
        externalData.getJson(api);
    }
}
