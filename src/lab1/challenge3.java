package lab1;

public class challenge3 {
    public static void main(String[] args) {
       int[] array = {3,2,-3,-2,3,0};
       int counter = 0;

       for(int i = 0; i<array.length-2;i++){
           for(int j = i+1; j<array.length -1;j++){


                   if ((array[i] + array[j] == 0) && (array[i] != 0) && (array[j] != 0)) {
                       counter += 1;
                       array[i] = array[j] = 0;

               }
           }
       }
        System.out.print(counter);

    }
}
