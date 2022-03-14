package com.study.microservicespayment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.microservicespayment.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
