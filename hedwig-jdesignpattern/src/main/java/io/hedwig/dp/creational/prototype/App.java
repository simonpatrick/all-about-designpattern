package io.hedwig.dp.creational.prototype;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class App {
    public static void main(String[] args) {




        Factory f=new FactoryImpl(new ElfSam(),
                new ElfBeast(),
                new ElfAdams());
        Sam sam = f.createSame();
        Adams adams = f.createAdams();
        Beast beast = f.createBeast();

        System.out.println(sam);
        System.out.println(adams);
        System.out.println(beast);
    }
}
