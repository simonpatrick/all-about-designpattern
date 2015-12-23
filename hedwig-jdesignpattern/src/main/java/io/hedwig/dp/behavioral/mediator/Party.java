package io.hedwig.dp.behavioral.mediator;

/**
 * 
 * Party interface.
 * 
 */
public interface Party {

	void addMember(PartyMember member);

	void act(PartyMember actor, Action action);

}
