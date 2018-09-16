package com.sectionfx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class FXSection
{
	protected Scene screen;
	protected Parent layout;
	protected FXController controller;

	public FXSection() {
		layout = null;
		controller = null;
		screen = null;
	}

	/**
	 * Factory method for creating an FXSection
	 * with null fields
	 *
	 * @return FXSection with null fields
	 * */
	public static FXSection create() {
		return new FXSection();
	}

	/**
	 * Sets the parent of the section via the
	 * project path URL of the respective FXML
	 *
	 * @return FXSection with a bound parent
	 * */
	public FXSection fromFXML(String URL) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(URL));
		this.layout = null;

		try {
			this.layout = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}

		controller = loader.getController();

		return this;
	}

	/**
	 * Sets a scene object for the section and
	 * specifies its width and height
	 *
	 * @param width width of scene
	 * @param height height of scene
	 * @return FXSection with a bound scene
	 * */
	public FXSection withScreen(double width, double height) {
		screen = new Scene(layout, width, height);
		return this;
	}

	/**
	 * Getter for bound scene
	 *
	 * @return bound scene
	 * */
	public Scene getScreen() {
		return screen;
	}

	/**
	 * Getter for bound parent
	 *
	 * @return bound parent
	 * */
	public Parent getLayout() {
		return layout;
	}

	/**
	 * Getter for generic controller
	 *
	 * @return bound controller of fxml
	 * */
	public <T extends FXController> T getController(Class<T> type) {
		return (T) controller;
	}
}
