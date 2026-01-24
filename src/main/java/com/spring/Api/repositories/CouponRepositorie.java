package com.spring.Api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Api.domain.coupon.Coupon;

public interface CouponRepositorie extends JpaRepository<Coupon, UUID> {
    
}
