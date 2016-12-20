package openClose;

import java.util.ArrayList;
import java.util.List;

public class OffBook extends Book{
	private String offprice;
	private int off = 8;
	public OffBook(String _name, String _price, String _auth) {
		super(_name, _price, _auth);
		this.offprice = _price;
	}
	
	public String getPrice() {
	    int price = Integer.parseInt(offprice);
		if(price>40){
			return String.valueOf(price*off/10);
		}
		return  String.valueOf(price);
	}
	
	public static void main(String[] args) {
		OffBook b = new OffBook("java", "100", "zyf");
		OffBook a= new OffBook("java介绍", "10", "zyf");
		List<OffBook> l = new ArrayList<OffBook>();
		l.add(b);
		l.add(a);
		for(Book c:l){
		System.out.println("书名:"+c.getName()+",价格："+c.getPrice()+",作者:"+c.getAuth());}
	}
}
