import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.lang3.RandomStringUtils;

public class Ticket {
	private Voyageur v;
	private Train t;
  private String id;

    public void saveTicketCode(Train t) {
        try {
          id = RandomStringUtils.randomAlphanumeric(10);

          File file = new File("liste tickets.txt");

          Scanner scanner = new Scanner(file);

          int lineNum = 0;
          while (scanner.hasNextLine()) {
              String line = scanner.nextLine();
              lineNum++;
              if(id.equals(line)) { 
                id = RandomStringUtils.randomAlphanumeric(10);
              }
          }
          scanner.close();

          
        if (t.getPlacesDispo() == 0) {
          System.out.println("Train Plein ! Demande refusee");
        }
        else {
          FileWriter myWriter = new FileWriter("liste tickets.txt", true);
          myWriter.write(id);
          myWriter.write("\n");
          myWriter.close();
          t.setPlacesDispo(t.getPlacesDispo() - 1);
        }
        } catch (IOException e) {
          System.out.println("error");
          e.printStackTrace();
        }
      }
    
    void setId(String id) {
        this.id = id;
    }

    String getId() {
        return id;
    }

	public Train getT() {
		return t;
	}

	public void setT(Train t) {
		this.t = t;
	}

	public Voyageur getV() {
		return v;
	}

	public void setV(Voyageur v) {
		this.v = v;
	}

}