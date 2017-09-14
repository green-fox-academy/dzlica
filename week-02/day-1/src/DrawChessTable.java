public class DrawChessTable {
    public static void main(String[] args) {
        String[] chesstable = {"% % % % "};
        int j = 0;
        while (j < 4) {

            for (int i = 0; i < chesstable.length; i++) {
                System.out.println(chesstable[i]);
                for (int z = 0; z < chesstable.length; z = z + 2) {
                        System.out.println(" " + chesstable[i]);
                    }
                }
            j++;
            }
        }
    }