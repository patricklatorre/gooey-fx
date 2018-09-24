package test;

import com.sectionfx.Gooey;
import com.sectionfx.GooeyJob;

public class Incrementor extends GooeyJob
{
	@Override
	public void create() {
		mainGooey = Gooey.create().fromFXML("/test/incrementor.fxml").withScreen(250, 120);

		IncrementCtrl ctrl = mainGooey.getController(IncrementCtrl.class);

		ctrl.getIncrementBtn().setOnAction(e -> {
			ctrl.getNumber().setText("" + (Integer.parseInt(ctrl.getNumber().getText()) + 1));
		});

		window.showAndWait();
	}
}
