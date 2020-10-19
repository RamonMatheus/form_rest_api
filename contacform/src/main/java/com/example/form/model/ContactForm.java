package com.example.form.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "contactForm")
public class ContactForm {

    @Id
    private String idContact;
    private String nameForm;
    private String emailForm;
    private String phoneForm;
    private String messageForm;
}
