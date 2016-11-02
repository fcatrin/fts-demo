package fts.demo;

import fts.core.Application;
import fts.core.Window;
import fts.swt.SWTFactory;
import fts.views.View;

public class Main {
	public static void main(String[] args) {
		Application app = new Application(new SWTFactory());
		Window window = app.createWindow();
		window.setTitle("First FTS window");
		
		View rootView = app.inflateView(window, "main");
		System.out.println(rootView);
		window.setContentView(rootView);
		window.open();
		window.mainLoop();
	}
}
