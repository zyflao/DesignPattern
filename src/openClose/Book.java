package openClose;

public class Book {
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
		private String name;
		private String price;
		private String auth;
		public Book(String _name,String _price,String _auth){
			this.name=_name;
			this.price=_price;
			this.auth=_auth;
		}
	public static void main(String[] args) {
		Book b = new Book("java", "20", "zyf");
		System.out.println("书名:"+b.getName()+",价格："+b.getPrice()+",作者:"+b.getAuth());
	}
}
