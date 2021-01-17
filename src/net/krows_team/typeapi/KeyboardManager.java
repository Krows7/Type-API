package net.krows_team.typeapi;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 
 * KeyboardManager class implements an {@link InputPlugin} for keyboard method.
 * 
 * @since 0.0.1
 *
 * @author Krows
 * 
 */
public class KeyboardManager extends InputPlugin implements KeyListener {
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		applyKey(e.getKeyCode());
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		
		removeKey(e.getKeyCode());
	}
}