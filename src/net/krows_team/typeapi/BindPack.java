package net.krows_team.typeapi;

import java.util.Arrays;
import java.util.List;

public class BindPack implements BindI {
	
	protected List<BindI> bindList;
	
	public BindPack(BindI... binds) {
		
		bindList = Arrays.asList(binds);
	}

	@Override
	public boolean isEqual(int key) {
		
		for(BindI bind : bindList) if(bind.isEqual(key)) return true;
		
		return false;
	}
	
	@Override
	public void press(int key) {
		
		bindList.forEach(bind -> bind.press(key));
	}
	
	@Override
	public void release(int key) {
		
		bindList.forEach(bind -> bind.release(key));
	}
}