package com.Contact.service;

import com.Contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service

public class contactServiceimpl implements contactService{

    List<Contact>list= List.of(
            new Contact(1L,"moizk@gmail.com","moizKhan",1311L),
            new Contact(2L,"moizk12@gmail.com","ArshadKhan",1311L),
            new Contact(3L,"moizk13@gmail.com","AkhilKhan",1321L),
            new Contact(4L,"moizk14@gmail.com","MuqeetKhan",1324L)
    );
    @Override
    public List<Contact> getContactsofUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
