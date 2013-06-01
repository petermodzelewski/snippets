package pl.keyer.oome.generator;

import java.util.concurrent.Callable;

class Sleepyhead implements Callable<Boolean> {
    private byte[] data = new byte[1024];

    @Override
    public Boolean call() throws Exception {
        Thread.sleep(100);
        return true;
    }
}
