package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.AppInitializer;

public class DashboardFormController {

    @FXML
    private JFXButton booksBtn;

    @FXML
    private JFXButton branchesBtn;

    @FXML
    private ImageView closeBtn;

    @FXML
    private JFXButton dashboardBtn;

    @FXML
    private AnchorPane dashboardPane;

    @FXML
    private AnchorPane homePane;

    @FXML
    private JFXButton logoutBtn;

    @FXML
    private JFXButton membersBtn;

    @FXML
    private ImageView minusBtn;

    @FXML
    private JFXButton transactionBtn;

    @FXML
    private JFXButton usersBtn;

    @FXML
    void booksBtnOnAction(ActionEvent event) {

    }

    @FXML
    void branchesBtnOnAction(ActionEvent event) {

    }

    @FXML
    void closeBtnOnClicked(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    void dashboardBtnOnAction(ActionEvent event) {

    }

    @FXML
    void logoutBtnOnAction(ActionEvent event) {

    }

    @FXML
    void membersBtnOnAction(ActionEvent event) {

    }

    @FXML
    void minusBtnOnClicked(MouseEvent event) {
        AppInitializer.stage2.setIconified(true);
    }

    @FXML
    void transactionBtnOnAction(ActionEvent event) {

    }

    @FXML
    void usersBtnOnAction(ActionEvent event) {

    }

}