package io.hedwig.hellodesignpattern;

import io.hedwig.wingspainter.DomainMapperPainter;

import java.io.File;
import java.io.IOException;

/**
 * Created by patrick on 15/12/1.
 */
public class Painter {
    //behavior
//    - get different package name for different classes
//    - write to file and use command to generate png file
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = Painter.class.getClassLoader().getResource("").getPath() +
                "io/hedwig/hellodesignpattern";
        String basePackageName = "io.hedwig.hellodesignpattern";
        System.out.println(path.equals(path));
        System.out.println(path);
        File file = new File(path);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File childFile : files) {
                if (childFile.isDirectory()) {
                    String packageSimpleName = childFile.getName();
                    File[] fs = childFile.listFiles();
                    assert fs != null;
                    for (File f : fs) {
                        if (f.isDirectory()) {
                            System.out.println(packageSimpleName);
                            System.out.println(f.getName());
                            System.out.println(basePackageName + "." + packageSimpleName + "." + f.getName());
                            DomainMapperPainter.build()
                                    .addPackage(basePackageName + "." + packageSimpleName + "." + f.getName())
                                    .writeTo(f.getName() + ".dot").paint();
                        }
                    }
                }
            }
        }


    }
}
