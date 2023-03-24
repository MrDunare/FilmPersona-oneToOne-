package it.softwareinside.app.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.softwareinside.app.models.Film;
import it.softwareinside.app.service.FilmService;

@RequestMapping("/api")
@RestController
public class RestControllerGeneral {

	
	
	@Autowired
	FilmService filmService;
	
	
	@PostMapping("/add")
	public boolean addFilmone(@RequestBody Film film) {
		return filmService.addFilm(film);
	}
	
	@DeleteMapping("/deleteId")
	public boolean delete(@RequestParam ("id") int id) {
		filmService.delete(id);
		return true;
	}
	
	@PostMapping("/update")
	public boolean update(@RequestBody Film film) {
		return filmService.addFilm(film);
	}
	
	@DeleteMapping("/deleteAll")
	public boolean deleteAll() {
		return filmService.deleteAll();
	}
	
	
}
