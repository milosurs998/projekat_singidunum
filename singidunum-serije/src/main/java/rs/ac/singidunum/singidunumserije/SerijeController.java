package rs.ac.singidunum.singidunumserije;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SerijeController {
	
	@Autowired
	private SerijeDaoService serija;
	private Serije serije;
	
	@GetMapping(path = "/serija")
	public List<Serije> getAll() {
		return serija.findAll();
	}
	
	@GetMapping(path = "/serija/{id}")
	public Serije getSerije(@PathVariable int id) {
		return serija.findOne(id);
	}
	
	@PostMapping(path = "/serija")
	public void addSerije(@RequestBody Serije serije) {
		serija.addSerija(serije);
		
	}
	
	@DeleteMapping(path = "/serija/{id}")
	public boolean izbrisiSeriju(@PathVariable int id) {
		serija.izbrisi(id);
		return true;
	}
	
}
