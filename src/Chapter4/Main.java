package Chapter4;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage primarystage) {

                double conversion , piToAngle, angleInDegrees,result;
                conversion=(Math.PI)/7;

                piToAngle=Math.sin(conversion);
                angleInDegrees=Math.toDegrees(piToAngle);

                //var result its equal to the angle.
                result=angleInDegrees;

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle(null);
                alert.setHeaderText("The Angle of Pi/7 is: ");
                alert.setContentText(String.valueOf(Math.round(result)));
                alert.showAndWait();
                alert.getResult();            }
        }




