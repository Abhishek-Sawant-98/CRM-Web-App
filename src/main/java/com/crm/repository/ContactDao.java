package com.crm.repository;

import java.util.List;

import com.crm.model.Contact;
import com.crm.model.User;

public interface ContactDao {

	public boolean addContact(Contact contact, User user);

	public boolean isContactRegistered(String contactMobile, String contactOwner);
	
	public List<Contact> getContactsByUserId(String userId);
	
}
