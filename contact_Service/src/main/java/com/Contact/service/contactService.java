package com.Contact.service;

import com.Contact.entity.Contact;

import java.util.List;

public interface contactService {
    public List<Contact> getContactsofUser(Long userId);
}
