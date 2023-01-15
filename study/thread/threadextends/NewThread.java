package com.study.thread.threadextends;

class Tampilan implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("This is Tampilan");
            NewThread.istirahat(7);
        }
    }

    public class NewThread {
        public static void main(String[] args) {
            Thread view1 = new Thread(new Tampilan());
            view1.start();
            Thread view2 = new Thread(new Tampilan());
            view2.start();

            for (int i = 0; i < 8; i++) {
                System.out.println("Main Thread");
                istirahat(5);
            }
        }

        public static void istirahat(int tunda) {
            try {
                Thread.sleep(tunda * 100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

