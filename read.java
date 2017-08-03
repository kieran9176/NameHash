import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by kieranderfus on 4/22/17.
 */

public class read {
    public static void read_file () {

        Scanner sam1 = null;
        Scanner sam2 = null;
        String temp_word1 = null;
        String temp_word2 = null;
        float data = 0;

        try {
            // sam1 = new Scanner(new File( "names1.txt" )) ;
            sam1 = new Scanner(new File("/Users/kieranderfus/IdeaProjects/PA4_HashTables/src/names1.txt"));

            // sam2 = new Scanner(new File( "names2.txt" )) ;
            sam2 = new Scanner(new File("/Users/kieranderfus/IdeaProjects/PA4_HashTables/src/names2.txt"));

        } catch (
                FileNotFoundException oops)

        {
            System.out.println("File Not Found.");
            return;
        }

        boolean loop1;
        loop1 = true;
        int i = 0;

        do {

            try {

                temp_word1 = sam1.next(); // gets word from file
                HashTable.Insert1(temp_word1);

                // temp_word2 = sam2.next(); // gets word from file
                // HashTable.Insert(temp_word2);

                // i++;

            } catch (InputMismatchException badI) {

            } catch (NoSuchElementException at_eof) {
                loop1 = false;
            }

        } while (loop1 && i<20);


        boolean loop2;
        loop2 = true;

        do {

            try {

                //temp_word1 = sam1.next(); // gets word from file
                //HashTable.Insert(temp_word1);

                temp_word2 = sam2.next(); // gets word from file
                HashTable.Insert2(temp_word2);

                // i++;

            } catch (InputMismatchException badI) {

            } catch (NoSuchElementException at_eof) {
                loop2 = false;
            }

        } while (loop2);

    }
}
