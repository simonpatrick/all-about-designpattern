package io.hedwig.jrefactoring.breakDepenency;

/**
 * Created by patrick on 15/10/29.
 */
public class AnimalFeedService {
    private boolean foodBowlEmpty;
    public void feed(){
        if(foodBowlEmpty) Feeder.replenishFood();
    }

}
