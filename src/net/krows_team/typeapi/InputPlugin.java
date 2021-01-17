package net.krows_team.typeapi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InputPlugin {
	
	protected Set<Integer> pressSet;
	protected Set<Integer> releaseSet;
	protected Set<BindI> bindSet;
	
	public InputPlugin() {

		bindSet = new HashSet<>();
		
		pressSet = new HashSet<>();
		
		releaseSet = new HashSet<>();
	}
	
	public void addBind(BindI bind) {
		
		bindSet.add(bind);
	}
	
	public void update() {
		
		for(BindI bind : bindSet) {
			
			pressSet.forEach(bind::press);
			
			releaseSet.forEach(bind::release);
		}
	}
	
	protected void applyKey(int key) {
		
		pressSet.add(key);
		
		releaseSet.remove(key);
	}
	
	protected void removeKey(int key) {
		
		releaseSet.add(key);
		
		pressSet.remove(key);
	}
	
	public List<Integer> getKeys() {
		
		return new ArrayList<>(pressSet);
	}
}