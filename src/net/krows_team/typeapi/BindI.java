package net.krows_team.typeapi;

/**
 * 
 * BindI interface implements an input bind for triggering by input method.
 * 
 * @since 0.0.1
 *
 * @author Krows
 * 
 */
public interface BindI {
	
/**
 * 
 * Returns true if a trigger key is equal to specified key.
 * 
 * @param key Trigger key.
 * 
 * @return True if a trigger key is equal to specified key.
 * 
 */
	public boolean isEqual(int key);
	
/**
 * 
 * Causes to trigger "press" event to bind if specified key is equal to a trigger key.
 * 
 * @param key Trigger key.
 * 
 */
	public void press(int key);

/**
 * 
 * Causes to trigger "release" event to bind if specified key is equal to a trigger key.
 * 
 * @param key Trigger key.
 * 
 */
	public void release(int key);
}