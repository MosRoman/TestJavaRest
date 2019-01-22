package com.gmail.morovo1988.testRest.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Document {
    @Id
    private String id;

    private String dateModified;

    private String title;

    private String documentType;

    private String hash;

    private String datePublished;

    private String documentOf;

    private String format;

    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public String getDocumentOf() {
        return documentOf;
    }

    public void setDocumentOf(String documentOf) {
        this.documentOf = documentOf;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Document() {
    }

    public Document(final String id,
        final String dateModified,
        final String title,
        final String documentType,
        final String hash,
        final String datePublished,
        final String documentOf,
        final String format,
        final String url) {
        this.id = id;
        this.dateModified = dateModified;
        this.title = title;
        this.documentType = documentType;
        this.hash = hash;
        this.datePublished = datePublished;
        this.documentOf = documentOf;
        this.format = format;
        this.url = url;
    }

    @Override
    public String toString() {
        return "Document{" +
            "id='" + id + '\'' +
            ", dateModified='" + dateModified + '\'' +
            ", title='" + title + '\'' +
            ", documentType='" + documentType + '\'' +
            ", hash='" + hash + '\'' +
            ", datePublished='" + datePublished + '\'' +
            ", documentOf='" + documentOf + '\'' +
            ", format='" + format + '\'' +
            ", url='" + url + '\'' +
            '}';
    }
}
