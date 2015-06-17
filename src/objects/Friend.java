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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
