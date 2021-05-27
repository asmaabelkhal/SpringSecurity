package org.sid.springmvc.dao;

import org.sid.springmvc.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PatientRepository extends JpaRepository<Patient, Long> {
	
	public Page<Patient> findByNameContains(String name, Pageable pageable);
}
