package lab7.threadnrunnable;

public class Main {
    public static int v = 0;
    public static void main(String[] args) throws Exception{
        System.out.println("before: " + v);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                v++;
                System.out.println(v);
            }
        };
        for (int i = 0; i < 500; i++){
            (new Thread(runnable)).start();
        }

        Thread.sleep(100);
        System.out.println("after: " + v);


    }
}
