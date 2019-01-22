package com.gmail.morovo1988.testRest.factories;

import com.gmail.morovo1988.testRest.domain.Document;

public class DocumentFactory {
    public static final String DOCUMENT_id = "4f6d6dc59d1844bb80143ccc2e727a2f";

    public static final String DOCUMENT_title = "11.09.2018.xlsx";

    public static final String DOCUMENT_documentType = "subContract";

    public static final String DOCUMENT_hash = "md5:232dba893a22ac722249ad92f8bccf22";

    public static final String DOCUMENT_datePublished = "2018-09-19T13:12:21.136232+03:00";

    public static final String DOCUMENT_documentOf = "tender";

    public static final String DOCUMENT_format = "text/plain";

    public static final String DOCUMENT_url = "https://public-docs-sandbox.prozorro.gov.ua/get/3500487074064bd98f1076c21fe69e9a?KeyID=1331dc52&Signature=w%252BTQLJCiU%2FDQXfp%2FxB0VfDNRzImPv7zch3e8H1jfVOZrDJZuam%2FOTVLlvpdUiz9WVLHdUzdMrQJclbl4Vs28CQ%253D%253D";

    public static final String DOCUMENT_dateModified = "2018-09-19T13:12:21.136263+03:00";

    public DocumentFactory() {
    }

    public static Document createDocument() {
        return new Document(
            DocumentFactory.DOCUMENT_id,
            DocumentFactory.DOCUMENT_dateModified,
            DocumentFactory.DOCUMENT_datePublished,
            DocumentFactory.DOCUMENT_documentOf,
            DocumentFactory.DOCUMENT_documentType,
            DocumentFactory.DOCUMENT_format,
            DocumentFactory.DOCUMENT_hash,
            DocumentFactory.DOCUMENT_title,
            DocumentFactory.DOCUMENT_url
        );
    }
}
