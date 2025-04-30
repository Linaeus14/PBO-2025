import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class Controller {

    private Model model;
    private boolean isBlack = false; // Flag untuk warna latar belakang

    @FXML
    private Label view;

    @FXML
    private Button button1;

    @FXML
    private StackPane root;

    public void initialize() {
        model = new Model(System.getProperty("java.version"), System.getProperty("javafx.version"));
        view.setText("Hello, JavaFX " + model.fxVersion + "\nRunning on Java " + model.javaVersion + ".");
    }

    @FXML
    private void toggleBackgroundColor() {
        if (isBlack) {
            root.setStyle("-fx-background-color: white;");
            view.setStyle("-fx-text-fill: black;");
        } else {
            root.setStyle("-fx-background-color: black;");
            view.setStyle("-fx-text-fill: white;");
        }
        isBlack = !isBlack; // Ubah warna latar belakang
    }
}
