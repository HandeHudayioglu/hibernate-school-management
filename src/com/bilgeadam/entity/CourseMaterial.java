package com.bilgeadam.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@Entity
@Table (name="course_materials")
public class CourseMaterial {
	

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private String url;
	
	@OneToOne(optional = false)
	@JoinColumn(name="course_id",referencedColumnName = "id")
	private Course course;

}
