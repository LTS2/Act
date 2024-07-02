package com.universal.act.domain.board;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @fileName    : BoardRestController
 * @author      : ewjin
 * @since       : 2024. 7. 2.
 */
@Slf4j
@RestController
@RequestMapping("boards")
public class BoardRestController {

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Board> test() {
		Board board = new Board();

		return ResponseEntity.ok(board);
	}
}
