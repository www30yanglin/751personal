package queues3;

/**
 * @author:Lin Yang
 **/
public class Person implements Comparable<Person>{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Person() {
	}
	@Override
	public String toString() {
		return this.id + ":" + this.name;
	}

	/**
	 * Change order of queue
	 * @param person
	 * @return
	 */
	@Override
	public int compareTo(Person person) {
		return this.id > person.getId() ? 1 : ( this.id < person.getId() ? -1 :0);
	}
}