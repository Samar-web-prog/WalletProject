package tn.projectwallet.entities1;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
@Entity
@Table (name="T_Transaction")
public class Transactions implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6915419434971600852L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Temporal(TemporalType.DATE)
	private Date Jour_T ;
	@Enumerated (EnumType.STRING)
	private etat etat; 
	private int E_id; 
	private int R_id;
	@ManyToOne
	client client;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getJour_T() {
		return Jour_T;
	}
	public void setJour_T(Date jour_T) {
		Jour_T = jour_T;
	}

	public void setE_id(int e_id) {
		E_id = e_id;
	}
	public int getR_id() {
		return R_id;
	}
	public void setR_id(int r_id) {
		R_id = r_id;
	}
	public etat getEtat() {
		return etat;
	}
	public void setEtat(etat etat) {
		this.etat = etat;
	}
	public client getClient() {
		return client;
	}
	public void setClient(client client) {
		this.client = client;
	}
	public int getE_id() {
		return E_id;
	}

}
