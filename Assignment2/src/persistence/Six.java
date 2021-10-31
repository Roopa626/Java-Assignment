package persistence;

public class Six {

	public static void main(String[] args) {
		
		FilePersistence obj1 = new FilePersistence();
		DatabasePersistence obj2 = new DatabasePersistence();
		
		obj1.persist();
		obj2.persist();

	}

}
