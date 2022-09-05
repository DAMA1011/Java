package interFace;

import java.util.Date;

public class SimCard extends Product{
	
	public int warranty; // 保固天數
	private Date expireDate; // 到期日
	
	public SimCard(String name, int price, int warranty, Date expireDate) {
		super(name, price);
		this.warranty = warranty;
		this.expireDate = expireDate;
	}

	public String desc() { // 改寫父類別的 description 內容
		String infoFromSuper = super.desc();
		String info = String.format("%s,最後開卡日: %s,使用: %d 天", infoFromSuper, expireDate, warranty);
		return info;
	}
	
	
	
}
