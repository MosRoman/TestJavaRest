package com.gmail.morovo1988.testRest;

import com.gmail.morovo1988.testRest.domain.Document;
import com.gmail.morovo1988.testRest.external.ExternalData;
import com.gmail.morovo1988.testRest.services.DocumentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class TestRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestRestApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(final DocumentService service) {
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {

                String api = "https://lb-api-sandbox.prozorro.gov.ua/api/2.4/contracts/23567e24f52746ef92c470be6059d193/documents";
                String api2 = "https://lb-api-sandbox.prozorro.gov.ua/api/2.4/contracts/4805f381d48948b1b34d6ea2daa029a3/documents ";
                String api3 = "https://lb-api-sandbox.prozorro.gov.ua/api/2.4/contracts/47fa8764e1b74f4db58f84c9db460566/documents ";

                service.saveDocuments(new ExternalData().getDocumentsFromApi(api));
                service.saveDocuments(new ExternalData().getDocumentsFromApi(api2));
                service.saveDocuments(new ExternalData().getDocumentsFromApi(api3));

            }
        };
    }
}
