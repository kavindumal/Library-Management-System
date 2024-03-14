package lk.ijse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.ImageCursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Objects;

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public static Stage stage2;

    @Override
    public void start(Stage stage) throws Exception {
        Parent rootNode = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/loginForm.fxml")));
        Scene scene = new Scene(rootNode);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.centerOnScreen();
        stage.setScene(scene);
        this.stage2 =stage;
        stage.show();
    }
}
