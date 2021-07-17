package rs.ac.singidunum.singidunumserije;

public class Serije {

	private int id, godina;
	private String naziv;
	private double trajanjeEpizodeMin;
	
	public Serije(int id, int godina, String naziv, double trajanjeEpizodeMin) {
		this.id = id;
		this.godina = godina;
		this.naziv = naziv;
		this.trajanjeEpizodeMin = trajanjeEpizodeMin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGodina() {
		return godina;
	}

	public void setGodina(int godina) {
		this.godina = godina;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getTrajanjeEpizodeMin() {
		return trajanjeEpizodeMin;
	}

	public void setTrajanjeEpizodeMin(double trajanjeEpizodeMin) {
		this.trajanjeEpizodeMin = trajanjeEpizodeMin;
	}

	@Override
	public String toString() {
		return "Serije [id=" + id + ", godina=" + godina + ", naziv=" + naziv + ", trajanjeEpizodeMin="
				+ trajanjeEpizodeMin + "]";
	}
	
}
