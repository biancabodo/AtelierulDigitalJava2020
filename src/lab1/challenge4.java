package lab1;

public class challenge4 {
    public static void main(String[] args) {
        int[] array = {-1,-1,-1,2};
        int counter = 0;

        for(int i = 0; i<array.length-2;i++){
            for(int j = i+1; j<array.length -1;j++){
                for(int k=j+1; k<array.length;k++) {

                    if ((array[i] + array[j] + array[k] == 0) && (array[i] != 0) && (array[j] != 0) && (array[k] != 0)) {
                        counter += 1;
                        array[i] = array[j] = array[k] = 0;
                    }
                }
            }
        }
        System.out.print(counter);

    }
}
