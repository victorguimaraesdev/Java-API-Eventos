package com.spring.Api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Api.domain.address.Addres;

public interface AdressRepositorie extends JpaRepository<Addres, UUID> {
    
}
