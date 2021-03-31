/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;

/**
 *
 * @author Tom
 */
public class MainFrameController implements Initializable {
    
    @FXML
    private ListView addressBooks;
    @FXML
    private TableView contactList;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> addrBooksItems = this.addressBooks.getItems();
        addrBooksItems.add("All contacts");
        addrBooksItems.add("Private contacts");
        addrBooksItems.add("Professional contacts");
        addrBooksItems.add("Student contacts");
    }
    
    public void addContact_OnClick() {
        ContactManagerFX.editContactDialog.show();
    }
    
}
