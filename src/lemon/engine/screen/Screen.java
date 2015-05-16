package lemon.engine.screen;

import lemon.engine.time.Timer;

public interface Screen {
	public void update(Timer timer);
	public void render();
}
