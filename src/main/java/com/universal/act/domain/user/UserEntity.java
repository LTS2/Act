package com.universal.act.domain.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

/**
 * @fileName    : User
 * @author      : ewjin
 * @since       : 2024. 7. 2.
 * @implNote    : 유저 정보
 */
@Entity
@SequenceGenerator(
	name = "USER_SEQ_GENERATOR",
	sequenceName = "SEQUENCE_NAME",
	initialValue = 1, allocationSize = 50
)
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_SEQ_GENERATOR")
	private Long id; // 유저 아이디

	// private String account; // 유저 아이디
	// private String password; // 비밀번호
	// private String email; // 유저 이메일
	private String name; // 이름
	private String gender; // 성별

	private int age; // 나이
	// private int phoneNumber; // 핸드폰 번호
	// private int birth; // 출생일
	//
	// private Date createdAt; // 생성일
	// private Date modifiedAt; // 수정일
	// private Date deletedAt; // 삭제일
}
