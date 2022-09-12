class classA extends Thread {
    public void run() {
        System.out.println("Start thread A...");
        for (int i = 1; i <= 5; i++) {
            if (i == 1)
                System.out.println("From thread A: i=" + i);
        }
        System.out.println("Exit thread A");
    }
}

class classB extends Thread {
    public void run() {
        System.out.println("Start thread B...");
        for (int j = 1; j <= 5; j++) {

            if (j == 2) {
                System.out.println("From thraed B: j=" + j);
            }
            System.out.println("..Exit thraed B..");
        }
    }
}

class classC extends Thread {
    public void run() {
        System.out.println("Start thread c...");
        for (int k = 1; k <= 5; k++) {
            System.out.println("From thread c: k=" + k);
            if (k == 3) {
                try {
                    sleep(2000);
                } catch (Exception e) {
                }
            }
        }
        System.out.println("...Exit thread C...");
    }
}

public class threadstate {
    public static void main(String[] args) {
        classA t1 = new classA();
        // t1.yield();
        classB t2 = new classB();
        classC t3 = new classC();
        t1.start();
        t2.start();
        t3.start();
        System.out.println("End of Execution...");
    }
}