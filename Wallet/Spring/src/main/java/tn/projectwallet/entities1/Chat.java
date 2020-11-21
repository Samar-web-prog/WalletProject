package tn.projectwallet.entities1;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
@Entity
@Table (name = "T_Chat")
public class Chat implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7135471761468034435L;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	private int m_id; 
	private int u_id ; 
	@Temporal(TemporalType.DATE)
	private Date date;
	@Temporal(TemporalType.TIME)
	private Date time;
	private String message;
	private int rating;
	@ManyToOne(cascade = CascadeType.ALL)
	client client;	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public client getClient() {
		return client;
	}
	public void setClient(client client) {
		this.client = client;
	}
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Chat(int m_id, int u_id, Date date, Date time, String message, int rating) {
		super();
		this.m_id = m_id;
		this.u_id = u_id;
		this.date = date;
		this.time = time;
		this.message = message;
		this.rating = rating;
	} 
}
