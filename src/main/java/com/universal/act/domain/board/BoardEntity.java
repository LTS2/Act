package com.universal.act.domain.board;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

/**
 * @fileName    : Board
 * @author      : ewjin
 * @since       : 2024. 7. 2.
 * @implNote    : 게시판
 */
@Entity
@SequenceGenerator(
	name = "BOARD_SEQ_GENERATOR",
	sequenceName = "BOARD_SEQ",
	initialValue = 1, allocationSize = 50
)
@Setter
@Getter
public class BoardEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOARD_SEQ_GENERATOR")
	private Long id; // 게시판 아이디

	private String title; // 제목
	private String author; // 작성자
	// private String category; // 카테고리

	// private int number; // 게시판 번호
	// private int views; // 조회수

	// private Date createdAt; // 작성일
	// private Date modifiedAt; // 수정일
	// private Date deletedAt; // 삭제일
}
