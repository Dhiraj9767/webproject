package com.app.service;

import java.util.List;

import com.app.Entity.Passanger_details;

public interface Passanger_service {
	public String upsert(Passanger_details pd);

	public Passanger_details getById(Integer ticketId);

	public List<Passanger_details> getAllPassangerDetails();

	public String deleteById(Integer ticketId);
}
