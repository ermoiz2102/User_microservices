package com.Contact.controller;

import com.Contact.entity.Contact;
import com.Contact.service.contactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    private contactService contactService;
    @GetMapping("/user/{userId}")
    public List<Contact>getContacts(@PathVariable("userId") Long userId){
        return this.contactService.getContactsofUser(userId);
    }
}
