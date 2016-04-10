package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Vadim on 20.03.2016.
 */
public class Exceptions {
    public static void main(String[] args) throws FileNotFoundException {

        openFile();
        System.out.println("Finished !");

    }

    public static void openFile() throws FileNotFoundException {
        File myF = new File("sample.txt");

        FileReader fr = new FileReader(myF);

/*        try {
            FileReader fr = new FileReader(myF);
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("File not found !");
        }*/

        System.out.println("In openFile() function.");

    }

}
