package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class BooksFormController {

    @FXML
    private JFXButton addBookBtn;

    @FXML
    private TableColumn<?, ?> bookAvailability;

    @FXML
    private TableColumn<?, ?> bookCategory;

    @FXML
    private TableColumn<?, ?> bookId;

    @FXML
    private TableColumn<?, ?> bookName;

    @FXML
    private TableColumn<?, ?> bookQty;

    @FXML
    private AnchorPane booksPane;

    @FXML
    private TableView<?> booksTableView;

    @FXML
    private JFXComboBox<?> booksType;

    @FXML
    private JFXComboBox<?> booksType1;

    @FXML
    private JFXButton searchBtn;

    @FXML
    private TextField searchTxt;

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
