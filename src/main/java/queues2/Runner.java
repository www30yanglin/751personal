package queues2;


import java.util.concurrent.PriorityBlockingQueue;

/**
 * put users into queue
 */
@SuppressWarnings("ALL")
public class Runner {
	public static void main(String[] args) throws InterruptedException {
		//Declare  queue，This is an unbounded queue so it needs being careful to use it
		PriorityBlockingQueue<User> priorityBlockingQueue = new PriorityBlockingQueue<User>();
		int objSize=100; //define objects initial size
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
			System.out.println(user.getName()+","+user.getAge()); //print user information with ages ascending order
		}
	}
}