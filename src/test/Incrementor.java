package test;

import com.sectionfx.FXSection;
import javafx.stage.Stage;

public class Incrementor
{
	private Stage window;

	/**
	 * Shows an app that simply increments a
	 * number upon clicking a button
	 * */
	public void show() {
		// Create window
		window = new Stage();
		window.setTitle("Incrementor");

		// Create section for incrementor.fxml
		FXSection section = FXSection.create()
				.fromFXML("/test/incrementor.fxml")
				.withScreen(250, 120);

		// Reference 'section' controller as 'ctrl'
		IncrementCtrl ctrl = section.getController(IncrementCtrl.class);

		// Increment text on (+) click
		ctrl.getIncrementBtn().setOnAction(e -> {
			ctrl.getNumber().setText("" + (Integer.parseInt(ctrl.getNumber().getText()) + 1));
		});

		// Set scene
		window.setScene(section.getScreen());

		// Show window
		window.showAndWait();
	}
}
