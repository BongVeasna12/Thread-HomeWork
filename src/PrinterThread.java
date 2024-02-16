public class PrinterThread {

    public static void main(String[] args) {
        String greeting  = "Welcome to Institute of Science Technology Advance Development!";
        String asterisk = "*";
        String motivation = "Don't give up this opportunity, do you best first!";
        String message = "-";
        String mesg = "Download";
        String loading = ".";
        String messages = "completing 100%";

        for (int i = 0; i < greeting.length(); i++) {
            char currentChar = greeting.charAt(i);
            Thread charThread = new Thread(() -> {
                System.out.print(currentChar );
            });
            charThread.start();

            try {
                // Sleep for a short duration to give a staggered effect
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        for (int i = 0; i < 62; i++) {
            int finalI = i; // Need to use a final variable in lambda expression
            Thread charThread = new Thread(() -> {
                System.out.print( asterisk );
            });
            charThread.start();

            try {
                // Sleep for a short duration to give a staggered effect
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        for (int j = 0; j < motivation.length(); j++) {
            char Motive = motivation.charAt(j);
            Thread  motivethread = new Thread(() -> {
                System.out.print(Motive);
            });
            motivethread.start();

        try {
            Thread.sleep(100);
        }catch (InterruptedException e) {
            e.printStackTrace();
            }
        }
        System.out.println();
        for (int i = 0; i < 62; i++) {
            int finalI = i; // Need to use a final variable in lambda expression
            Thread charThread = new Thread(() -> {
                System.out.print( message );
            });
            charThread.start();

            try {
                // Sleep for a short duration to give a staggered effect
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        for (int k = 0; k < 20 ; k++) {
            int finalI = k;
            Thread charThread1 = new Thread(() -> {
                System.out.print(loading.charAt(0));
            });
            charThread1.start();

            try {
                // Sleep for a short duration to give a staggered effect
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(messages);

    }
}
