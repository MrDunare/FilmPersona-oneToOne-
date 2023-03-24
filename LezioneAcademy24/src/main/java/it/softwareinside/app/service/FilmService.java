package it.softwareinside.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareinside.app.models.Film;
import it.softwareinside.app.repository.RepositoryFilm;


@Service
public class FilmService {

	@Autowired
	RepositoryFilm repositoryFilm;
	
	
	/**
	 * 
	 * metodo che aggiunge un film al database e allo stesso 
	 * tempo una persona,protagonista nel film
	 * 
	 * @param film
	 * @return
	 */
	public boolean addFilm(Film film) {
		
		try {
			repositoryFilm.save(film);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	/**
	 * metodo per cancellare un film in base all'id
	 * 
	 * @param id
	 * @return
	 */
	public Film delete(int id) {
		
		try {
			Film film = repositoryFilm.findById(id).get();
			repositoryFilm.deleteById(id);
			return film;
		} catch (Exception e) {
			return null;
		}
		
	}
	
	/**
	 * 
	 * metodo che modifica un film nel database
	 * 
	 * @param film
	 * @return
	 */
	public boolean update(Film film) {
		addFilm(film);
		return true;
	}
	/**
	 * 
	 * metodo che cancella tutti i film presenti nel database
	 * 
	 * @param film
	 * @return
	 */
	public boolean deleteAll() {
		try {
			repositoryFilm.deleteAll();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
