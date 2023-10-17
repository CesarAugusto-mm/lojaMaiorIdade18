package com.maiorIdade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.maiorIdade.Repository.ClienteRepository;
import com.maiorIdade.Repository.AnterfatoRepository;

@Service
public class CentralService {
	
	@Autowired
	private AnterfatoRepository anterfatoRepository;
	
	@Autowired ClienteRepository clienteRepository;
	

}
