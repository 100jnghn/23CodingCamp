
public class Phone {
	private String name;
	private String tel;
	
	Phone(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getTel() {
		return this.tel;
	}
}
