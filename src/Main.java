import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Registry reg = new Registry()  ; 
		
		
		ArrayList<Teamleader> leaders1 = new ArrayList<>()  ; 
		ArrayList<Camper> campers1 = new ArrayList<>() ;
		
		leaders1.add(new Teamleader("������ ���������", "6982233611", "��������", 20, "����������",false, "������", "������", 1)) ;
		campers1.add(new Camper("������ �������", "6982233611", "��������", 10, "����������",false, "������", "������") ); 
		campers1.add(new Camper("������� �������", "6982233611", "��������", 10, "���������",false, "������", "������") ); 
		campers1.add(new Camper("������� ��������", "6982233611", "����� �����", 10, "����������",false, "������", "������") ); 
		campers1.add(new Camper("������ ��������", "6982233611", "������ �����", 10, "����������",false, "������", "������") ); 
		
			
		Scene scene1 = new Scene() ; 
		scene1.setCampers(campers1);
		scene1.setLeaders(leaders1);
		reg.scenes.put(1, scene1) ; 
		
		ArrayList<Teamleader> leaders2 = new ArrayList<>()  ; 
		ArrayList<Camper> campers2 = new ArrayList<>() ;
		
		
		leaders2.add(new Teamleader("������� ������", "6982233611", "�.���������", 20, "���������",true, "������", "������", 2)) ;
		campers2.add(new Camper("������ ������", "6982233611", "��������", 10, "���������",true, "������", "������") ); 
		campers2.add(new Camper("�������� ������", "6982233611", "��������", 10, "����������",true, "������", "������") ); 
		campers2.add(new Camper("��������� ��������", "6982233611", "����� �����", 10, "��������",true, "������", "������") ); 
		campers2.add(new Camper("����� ������", "6982233611", "������ �����", 10, "����������",true, "������", "������") ); 
		campers2.add(new Camper("������ ����������", "6982233611", "��������", 10, "����������",true, "������", "������") ); 
		Scene scene2 = new Scene() ; 
		scene2.setCampers(campers2);
		scene2.setLeaders(leaders2);
		
		reg.scenes.put(2, scene2);
		
		new GUI(reg) ; 
	}

}
