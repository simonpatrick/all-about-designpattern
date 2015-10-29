package io.hedwig.jrefactoring.breakDepenency.refactored;

/**
 * Created by patrick on 15/10/29.
 */
public class AnimalFeedServiceRefactor {
    public AnimalFeedServiceRefactor(IFeederService feederService) {
        this.feederService = feederService;
    }

    public IFeederService feederService;

    public void feed(){
        feederService.replenishFood();
    }

}
