package board;

import board.board.dto.BoardDto;
import board.board.entity.Board;
import board.board.mapper.BoardMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardApplicationTests {

	@Autowired
	BoardMapper boardMapper;

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testSqlSession() throws Exception{
		System.out.println(sqlSession.toString());
	}

	@Test
	public void selectAll() throws Exception {
		System.out.println(boardMapper.selectBoardList());
	}

	@Test
	public void insert() throws Exception {

		BoardDto board = BoardDto.builder().title("abc").contents("abc").build();
		boardMapper.insertBoard(board);
	}

}
