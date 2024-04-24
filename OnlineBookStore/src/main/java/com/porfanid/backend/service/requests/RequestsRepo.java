package com.porfanid.backend.service.requests;


import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface RequestsRepo extends JpaRepository<Requests, RequestsId> {
    @Transactional
    @Modifying
    @Query("UPDATE Requests r " +
            "SET r.accepted = 1 " +  // Always set accepted to true
            "WHERE r.username = :#{#requests.username} " +
            "AND r.title = :#{#requests.title} " +
            "AND r.holder = :#{#requests.holder}")
    void updateAcceptedStatus(Requests requests);

    @Transactional
    @Modifying
    @Query("UPDATE Requests r " +
            "SET r.accepted = -1" +
            "WHERE r.username = :#{#requests.username} " +
            "AND r.title = :#{#requests.title} " +
            "AND r.holder = :#{#requests.holder}")
    void updateDeniedStatus(Requests requests);
}
