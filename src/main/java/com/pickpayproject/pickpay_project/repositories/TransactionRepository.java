package com.pickpayproject.pickpay_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pickpayproject.pickpay_project.domain.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}
