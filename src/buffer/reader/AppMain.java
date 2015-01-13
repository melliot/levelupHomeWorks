package buffer.reader;

public class AppMain {
    public static void main(String[] args) {
        StreamProducer streamProducer = new StreamProducer();
        new Thread(new Producer(100, 400, streamProducer)).start();
        new Thread(new Producer(1000, 500, streamProducer)).start();
        new Thread(new Consumer("First", streamProducer)).start();
        new Thread(new Consumer("Second", streamProducer)).start();
    }
}
