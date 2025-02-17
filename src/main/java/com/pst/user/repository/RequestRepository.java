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

	// Used to filter total count of each certificate
	@Query(value = "select type_of_document, count(*) from certificate_requests group by type_of_document", nativeQuery = true)
	List<Object[]> findCertificateTypeCount();

	@Query(value = "select type_of_document, count(*) from certificate_requests where status=:status group by type_of_document", nativeQuery = true)
	List<Object[]> findCertificateTypeCountByStatus(@Param("status") String status);

	// Used to filter certificates based on year, month, date
	@Query(value = "SELECT DATE_FORMAT(created_at, '%M') AS `Month`, COUNT(*) AS `Applications Received`, SUM(CASE WHEN status = 'inprogress' THEN 1 ELSE 0 END) AS `Applications Inprogress`, SUM(CASE WHEN status = 'completed' THEN 1 ELSE 0 END) AS `Applications Approved`, SUM(CASE WHEN status = 'rejected' THEN 1 ELSE 0 END) AS `Applications Rejected` FROM certificate_requests r WHERE YEAR(r.created_at) = :year  GROUP BY DATE_FORMAT(created_at, '%M') ORDER BY MIN(created_at);", nativeQuery = true)
	List<Object[]> findByCreatedAtYear(@Param("year") int year);

	@Query(value = "SELECT DATE_FORMAT(created_at, '%M') AS `Month`, COUNT(*) AS `Applications Received`, SUM(CASE WHEN status = 'inprogress' THEN 1 ELSE 0 END) AS `Applications Inprogress`, SUM(CASE WHEN status = 'completed' THEN 1 ELSE 0 END) AS `Applications Approved`, SUM(CASE WHEN status = 'rejected' THEN 1 ELSE 0 END) AS `Applications Rejected` FROM certificate_requests r WHERE YEAR(r.created_at) = :year AND MONTH(r.created_at) = :month  GROUP BY DATE_FORMAT(created_at, '%M') ORDER BY MIN(created_at);", nativeQuery = true)
	List<Object[]> findByCreatedAtYearAndCreatedAtMonth(@Param("year") int year, @Param("month") int month);

	@Query(value = "SELECT DATE_FORMAT(created_at, '%M') AS `Month`, COUNT(*) AS `Applications Received`, SUM(CASE WHEN status = 'inprogress' THEN 1 ELSE 0 END) AS `Applications Inprogress`, SUM(CASE WHEN status = 'completed' THEN 1 ELSE 0 END) AS `Applications Approved`, SUM(CASE WHEN status = 'rejected' THEN 1 ELSE 0 END) AS `Applications Rejected` FROM certificate_requests WHERE created_at = :date GROUP BY DATE_FORMAT(created_at, '%M') ORDER BY MIN(created_at);", nativeQuery = true)
	List<Object[]> findByCreatedAt(@Param("date") Date date);

	// Used to filter certificates based on year, month, date
	@Query(value = "SELECT country, state, district, mandal, village, " + "COUNT(*) AS request_received, "
			+ "COUNT(CASE WHEN status = 'Inprogress' THEN 1 END) AS request_pending, "
			+ "COUNT(CASE WHEN status = 'Rejected' THEN 1 END) AS request_rejected, "
			+ "COUNT(CASE WHEN status = 'Completed' THEN 1 END) AS request_approved " + "FROM certificate_requests "
			+ "WHERE (:country IS NULL OR country = :country) " + "AND (:state IS NULL OR state = :state) "
			+ "AND (:district IS NULL OR district = :district) " + "AND (:mandal IS NULL OR mandal = :mandal) "
			+ "AND (:village IS NULL OR village = :village) "
			+ "GROUP BY country, state, district, mandal, village", nativeQuery = true)
	List<Object[]> findByCountryAndStateAndDistrictAndMandalAndVillage(@Param("country") String country,
			@Param("state") String state, @Param("district") String district, @Param("mandal") String mandal,
			@Param("village") String village);

	@Query(value = "SELECT country, state, district, mandal, village, " + "COUNT(*) AS request_received, "
			+ "COUNT(CASE WHEN status = 'Inprogress' THEN 1 END) AS request_pending, "
			+ "COUNT(CASE WHEN status = 'Rejected' THEN 1 END) AS request_rejected, "
			+ "COUNT(CASE WHEN status = 'Completed' THEN 1 END) AS request_approved " + "FROM certificate_requests "
			+ "WHERE (:country IS NULL OR country = :country) " + "AND (:state IS NULL OR state = :state) "
			+ "AND (:district IS NULL OR district = :district) " + "AND (:mandal IS NULL OR mandal = :mandal) "
			+ "GROUP BY country, state, district, mandal, village", nativeQuery = true)
	List<Object[]> findByCountryAndStateAndDistrictAndMandal(@Param("country") String country,
			@Param("state") String state, @Param("district") String district, @Param("mandal") String mandal);

	@Query(value = "SELECT country, state, district, mandal, village, " + "COUNT(*) AS request_received, "
			+ "COUNT(CASE WHEN status = 'Inprogress' THEN 1 END) AS request_pending, "
			+ "COUNT(CASE WHEN status = 'Rejected' THEN 1 END) AS request_rejected, "
			+ "COUNT(CASE WHEN status = 'Completed' THEN 1 END) AS request_approved " + "FROM certificate_requests "
			+ "WHERE (:country IS NULL OR country = :country) " + "AND (:state IS NULL OR state = :state) "
			+ "AND (:district IS NULL OR district = :district) "
			+ "GROUP BY country, state, district, mandal, village", nativeQuery = true)
	List<Object[]> findByCountryAndStateAndDistrict(@Param("country") String country, @Param("state") String state,
			@Param("district") String district);

	@Query(value = "SELECT country, state, district, mandal, village, " + "COUNT(*) AS request_received, "
			+ "COUNT(CASE WHEN status = 'Inprogress' THEN 1 END) AS request_pending, "
			+ "COUNT(CASE WHEN status = 'Rejected' THEN 1 END) AS request_rejected, "
			+ "COUNT(CASE WHEN status = 'Completed' THEN 1 END) AS request_approved " + "FROM certificate_requests "
			+ "WHERE (:country IS NULL OR country = :country) " + "AND (:state IS NULL OR state = :state) "
			+ "GROUP BY country, state, district, mandal, village", nativeQuery = true)
	List<Object[]> findByCountryAndState(@Param("country") String country, @Param("state") String state);

	@Query(value = "SELECT country, state, district, mandal, village, " + "COUNT(*) AS request_received, "
			+ "COUNT(CASE WHEN status = 'Inprogress' THEN 1 END) AS request_pending, "
			+ "COUNT(CASE WHEN status = 'Rejected' THEN 1 END) AS request_rejected, "
			+ "COUNT(CASE WHEN status = 'Completed' THEN 1 END) AS request_approved " + "FROM certificate_requests "
			+ "WHERE (:country IS NULL OR country = :country) "
			+ "GROUP BY country, state, district, mandal, village", nativeQuery = true)
	List<Object[]> findByCountry(@Param("country") String country);

}
