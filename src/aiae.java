public class aiae {
    public static void main(String[] args) {
        System.out.println("Challenge 1");

        for(int i = 1; i<=100;i++){
            if((i%3 != 0) && (i%5!=0)){
                System.out.print(i);

            }
            else if (i % 3 == 0){
                System.out.print("bizz");
            }
            else if (i%5==0){
                System.out.print("razz");
            }

            System.out.print(", ");
        }
    }
}

