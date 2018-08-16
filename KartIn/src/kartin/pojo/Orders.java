package kartin.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderss")
public class Orders {
	
	@Id
	private String orderId;
	
	private String userId;
	
	private String paymentMode;
	
	private Date TStamp;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Date getTStamp() {
		return TStamp;
	}

	public void setTStamp(Date TStamp) {
		this.TStamp = TStamp;
	}

}
