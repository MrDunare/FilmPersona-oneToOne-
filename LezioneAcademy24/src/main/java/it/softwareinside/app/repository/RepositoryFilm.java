package it.softwareinside.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.softwareinside.app.models.Film;

public interface RepositoryFilm extends JpaRepository<Film, Integer>{

}
