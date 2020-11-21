package tn.projectwallet.entities1;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table( name= "T_admin")
public class user implements Serializable {
	/************/
	private static final long SerialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	
	private String firstName ;
	private String lastName ;
	
	@Enumerated(EnumType.STRING)
	private role Role;
	@Temporal(TemporalType.DATE)
	private Date date;
	private boolean dispo;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<client> client;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Transactions> transaction;
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Chat> chat;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<reclamation> reclamations;
	public Set<reclamation> getReclamations() {
		return reclamations;
	}
	public void setReclamations(Set<reclamation> reclamations) {
		this.reclamations = reclamations;
	}
	public user(int id, String firstName, String lastName, role role, Date date) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		Role = role;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public role getRole() {
		return Role;
	}
	public void setRole(role role) {
		Role = role;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public static long getSerialversionuid() {
		return SerialVersionUID;
	}
	public boolean isDispo() {
		return dispo;
	}
	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}
	public Set<client> getClient() {
		return client;
	}
	public void setClient(Set<client> client) {
		this.client = client;
	}
	public Set<Transactions> getTransaction() {
		return transaction;
	}
	public void setTransaction(Set<Transactions> transaction) {
		this.transaction = transaction;
	}
	public Set<Chat> getChat() {
		return chat;
	}
	public void setChat(Set<Chat> chat) {
		this.chat = chat;
	}

	
	
}