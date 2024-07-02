package com.universal.act.domain;

import com.universal.act.domain.board.BoardEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * @fileName    : Main
 * @author      : ewjin
 * @since       : 2024. 7. 2.
 */
public class Main {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("act");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			BoardEntity board = new BoardEntity();
			// UserEntity user = new UserEntity();

			board.setTitle("test");
			em.persist(board);

			tx.commit();
		} catch (Exception e) {

			tx.rollback();
			e.printStackTrace();
		}

	}
}
