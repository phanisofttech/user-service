package com.pst.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.pst.user.entity.UserEntity;
import org.springframework.data.jpa.repository.Modifying;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Modifying
    @Query(value = "update user set password=:newPassword where aadhaar_number=:aadhaarNumber and password=:oldPassword", nativeQuery = true)
    int updatePasswordByAadhaarNumber(@Param("newPassword") String newPassword,
                                      @Param("aadhaarNumber") long aadhaarNumber, @Param("oldPassword") String oldPassword);
}
