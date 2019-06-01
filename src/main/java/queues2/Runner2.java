package queues2;


import java.util.concurrent.PriorityBlockingQueue;

/**
 * Measure time consumed to put objects in queue
 */
@SuppressWarnings("ALL")
public class Runner2 {
	public static void main(String[] args) throws InterruptedException {
		//Declaration Time，Require being careful to unbounded queue
		PriorityBlockingQueue<User> priorityBlockingQueue = new PriorityBlockingQueue<User>();
		int objSize=100; 							//define the initial size of objects
		int[] objSizes=new int[]{1,200,500,1000,2000,5000,10000,20000,50000};	//current size of object which is put int oqueue
		for(int j=0;j<objSizes.length;j++){
			long start = System.currentTimeMillis();	//Starting Time
			for(int i=0;i<objSizes[j];i++){			//Obtain the value stored in object size
				int age=(int)(1+Math.random()*(100));
				int unum=(int)(1+Math.random()*(5));
				if(unum==1){
					priorityBlockingQueue.put(new User("Spiderman"+i,age));
				}else if(unum==2){
					priorityBlockingQueue.put(new User("Batman"+i,age));
				}else if(unum==3){
					priorityBlockingQueue.put(new User("Superman"+i,age));
				}else if(unum==4){
					priorityBlockingQueue.put(new User("Shazam"+i,age));
				}else  {
					priorityBlockingQueue.put(new User("Me"+i,age));
				}
			}
			long end = System.currentTimeMillis();	//End Time
			long res= end-start; //Time consumed
			System.out.println("The size of object stored in queue is"+objSizes[j]+"，Time consumed："+res);
		}

		while(true){
			User user = priorityBlockingQueue.take();
			System.out.println(user.getName()+","+user.getAge()); //Print User information in ascending order of ages.
		}
	}
}