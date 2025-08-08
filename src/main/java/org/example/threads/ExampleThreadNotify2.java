package org.example.threads;


import org.example.system.AbstractExampleClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExampleThreadNotify2 extends AbstractExampleClass {

    static final List<String> list = Collections.synchronizedList(new ArrayList<>());

    @Override
    public void runContent() {
        new OutputThread().start();
        new InputThread().start();
    }

    class InputThread extends Thread {

        @Override
        public void run(){
            Scanner sc = new Scanner(System.in);
            while (true) {
                synchronized (list) {
                    list.add(sc.nextLine());
                    list.notify();
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }



    class OutputThread extends Thread {

        @Override
        public void run(){
            while (list.isEmpty()) {
                synchronized (list) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(list.get(0));
                    list.remove(0);
                }
            }
        }

    }
}
