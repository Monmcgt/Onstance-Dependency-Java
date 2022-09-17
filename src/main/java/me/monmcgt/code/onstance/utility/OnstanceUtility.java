package me.monmcgt.code.onstance.utility;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class OnstanceUtility {
    public static void scheduleGarbageCollector(int threads, long millis) {
        Executors.newScheduledThreadPool(threads).scheduleAtFixedRate(System::gc, 0, millis, TimeUnit.MILLISECONDS);
    }
}
