package com.umi.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="InscriptionPedagogique")
public class InscriptionPedagogique {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_ip")
	private int id_ip;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="etudiant", foreignKey = @ForeignKey(name = "fk_etudiant"))
	private Etudiant etudiant;
	
	@ManyToMany(fetch=FetchType.LAZY)
	private List<Filiere> filieres = new ArrayList<Filiere>();
	
	@Column(name="annee_academique")
	private String annee_academique; // not an integer ??
	
	@Column(name="date_pre_inscription")
	private Date date_pre_inscription;
	
	@Column(name="date_valid_inscription")
	private Date date_valid_inscription;

	public InscriptionPedagogique() {
	}

	public InscriptionPedagogique(int id_ip, Etudiant etudiant, List<Filiere> filieres, String annee_academique,
			Date date_pre_inscription, Date date_valid_inscription) {
		this.id_ip = id_ip;
		this.etudiant = etudiant;
		this.filieres = filieres;
		this.annee_academique = annee_academique;
		this.date_pre_inscription = date_pre_inscription;
		this.date_valid_inscription = date_valid_inscription;
	}

	public int getId_ip() {
		return id_ip;
	}

	public void setId_ip(int id_ip) {
		this.id_ip = id_ip;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public List<Filiere> getFilieres() {
		return filieres;
	}

	public void setFilieres(List<Filiere> filieres) {
		this.filieres = filieres;
	}

	public String getAnnee_academique() {
		return annee_academique;
	}

	public void setAnnee_academique(String annee_academique) {
		this.annee_academique = annee_academique;
	}

	public Date getdate_pre_inscription() {
		return date_pre_inscription;
	}

	public void setDate_pre_inscription(Date date_pre_inscription) {
		this.date_pre_inscription = date_pre_inscription;
	}

	public Date getDate_valid_inscription() {
		return date_valid_inscription;
	}

	public void setDate_valid_inscription(Date date_valid_inscription) {
		this.date_valid_inscription = date_valid_inscription;
	}
	
}
