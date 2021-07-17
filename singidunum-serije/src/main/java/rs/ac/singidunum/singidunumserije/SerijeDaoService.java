package rs.ac.singidunum.singidunumserije;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SerijeDaoService {

public static List<Serije> serija = new ArrayList<>();
	
	static {
		
		serija.add(new Serije(1, 2003, "Dekster", 45.00));
		serija.add(new Serije(1, 2013, "Vikinzi", 75.00));
		serija.add(new Serije(1, 2020, "StarWars", 35.00));
		serija.add(new Serije(1, 2008, "Got", 55.00));
		serija.add(new Serije(1, 2012, "Witcher", 20.00));
		
	}
	
	public List<Serije> findAll() {
		return serija;
	}
	
	public Serije findOne(int id) {
		for(Serije serije : serija) {
			if(serije.getId()==id) {
				return serije;
			}
		}
		
		return null;
	}
	
	public void addSerija(Serije serije) {
		serija.add(serije);
	}
	
	public void izbrisi(int id) {
		serija.remove(id);
	}
	
}
