package com.gmail.morovo1988.testRest.services;

import com.gmail.morovo1988.testRest.domain.Document;
import com.gmail.morovo1988.testRest.repositories.DocumentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DocumentServiceImpl implements DocumentService {
    private DocumentRepository repository;

    @Autowired
    public DocumentServiceImpl(final DocumentRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public List<Document> saveDocuments(List<Document> documents) {

        return this.repository.saveAll(documents);
    }
}
