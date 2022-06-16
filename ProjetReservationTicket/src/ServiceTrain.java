import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;


public class ServiceTrain {
	private LinkedList<Train> trainsDispo = new LinkedList<>();
	private  LinkedList<Train> trains = new LinkedList<>();



	
	public ServiceTrain() {
		super();
	}
	
	public LinkedList<Train> getTrainDispo() {
		return trainsDispo;
	}

	public void setTrainDispo(LinkedList<Train> trainDispo) {
		this.trainsDispo = trainDispo;
	}

	public LinkedList<Train> gettrains() {
		return trains;
	}

	public void settrains(LinkedList<Train> trains) {
		this.trains = trains;
	}
	
	public Train trouverTrain(int trainNombre) {
		Train btata = null;
		for (Train t : trainsDispo) {
			if (t.getTrainNombre() == trainNombre) {
				return t;
			}
		}
		return btata ;
	}
	
	public Train trouverTrain(String trainNom) {
		Train boorgir = null;
		for (Train t : trainsDispo) {
			if (t.getTrainNom() == trainNom) {
				return t;
			}
		}
		return boorgir ;
	}
	
	public List<Train> chercherTrainsEntreStations(String deStation, String versStation, LocalDate date, int nombrePlaces) {
		List<Train> trainsTrouves = new LinkedList<>();
		for (Train t : trainsDispo) {
			if (t.getDeStation().equals(deStation) && t.getVersStation().equals(versStation) && t.getDate().equals(date) && (t.getPlacesDispo() >= nombrePlaces) ) {
				trainsTrouves.add(t);
			}
		}
		return trainsTrouves ;
	}


}
