package cs.dit.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cs.dit.domain.BoardVO;
import cs.dit.domain.SdivVO;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) //현재 테스트 코드가 스프링 실행 역할을 할 것이라고 알림
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") //설정파일 읽어내기
@Log4j //lombok을 이용해 로그를 기록하는 Logger를 변수로 생성
public class SdivServiceTest {
	
	@Autowired
	private SdivService service;
	
	@Test
	public void testGetList() {
		log.info("GET LIST() TEST ....................................................");
		
		service.sgetList().forEach(board -> log.info(board));
		
	}
	
	@Test
	public void testGet() {
		log.info("GET TEST ....................................................");
		
		SdivVO board = service.get(1L);
		
		log.info(board);
	}

}
