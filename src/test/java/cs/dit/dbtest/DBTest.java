package cs.dit.dbtest;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) //현재 테스트 코드가 스프링 실행 역할을 할 것이라고 알림
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") //설정파일 읽어내기
@Log4j //lombok을 이용해 로그를 기록하는 Logger를 변수로 생성
public class DBTest {

	@Test
	public void testConnection() {
		try {
			Class class1 = Class.forName("org.mariadb.jdbc.Driver");
			
			log.info(class1);
			
			Connection con = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/sonny", "root", "0070");
			log.info(con);
			
			con.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
