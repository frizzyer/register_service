package kz.yerbol.domain;
// Generated 28.10.2016 18:30:19 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Student generated by hbm2java
 */

 @Entity
 @Table(name = "Student")
public class Student  implements java.io.Serializable {

		@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "idstudent")
		private int idstudent;
		
		@ManyToOne
    @JoinColumn(name = "id_specialty")
		private Specialty specialty;

		@Column(name = "FirstName")
		private String firstName;

		@Column(name = "LastName")
		private String lastName;
		
		@Column(name = "EntryYEar")
		private Date entryYear;

		@Column(name = "edu_Level")
		private String eduLevel;

		@Column(name = "paymenttype")
		private String paymenttype;

		@Column(name = "gender")
		private String gender;

		@Column(name = "birthday")
		private Date birthday;

		@Column(name = "telephone1")
		private String telephone1;

		@Column(name = "telephone2")
		private String telephone2;

		@Column(name = "email1")
		private String email1;

		@Column(name = "email2")
		private String email2;

		@Column(name = "address")
		private String address;

		@Column(name = "nationality")
		private String nationality;

		@Column(name = "docType")
		private String docType;

		@Column(name = "docNumber")
		private String docNumber;

		@Column(name = "docExpiretime")
		private Date docExpiretime;

		@Column(name = "docIssueOrgnazation")
		private String docIssueOrgnazation;

		@Column(name = "fatherName")
		private String fatherName;

		@Column(name = "fatherWorkingPlace")
		private String fatherWorkingPlace;

		@Column(name = "fatherMobilePhone")
		private String fatherMobilePhone;

		@Column(name = "fatherHomePhone")
		private String fatherHomePhone;

		@Column(name = "fatherEmail")
		private String fatherEmail;

		@Column(name = "fatherAdress")
		private String fatherAdress;

		@Column(name = "matherName")
		private String matherName;

		@Column(name = "matherWorkingPlace")
		private String matherWorkingPlace;

		@Column(name = "matherMobilePhone")
		private String matherMobilePhone;

		@Column(name = "matherHomePhone")
		private String matherHomePhone;

		@Column(name = "matherEmail")
		private String matherEmail;

		@Column(name = "matherAddress")
		private String matherAddress;

		@Column(name = "image_Path")
		private String imagePath;

		@Column(name = "idEdu")
		private Integer idEdu;

		@Column(name = "studentId")
		private String studentId;

		@OneToMany(mappedBy = "student")
		private Set<Educationhistory> educationhistories = new HashSet<Educationhistory>(0);

		public Student() {
		}

	
		public Student(int idstudent, Specialty specialty) {
				this.idstudent = idstudent;
				this.specialty = specialty;
		}
		public Student(int idstudent, Specialty specialty, String firstName, String lastName, Date entryYear, String eduLevel, String paymenttype, String gender, Date birthday, String telephone1, String telephone2, String email1, String email2, String address, String nationality, String docType, String docNumber, Date docExpiretime, String docIssueOrgnazation, String fatherName, String fatherWorkingPlace, String fatherMobilePhone, String fatherHomePhone, String fatherEmail, String fatherAdress, String matherName, String matherWorkingPlace, String matherMobilePhone, String matherHomePhone, String matherEmail, String matherAddress, String imagePath, Integer idEdu, String studentId, Set educationhistories) {
			 this.idstudent = idstudent;
			 this.specialty = specialty;
			 this.firstName = firstName;
			 this.lastName = lastName;
			 this.entryYear = entryYear;
			 this.eduLevel = eduLevel;
			 this.paymenttype = paymenttype;
			 this.gender = gender;
			 this.birthday = birthday;
			 this.telephone1 = telephone1;
			 this.telephone2 = telephone2;
			 this.email1 = email1;
			 this.email2 = email2;
			 this.address = address;
			 this.nationality = nationality;
			 this.docType = docType;
			 this.docNumber = docNumber;
			 this.docExpiretime = docExpiretime;
			 this.docIssueOrgnazation = docIssueOrgnazation;
			 this.fatherName = fatherName;
			 this.fatherWorkingPlace = fatherWorkingPlace;
			 this.fatherMobilePhone = fatherMobilePhone;
			 this.fatherHomePhone = fatherHomePhone;
			 this.fatherEmail = fatherEmail;
			 this.fatherAdress = fatherAdress;
			 this.matherName = matherName;
			 this.matherWorkingPlace = matherWorkingPlace;
			 this.matherMobilePhone = matherMobilePhone;
			 this.matherHomePhone = matherHomePhone;
			 this.matherEmail = matherEmail;
			 this.matherAddress = matherAddress;
			 this.imagePath = imagePath;
			 this.idEdu = idEdu;
			 this.studentId = studentId;
			 this.educationhistories = educationhistories;
		}
	 
		public int getIdstudent() {
				return this.idstudent;
		}
		
		public void setIdstudent(int idstudent) {
				this.idstudent = idstudent;
		}
		public Specialty getSpecialty() {
				return this.specialty;
		}
		
		public void setSpecialty(Specialty specialty) {
				this.specialty = specialty;
		}
		public String getFirstName() {
				return this.firstName;
		}
		
		public void setFirstName(String firstName) {
				this.firstName = firstName;
		}
		public String getLastName() {
				return this.lastName;
		}
		
		public void setLastName(String lastName) {
				this.lastName = lastName;
		}
		public Date getEntryYear() {
				return this.entryYear;
		}
		
		public void setEntryYear(Date entryYear) {
				this.entryYear = entryYear;
		}
		public String getEduLevel() {
				return this.eduLevel;
		}
		
		public void setEduLevel(String eduLevel) {
				this.eduLevel = eduLevel;
		}
		public String getPaymenttype() {
				return this.paymenttype;
		}
		
		public void setPaymenttype(String paymenttype) {
				this.paymenttype = paymenttype;
		}
		public String getGender() {
				return this.gender;
		}
		
		public void setGender(String gender) {
				this.gender = gender;
		}
		public Date getBirthday() {
				return this.birthday;
		}
		
		public void setBirthday(Date birthday) {
			this.birthday = birthday;
			
		}
		public String getTelephone1() {
				return this.telephone1;
		}
		
		public void setTelephone1(String telephone1) {
				this.telephone1 = telephone1;
		}
		public String getTelephone2() {
				return this.telephone2;
		}
		
		public void setTelephone2(String telephone2) {
				this.telephone2 = telephone2;
		}
		public String getEmail1() {
				return this.email1;
		}
		
		public void setEmail1(String email1) {
				this.email1 = email1;
		}
		public String getEmail2() {
				return this.email2;
		}
		
		public void setEmail2(String email2) {
				this.email2 = email2;
		}
		public String getAddress() {
				return this.address;
		}
		
		public void setAddress(String address) {
				this.address = address;
		}
		public String getNationality() {
				return this.nationality;
		}
		
		public void setNationality(String nationality) {
				this.nationality = nationality;
		}
		public String getDocType() {
				return this.docType;
		}
		
		public void setDocType(String docType) {
				this.docType = docType;
		}
		public String getDocNumber() {
				return this.docNumber;
		}
		
		public void setDocNumber(String docNumber) {
				this.docNumber = docNumber;
		}
		public Date getDocExpiretime() {
				return this.docExpiretime;
		}
		
		public void setDocExpiretime(Date docExpiretime) {
				this.docExpiretime = docExpiretime;
		}
		public String getDocIssueOrgnazation() {
				return this.docIssueOrgnazation;
		}
		
		public void setDocIssueOrgnazation(String docIssueOrgnazation) {
				this.docIssueOrgnazation = docIssueOrgnazation;
		}
		public String getFatherName() {
				return this.fatherName;
		}
		
		public void setFatherName(String fatherName) {
				this.fatherName = fatherName;
		}
		public String getFatherWorkingPlace() {
				return this.fatherWorkingPlace;
		}
		
		public void setFatherWorkingPlace(String fatherWorkingPlace) {
				this.fatherWorkingPlace = fatherWorkingPlace;
		}
		public String getFatherMobilePhone() {
				return this.fatherMobilePhone;
		}
		
		public void setFatherMobilePhone(String fatherMobilePhone) {
				this.fatherMobilePhone = fatherMobilePhone;
		}
		public String getFatherHomePhone() {
				return this.fatherHomePhone;
		}
		
		public void setFatherHomePhone(String fatherHomePhone) {
				this.fatherHomePhone = fatherHomePhone;
		}
		public String getFatherEmail() {
				return this.fatherEmail;
		}
		
		public void setFatherEmail(String fatherEmail) {
				this.fatherEmail = fatherEmail;
		}
		public String getFatherAdress() {
				return this.fatherAdress;
		}
		
		public void setFatherAdress(String fatherAdress) {
				this.fatherAdress = fatherAdress;
		}
		public String getMatherName() {
				return this.matherName;
		}
		
		public void setMatherName(String matherName) {
				this.matherName = matherName;
		}
		public String getMatherWorkingPlace() {
				return this.matherWorkingPlace;
		}
		
		public void setMatherWorkingPlace(String matherWorkingPlace) {
				this.matherWorkingPlace = matherWorkingPlace;
		}
		public String getMatherMobilePhone() {
				return this.matherMobilePhone;
		}
		
		public void setMatherMobilePhone(String matherMobilePhone) {
				this.matherMobilePhone = matherMobilePhone;
		}
		public String getMatherHomePhone() {
				return this.matherHomePhone;
		}
		
		public void setMatherHomePhone(String matherHomePhone) {
				this.matherHomePhone = matherHomePhone;
		}
		public String getMatherEmail() {
				return this.matherEmail;
		}
		
		public void setMatherEmail(String matherEmail) {
				this.matherEmail = matherEmail;
		}
		public String getMatherAddress() {
				return this.matherAddress;
		}
		
		public void setMatherAddress(String matherAddress) {
				this.matherAddress = matherAddress;
		}
		public String getImagePath() {
				return this.imagePath;
		}
		
		public void setImagePath(String imagePath) {
				this.imagePath = imagePath;
		}
		public Integer getIdEdu() {
				return this.idEdu;
		}
		
		public void setIdEdu(Integer idEdu) {
				this.idEdu = idEdu;
		}
		public String getStudentId() {
				return this.studentId;
		}
		
		public void setStudentId(String studentId) {
				this.studentId = studentId;
		}
		public Set getEducationhistories() {
				return this.educationhistories;
		}
		
		public void setEducationhistories(Set educationhistories) {
				this.educationhistories = educationhistories;
		}




}


