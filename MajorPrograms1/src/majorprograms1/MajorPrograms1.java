
package majorprograms1;

import java.util.Scanner;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javax.swing.JOptionPane;

/**
 *
 * @author andyvo
 */
public class MajorPrograms1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           TimeBlock tb = new TimeBlock();
           Appointment Apmt = new Appointment();
           Course core = new Course();
           core.setCourseName("Test");
           
           JOptionPane.showMessageDialog(null, core.toString());
           
           String h = "";
           if (args[0].isEmpty()) {
                System.out.println ("enter filename");
                
                Scanner scanner = new Scanner ( System.in);
                h = scanner.next();
            } else {
            h = args[0];
            }
    
                       
    }
           
          /* Alert alert = new Alert(AlertType.INFORMATION);
             alert.setTitle("Information Dialog");
             alert.setHeaderText("Look, an Information Dialog");
             alert.setContentText(core.toString());
             
             alert.showAndWait(); **/
                                        


    

    }
    

