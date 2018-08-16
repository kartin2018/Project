package kartin.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	@Id
	private String cartId;
	
	private String userId;
	
	private String productId;

	private int productQty;

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

}
