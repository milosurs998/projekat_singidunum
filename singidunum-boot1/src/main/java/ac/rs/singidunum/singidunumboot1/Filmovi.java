package ac.rs.singidunum.singidunumboot1;

public class Filmovi {

	private Integer id;
	private String naziv, opis, zanr;
	private double trajanjeMinuti;
	
	public Filmovi(Integer id, String naziv, String opis, String zanr, double trajanjeMinuti) {
		this.id = id;
		this.naziv = naziv;
		this.opis = opis;
		this.zanr = zanr;
		this.trajanjeMinuti = trajanjeMinuti;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getZanr() {
		return zanr;
	}

	public void setZanr(String zanr) {
		this.zanr = zanr;
	}

	public double getTrajanjeMinuti() {
		return trajanjeMinuti;
	}

	public void setTrajanjeMinuti(double trajanjeMinuti) {
		this.trajanjeMinuti = trajanjeMinuti;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", naziv=" + naziv + ", opis=" + opis + ", zanr=" + zanr + ", trajanje=" + trajanjeMinuti
				+ "]";
	}
	
}
