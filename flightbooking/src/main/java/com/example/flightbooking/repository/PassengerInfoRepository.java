package com.example.flightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flightbooking.model.PassengerInfo;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Integer>  
{

}
