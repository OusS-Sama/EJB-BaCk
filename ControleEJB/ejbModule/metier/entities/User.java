package metier.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

public class User implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private String telephone;
	private String email;
	private Date dateNaissance;
	private static final long serialVersionUID = 1L;
	@Transient
	@OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
	private List<Smartphone> smartphone;

	public User() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}   
	public String getTelephone() {
		return this.telephone;
	}

	public List<Smartphone> getSmartphone() {
		return smartphone;
	}
	public void setSmartphone(List<Smartphone> smartphone) {
		this.smartphone = smartphone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public Date getDateNaissance() {
		return this.dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
   
}
