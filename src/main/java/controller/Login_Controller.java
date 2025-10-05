package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Login_Controller {
    public void login(ActionEvent actionEvent) {


    }

    public void goToSign(ActionEvent actionEvent) throws IOException {
        Stage SignUp = new Stage();
        SignUp.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/SignUp.fxml"))));
        SignUp.show();
    }
}
