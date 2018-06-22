
import java.util.ArrayList;
import java.util.HashMap;


public class Registry {

	public HashMap<Integer,Scene> scenes = new HashMap<>();

	public Registry() {
		
	} 
	
	
	
	public String calcManpower()
	{
		int sum1 = 0 ; 
		int sum2 = 0 ;
		String answer = ""; 
		for(Integer key : scenes.keySet())
		{
			
			answer += "сйгмг " + key + ": "+ scenes.get(key).getCampers().size() + "+" + scenes.get(key).getLeaders().size() + "\n" ; 
			sum1 += scenes.get(key).getCampers().size() ; 
			sum2 += scenes.get(key).getLeaders().size() ; 
		}
			
		return answer += "\nсумоко:" + (sum1+sum2) + "\nOладаявес:" + sum2 + "\nKатасйгмытес:" + sum1; 
	}
	
	public String delete(String name , int scene , int age)
	{
		ArrayList<Camper> campers = scenes.get(scene).getCampers() ;
		ArrayList<Teamleader> leaders = scenes.get(scene).getLeaders() ;
		Camper camperToRemove = null ; 
		for(Camper c : campers)
		{
			if(c.getFullname().equals(name)&&c.getAge() == age )
				camperToRemove = c ; 	
			
		}
		
		
		if(camperToRemove!=null) {
			campers.remove(camperToRemove) ; 
			return "диацяажг епитувгс" ; 
		}
			
	
			
		Teamleader leadertoremove = null ; 
		for(Teamleader l : leaders)
		{
		
			if(l.getFullname().equals(name)&&l.getAge() == age )
				leadertoremove   = l ; 
				
			
		}
		
		if(leadertoremove!=null) {
			
			leaders.remove(leadertoremove) ; 
			return "диацяажг епитувгс" ; 
		}
		
		
		return "диацяажг амепитувгс" ; 
		
	}
	
	
	public boolean isCamperOrLeader(String name , int scene , int age)
	{
		ArrayList<Camper> campers = scenes.get(scene).getCampers() ;
		ArrayList<Teamleader> leaders = scenes.get(scene).getLeaders() ;
		
		for(Camper c : campers)
		{
			if(c.getFullname().equals(name)&&c.getAge() == age )
				return true ; 
			
		}
		
		
		for(Teamleader l : leaders)
		{
		
			if(l.getFullname().equals(name)&&l.getAge() == age )
				return true ; 
				
			
		}
		
		return false;
	}

	public boolean isScene(int scene)
	{
		for(Integer key : scenes.keySet())
		   if(key == scene)
			   return true ;
		
		return false ; 
 	}
	
	
}
