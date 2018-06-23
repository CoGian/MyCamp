import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.swing.*;

public class GUI extends JFrame{

	//panels
	private JPanel panel = new JPanel() ; 
	private JPanel searchpanel = new JPanel() ; 
	private JPanel labelpanel =new JPanel() ; 
	private JPanel listpanel = new JPanel() ; 
	private JPanel buttonpanel = new JPanel() ; 
	
	//text fields
	private JTextField namefield = new JTextField();
	private JTextField scenefield = new JTextField();
	
	//buttons
	private JButton SearchButton = new JButton ("ΑΝΑΖΗΤΗΣΗ");
	private JButton addbutton = new JButton("ΠΡΟΣΘΗΚΗ");
	private JButton delbutton = new JButton("ΔΙΑΓΡΑΦΗ");
	private JButton manpowerbutton = new JButton("ΒΓΑΛΕ ΔΥΝΑΜΗ") ; 
	private JButton trasferbutton =new JButton("ΜΕΤΑΦΟΡΑ") ; 
	
	
	//jlists ,deafultmodels
	private DefaultListModel<String> fullnameModel = new DefaultListModel<String>();
	private DefaultListModel<String> sceneModel = new DefaultListModel<String>();
	private DefaultListModel<String> ageModel = new DefaultListModel<String>();
	private DefaultListModel<String> telephoneModel = new DefaultListModel<String>();
	private DefaultListModel<String> cityModel = new DefaultListModel<String>();
	private DefaultListModel<String> transportModel = new DefaultListModel<String>();
	private DefaultListModel<String> genderModel = new DefaultListModel<String>();
	private DefaultListModel<String> allergiesAndDrugsModel = new DefaultListModel<String>();
	private DefaultListModel<String> judgmentModel = new DefaultListModel<String>();
	
	private JList<String>  fullnamelist = new JList<>() ; 
	private JList<String>  scenelist = new JList<>() ; 
	private JList<String>  agelist = new JList<>() ; 
	private JList<String>  telephonelist = new JList<>() ; 
	private JList<String>  citylist = new JList<>() ; 
	private JList<String>  transportlist = new JList<>() ; 
	private JList<String>  genderlist = new JList<>() ; 
	private JList<String>  allergiesAndDrugslist = new JList<>() ; 
	private JList<String>  judgmentlist = new JList<>() ; 
	
	public GUI(Registry reg)
	{
		searchpanel.add(Box.createRigidArea(new Dimension(1600,10)));
		JToolTip instructions1 = new JToolTip() ; 
		instructions1.setTipText("♦ΓΙΑ ΝΑ ΨΑΞΕΤΕ ΕΝΑΝ ΣΥΓΚΕΚΡΙΜΕΝΟ ΚΑΤΑΣΚΗΝΩΤΗ/ΟΜΑΔΑΡΧΗ ΣΥΜΠΛΗΡΩΣΤΕ ΜΟΝΟ ΤΟ ΟΝΟΜΑΤΕΠΩΝΥΜΟ " );
		JToolTip instructions2 = new JToolTip() ; 
		instructions2.setTipText("♦ΓΙΑ ΝΑ ΨΑΞΕΤΕ ΤΑ ΑΤΟΜΑ ΜΙΑΣ ΣΥΓΚΕΚΡΙΜΕΝΗΣ ΣΚΗΝΗΣ ΣΥΜΠΛΗΡΩΣΤΕ ΜΟΝΟ ΤΟΝ ΑΡΙΘΜΟ ΤΗΣ ΣΚΗΝΗΣ ");
		JToolTip instructions3 = new JToolTip() ; 
		instructions3.setTipText("♦ΓΙΑ ΝΑ ΔΙΑΓΡΑΨΕΤΕ ΕΝΑΝ ΚΑΤΑΣΚΗΝΩΤΗ/ΟΜΑΔΑΡΧΗ ΕΠΙΛΕΞΤΕ ΤΟ ΟΝΟΜΑΤΕΠΩΝΥΜΟ,ΤΗΝ ΣΚΗΝΗ ΚΑΙ ΤΗΝ ΗΛΙΚΙΑ ΤΟΥ ");
		JToolTip instructions4 = new JToolTip() ; 
		instructions4.setTipText("♦ΓΙΑ ΝΑ ΜΕΤΑΦΕΡΕΤΕ ΕΝΑΝ ΚΑΤΑΣΚΗΝΩΤΗ/ΟΜΑΔΑΡΧΗ ΕΠΙΛΕΞΤΕ ΤΟ ΟΝΟΜΑΤΕΠΩΝΥΜΟ,ΤΗΝ ΣΚΗΝΗ ΚΑΙ ΤΗΝ ΗΛΙΚΙΑ ΤΟΥ ");
		JToolTip instructions5 = new JToolTip() ; 
		instructions5.setTipText("♦ΓΙΑ ΝΑ ΔΗΜΙΟΥΡΓΗΣΕΤΕ ΜΙΑ ΚΑΙΝΟΥΡΙΑ ΣΚΗΝΗ ΑΡΚΕΙ ΝΑ ΠΡΟΣΘΕΣΕΤΕ ΤΟΝ ΟΜΑΔΑΡΧΗ ΤΗΣ ΣΚΗΝΗΣ ");
		
		searchpanel.add(instructions1);
		searchpanel.add(Box.createRigidArea(new Dimension(1600,5)));
		searchpanel.add(instructions2);
		searchpanel.add(Box.createRigidArea(new Dimension(1600,20)));
		searchpanel.add(Box.createRigidArea(new Dimension(100,0))) ; 
		searchpanel.add(new JLabel("ΕΙΣΑΓΕΤΕ ΟΝΟΜΑΤΕΠΩΝΥΜΟ:")) ; 
		namefield.setColumns(20);
		searchpanel.add(namefield) ; 
		searchpanel.add(Box.createRigidArea(new Dimension(50,0))) ; 
		searchpanel.add(new JLabel("ΕΙΣΑΓΕΤΕ ΑΡΙΘΜΟ ΣΚΗΝΗΣ:")) ; 
		scenefield.setColumns(3);
		searchpanel.add(scenefield) ; 
		searchpanel.add(Box.createRigidArea(new Dimension(50,0))) ; 
		searchpanel.add(SearchButton);
		
		fullnamelist.setModel(fullnameModel);
		scenelist.setModel(sceneModel);
		agelist.setModel(ageModel);
		telephonelist.setModel(telephoneModel);
		citylist.setModel(cityModel);
		transportlist.setModel(transportModel);
		genderlist.setModel(genderModel);
		allergiesAndDrugslist.setModel(allergiesAndDrugsModel);
		judgmentlist.setModel(judgmentModel);
		
		
		labelpanel.setLayout(new GridLayout(1, 9));
		labelpanel.add(new JLabel("ΟΝΟΜΑΤΕΠΩΝΥΜΟ:")) ; 
		labelpanel.add(new JLabel("ΣΚΗΝΗ:")) ; 
		labelpanel.add(new JLabel("ΗΛΙΚΙΑ:")) ; 
		labelpanel.add(new JLabel("ΤΗΛΕΦΩΝΟ:")) ; 
		labelpanel.add(new JLabel("ΠΟΛΗ:")) ; 
		labelpanel.add(new JLabel("ΜΕΣΟ ΜΕΤΑΦOΡΑΣ:")) ; 
		labelpanel.add(new JLabel("ΦΥΛΟ:")) ; 
		labelpanel.add(new JLabel("ΑΛΕΡΓΕΙΕΣ & ΦΑΡΜΑΚΑ:")) ; 
		labelpanel.add(new JLabel("ΕΚΔΙΚΑΣΙΜΟΣ:")) ; 
		
		listpanel.setLayout(new GridLayout(1, 9));
		listpanel.add(new JScrollPane(fullnamelist)) ; 
		listpanel.add(new JScrollPane(scenelist)) ; 
		listpanel.add(new JScrollPane(agelist)) ; 
		listpanel.add(new JScrollPane(telephonelist)) ; 
		listpanel.add(new JScrollPane(citylist)) ; 
		listpanel.add(new JScrollPane(transportlist)) ; 
		listpanel.add(new JScrollPane(genderlist)) ; 
		listpanel.add(new JScrollPane(allergiesAndDrugslist)) ; 
		listpanel.add(new JScrollPane(judgmentlist)) ; 
		
		buttonpanel.add(instructions3);
		buttonpanel.add(Box.createRigidArea(new Dimension(1600,5)));
		buttonpanel.add(instructions4);
		buttonpanel.add(Box.createRigidArea(new Dimension(1600,5)));
		buttonpanel.add(instructions5);
		buttonpanel.add(Box.createRigidArea(new Dimension(1600,50))) ; 
		buttonpanel.add(addbutton);
		buttonpanel.add(Box.createRigidArea(new Dimension(50,0))) ; 
		buttonpanel.add(delbutton);
		buttonpanel.add(Box.createRigidArea(new Dimension(50,0))) ;
		buttonpanel.add(manpowerbutton);
		buttonpanel.add(Box.createRigidArea(new Dimension(50,0))) ;
		buttonpanel.add(trasferbutton);
		
		
		this.setContentPane(panel);
		this.getContentPane().setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		this.getContentPane().add(searchpanel);
		this.getContentPane().add(labelpanel);
		this.getContentPane().add(listpanel);
		this.getContentPane().add(buttonpanel);
		
		
		SearchButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fullnameModel.removeAllElements();
				sceneModel.removeAllElements();
				ageModel.removeAllElements();
				telephoneModel.removeAllElements();
				cityModel.removeAllElements();
				transportModel.removeAllElements();
				genderModel.removeAllElements();
				allergiesAndDrugsModel.removeAllElements();
				judgmentModel.removeAllElements();
				
				String name = namefield.getText().toUpperCase() ; 
				String scene = scenefield.getText().toLowerCase() ; 
				if(name.isEmpty() && scene.isEmpty() )
					JOptionPane.showMessageDialog(panel, "ΕΙΣΑΓΕΤΕ ΟΝΟΜΑΤΕΠΩΝΥΜΟ Ή ΣΚΗΝΗ ");
				else {
					
					HashMap<Integer,Scene>  map =  reg.scenes ; 
					
					if(!name.isEmpty())
					{
						boolean found = false ; 
						for(Integer key : map.keySet() )
						{
							ArrayList<Teamleader> leaders = map.get(key).getLeaders(); 
							for(Teamleader l : leaders)
							{
								if(l.getFullname().equals(name)){
										
									fullnameModel.addElement(l.getFullname()+",OΜΑΔΑΡΧΗΣ");
									sceneModel.addElement(key.toString());
									ageModel.addElement(Integer.toString(l.getAge()));
									telephoneModel.addElement(l.getTelephone());
									cityModel.addElement(l.getCity());
									transportModel.addElement(l.getTransport());
									if(l.isGender())
										genderModel.addElement("ΚΟΡΙΤΣΙ");
									else
										genderModel.addElement("ΑΓΟΡΙ");
									allergiesAndDrugsModel.addElement(l.getAllergiesAndDrugs());
									judgmentModel.addElement(l.getJudgment());
									found = true ; 
								}
							}
						
							
							ArrayList<Camper> campers = map.get(key).getCampers(); 
							for(Camper c : campers)
							{
								if(c.getFullname().equals(name)){
										
									fullnameModel.addElement(c.getFullname());
									sceneModel.addElement(key.toString());
									ageModel.addElement(Integer.toString(c.getAge()));
									telephoneModel.addElement(c.getTelephone());
									cityModel.addElement(c.getCity());
									transportModel.addElement(c.getTransport());
									if(c.isGender())
										genderModel.addElement("ΚΟΡΙΤΣΙ");
									else
										genderModel.addElement("ΑΓΟΡΙ");
									allergiesAndDrugsModel.addElement(c.getAllergiesAndDrugs());
									judgmentModel.addElement(c.getJudgment());
									found = true ; 
								}
								
									
							}
							
							
						}
						
					   if(!found)
						   JOptionPane.showMessageDialog(panel, "ΔΕΝ ΥΠΑΡΧΕΙ ");
					}
					else
					{
						Integer key = Integer.parseInt(scene) ; 
						if(map.containsKey(key)) {
							ArrayList<Teamleader> leaders = map.get(key).getLeaders(); 
							for(Teamleader l : leaders)
							{
														
									fullnameModel.addElement(l.getFullname()+",ΟΜΑΔΑΡΧΗΣ");
									sceneModel.addElement(scene);
									ageModel.addElement(Integer.toString(l.getAge()));
									telephoneModel.addElement(l.getTelephone());
									cityModel.addElement(l.getCity());
									transportModel.addElement(l.getTransport());
									if(l.isGender())
										genderModel.addElement("ΚΟΡΙΤΣΙ");
									else
										genderModel.addElement("ΑΓΟΡΙ");
									allergiesAndDrugsModel.addElement(l.getAllergiesAndDrugs());
									judgmentModel.addElement(l.getJudgment());
																
							}
							
							ArrayList<Camper> campers = map.get(key).getCampers(); 
							for(Camper c : campers)
							{
														
										
									fullnameModel.addElement(c.getFullname());
									sceneModel.addElement(key.toString());
									ageModel.addElement(Integer.toString(c.getAge()));
									telephoneModel.addElement(c.getTelephone());
									cityModel.addElement(c.getCity());
									transportModel.addElement(c.getTransport());
									if(c.isGender())
										genderModel.addElement("ΚΟΡΙΤΣΙ");
									else
										genderModel.addElement("ΑΓΟΡΙ");
									allergiesAndDrugsModel.addElement(c.getAllergiesAndDrugs());
									judgmentModel.addElement(c.getJudgment());
								
								
									
							}
						
						}
						else
							JOptionPane.showMessageDialog(panel, "ΔΕΝ ΥΠΑΡΧΕΙ Η ΣΚΗΝΗ ");
					}
				}
					
				
				
			}
		});
		
		
		manpowerbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JOptionPane.showMessageDialog(panel, reg.calcManpower());
			}
		});
		
		
		delbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name = fullnamelist.getSelectedValue() ; 
				String age = agelist.getSelectedValue();
				String scene =scenelist.getSelectedValue() ; 
				if(name != null && age !=null  && scene!=null)
				{
					Object[] options = {"ΝΑΙ",
                    "ΟΧΙ"};
					int n = JOptionPane.showOptionDialog(panel,
							"ΕΙΣΤΕ ΣΙΓΟΥΡΟΣ", "ΔΙΑΓΡΑΦΗ " + name ,JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,null,options,  options[1]);
					if(n==0){
						
						
				
						if(name.contains("ΟΜΑΔΑΡΧΗΣ"))
						{
							String[] namesList = name.split(","); 
							name = namesList[0] ;
						}
							
						
						JOptionPane.showMessageDialog(panel, reg.delete(name, Integer.parseInt(scene), Integer.parseInt(age))) ; 
						int  i = fullnamelist.getSelectedIndex() ; 
						fullnameModel.removeElementAt(i);
						sceneModel.removeElementAt(i);
						ageModel.removeElementAt(i);
						telephoneModel.removeElementAt(i);
						cityModel.removeElementAt(i);
						transportModel.removeElementAt(i);
						genderModel.removeElementAt(i);
						allergiesAndDrugsModel.removeElementAt(i);
						judgmentModel.removeElementAt(i);
						
					}
				}
				else {
					JOptionPane.showMessageDialog(panel, "ΔΕΝ ΕΠΕΛΕΞΕΣ ΣΩΣΤΑ ΤΑ ΣΤΟΙΧΕΙΑ ΓΙΑ ΝΑ ΓΙΝΕΙ Η ΔΙΑΓΡΑΦΗ ");
				}
					
				
				
			}
		});
		
		
		addbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JPanel pane = new JPanel(); 
				JTextField NameField = new JTextField(20);
			    JTextField SceneField = new JTextField() ; 
			    JTextField AgeField = new JTextField(20);
				JTextField TelephoneField = new JTextField(20);
			    JTextField CityField = new JTextField(20);
				JTextField allergiesAndDrugsField = new JTextField(20) ; 
				JTextField judgmentField = new JTextField(20);
				
				JButton registerButton = new JButton("ΕΓΓΡΑΦΗ") ; 
				JDialog jd=new JDialog();
				String [] genders = { "ΑΓΟΡΙ", "ΚΟΡΙΤΣΙ" };
				JComboBox<String> GenderBox = new JComboBox<String>(genders);
				String [] vehicles = { "ΑΥΤΟΚΙΝΗΤΟ", "ΛΕΩΦΟΡΕΙΟ" };
				JComboBox<String> TransposrtBox = new JComboBox<String>(vehicles);
				String [] status = { "ΚΑΤΑΣΚΗΝΩΤΗΣ", "ΟΜΑΔΑΡΧΗΣ" };
				JComboBox<String> statusbox = new JComboBox<String>(status);
				
				pane.setLayout(new GridLayout(22, 1,5,0));
				pane.add(new JLabel("ΟΝΟΜΑΤΕΠΩΝΥΜΟ:")) ; 
				pane.add(NameField) ; 
				pane.add(new JLabel("ΣΚΗΝΗ:")) ; 
				pane.add(SceneField) ; 
				pane.add(new JLabel("ΗΛΙΚΙΑ:")) ; 
				pane.add(AgeField) ; 
				pane.add(new JLabel("ΤΗΛΕΦΩΝΟ:")) ; 
				pane.add(TelephoneField) ; 
				pane.add(new JLabel("ΠΟΛΗ:")) ; 
				pane.add(CityField) ; 
				pane.add(new JLabel("ΜΕΣΟ ΜΕΤΑΦOΡΑΣ:")) ; 
				pane.add(TransposrtBox) ; 
				pane.add(new JLabel("ΦΥΛΟ:")) ; 
				pane.add(GenderBox) ; 
				pane.add(new JLabel("ΑΛΕΡΓΕΙΕΣ & ΦΑΡΜΑΚΑ:")) ;
				pane.add(allergiesAndDrugsField) ; 
				pane.add(new JLabel("ΕΚΔΙΚΑΣΙΜΟΣ:")) ; 
				pane.add(judgmentField) ; 
				pane.add(new JLabel("ΙΔΙΟΤΗΤΑ:")) ; 
				pane.add(statusbox);
				
				
				//see if camper exists already , if it is a leader and scene doent exist it creates the scene 
				registerButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						 String fullname = NameField.getText();
						 String scene =  SceneField.getText();
						 String age = AgeField.getText() ; 
						 String telephone = TelephoneField.getText();
						 String cityName = CityField.getText();
						 int vehicle = TransposrtBox.getSelectedIndex(); 
						 int gender = GenderBox.getSelectedIndex() ; 
						 String allergiesAndDrugs = allergiesAndDrugsField.getText(); 
						 String judgment = judgmentField.getText();	
						 int status1 = statusbox.getSelectedIndex(); 
						 
						 if(!fullname.isEmpty()  &&  !scene.isEmpty() && !age.isEmpty() &&
						!telephone.isEmpty()  && !cityName.isEmpty() && gender!= -1 && vehicle != -1 && !allergiesAndDrugs.isEmpty()
						 && !judgment.isEmpty() && status1 != -1 )
						 {
							 boolean gender1 ; 
							  if(gender==1)
								  gender1 = true ; 
							  else 
								  gender1 = false ; 
							  
							  String vehicle1 ; 
							  if(vehicle==0)
								  vehicle1 = "ΑΥΤΟΚΙΝΗΤΟ"; 
							  else 
								  vehicle1 = "ΛΕΩΦΟΡΕΙΟ" ; 
							  
							  try {
								  int age1 = Integer.parseInt(age); 
								  int scene1 = Integer.parseInt(scene) ; 
								  if(status1 == 1 && !reg.isScene(scene1) )
								  {
									  reg.scenes.put(scene1, new Scene() ) ;
									  JOptionPane.showMessageDialog(pane, "ΔΗΜΙΟΥΡΓΗΘΗΚΕ Η ΣΚΗΝΗ:" + scene);
								  }
								  if(!reg.isCamperOrLeader(fullname, scene1, age1)) {
									 
									  
									  if(status1 == 0)
										  reg.scenes.get(scene1).getCampers().add(new Camper(fullname, telephone, cityName, age1, vehicle1, gender1, allergiesAndDrugs, judgment)) ; 
									  else 
										  reg.scenes.get(scene1).getLeaders().add(new Teamleader(fullname, telephone, cityName, age1, vehicle1, gender1, allergiesAndDrugs, judgment, scene1));
									  
										  
									  
									  JOptionPane.showMessageDialog(pane, "ΕΓΓΡΑΦΗ ΟΛΟΚΛΗΡΩΘΗΚΕ");
									  
								      //Serialization.SaveToFile(reg);	
									  Object[] options = {"ΝΑΙ",
					                    "ΟΧΙ"};
										int n = JOptionPane.showOptionDialog(panel,
												"", "ΘΕΛΕΤΕ ΚΑΙ ΑΛΛΗ ΕΓΓΡΑΦΗ",JOptionPane.YES_NO_CANCEL_OPTION,
										JOptionPane.QUESTION_MESSAGE,null,options,  options[1]);
										if(n==0){
											 NameField.setText("");
										     SceneField.setText("");
										     AgeField.setText("");
											 TelephoneField.setText("");
										     CityField.setText("");
											 allergiesAndDrugsField.setText("");
											 judgmentField.setText("");
											
											
										}
										else
											jd.dispose() ; 
										
								      
								  }						  
								  else 
									  JOptionPane.showMessageDialog(pane, "ΗΔΗ ΕΙΠΑΡΧΕΙ");				  
								  
									  
								  
								  }
							  catch (Exception e1) {
									// TODO: handle exception
									  JOptionPane.showMessageDialog(pane, "ΛΑΘΟΣ ΑΡΙΘΜΟΣ ΣΚΗΝΗΣ Ή ΗΛΙΚΙΑ");
								   }

						 }
						 else 
							 JOptionPane.showMessageDialog(pane, "ΔΕΝ ΣΥΜΛΗΡΩΣΑΤΕ ΣΩΣΤΑ ΤΑ ΣΤΟΙΧΕΙΑ");
						 
						
					}
				});
				pane.add(Box.createRigidArea(new Dimension(250,5)));
				pane.add(registerButton);
				
				
				jd.add(pane);
				jd.setVisible(true);
				jd.setSize(250, 600);
				jd.setLocationRelativeTo(panel);
			}
		});
		
		
		trasferbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
                JDialog jd = new JDialog() ; 
                JPanel pane = new JPanel(); 
				JTextField SceneField = new JTextField(2);
				JButton confirmationbtn = new JButton("ΕΠΙΒΕΒΑΙΩΣΗ");
				
				pane.add(new JLabel("ΜΕΤΑΦΟΡΑ ΣΤΗΝ ΣΚΗΝΗ:"));
                pane.add(SceneField);
                pane.add(confirmationbtn);
                
                confirmationbtn.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(!SceneField.getText().isEmpty())
						{
							Integer scene1 = Integer.parseInt(SceneField.getText()) ; 
							if(reg.isScene(scene1))
							{
								String name = fullnamelist.getSelectedValue() ; 
								String age = agelist.getSelectedValue();
								String scene =scenelist.getSelectedValue() ; 
								if(name != null && age !=null  && scene!=null)
								{
									if(name.contains("ΟΜΑΔΑΡΧΗΣ")){
										String[] namesList = name.split(","); 
										name = namesList[0] ;
									}
									
								
									JOptionPane.showMessageDialog(panel, reg.trasfer(name, Integer.parseInt(scene), Integer.parseInt(age),scene1)) ; 
									int  i = fullnamelist.getSelectedIndex() ; 
									fullnameModel.removeElementAt(i);
									sceneModel.removeElementAt(i);
									ageModel.removeElementAt(i);
									telephoneModel.removeElementAt(i);
									cityModel.removeElementAt(i);
									transportModel.removeElementAt(i);
									genderModel.removeElementAt(i);
									allergiesAndDrugsModel.removeElementAt(i);
									judgmentModel.removeElementAt(i);
									jd.dispose();
								}
							
							
							}
							else
								JOptionPane.showMessageDialog(panel,"ΔΕΝ ΕΙΠΑΡΧΕΙ Η ΣΚΗΝΗ "  ); 
						}
						else
							JOptionPane.showMessageDialog(panel,"ΣΥΜΠΛΗΡΩΣΤΕ ΣΩΣΤΑ ΤΑ ΣΤΟΙΧΕΙΑ" ); 
					}
					
				});
                
				jd.add(pane);
				jd.setVisible(true);
				jd.setSize(250, 100);
				jd.setLocationRelativeTo(panel);
			}
		});
		
		this.setSize(1600,900);
		this.setVisible(true);
		this.setTitle("MyCamp");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//centre the window
	    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
		this.setLocation(x, y);
	}
	
}
