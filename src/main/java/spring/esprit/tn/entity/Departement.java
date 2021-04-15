package spring.esprit.tn.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Departement implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private double id;
	private String name;
	@ManyToOne
	private Entreprise entreprise;
	@OneToMany(cascade = CascadeType.ALL , mappedBy="departement")
	private Set<Mission> mission;
	@ManyToMany
	private Set<Employe> employes;
	
	
	public Departement(double id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	

}
