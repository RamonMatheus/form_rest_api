package com.example.form.repository;

import com.example.form.model.ContactForm;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactFormRepository extends MongoRepository<ContactForm, String> {

    Optional<ContactForm> findById(String idContact);

    void deleteById(String idContact);
}
