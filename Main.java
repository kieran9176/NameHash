public class Main {

    public static int table_size = 130;
    public static dll main_hash_table[] = new dll[table_size];
    public static dll output_hash_table[] = new dll[table_size];

    public static void main(String[] args) {

        for (int k = 0; k < main_hash_table.length; k++) {
            main_hash_table[k] = new dll();
            output_hash_table[k] = new dll();
        }

        read.read_file();

    }
}
