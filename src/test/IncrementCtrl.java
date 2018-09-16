package test;

import java.net.URL;
import java.util.ResourceBundle;

import com.sectionfx.FXController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class IncrementCtrl extends FXController
{

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Label number;

	@FXML
	private Button incrementBtn;

	@FXML
	void initialize() {
		assert number != null : "fx:id=\"number\" was not injected: check your FXML file 'incrementor.fxml'.";
		assert incrementBtn != null : "fx:id=\"incrementBtn\" was not injected: check your FXML file 'incrementor.fxml'.";

	}

	public ResourceBundle getResources() {
		return resources;
	}

	public void setResources(ResourceBundle resources) {
		this.resources = resources;
	}

	public URL getLocation() {
		return location;
	}

	public void setLocation(URL location) {
		this.location = location;
	}

	public Label getNumber() {
		return number;
	}

	public void setNumber(Label number) {
		this.number = number;
	}

	public Button getIncrementBtn() {
		return incrementBtn;
	}

	public void setIncrementBtn(Button incrementBtn) {
		this.incrementBtn = incrementBtn;
	}
}
