import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Registry reg = new Registry()  ; 
		
		
		ArrayList<Teamleader> leaders1 = new ArrayList<>()  ; 
		ArrayList<Camper> campers1 = new ArrayList<>() ;
		
		leaders1.add(new Teamleader("йыстас циамтсиос", "6982233611", "кацйадас", 20, "аутойимгто",false, "йамема", "йамема", 1)) ;
		campers1.add(new Camper("йыстас хеойкгс", "6982233611", "кацйадас", 10, "аутойимгто",false, "йамема", "йамема") ); 
		campers1.add(new Camper("циаммгс хеойкгс", "6982233611", "кацйадас", 10, "кеыжояеио",false, "йамема", "йамема") ); 
		campers1.add(new Camper("циаммгс йалпеягс", "6982233611", "лийяг бокбг", 10, "аутойимгто",false, "йамема", "йамема") ); 
		campers1.add(new Camper("иыайгл йалпеягс", "6982233611", "лецакг бокбг", 10, "аутойимгто",false, "йамема", "йамема") ); 
		
			
		Scene scene1 = new Scene() ; 
		scene1.setCampers(campers1);
		scene1.setLeaders(leaders1);
		reg.scenes.put(1, scene1) ; 
		
		ArrayList<Teamleader> leaders2 = new ArrayList<>()  ; 
		ArrayList<Camper> campers2 = new ArrayList<>() ;
		
		
		leaders2.add(new Teamleader("келомиа мтоуйг", "6982233611", "м.апоккомиа", 20, "кеыжояеио",true, "йамема", "йамема", 2)) ;
		campers2.add(new Camper("еиягмг моялоу", "6982233611", "кацйадас", 10, "кеыжояеио",true, "йамема", "йамема") ); 
		campers2.add(new Camper("еуцемеиа мтотсг", "6982233611", "кацйадас", 10, "аутойимгто",true, "йамема", "йамема") ); 
		campers2.add(new Camper("ваяийкеиа кеутеяоу", "6982233611", "лийяг бокбг", 10, "кеыжыяио",true, "йамема", "йамема") ); 
		campers2.add(new Camper("ахгма мамама", "6982233611", "лецакг бокбг", 10, "аутойимгто",true, "йамема", "йамема") ); 
		campers2.add(new Camper("екпида цеяасилиоу", "6982233611", "вакастяа", 10, "аутойимгто",true, "йамема", "йамема") ); 
		Scene scene2 = new Scene() ; 
		scene2.setCampers(campers2);
		scene2.setLeaders(leaders2);
		
		reg.scenes.put(2, scene2);
		
		new GUI(reg) ; 
	}

}
