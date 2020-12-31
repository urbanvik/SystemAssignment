import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class SystemTestGUI extends Application {
	
	@Override
	public void start (Stage stage) {
		
		SystemAssignment mySystem4 = new SystemAssignment ("Part", "D", 425);
		
	// create and configure a non-editable text area to display the results      
		TextArea messageDisplay = new TextArea();        
		messageDisplay.setEditable(false);         
		messageDisplay.setMinSize(400,150);         
		messageDisplay.setMaxSize(200,200); 
		
   // create and configure Labels for menu options       
		Label option1 = new Label("1. Print System Details");    // Menu 1 label
		option1.setTextFill(Color.GREEN);         
		option1.setFont(Font.font("Arial", 15));   
		
		Label option2= new Label("2. Display System Properties");   // Menu 2 label
		option2.setTextFill(Color.GREEN);         
		option2.setFont(Font.font("Arial", 15));
		
		Label option3= new Label("3. Diagnose System");   // Menu 3 label
		option3.setTextFill(Color.GREEN);         
		option3.setFont(Font.font("Arial", 15));
		
		Label option4= new Label("4. Set Details");  // Menu 4 label   
		option4.setTextFill(Color.GREEN);         
		option4.setFont(Font.font("Arial", 15));
		
		Label option5= new Label("5. Quit the program");     // Menu 5 label    
		option5.setTextFill(Color.GREEN);         
		option5.setFont(Font.font("Arial", 15));
		
   // Create and configure menu buttons
		Button option1Button = new Button();     //menu selection button 1 
		option1Button.setText("Select");  
		option1Button.setOnAction( e ->                     
							{   
							messageDisplay.setText(mySystem4.displayDetails()); // print system details                                                                 
								}                                     
							); 
		
		Button option2Button = new Button();     //menu selection button 2
		option2Button.setText("Select");        
		option2Button.setOnAction( e ->                     
							{   
							messageDisplay.setText(mySystem4.displaySystemProperties() 
									+ "\n" + mySystem4.osMessage()); //print system properties                                                               
								}                                     
							); 
		 
		Button option3Button = new Button();     //menu selection button 3
		option3Button.setText("Select");        
		option3Button.setOnAction( e ->                     
							{   
							messageDisplay.setText(mySystem4.diagnoseSystem()); // print system diagnosis                                                             
								}                                     
							); 
		
		Button option4Button = new Button();     //menu selection button 4
		option4Button.setText("Select");        
		option4Button.setOnAction( e ->                     
							{   
							messageDisplay.setText("Button 4");
								
								}                                     
							); 
		
		Button option5Button = new Button();     //menu selection button 5
		option5Button.setText("Select");        
		option5Button.setOnAction( e ->                     
							{   
							messageDisplay.setText("Thanks for using the program.");                                                            
								}    
							); 
		
	// create and configure an HBox for the labels and text inputs                       
		HBox menu1 = new HBox(10);
		menu1.setAlignment(Pos.CENTER);        
		menu1.getChildren().addAll(option1, option1Button);  
		
		HBox menu2 = new HBox(10);
		menu2.setAlignment(Pos.CENTER);        
		menu2.getChildren().addAll(option2, option2Button);  
		
		HBox menu3 = new HBox(10);
		menu3.setAlignment(Pos.CENTER);        
		menu3.getChildren().addAll(option3, option3Button);  
		
		HBox menu4 = new HBox(10);
		menu4.setAlignment(Pos.CENTER);        
		menu4.getChildren().addAll(option4, option4Button);  
		
		HBox menu5 = new HBox(10);
		menu5.setAlignment(Pos.CENTER);        
		menu5.getChildren().addAll(option5, option5Button);  
		
		
	// create container to hold all menu components         
		VBox root = new VBox(10);         
		root.setAlignment(Pos.CENTER);        
		root.getChildren().addAll(menu1, menu2, menu3, menu4, menu5, messageDisplay); 
		
		
	// create scene and add it to the stage         
		Scene scene = new Scene(root, 500, 400);         
		stage.setScene(scene);         
		stage.setTitle("System Menu");        
		stage.show();  
	}


	public static void main(String[] args) {
		
		launch(args);
		

	}
}
