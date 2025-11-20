import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class MyController  {
	
    
    @FXML
    private TextField textField1;
    
    @FXML
    private TextField textField2;
   
    @FXML
    private Button b1;
    
    @FXML
    private Button b2;
    
    
	public void b1Method(){
		
        String textEntered = textField1.getText();
        
        String newText = textEntered + " : from the center text field!";
        textField2.setText(newText);
        b1.setDisable(true);
        b1.setText("pressed");

     
	}
	
	public void b2Method(){
		textField1.clear();
		textField2.clear();
		textField2.setText("final string goes here");
		b1.setDisable(false);
		b1.setText("button one");
		

        
     
	}
	
}
