package spring.esprit.tn.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Entreprise implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private double id;
	private String name;
	private String raisonSocial;
	@OneToMany(cascade = CascadeType.ALL , mappedBy="entreprise")
	private Set<Departement> departement;
	
	public Entreprise(double id, String name, String raisonSocial) {
		super();
		this.id = id;
		this.name = name;
		this.raisonSocial = raisonSocial;
	}
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRaisonSocial() {
		return raisonSocial;
	}
	public void setRaisonSocial(String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}
	
	

}
