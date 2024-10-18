package com.app.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entity.Passanger_details;

public interface passengerRepo extends JpaRepository<Passanger_details, Integer> {

}
