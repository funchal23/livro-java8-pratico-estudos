package capitulo2e3;

public class TesteLambda2 {

    public static void main(String[] args) {


        Runnable o = () -> {
            System.out.println("Jesus te ama");
        };

        System.out.println(o);
        System.out.println(o.getClass());


        final int numero = 23;
        new Thread(() -> {
            System.out.println(numero);
        }).start();

        int numero2 = 23;
        new Thread(() -> {
            System.out.println(numero2);
        }).start();




    }

}
