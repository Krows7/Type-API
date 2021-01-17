package net.krows_team.typeapi;

import java.util.function.Consumer;

public class Bind implements BindI {
	
	protected int key;
	
	protected Consumer<Bind> script;
	protected Consumer<Bind> onRelease;
	
	protected boolean pressed;
	protected boolean type;
	
/**
 * 
 * 
 * 
 */
	public Bind(int key, Runnable script) {
		
		this(key, false, bind -> script.run());
	}
	
	public Bind(int key, boolean type, Consumer<Bind> script) {
		
		this(key, type, script, b -> {});
	}
	
	public Bind(int key, boolean type, Consumer<Bind> script, Consumer<Bind> onRelease) {
		
		this.key = key;
		
		this.type = type;
		
		this.script = script;
		
		this.onRelease = onRelease;
	}
	
	@Override
	public void press(int key) {
		
		if(!isEqual(key)) return;
		if(pressed && type) return;
		
		pressed = true;
		
		script.accept(this);
	}
	
	@Override
	public boolean isEqual(int key) {
		
		return this.key == key;
	}
	
	@Override
	public void release(int key) {
		
		if(!isEqual(key)) return;
		
		pressed = false;
		
		onRelease.accept(this);
	}
}