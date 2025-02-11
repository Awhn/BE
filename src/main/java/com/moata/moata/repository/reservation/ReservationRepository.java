package com.moata.moata.repository.reservation;

import com.moata.moata.entity.reservation.Reservation;
import com.moata.moata.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    @Query("SELECT r FROM Reservation r WHERE " +
       "(:from IS NULL OR r.startTime >= :from) AND " +  // Handle from being null
       "(:to IS NULL OR r.startTime <= :to) AND " +      // Handle to being null
       "(r.reserverId = :user OR :user IS NULL)")       
    List<Reservation> searchReservations(
            @Param("from") LocalDateTime from,
            @Param("to") LocalDateTime to,
            @Param("user") User user);
    List<Reservation> findByReserverId(User reserverId);
}
