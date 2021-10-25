package com.ytrocha.ediaristas.repositories;

import com.ytrocha.ediaristas.models.Diarista;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaristaRepository extends JpaRepository<Diarista, Long> {
    
}
