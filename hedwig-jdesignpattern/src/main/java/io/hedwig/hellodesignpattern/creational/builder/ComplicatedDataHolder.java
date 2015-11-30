package io.hedwig.hellodesignpattern.creational.builder;

/**
 * Created by patrick on 15/9/26.
 */
public class ComplicatedDataHolder {

    private final String data;
    private final int num;

    public ComplicatedDataHolder(String data, int num) {
        this.data = data;
        this.num = num;
    }

    @Override
    public String toString() {
        return "ComplicatedDataHolder{" +
                "data='" + data + '\'' +
                ", num=" + num +
                '}';
    }

    public static class Builder{
        private String data;
        private int num;

        public Builder data(String data){
            this.data=data;
            return this;
        }

        public Builder num(int num){
            this.num=num;
            return this;
        }
        public ComplicatedDataHolder build(){
            return new ComplicatedDataHolder(data,num);
        }
    }

    public static void main(String[] args) {
        final ComplicatedDataHolder h = new ComplicatedDataHolder.Builder()
                .data("this").num(1234).build();
        System.out.println(h);
    }
}
