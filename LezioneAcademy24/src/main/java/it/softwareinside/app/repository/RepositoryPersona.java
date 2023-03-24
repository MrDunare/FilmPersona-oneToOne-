package it.softwareinside.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.softwareinside.app.models.Persona;

public interface RepositoryPersona extends JpaRepository<Persona, Integer>{

}
