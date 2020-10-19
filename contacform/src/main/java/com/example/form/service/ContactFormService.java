package com.example.form.service;

import com.example.form.model.ContactForm;

import java.util.List;
import java.util.Optional;

public interface ContactFormService {

    public List<ContactForm> getAllContacts();

    public Optional<ContactForm> getContactById(String idContact);

    public String deleteContactFormById(String idContact);

    public String saveContactForm(ContactForm contactForm);
}
