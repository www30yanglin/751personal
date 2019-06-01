package queues;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.logging.Logger;

/**
 * Queue Input
 */
public class Runner {

    private final static Logger logger = Logger.getLogger(String.valueOf(Runner.class));
    public static void main(String[] args) {
		int[] threads=new int[]{1,10,50,100,200,500};//number of thread
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		int objSize=1000;
		logger.info("Start executing putting data into queue");
        for(int i=0;i<threads.length;i++){
			long start = System.currentTimeMillis();	//start time
			for(int j=0;j<threads[i];j++){			//number of thread executed
				User user = new User();
				new Thread(user).start();
			}
			long end = System.currentTimeMillis();	//end time
			long res= end-start; //output
			map.put(threads[i],res+"");
		}
		Integer key = null;
		String value = null;
		Iterator iter = map.keySet().iterator();
		while (iter.hasNext()) {
			key = (Integer)iter.next();
			value = (String)map.get(key);
			System.out.println("The number of threads is"+key+"Time consumed is："+value);
		}
    }
}
