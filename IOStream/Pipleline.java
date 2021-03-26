package IOStream;

import java.io.*;

/**
 * @author Bhaskar on 01-01-2021
 */

class Producer extends Thread {

    OutputStream outputStream;

    public Producer(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        int count = 1;
        while (true) {
            try {
                outputStream.write(count);
                outputStream.flush();
                System.out.println("Producer "+count);
                Thread.sleep(10);
                count++;
            } catch (Exception e) {

            }

        }
    }

}

class Consumer extends Thread {

    InputStream inputStream;

    public Consumer(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        int x;
        while (true) {
            try {
                x = inputStream.read();
                System.out.println("Consumer "+x);
                System.out.flush();
                Thread.sleep(10);
                x++;
            } catch (Exception e) {

            }

        }
    }

}

public class Pipleline {

    public static void main(String[] args) throws IOException {
        PipedInputStream pipedInputStream = new PipedInputStream();
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        pipedInputStream.connect(pipedOutputStream);

        Producer producer = new Producer(pipedOutputStream);
        Consumer consumer = new Consumer(pipedInputStream);

        producer.start();
        consumer.start();

    }

}
