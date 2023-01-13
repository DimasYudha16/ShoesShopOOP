import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import java.util.ResourceBundle;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


public class Controller implements Initializable { // untukk nge get value dari fxml

    @FXML
    private TextField namaSepatu;

    @FXML
    private TextField ukuranSepatu;

    @FXML
    private TextField warnaSepatu;

    @FXML
    private TextField jumlah;

    @FXML
    private TextField hargaSepatu;

    @FXML
    private Button tambah;

    @FXML
    private Button hapus;

    @FXML
    private Button perbarui;

    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == tambah) {
            String namaS = namaSepatu.getText();
            String ukuranS = ukuranSepatu.getText();
            String warnaS = warnaSepatu.getText();  
            String hargaS = hargaSepatu.getText();
            String jumlahS = jumlah.getText();

            ListSepatu.tambahSepatu(namaS, ukuranS, warnaS, hargaS, jumlahS);

            ListSepatu.displayListSepatu();

            // try {
            //     FXMLLoader loader = new FXMLLoader();
            //     loader.setLocation(getClass().getResource("../fxml/RegisterPage.fxml"));
            //     Parent root = loader.load();
            //     pnlChange.getChildren().setAll(root);
            // } catch (Exception e) {
            //     // TODO: handle exception
            // }
        }
    }
}
