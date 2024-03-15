package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class MembersFormController {

    @FXML
    private JFXButton addBookBtn;

    @FXML
    private TableColumn<?, ?> deleteMemberTC;

    @FXML
    private TableColumn<?, ?> emailTC;

    @FXML
    private TableColumn<?, ?> memberIdTC;

    @FXML
    private TableView<?> memberTableView;

    @FXML
    private JFXComboBox<?> membersJoinTimeCB;

    @FXML
    private AnchorPane membersPane;

    @FXML
    private JFXComboBox<?> membersReturnsCB;

    @FXML
    private TableColumn<?, ?> nameTC;

    @FXML
    private JFXButton searchBtn;

    @FXML
    private TextField searchTxt;

    @FXML
    private TableColumn<?, ?> totalBorrowingTC;

    @FXML
    void addBookBtnOnAction(ActionEvent event) {

    }

    @FXML
    void searchBtnOnAction(ActionEvent event) {

    }

    @FXML
    void searchTxtOnAction(ActionEvent event) {

    }

}
