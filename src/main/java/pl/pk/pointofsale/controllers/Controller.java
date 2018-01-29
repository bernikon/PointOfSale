package pl.pk.pointofsale.controllers;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import pl.pk.pointofsale.models.MysqlConnector;
import pl.pk.pointofsale.models.Utils;
import pl.pk.pointofsale.models.dao.ProductDao;
import pl.pk.pointofsale.models.dao.impl.ProductDaoImpl;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    Button buttonEnter, buttonExit;


    @FXML
    TextField textBarcode, textLCD;

    private ProductDao productDao = new ProductDaoImpl();

    public void initialize(URL location, ResourceBundle resources) {
        // MysqlConnector.getInstance();
        buttonEnter.setOnMouseClicked(e -> showProduct());


    }

    private boolean checkBarcodeData() {
        String barcode = textBarcode.getText();

        if (barcode.isEmpty()) {
            Utils.createSimpleDialog("Info", "Wprowadzanie kodu kreskowego", "Nieprawidłowy kod kreskowy");
            return false;
        }
        return true;
    }


    private void showProduct() {
        String barcode = textBarcode.getText();
        // ...


        if (!checkBarcodeData()) {
            return;
        }
    }
}
