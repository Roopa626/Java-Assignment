package persistence;

public class DatabasePersistence extends Persistence{
	@Override
	public void persist() {
		System.out.println("Stored in Database");
	}

}
