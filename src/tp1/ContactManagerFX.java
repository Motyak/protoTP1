/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Tom
 */
public class ContactManagerFX extends Application {
    
    public static Stage editContactDialog;
    public static Stage addPhoneNumberDialog;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainFrame.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        this.createEditContactDialog(stage);
        this.createAddPhoneNumberDialog(ContactManagerFX.editContactDialog);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    private void createEditContactDialog(Stage parent) throws IOException {
        ContactManagerFX.editContactDialog = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("ContactEditor.fxml"));
        Scene scene = new Scene(root);
        ContactManagerFX.editContactDialog.setScene(scene);
        
        ContactManagerFX.editContactDialog.initOwner(parent);
        ContactManagerFX.editContactDialog.initModality(Modality.APPLICATION_MODAL);
        ContactManagerFX.editContactDialog.initStyle(StageStyle.UTILITY);
        ContactManagerFX.editContactDialog.setResizable(false);
    }
    
    private void createAddPhoneNumberDialog(Stage parent) throws IOException {
        ContactManagerFX.addPhoneNumberDialog = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("AddPhoneNumber.fxml"));
        Scene scene = new Scene(root);
        ContactManagerFX.addPhoneNumberDialog.setScene(scene);
        
        ContactManagerFX.addPhoneNumberDialog.initOwner(parent);
        ContactManagerFX.addPhoneNumberDialog.initModality(Modality.APPLICATION_MODAL);
        ContactManagerFX.addPhoneNumberDialog.initStyle(StageStyle.UTILITY);
        ContactManagerFX.addPhoneNumberDialog.setResizable(false);
    }
    
}
