package com.gmail.morovo1988.testRest.repositories;

import com.gmail.morovo1988.testRest.domain.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Document, String> {
}
