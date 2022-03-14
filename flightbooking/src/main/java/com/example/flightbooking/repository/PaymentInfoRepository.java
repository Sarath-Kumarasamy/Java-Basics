package com.example.flightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flightbooking.model.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,Integer> 
{

}
