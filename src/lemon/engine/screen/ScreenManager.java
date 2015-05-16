package lemon.engine.screen;

import java.util.Stack;

import lemon.engine.event.EventManager;

public class ScreenManager {
	private static Stack<Screen> screens;
	private static Screen currentScreen; //cache;
	static{
		screens = new Stack<Screen>();
		currentScreen = null;
		pushScreen(null);
	}
	public static Screen pushScreen(Screen screen){
		EventManager.callListeners(new LemonScreenChangeEvent(currentScreen, screen));
		ScreenManager.currentScreen = screen;
		return screens.push(screen);
	}
	public static Screen popScreen(){
		Screen screen = screens.pop();
		if(screen==null){
			screens.push(screen);
			throw new IllegalStateException("No Screens!");
		}
		ScreenManager.currentScreen = screens.lastElement();
		EventManager.callListeners(new LemonScreenChangeEvent(screen, currentScreen));
		return screen;
	}
	public static Screen getCurrentScreen(){
		return currentScreen;
	}
	public static Screen[] getScreens(){
		return screens.toArray(new Screen[]{});
	}
}
