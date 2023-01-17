
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import java.util.ResourceBundle;
import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
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
    private TextField IdSepatu;
    @FXML
    private TextField test;

    @FXML
    private Label idListShoes;

    @FXML
    private Label namaListSepatu;

    @FXML
    private Label ukuranListSepatu;

    @FXML
    private Label warnaListSepatu;

    @FXML
    private Label jumlahListSepatu;

    @FXML
    private Label hargaListSepatu;

    @FXML
    private Button tambah;

    @FXML
    private Button butHapus;

    @FXML
    private Button butPerbarui;

    @FXML
    private Button butEdit;

    @FXML
    private VBox pnItemsBook;

    @FXML
    private AnchorPane pnlChange;

    public void initialize(URL location, ResourceBundle resources) {
        Node[] nodes = new Node[1000];
        for (int i = 0; i < ListSepatu.getSize(); i++) {
            try {
                final int j = i;
                nodes[i] = FXMLLoader.load(getClass().getResource("ListShoesItem.fxml"));

                // give the items some effect
                nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color : #0A0E3F");
                });
                nodes[i].setOnMouseExited(event -> {
                    nodes[j].setStyle("-fx-background-color : #02030A");
                });

                // // set the data to the labels
                idListShoes = (Label) nodes[i].lookup("#idListShoes");
                idListShoes.setText((i + 1) + "");

                namaListSepatu = (Label) nodes[i].lookup("#namaListSepatu");
                namaListSepatu.setText(ListSepatu.getNamaSepatu(i));

                ukuranListSepatu = (Label) nodes[i].lookup("#ukuranListSepatu");
                ukuranListSepatu.setText(ListSepatu.getUkuranSepatu(i));

                warnaListSepatu = (Label) nodes[i].lookup("#warnaListSepatu");
                warnaListSepatu.setText(ListSepatu.getWarnaSepatu(i));

                jumlahListSepatu = (Label) nodes[i].lookup("#jumlahListSepatu");
                jumlahListSepatu.setText(ListSepatu.getJumlahSepatu(i));

                hargaListSepatu = (Label) nodes[i].lookup("#hargaListSepatu");
                hargaListSepatu.setText(ListSepatu.getHargaSepatu(i));

                pnItemsBook.getChildren().add(nodes[i]);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
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

            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Library.fxml"));
                Parent root = loader.load();
                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
            }
        } else if (event.getSource() == butHapus) {

            try {
                int index = Integer.parseInt(IdSepatu.getText()) - 1;

                ListSepatu.removeSepatu(index);

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Library.fxml"));
                Parent root = loader.load();
                pnlChange.getChildren().setAll(root);

            } catch (Exception e) {
            }
        } else if (event.getSource() == butPerbarui) {

            int index = Integer.parseInt(IdSepatu.getText()) - 1;
            namaSepatu.setText(ListSepatu.getNamaSepatu(index));
            ukuranSepatu.setText(ListSepatu.getUkuranSepatu(index));
            warnaSepatu.setText(ListSepatu.getWarnaSepatu(index));
            hargaSepatu.setText(ListSepatu.getHargaSepatu(index));
            jumlah.setText(ListSepatu.getJumlahSepatu(index));


        } else if (event.getSource() == butEdit) {

            try {
                String namaS = namaSepatu.getText();
                String ukuranS = ukuranSepatu.getText();
                String warnaS = warnaSepatu.getText();
                String hargaS = hargaSepatu.getText();
                String jumlahS = jumlah.getText();
    
                int index = Integer.parseInt(IdSepatu.getText()) - 1;   
    
                ListSepatu.editSepatu(index, namaS, ukuranS, warnaS, hargaS, jumlahS);

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Library.fxml"));
                Parent root = loader.load();
                pnlChange.getChildren().setAll(root);

            } catch (Exception e) {
            }
        }
    }

}
