
public class Voyageur {
	private String Name;
	private String numcartenationale ;
	private String adresseMail;
	private String numTel;
	
	public Voyageur(String Name, String numcartenationale, String adresseMail, String numTel) {
		this.Name=Name;
		this.numcartenationale=numcartenationale;
		this.adresseMail=adresseMail;
		this.numTel=numTel;
		
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String Namee) {
		Name = Namee;
	}

	
	public String getAdresseMail() {
		return adresseMail;
	}
	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public String getNumcartenationale() {
		return numcartenationale;
	}

	public void setNumcartenationale(String numcartenationale) {
		this.numcartenationale = numcartenationale;
	}
}