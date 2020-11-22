package lab1;

public class challenge2 {
    public static void main(String[] args) {

        System.out.println("Challenge 2");


        for(int i=1; i<=170; i++){
            System.out.print(i+": "+compute(i)+"\n");

        }

    }


    public static String compute(int n) {
//        System.out.println("Challenge 2");
        String result = "";
        String stringN = Integer.toString(n);
        if(n%3 == 0){
            result+= "Foo";

        }

        if(n%5 == 0){
            result+= "Bar";
        }

        if(n%7 == 0){
            result+= "Qix";
        }


        for (int i = 0; i < stringN.length(); i++){
            char c = stringN.charAt(i);



            if(c == '3'){
                result+= "Foo";
            }

            if(c == '5'){
                result+= "Bar";
            }

            if(c == '7'){
                result+= "Qix";
            }

            if(c == '0'){
                result+="*";
            }


        }

        if (result.equals("")){
            return stringN;

        } else {
            return result;
        }

    }
}
