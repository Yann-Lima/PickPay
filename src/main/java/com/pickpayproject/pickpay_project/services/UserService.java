package com.pickpayproject.pickpay_project.services;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

import com.pickpayproject.pickpay_project.domain.user.User;
import com.pickpayproject.pickpay_project.domain.user.UserType;
import com.pickpayproject.pickpay_project.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    
    public void validateTransaction(User sender, BigDecimal amount) throws Exception {
        if (sender.getUserType() != UserType.COMMON) {
            throw new Exception("Usuário do tipo logista não esta autorizado a realizar transação");
        }
        
        if(sender.getBalance().compareTo(amount)<0) {
        	throw new Exception("Saldo insuficiente");
        }
    }
    
    public User findUserById(Long id) throws Exception{
        return this.repository.findById(id).orElseThrow(() -> new Exception("Usuário não encontrado"));
    }
    
    public void saveUser(User user) {
    	this.repository.save(user);
    }
}
