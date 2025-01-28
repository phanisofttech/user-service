package com.pst.user.repository;

import com.pst.user.entity.RequestEntity;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<RequestEntity, Long> {
	
	 @Query(value="select type_of_document, count(*) from certificate_requests group by type_of_document", nativeQuery=true)
     List<Object[]> findCertificateTypeCount();
     
     @Query(value="select type_of_document, count(*) from certificate_requests where status=:status group by type_of_document", nativeQuery=true)
     List<Object[]> findCertificateTypeCountByStatus(@Param("status") String status);

    @Query(value = "SELECT * FROM certificate_requests  r WHERE YEAR(r.created_at) = :year", nativeQuery = true)
    List<RequestEntity> findByCreatedAtYear(@Param("year") int year);

    @Query(value = "SELECT * FROM certificate_requests r WHERE YEAR(r.created_at) = :year AND MONTH(r.created_at) = :month", nativeQuery = true)
    List<RequestEntity> findByCreatedAtYearAndCreatedAtMonth(@Param("year") int year, @Param("month") int month);

    @Query(value = "SELECT * FROM certificate_requests r WHERE r.created_at = :date", nativeQuery = true)
    List<RequestEntity> findByCreatedAt(@Param("date") Date date);

}
