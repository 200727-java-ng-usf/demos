package com.revature.models;

import com.revature.util.RegexUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;

@Entity
@Table(name="app_users")
@AllArgsConstructor
@Data @NoArgsConstructor
public class AppUser {

	@Id @Column
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;

	@NotBlank
	@Column(nullable=false, unique=true)
	private String username;

	@NotBlank
	@Column(nullable=false)
	@Pattern(regexp=RegexUtil.PW_REGEX)
	private String password;

	@NotBlank
	@Column(name="first_name", nullable=false)
	private String firstName;

	@NotBlank
	@Column(name="last_name", nullable=false)
	private String lastName;

	@Column(nullable=false, unique=true)
	@Pattern(regexp= RegexUtil.EMAIL_REGEX)
	private String email;

	@Column(name="register_datetime", updatable=false, columnDefinition="timestamp default CURRENT_TIMESTAMP")
	private LocalDateTime registerDateTime;

	@Enumerated(EnumType.STRING)
	private UserRole role;

}