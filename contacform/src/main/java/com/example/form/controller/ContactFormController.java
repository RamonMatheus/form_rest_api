package com.example.form.controller;


import com.example.form.model.ContactForm;
import com.example.form.repository.ContactFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contactForm")
public class ContactFormController {

    @Autowired
    ContactFormRepository contactFormRepository;

    @GetMapping
    public List<ContactForm> getAllContactForm(){
        return contactFormRepository.findAll();
    }
    @GetMapping("/{idClient}")
    public Optional<ContactForm> getContactById(@PathVariable String idContact){
        return contactFormRepository.findById(idContact);
    }

    @DeleteMapping("/delete")
    public String deleteContactById(@PathVariable String idContact){
        contactFormRepository.deleteById(idContact);
        return "Deleted";
    }
    @PostMapping("/save")
    public String saveContactForm(@RequestBody ContactForm contactForm){
        contactFormRepository.save(contactForm);
        return "Saved Completed";
    }
}
