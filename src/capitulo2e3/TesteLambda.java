package capitulo2e3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TesteLambda {

    public static void main(String[] args) {


        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i < 1000; i++){
                    System.out.println(i);
                }
            }
        };

        //new Thread(r).start();

        Runnable run = () -> {
            for(int i = 0 ; i < 1000; i++){
                System.out.println(i);
            }
        };

        //new Thread(run).start();

        //new Thread(() -> {
        //    for(int i = 0 ; i < 1000; i++){
        //        System.out.println(i);
        //    }
        //}).start();


        // 3.1

        java.awt.Button button = new Button();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("evento acionado");
            }
        });

        button.addActionListener( (e) -> {
            System.out.println("evento acionado");
        });

        button.addActionListener(e -> System.out.println("evento acionado"));



    }
}
