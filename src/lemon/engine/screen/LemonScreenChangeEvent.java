package lemon.engine.screen;

public class LemonScreenChangeEvent implements ScreenChangeEvent {
	private Screen from;
	private Screen to;
	public LemonScreenChangeEvent(Screen from, Screen to){
		this.from = from;
		this.to = to;
	}
	@Override
	public Screen getScreenFrom() {
		return from;
	}
	@Override
	public Screen getScreenTo() {
		return to;
	}
}
