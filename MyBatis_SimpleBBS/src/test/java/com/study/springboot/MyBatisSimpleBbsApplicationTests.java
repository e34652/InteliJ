package com.study.springboot;

import com.study.springboot.dao.ISimpleBbsDao;
import com.study.springboot.dto.SimpleBbsDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
class MyBatisSimpleBbsApplicationTests {

	@Autowired
	ISimpleBbsDao dao;

	@Test
	void contextLoads() {
	}
	@Test
	@Transactional
	@Commit
	public void emInsert(){
		SimpleBbsDto dto = SimpleBbsDto.builder().writer("me").title("gom").content("moongommoon").build();
		dao.writeDao(dto.getWriter(), dto.getTitle(), dto.getContent());
	}

	@Test
	@Transactional
	@Commit
	public void emList(){
		List<SimpleBbsDto> list = dao.listDao();
		System.out.println(list);
	}

}
