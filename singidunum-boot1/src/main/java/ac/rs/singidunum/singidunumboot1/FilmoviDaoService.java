package ac.rs.singidunum.singidunumboot1;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class FilmoviDaoService {

public static List<Filmovi> film = new ArrayList<>();
	
	static {
		
		film.add(new Filmovi(1, "Venom", "Priča o nastanku Marvelovog najzagonetnijeg, nasloženijeg i najopasnijeg lika – Venoma!", "Akcija", 108.00));
		film.add(new Filmovi(2, "X-MEN Dark Phoenix", "U “Mračnom Feniksu”, X-Men se suočavaju sa najstrašnijim I najmoćnijim neprijateljem dosad", "Akcija", 109.00));
		film.add(new Filmovi(3, "DEADPOOL 2", "Vejd mora da se bori sa nindžama, jakuzama i čoporom agresivnih pasa, dok putuje svetom i otkriva značaj porodice, prijateljstva i ukusa", "Akcija", 114.00));
		film.add(new Filmovi(4, "SAN ANDREAS", "Pilot spasilačkog helikoptera (Dvejn Džonson) i njegova bivša žena (Karla Gudžino) zajedno odlaze iz Los Anđelesa u San Francisko da spasu ćerku", "Akcija", 110.00));
		film.add(new Filmovi(5, "BUMBLEBEE", "Sajbertron je pao. Kada Optimus Prajm pošalje Bamblbija da brani Zemlju, tada počinje njegovo putovanje da postane heroj", "Akcija", 129.00));
		
	}
	
	public List<Filmovi> findAll() {
		return film;
	}
	
	public Filmovi findOne(int id) {
		for(Filmovi filmovi : film) {
			if(filmovi.getId()==id) {
				return filmovi;
			}
		}
		
		return null;
	}
	
	public void addFilmovi(Filmovi filmovi) {
		film.add(filmovi);
	}
	
	public void izbrisi(int id) {
		film.remove(id);
	}

}
