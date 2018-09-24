package com.sectionfx;

import javafx.stage.Stage;

public abstract class GooeyJob
{
	protected Stage window;
	protected Gooey mainGooey;

	public GooeyJob() {
		window = new Stage();
		create();
		window.setScene(mainGooey.getScreen());
	}

	public Stage getWindow() {
		return window;
	}

	public Gooey getMainGooey() {
		return mainGooey;
	}

	public void setMainGooey(Gooey mainGooey) {
		this.mainGooey = mainGooey;
	}

	public abstract void create();
}
