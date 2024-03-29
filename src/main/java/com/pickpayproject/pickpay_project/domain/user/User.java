package com.pickpayproject.pickpay_project.domain.user;

import java.math.BigDecimal;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity(name="users")
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fisrtName;
    
    private String lastName;
    
    @Column(unique=true)
    private String document;
    
    @Column(unique=true)
    private String email;
    
    @Column(unique=true)
    private String password;
    
    private BigDecimal balance;
    
    @Enumerated(EnumType.STRING)
    private UserType userType;

	public UserType getUserType() {
		// TODO Auto-generated method stub
		return null;
	}

	public BigDecimal getBalance() {
		// TODO Auto-generated method stub
		return null;
	}
}
