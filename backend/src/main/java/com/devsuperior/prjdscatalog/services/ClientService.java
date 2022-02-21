package com.devsuperior.prjdscatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.prjdscatalog.entities.Client;
import com.devsuperior.prjdscatalog.repositories.ClientRepository;

@Service
public class ClientService {
	@Autowired
	private	ClientRepository repository;
	
	public List<Client> findAll(){
		return repository.findAll();
	}
}