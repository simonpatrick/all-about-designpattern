package io.hedwig.jdesignpattern.builder;

/**
 * Created by patrick on 15/9/26.
 */
public class DataHolder { //immutable

    private String data;
    //ImmutableMap.ImmutableList

    public DataHolder(String data) {
        this.data = data;
    }
}
