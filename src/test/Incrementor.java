package test;

import com.sectionfx.Gooey;
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

		// Create gooey object for encapsulating incrementor.fxml and its controller
		Gooey gooey = Gooey.create()
				.fromFXML("/test/incrementor.fxml")
				.withScreen(250, 120);


		// Get incrementor.fxml's controller as 'ctrl'
		IncrementCtrl ctrl = gooey.getController(IncrementCtrl.class);

		// Set functionality : increment number on (+) button click
		ctrl.getIncrementBtn().setOnAction(e -> {
			ctrl.getNumber().setText("" + (Integer.parseInt(ctrl.getNumber().getText()) + 1));
		});

		// Attach the gooey to the window
		window.setScene(gooey.getScreen());

		// Show window
		window.showAndWait();
	}
}
