import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SimpleJavaFXApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        //Create a new button
        Button button = new Button("Click me!");

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello, World!");
            }
        });  
        primaryStage.setTitle("Simple JavaFX App");
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
