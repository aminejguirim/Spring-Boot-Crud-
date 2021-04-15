package spring.esprit.tn.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Contrat implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private double reference;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	private String typeContrat;
	private double salaire;
	@OneToOne
	private Employe employe;
	
	
	public Contrat(double reference, Date dateDebut, String typeContrat, double salaire, Employe employe) {
		super();
		this.reference = reference;
		this.dateDebut = dateDebut;
		this.typeContrat = typeContrat;
		this.salaire = salaire;
		this.employe = employe;
	}
	public double getReference() {
		return reference;
	}
	public void setReference(double reference) {
		this.reference = reference;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getTypeContrat() {
		return typeContrat;
	}
	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	
}

