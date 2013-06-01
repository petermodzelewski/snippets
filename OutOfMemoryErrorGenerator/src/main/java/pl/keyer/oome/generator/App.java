package pl.keyer.oome.generator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

    public static void main(String[] args) throws Exception{
        final ExecutorService threadPool = Executors.newFixedThreadPool(16);
        while(true){
            threadPool.submit(new Sleepyhead());
        }
    }

}
