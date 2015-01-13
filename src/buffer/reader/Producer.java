package buffer.reader;

public class Producer implements Runnable{
    private final StreamProducer streamProducer;
    private final int period;
    private int startValue;

    public Producer(int startValue, int period, StreamProducer streamProducer){
        this.startValue = startValue;
        this.period = period;
        this.streamProducer = streamProducer;
    }
    @Override
    public void run(){
        while (true){
            try{
                System.out.println(startValue + " produced" + " " + System.currentTimeMillis());
                streamProducer.put(startValue++);
                Thread.sleep(period);
            }catch (InterruptedException e){
                System.out.println(Thread.currentThread().getName() + " stopped");
                break;
            }
        }
    }
}
