package com.convinichoosa.business.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.convinichoosa.business.domain.Name;



@Repository
public interface CheckRepository extends JpaRepository <Name, Long> {

	

	


}
