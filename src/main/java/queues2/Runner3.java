package queues2;


import java.util.concurrent.PriorityBlockingQueue;

/***
 * Order of getting into queue and order for being taken from queue after rearrangement
 */
@SuppressWarnings("ALL")
public class Runner3 {
	public static void main(String[] args) throws InterruptedException {
		
		PriorityBlockingQueue<User> priorityBlockingQueue = new PriorityBlockingQueue<User>();
		int objSize=100; //Define initial size of objects
		for(int i=0;i<objSize;i++){
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
		while(true){
			User user = priorityBlockingQueue.take();
			System.out.println(user.getName()+","+user.getAge()); //Print User information with ages ascending order
		}
	}
}