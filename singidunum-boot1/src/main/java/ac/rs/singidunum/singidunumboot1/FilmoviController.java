package ac.rs.singidunum.singidunumboot1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmoviController {

	@Autowired
	private FilmoviDaoService film;
	private Filmovi filmovi;
	
	@GetMapping(path = "/film")
	public List<Filmovi> getAll() {
		return film.findAll();
	}
	
	@GetMapping(path = "/film/{id}")
	public Filmovi getFilmovi(@PathVariable int id) {
		return film.findOne(id);
	}
	
	@PostMapping(path = "/film")
	public void addFilmovi(@RequestBody Filmovi filmovi) {
		film.addFilmovi(filmovi);
		
	}
	
	@DeleteMapping(path = "/film/{id}")
	public boolean izbrisiFilm(@PathVariable int id) {
		film.izbrisi(id);
		return true;
	}

	
}
