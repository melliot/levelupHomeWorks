package buffer.reader;

public class Consumer implements Runnable{
    private final String id;
    private final StreamProducer streamProducer;

    public Consumer(String id, StreamProducer streamProducer){
        this.id = id;
        this.streamProducer = streamProducer;
    }
    @Override
    public void run(){
        while (true){
            try{
                Integer elem = streamProducer.get();
                System.out.println(elem + " consumed by " + id + " " + System.currentTimeMillis());
            }catch (InterruptedException e){
                System.out.println(Thread.currentThread().getName() + " stopped.");
                return;
            }
        }
    }
}
