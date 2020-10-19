package com.example.form.service.implement;

import com.example.form.model.ContactForm;
import com.example.form.repository.ContactFormRepository;
import com.example.form.service.ContactFormService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ContactFormServiceImplement implements ContactFormService {

    @Autowired
    ContactFormRepository contactFormRepository;

    @Override
    public List<ContactForm> getAllContacts() {
        return contactFormRepository.findAll() ;
    }

    @Override
    public Optional<ContactForm> getContactById(String idContact) {
        return contactFormRepository.findById(idContact);
    }

    @Override
    public String deleteContactFormById(String idContact) {
        contactFormRepository.deleteById(idContact);
        return "Deleted";
    }


    @Override
    public String saveContactForm(ContactForm contactForm) {
        contactFormRepository.save(contactForm);
        return "Saved";
    }
}
