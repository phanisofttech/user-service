package com.pst.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pst.user.entity.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long> {
}
