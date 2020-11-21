package tn.projectwallet.entities1;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name ="T_user")
public class client implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String nom; 
	public etat getEtat() {
		return etat;
	}
	public void setEtat(etat etat) {
		this.etat = etat;
	}
	public Set<Transactions> getTransaction() {
		return transaction;
	}
	public void setTransaction(Set<Transactions> transaction) {
		this.transaction = transaction;
	}
	private String prenom;
	private String email; 
	private String mdp; 
	@Enumerated (EnumType.STRING)
	private etat  etat; 
	private String adresse; 
	private Float montant; 
	private String officialid;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="client")
	private Set<Transactions> transaction;
	public client(int id, String nom, String prenom, String email, String mdp,  String adresse,
			Float montant, String officialid) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mdp = mdp;
		this.adresse = adresse;
		this.montant = montant;
		this.officialid = officialid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Float getMontant() {
		return montant;
	}
	public void setMontant(Float montant) {
		this.montant = montant;
	}
	public String getOfficialid() {
		return officialid;
	}
	public void setOfficialid(String officialid) {
		this.officialid = officialid;
	}
	
	
}
