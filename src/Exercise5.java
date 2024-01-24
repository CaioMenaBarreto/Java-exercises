public class Exercise5 {
    public static void main(String[] args) {
        String[] array1 = {"Morango", "Banana", "Maçã", "Uva", "Caqui"};
        String[] array2 = {"Manga", "Caqui", "Morango", "Amora"};

        for (int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]){
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
