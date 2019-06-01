package queues4;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

import static queues4.QueueContrast.blockingQueue;

/**
 * Comparison between normal blocking queue与 and priority queue
 */
public class Runner {


	public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
		System.out.println("******Starting testing blocking queue******");
		blockingQueue(new LinkedBlockingQueue<QueueContrast>());
		TimeUnit.MILLISECONDS.sleep(1000);
		System.out.println("******Starting testing priority queue******");
		blockingQueue(new PriorityBlockingQueue<QueueContrast>());
	}
}
