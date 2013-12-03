package fighter.com.ui;

/**
 * Created with IntelliJ IDEA.
 * User: Fryslan
 * Date: 25-11-13
 * Time: 14:15
 */

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class UI extends Stage {

    public UI() {
        try {
            Parent parent = FXMLLoader.load(UI.class.getResource("C:/Users/Gebruiker/Documents/GitHub/HexbotProScritps/out/production/HexbotProScritps/fighter/ui/FighterUI.fxml"));
            Scene scene = new Scene(parent);
            setScene(scene);
            setTitle("FryslanFighter");
            show();
        } catch (IOException e) {e.printStackTrace(); }
    }
}
