package pl.pk.pointofsale.models;

import javafx.scene.control.Alert;

public class Utils {
    public static void createSimpleDialog(String message){
        Alert alert =  new Alert (Alert.AlertType.INFORMATION);
        alert.setContentText(message);
        alert.show();
    }
}
