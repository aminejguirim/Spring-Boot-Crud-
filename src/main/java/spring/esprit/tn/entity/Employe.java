package spring.esprit.tn.entity;

import java.io.Serializable;
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
import javax.persistence.OneToOne;

@Entity
public class Employe implements Serializable{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private double id;
	private String prenom;
	private String nom;
	private String email;
	private boolean isActif;
	@Enumerated(EnumType.STRING)
	Role role ;
	@OneToOne(mappedBy="employe")
	private Contrat contrat;
	@ManyToMany(cascade = CascadeType.ALL , mappedBy="employes")
	private Set<Departement> departements;
	@ManyToMany
	private Set<Mission> missions;
	
	
	
	public Employe(double id, String prenom, String nom, String email, boolean isActif, Role role, Contrat contrat) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.isActif = isActif;
		this.role = role;
		this.contrat = contrat;
	}
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isActif() {
		return isActif;
	}
	public void setActif(boolean isActif) {
		this.isActif = isActif;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Contrat getContrat() {
		return contrat;
	}
	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	
	
	
}
