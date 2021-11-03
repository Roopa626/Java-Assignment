package generics;

public class Values<k, v> {
	private k key;
	private v value;
	
	public Values(k key,v value) {
		super();
		this.key = key;
		this.value = value;
	}
	public <k,v> String showData() {
		return key+" "+value;
	}
	

}