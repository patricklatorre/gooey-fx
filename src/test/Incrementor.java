package test;

import com.sectionfx.Gooey;
import javafx.stage.Stage;

public class Incrementor
{
	public static void show() {
		// Create gooey object for encapsulating incrementor.fxml and its controller
		Gooey gooey = Gooey.create()
				.fromFXML("/test/incrementor.fxml")
				.withScreen(250, 120);

		// Get incrementor.fxml's controller as 'ctrl' (for ease of reference)
		IncrementCtrl ctrl = gooey.getController(IncrementCtrl.class);

		// Set functionality : increment number on (+) button click
		ctrl.getIncrementBtn().setOnAction(e -> {
			ctrl.getNumber().setText("" + (Integer.parseInt(ctrl.getNumber().getText()) + 1));
		});

		// Create window, attach gooey to window, then show
		Stage window = new Stage();
		window.setScene(gooey.getScreen());
		window.showAndWait();
	}
}
