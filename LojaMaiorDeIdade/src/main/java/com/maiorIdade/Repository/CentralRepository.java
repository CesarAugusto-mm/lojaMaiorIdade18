package com.maiorIdade.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maiorIdade.Model.CentralM;

@Repository
public interface CentralRepository extends JpaRepository<CentralM, Integer>{
	
	
}
