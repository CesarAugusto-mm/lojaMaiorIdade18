package com.maiorIdade.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maiorIdade.Model.Anterfato;

@Repository
public interface AnterfatoRepository extends JpaRepository<Anterfato, Integer>{

}
