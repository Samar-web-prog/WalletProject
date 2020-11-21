package tn.projectwallet.entities1;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="T_reclamation")
public class reclamation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

private String objet ;
private String description ;
private etatreclamation etat; 
@ManyToOne(cascade = CascadeType.ALL)
client client;
@OneToOne
private Chat chat;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Chat getChat() {
	return chat;
}
public void setChat(Chat chat) {
	this.chat = chat;
}
public reclamation(String objet, String description, etatreclamation etat, tn.projectwallet.entities1.client client) {
	super();
	this.objet = objet;
	this.description = description;
	this.etat = etat;
	this.client = client;
}
public String getObjet() {
	return objet;
}
public void setObjet(String objet) {
	this.objet = objet;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public etatreclamation getEtat() {
	return etat;
}
public void setEtat(etatreclamation etat) {
	this.etat = etat;
}
public client getClient() {
	return client;
}
public void setClient(client client) {
	this.client = client;
}
}
