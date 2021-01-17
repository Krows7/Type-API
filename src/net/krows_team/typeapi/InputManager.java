package net.krows_team.typeapi;

import java.util.HashMap;
import java.util.Map;

public class InputManager {
	
	private Map<Class<? extends InputPlugin>, InputPlugin> inputMap;
	
	public InputManager() {
		
		inputMap = new HashMap<>();
	}
	
	public void update() {
		
		inputMap.values().forEach(InputPlugin::update);
	}
	
	public void addInputManager(InputPlugin manager) {
		
		inputMap.put(manager.getClass(), manager);
	}
	
	@SuppressWarnings("unchecked")
	public <T extends InputPlugin> T getInputManager(Class<T> clazz) {
		
		return (T) inputMap.get(clazz);
	}
	
	public MouseManager getMouseManager() {
		
		return getInputManager(MouseManager.class);
	}
	
	public KeyboardManager getKeyboardManager() {
		
		return getInputManager(KeyboardManager.class);
	}
}