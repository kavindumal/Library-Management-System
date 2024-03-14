package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.AppInitializer;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class LoginFormController implements Initializable {

    @FXML
    private ImageView closeBtn;

    @FXML
    private JFXButton loginBtn;

    @FXML
    private AnchorPane loginPane;

    @FXML
    private AnchorPane mainPane;

    @FXML
    private ImageView minusBtn;

    @FXML
    private PasswordField passwordTxt;

    @FXML
    private ImageView passwordVisibleBtn;

    @FXML
    private TextField usernameTxt;

    @FXML
    void closeBtnOnClicked(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    void loginBtnOnAction(ActionEvent event) {
        loginPane.getChildren().clear();
        try {
            loginPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/dashboardForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void minusBtnOnClicked(MouseEvent event) {
        AppInitializer.stage2.setIconified(true);
    }

    @FXML
    void passwordTxtOnAction(ActionEvent event) {

    }

    @FXML
    void passwordVisibleBtnOnClicked(MouseEvent event) {

    }

    @FXML
    void usernameTxtOnAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        usernameTxt.requestFocus();
    }
}
