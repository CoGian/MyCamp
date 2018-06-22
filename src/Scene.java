import java.util.ArrayList;

public class Scene {

	private  int id ; 
	private ArrayList<Teamleader> leaders = new ArrayList<>()  ; 
	private ArrayList<Camper> campers = new ArrayList<>() ;
	
	public Scene(ArrayList<Teamleader> leaders, ArrayList<Camper> campers) {
		
		this.leaders = leaders;
		this.campers = campers;
	}

	public ArrayList<Teamleader> getLeaders() {
		return leaders;
	}

	public void setLeaders(ArrayList<Teamleader> leaders) {
		this.leaders = leaders;
	}

	public ArrayList<Camper> getCampers() {
		return campers;
	}

	public void setCampers(ArrayList<Camper> campers) {
		this.campers = campers;
	} 
	
	
	
	
}
