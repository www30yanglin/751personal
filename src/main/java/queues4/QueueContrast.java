package queues4;

import java.util.Random;
import java.util.concurrent.BlockingQueue;


class QueueContrast implements Runnable,Comparable{
	private int priority;

	public QueueContrast(int priority ) {
		this.priority = priority;
	}
	@Override
	public void run() {
		System.out.println("Priority"+priority+"task completed！");
	}
	@Override
	public int compareTo(Object arg) {
		QueueContrast task = (QueueContrast)arg;
		if(this.priority == task.priority){
			return 0;
		}
		return this.priority>task.priority?1:-1;
	}

	//For comparision，firstly take a look how element order is arranged when put/taken,then compare it with priority queue
	//Conclusion：LinkedBlockingQueue uses FIFO to put/obtain elements
	//The elements in PriorityBlockingQueue have to implement Comparable interface，it still follows FIFO，the order of elements was arranged by 'comparedto' before put into queue
	public static void blockingQueue(final BlockingQueue<QueueContrast> queue) throws InterruptedException{
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int priority = random.nextInt(1000);
			System.out.println("Element priority："+priority);
			queue.put( new QueueContrast(priority) );
		}

		new Thread(new Runnable() {
			public void run() {
				while( !Thread.currentThread().isInterrupted() ){
					try {
						queue.take().run();//take elements from queue
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}
