import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        //isi arraylist
        ListSepatu.tambahSepatu("Sepatu Nike", "42", "Hitam", "Rp. 1.000.000", "10");
        ListSepatu.tambahSepatu("Sepatu Adidas", "43", "Putih", "Rp. 1.500.000", "5");
        ListSepatu.tambahSepatu("Sepatu Puma", "44", "Merah", "Rp. 2.000.000", "3");

        Parent root = FXMLLoader.load(getClass().getResource("Library.fxml"));
        
        Scene scene = new Scene(root);

        stage.setTitle("Library Inventory");
        stage.getIcons().add(new Image("Library Inv.png"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}