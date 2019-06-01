package queues3;

import java.util.concurrent.PriorityBlockingQueue;


/**
 * Queue Usage
 */
@SuppressWarnings("ALL")
public class Runner {
	public static void main(String[] args) throws InterruptedException {
		PriorityBlockingQueue<Person> pbq = new PriorityBlockingQueue<>();
		pbq.add(new Person(3,"person3"));
		System.err.println("Container：" + pbq);
		pbq.add(new Person(2,"person2"));
		System.err.println("Container：" + pbq);
		pbq.add(new Person(1,"person1"));
		System.err.println("Container：" + pbq);
		pbq.add(new Person(4,"person4"));
		System.err.println("Container：" + pbq);
		System.err.println("---------Queue situation after used-------------" );


		System.err.println("Obtain element " + pbq.take().getId());
		System.err.println("Container：" + pbq);
		System.err.println("Split Line----------------------------------------------------------------" );

		System.err.println("Obtain element " + pbq.take().getId());
		System.err.println("Container：" + pbq);
		System.err.println("Split Line----------------------------------------------------------------" );

		System.err.println("Obtain element " + pbq.take().getId());
		System.err.println("Container：" + pbq);
		System.err.println("Split Line----------------------------------------------------------------" );

		System.err.println("Obtain element " + pbq.take().getId());
		System.err.println("Container：" + pbq);
		System.err.println("Split Line----------------------------------------------------------------" );
	}
}
