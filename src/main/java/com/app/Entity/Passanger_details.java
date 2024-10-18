package com.app.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "IRCTC APP")
public class Passanger_details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer PassangerId;
	private String FullName;
	private String Gender;
	private String Nationality;
	private Integer Mob;
	private String Mail;
	private String Address;
}
