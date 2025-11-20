import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class JavaFXTemplate extends Application {
	@Override
	public void start(Stage primaryStage) {
		 try {
	            // Read file fxml and draw interface.
	            Parent root = FXMLLoader.load(getClass()
	                    .getResource("/Myfxml2.fxml"));
	 
	            primaryStage.setTitle("Alexandra Golley Homework 3");
             Scene s1 = new Scene(root, 500,500);
             s1.getStylesheets().add("/style1.css");
	            primaryStage.setScene(s1);
	            primaryStage.show();
	         
	        } catch(Exception e) {
	            e.printStackTrace();
	            System.exit(1);
	        }
	}
	
	public static void main(String[] args) {
		launch(args);
	}


}
