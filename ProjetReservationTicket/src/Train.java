import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Train {
	private String trainNom;
	private int trainNombre;
	private String deStation;
	private String versStation;
	private int placesDispo;
	private String tarif;
	private String date;
	
	public Train() {
		super();
	}
	
	public Train(String trainNom, int trainNombre, String deStation, String versStation, int placesDispo, String tarif) {
		this.trainNom = trainNom;
		this.trainNombre = trainNombre;
		this.deStation = deStation;
		this.versStation = versStation;
		this.placesDispo = placesDispo;
		this.tarif = tarif;
	}
	
	public Train(String deStation, String versStation, String fdate) {
		this.deStation = deStation;
		this.versStation = versStation;
		this.date = fdate;
	}
	
	public String getTrainNom() {
		return trainNom;
	}
	public void setTrainNom(String trainNom) {
		this.trainNom = trainNom;
	}
	public int getTrainNombre() {
		return trainNombre;
	}
	public void setTrainNombre(int trainNombre) {
		this.trainNombre = trainNombre;
	}
	public String getDeStation() {
		return deStation;
	}
	public void setDeStation(String deStation) {
		this.deStation = deStation;
	}
	public String getVersStation() {
		return versStation;
	}
	public void setVersStation(String versStation) {
		this.versStation = versStation;
	}
	public int getPlacesDispo() {
		return placesDispo;
	}
	public void setPlacesDispo(int placesDispo) {
		this.placesDispo = placesDispo;
	}
	public String getTarif() {
		return tarif;
	}
	public void setTarif(String tarif) {
		this.tarif = tarif;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
}
