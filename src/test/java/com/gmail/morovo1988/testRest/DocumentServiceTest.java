package com.gmail.morovo1988.testRest;

import com.gmail.morovo1988.testRest.domain.Document;
import com.gmail.morovo1988.testRest.factories.DocumentFactory;
import com.gmail.morovo1988.testRest.repositories.DocumentRepository;
import com.gmail.morovo1988.testRest.services.DocumentService;
import com.gmail.morovo1988.testRest.services.DocumentServiceImpl;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

public class DocumentServiceTest {
    @Mock
    private DocumentRepository repository;

    private DocumentService service;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        this.service = new DocumentServiceImpl(this.repository);

    }

    @Test
    public void shouldSaveListDocuments() {
        Document document = DocumentFactory.createDocument();
        List<Document> documents = Arrays.asList(document);

        when(this.service.saveDocuments(Collections.singletonList(document))).thenReturn(Collections.singletonList(document));

        List<Document> documentList = this.service.saveDocuments(documents);

        verify(this.repository).saveAll(documents);

        assertThat(documentList).isNotNull().hasSize(1).contains(document);

    }
}
