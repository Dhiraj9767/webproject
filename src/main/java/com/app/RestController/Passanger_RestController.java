package com.app.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entity.Passanger_details;
import com.app.service.Passanger_service;

@RestController
public class Passanger_RestController {
	@Autowired
	private Passanger_service ps;

	@PostMapping("/IRCTCPassangerTicketDetails")
	public ResponseEntity<String> ConfirmPassangerdetails(@RequestBody Passanger_details pd) {

		String status = ps.upsert(pd);
		return new ResponseEntity<String>(status, HttpStatus.CREATED);

	}

	@GetMapping("/IRCTCTicket/{PassangerId}")
	public ResponseEntity<Passanger_details> getticketdetails(@PathVariable Integer PassangerId) {
		Passanger_details passangerId = ps.getById(PassangerId);
		return new ResponseEntity<>(passangerId, HttpStatus.OK);

	}

	@GetMapping("/passangerticketdetials")
	public ResponseEntity<List<Passanger_details>> getallpassangerdetails() {
		List<Passanger_details> allpassangerdetails = ps.getAllPassangerDetails();
		return new ResponseEntity<>(allpassangerdetails, HttpStatus.OK);

	}

	@PutMapping("/IRCTCPassangerTicketDetailsUpdated")
	public ResponseEntity<String> updatePassangerdetails(@RequestBody Passanger_details pd) {

		String status = ps.upsert(pd);
		return new ResponseEntity<>(status, HttpStatus.CREATED);

	}

	@DeleteMapping("/IRCTCTicket/{PassangerId}")
	public ResponseEntity<String> deletepassangerdetails(@PathVariable Integer PassangerId) {
		String status = ps.deleteById(PassangerId);
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}

}
