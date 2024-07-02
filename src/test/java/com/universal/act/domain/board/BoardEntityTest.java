package com.universal.act.domain.board;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * @fileName    : BoardEntityTest
 * @author      : ewjin
 * @since       : 2024. 7. 2.
 */
class BoardEntityTest {

	private EntityManagerFactory emf;
	private EntityManager em;
	private EntityTransaction tx;

	@BeforeEach
	public void setUp() {
		emf = Persistence.createEntityManagerFactory("act");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}

	@AfterEach
	public void tearDown() {
		if (em != null) {
			em.close();
		}
		if (emf != null) {
			emf.close();
		}
	}

	@Test
	@DisplayName("첫 테스트")
	public void test() {
		// tx.begin();
		BoardEntity board = new BoardEntity();
		em.persist(board);
		BoardEntity boardTitle = em.find(BoardEntity.class, 1);
		// tx.commit();
		assertNotNull(board.getId());

		assertEquals(boardTitle.getTitle(), "test");
	}
}
