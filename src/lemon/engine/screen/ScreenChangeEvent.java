package lemon.engine.screen;

import lemon.engine.event.Event;

public interface ScreenChangeEvent extends Event {
	public Screen getScreenFrom();
	public Screen getScreenTo();
}
