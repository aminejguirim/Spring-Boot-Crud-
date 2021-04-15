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
@Entity
public class Mission implements Serializable{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private double id;
	private String name;
	private String description;
	@ManyToOne
	private Departement departement;
	@ManyToMany(cascade = CascadeType.ALL , mappedBy="missions")
	private Set<Employe> employes;
	
	public Mission(double id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
