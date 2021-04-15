package spring.esprit.tn.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
	@Table(name="T_USER")
	public class User implements Serializable {
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private long id;
		
		private String lastName;
		@Column(name="first_name")
		private String firstName;
		@Temporal(TemporalType.DATE)
		private Date dateNaissance;
		
		@Enumerated(EnumType.STRING)
		Role role;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public Date getDateNaissance() {
			return dateNaissance;
		}

		public void setDateNaissance(Date dateNaissance) {
			this.dateNaissance = dateNaissance;
		}
	}

