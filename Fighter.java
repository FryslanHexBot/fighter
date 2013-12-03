package fighter;

import fighter.com.ui.UI;
import fighter.com.worker.Eat;
import fighter.com.worker.Kill;
import fighter.com.worker.Loot;
import javafx.application.Platform;
import org.hexbot.api.listeners.Paintable;
import org.hexbot.core.concurrent.script.Info;
import org.hexbot.core.concurrent.script.TaskScript;
import org.hexbot.core.concurrent.script.Type;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Fryslan
 * Date: 25-11-13
 * Time: 14:15
 */
@Info(author = "Fryslan", name = "Fryslan AIO Fighter", description = "Fryslan AIO Fighter", type = Type.COMBAT)
public class Fighter extends TaskScript implements Paintable {

    public Fighter(){
        submit(new Kill(), new Loot(), new Eat());
    }
    @Override
    public void onStart() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                new UI();
            }
        });

    }

    @Override
    public void paint(Graphics graphics) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
