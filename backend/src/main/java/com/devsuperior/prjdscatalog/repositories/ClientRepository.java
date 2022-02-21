package com.devsuperior.prjdscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.prjdscatalog.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
