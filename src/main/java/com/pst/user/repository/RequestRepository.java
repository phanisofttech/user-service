package com.pst.user.repository;

import com.pst.user.entity.RequestEntity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RequestRepository extends JpaRepository<RequestEntity, Long> {
	
	 @Query(value="select type_of_document, count(*) from certificate_requests group by type_of_document", nativeQuery=true)
     List<Object[]> findCertificateTypeCount();
     
     @Query(value="select type_of_document, count(*) from certificate_requests where status=:status group by type_of_document", nativeQuery=true)
     List<Object[]> findCertificateTypeCountByStatus(@Param("status") String status);

}
