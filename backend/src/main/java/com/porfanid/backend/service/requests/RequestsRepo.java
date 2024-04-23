package com.porfanid.backend.service.requests;


import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestsRepo extends JpaRepository<Requests, RequestsId> {
}
