package fts.demo;

import fts.core.Application;
import fts.core.Window;
import fts.swt.SWTFactory;

public class Main {
	public static void main(String[] args) {
		Application app = new Application(new SWTFactory());
		Window window = app.createWindow();
		window.setTitle("First FTS window");
		window.open();
		window.mainLoop();
	}
}
