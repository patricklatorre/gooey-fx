import javafx.application.Application;
import javafx.stage.Stage;
import test.Incrementor;

public class TestApp extends Application
{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Instantiate app
		Incrementor app = new Incrementor();

		// Show app
		app.show();
	}
}
