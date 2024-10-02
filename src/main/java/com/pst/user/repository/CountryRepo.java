package com.pst.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pst.user.entity.CountryEntity;

public interface CountryRepo extends JpaRepository<CountryEntity,Integer> {

}
