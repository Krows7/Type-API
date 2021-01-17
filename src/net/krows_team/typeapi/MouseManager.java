package net.krows_team.typeapi;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

/**
 * 
 * KeyboardManager class implements an {@link InputPlugin} for mouse method.
 * 
 * @since 0.0.1
 *
 * @author Krows
 * 
 */
public class MouseManager extends InputPlugin implements MouseListener, MouseMotionListener, MouseWheelListener {
	
	private Point mousePoint;
	
	public MouseManager() {
		
		mousePoint = new Point();
	}
	
	public Point getMousePoint() {
		
		return (Point) mousePoint.clone();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		applyKey(e.getButton());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		removeKey(e.getButton());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
	
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
		mousePoint = e.getPoint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		mousePoint = e.getPoint();
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		
	}
}