package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entity.Passanger_details;
import com.app.Repo.passengerRepo;

@Service
public class passangerserviceimpl implements Passanger_service {
	@Autowired
	private passengerRepo pr;

	@Override
	public String upsert(Passanger_details pd) {

		pr.save(pd);
		return "successfull created and updated";
	}

	@Override
	public Passanger_details getById(Integer PassangerId) {

		Optional<Passanger_details> findbyId = pr.findById(PassangerId);
		if (findbyId.isPresent()) {
			return findbyId.get();
		}

		return null;
	}

	@Override
	public List<Passanger_details> getAllPassangerDetails() {
		pr.findAll();
		return pr.findAll();
	}

	@Override
	public String deleteById(Integer PassangerId) {
		if (pr.existsById(PassangerId)) {
			pr.deleteById(PassangerId);
			return "Deleted record successfully..!";
		} else {
			return "No record found";
		}

	}

}
