package com.gmail.morovo1988.testRest.services;

import com.gmail.morovo1988.testRest.domain.Document;

import java.util.List;

public interface DocumentService {

    List<Document> saveDocuments(List<Document> documents);
}
