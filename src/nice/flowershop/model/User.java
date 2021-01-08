package nice.flowershop.model;

public class User {
	private int userId;
	private String fullname;
	private String gender;
	private String birthday;
	private String username;
	private String email;
	private String phonenumbeer;
	private String passwrd;
	
	
	public User( String fullname, String gender, String birthday, String username, String email,
			String phonenumbeer, String passwrd) {
		super();
		this.fullname = fullname;
		this.gender = gender;
		this.birthday = birthday;
		this.username = username;
		this.email = email;
		this.phonenumbeer = phonenumbeer;
		this.passwrd = passwrd;
	}
	
	public User(int userId, String fullname, String gender, String birthday, String username, String email,
			String phonenumbeer, String passwrd) {
		super();
		this.userId = userId;
		this.fullname = fullname;
		this.gender = gender;
		this.birthday = birthday;
		this.username = username;
		this.email = email;
		this.phonenumbeer = phonenumbeer;
		this.passwrd = passwrd;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumbeer() {
		return phonenumbeer;
	}
	public void setPhonenumbeer(String phonenumbeer) {
		this.phonenumbeer = phonenumbeer;
	}
	public String getPasswrd() {
		return passwrd;
	}
	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}
	

}
