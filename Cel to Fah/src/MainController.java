import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Button btnClear;

    @FXML
    private Button btnDisplay;

    @FXML
    private Button btnExit;

    @FXML
    private TextArea txtDisplay;

    @FXML
    private TextField txtEnd;

    @FXML
    private TextField txtStart;

    //clear method
    @FXML
    void clearMethod(ActionEvent event) 
    {
        txtStart.clear();
        txtEnd.clear();
        txtDisplay.clear();

    }
    

    @FXML
    void displayMethod(ActionEvent event) 
    {
        //taking user value and saving in variable named a and b
        double a = Double.parseDouble(txtStart.getText());
        double b = Double.parseDouble(txtEnd.getText());

        txtDisplay.setText("CELSIUS \t\t FAHRENHEIT \n");
        double val3=0;
        //for loop to print data for specific range
        for(;a <= b; a++)
        {
             val3 = (a*9/5)+32;
             txtDisplay.appendText(a + " \t\t\t" + val3+ "\n");
        }
       


    }

    //exit method
    @FXML
    void exitMethod(ActionEvent event) 
    {
        Alert a=new Alert(Alert.AlertType.CONFIRMATION); // new instance of alert to show when user click on exit button.
        a.setTitle("Confirmation Message ");  //to set title of exit page
        a.setContentText("Click Ok to exit! "); 
        a.showAndWait().ifPresent(response -> {
            if(response==ButtonType.OK)
            {
                System.exit(0);
            }
        });

    }

}
