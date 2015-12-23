package io.hedwig.dp.more.eventaggregator;

/**
 * 
 * Observers of events implement this interface.
 *
 */
public interface EventObserver {
	
	void onEvent(Event e);

}
