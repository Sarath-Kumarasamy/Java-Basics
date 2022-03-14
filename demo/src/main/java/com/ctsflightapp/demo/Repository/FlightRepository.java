package com.ctsflightapp.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctsflightapp.demo.modal.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer>{

	public void delete(Optional<Flight> f1);

}
