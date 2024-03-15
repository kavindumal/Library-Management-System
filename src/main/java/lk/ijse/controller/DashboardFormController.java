package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.AppInitializer;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class DashboardFormController implements Initializable {

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
    private ImageView dashboardImage;

    @FXML
    private ImageView transactionsImg;

    @FXML
    private ImageView usersImg;

    @FXML
    private ImageView branchesImg;

    @FXML
    private ImageView membersImg;

    @FXML
    private ImageView booksImg;

    @FXML
    private JFXButton transactionBtn;

    @FXML
    private JFXButton usersBtn;

    int count = 0;

    @FXML
    void booksBtnOnAction(ActionEvent event) {
        loadPage();
        booksImg.setImage(new Image("/img/booksIconOnClicked.png"));
        booksBtn.setStyle("-fx-content-display: left; -fx-background-color: #EFF9FE; -fx-text-fill: #0D78AA; -fx-font-size: 21px; -fx-background-radius: 20px");
        count = 2;
        homePane.getChildren().clear();
        try {
            homePane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/booksForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void branchesBtnOnAction(ActionEvent event) {
        loadPage();
        branchesImg.setImage(new Image("/img/branchesIconOnClicked.png"));
        branchesBtn.setStyle("-fx-content-display: left; -fx-background-color: #EFF9FE; -fx-text-fill: #0D78AA; -fx-font-size: 21px; -fx-background-radius: 20px");
        count = 4;
        homePane.getChildren().clear();
        try {
            homePane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/branchesForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void closeBtnOnClicked(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    void dashboardBtnOnAction(ActionEvent event) {
        loadPage();
        dashboardImage.setImage(new Image("/img/dashboardIconClicked.png"));
        dashboardBtn.setStyle("-fx-content-display: left; -fx-background-color: #EFF9FE; -fx-text-fill: #0D78AA; -fx-font-size: 21px; -fx-background-radius: 20px");
        count = 1;
        homePane.getChildren().clear();
        try {
            homePane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/homeForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void logoutBtnOnAction(ActionEvent event) {

    }

    @FXML
    void membersBtnOnAction(ActionEvent event) {
        loadPage();
        membersImg.setImage(new Image("/img/membersIconOnClicked.png"));
        membersBtn.setStyle("-fx-content-display: left; -fx-background-color: #EFF9FE; -fx-text-fill: #0D78AA; -fx-font-size: 21px; -fx-background-radius: 20px");
        count = 3;
        homePane.getChildren().clear();
        try {
            homePane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/membersForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void minusBtnOnClicked(MouseEvent event) {
        AppInitializer.stage2.setIconified(true);
    }

    @FXML
    void transactionBtnOnAction(ActionEvent event) {
        loadPage();
        transactionsImg.setImage(new Image("/img/transactionIconOnClicked.png"));
        transactionBtn.setStyle("-fx-content-display: left; -fx-background-color: #EFF9FE; -fx-text-fill: #0D78AA; -fx-font-size: 21px; -fx-background-radius: 20px");
        count = 6;
        homePane.getChildren().clear();
        try {
            homePane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/transactionsForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void usersBtnOnAction(ActionEvent event) {
        loadPage();
        usersImg.setImage(new Image("/img/settingsIconClicked.png"));
        usersBtn.setStyle("-fx-content-display: left; -fx-background-color: #EFF9FE; -fx-text-fill: #0D78AA; -fx-font-size: 21px; -fx-background-radius: 20px");
        count = 5;
        homePane.getChildren().clear();
        try {
            homePane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/usersForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void loadPage() {
        if (count == 1) {
            dashboardImage.setImage(new Image("/img/dashboardIcon.png"));
            dashboardBtn.setStyle("-fx-content-display: text; -fx-background-color: transparent; -fx-text-fill: #EFF9FE; -fx-font-size: 21px; -fx-background-radius: 20px");
        } else if (count == 2) {
            booksImg.setImage(new Image("/img/booksicon.png"));
            booksBtn.setStyle("-fx-content-display: text; -fx-background-color: transparent; -fx-text-fill: #EFF9FE; -fx-font-size: 21px; -fx-background-radius: 20px");
        } else if (count == 3) {
            membersImg.setImage(new Image("/img/membersIcon.png"));
            membersBtn.setStyle("-fx-content-display: text; -fx-background-color: transparent; -fx-text-fill: #EFF9FE; -fx-font-size: 21px; -fx-background-radius: 20px");
        } else if (count == 4) {
            branchesImg.setImage(new Image("/img/branchesIcon.png"));
            branchesBtn.setStyle("-fx-content-display: text; -fx-background-color: transparent; -fx-text-fill: #EFF9FE; -fx-font-size: 21px; -fx-background-radius: 20px");
        } else if (count == 5) {
            usersImg.setImage(new Image("/img/settingsIcon.png"));
            usersBtn.setStyle("-fx-content-display: text; -fx-background-color: transparent; -fx-text-fill: #EFF9FE; -fx-font-size: 21px; -fx-background-radius: 20px");
        } else if (count == 6) {
            transactionsImg.setImage(new Image("/img/transactionIcon.png"));
            transactionBtn.setStyle("-fx-content-display: text; -fx-background-color: transparent; -fx-text-fill: #EFF9FE; -fx-font-size: 21px; -fx-background-radius: 20px");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadUi();
    }

    private void loadUi() {
        count = 1;
        dashboardBtn.fire();
        homePane.getChildren().clear();
        try {
            homePane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/homeForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}