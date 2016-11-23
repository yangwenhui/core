package com.iezview.sway.data.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.iezview.sway.data.jpa.model.SwayWork;
import com.iezview.sway.data.jpa.repository.SwayWorkRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class IezSwayDataJpaCompleteApplicationTests {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private SwayWorkRepository swayWork;

	@Test
	public void contextLoads() {
		SwayWork entity = new SwayWork();

		entityManager.persist(entity);

		Iterable<SwayWork> its = swayWork.findAll();
		for (SwayWork s : its) {
			System.out.println(s);
		}
	}

}
