package com.pst.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pst.user.entity.StateEntity;

@Repository
public interface StateRepository extends JpaRepository<StateEntity,Integer>{

	
}
