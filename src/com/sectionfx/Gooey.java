package com.sectionfx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class Gooey
{
	protected Scene screen;
	protected Parent layout;
	protected FXController controller;

	public Gooey() {
		layout = null;
		controller = null;
		screen = null;
	}

	/**
	 * Factory method for creating an Gooey
	 * with null fields
	 *
	 * @return Gooey with null fields
	 * */
	public static Gooey create() {
		return new Gooey();
	}

	/**
	 * Sets the parent of the section via the
	 * project path URL of the respective FXML
	 *
	 * @return Gooey with a bound parent
	 * */
	public Gooey fromFXML(String URL) {
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
	 * @return Gooey with a bound scene
	 * */
	public Gooey withScreen(double width, double height) {
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
