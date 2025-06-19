package com.jpmc.midascore.kafka;

import com.jpmc.midascore.foundation.Transaction;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class TransactionHandler {

    private final AtomicInteger counter = new AtomicInteger(0);

    public void process(Transaction transaction) {
        int i = counter.incrementAndGet();
        if (i <= 4) {
            System.out.println("Transaction #" + i + ": Amount = " + transaction.getAmount());
        }
    }
}
