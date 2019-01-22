package com.gmail.morovo1988.testRest.external;

import com.gmail.morovo1988.testRest.domain.Document;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.List;

public class ExternalData {

    private OkHttpClient client = new OkHttpClient();

    public  String getJson(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();


        Response response = client.newCall(request).execute();
        return  response.body().string();
    }

    public List<Document> getDocumentsFromApi(String url) {
        String json = null;
        try {
            json = getJson(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();

        Data data = gson.fromJson(json, Data.class);

        return data.getData();

    }
}
