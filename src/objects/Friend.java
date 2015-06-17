package objects;

public class Friend {

	private String name;
	private String email;
	private String photo;

	public Friend() {

	}

	public Friend(String name) {
		this.name = name;
	}

	public Friend(String name, String photo) {
		this.name = name;
		this.photo = photo;
	}

}
