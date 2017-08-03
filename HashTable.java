/**
 * Created by kieranderfus on 4/22/17.
 */
public class HashTable {

    public static int HashFunc (String word) {

        int word_length = word.length();
        double ascii_sum = 0;

        int index;

        for (int i = 0; i < word_length; i++) {

            char character = word.charAt(i);
            int ascii = (int)character;

            ascii_sum = (ascii * (Math.pow(7, i))); // 7 is arbitrary prime number

        }

        index = (int)(ascii_sum % Main.table_size);
        return index;

    }

    public static void Insert1 (String temp_word) {

        int index;
        index = HashTable.HashFunc(temp_word); //gets HashCode

        listcell temp = new listcell(temp_word); // creates new listcell

        if (Main.main_hash_table[index].search(temp_word) == null) { // searches index's dll for word

            Main.main_hash_table[index].append(temp);
            //if search returns null, appends new listcell to index's dll

        }
    }

    public static void Insert2 (String temp_word) {

        int index;
        index = HashTable.HashFunc(temp_word); //gets HashCode

        listcell temp = new listcell(temp_word); // creates new listcell

        if (Main.main_hash_table[index].search(temp_word) == null) { // searches index's dll for word

            // do nothing! nothing at all!
        }
        else if (Main.output_hash_table[index].search(temp_word) == null) {

            Main.output_hash_table[index].append(temp);
            System.out.println(temp_word);

        }
    }
}
