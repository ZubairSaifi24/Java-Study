package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkImpl {

	ExecutorService worker = Executors.newFixedThreadPool(2);
    for(int i=0; i<=10; i++){
        int tid = i;
        worker.execute(()->{
            System.out.println(Thread.currentThread().getName()+" : task"+tid);
        });
    }
	
}
