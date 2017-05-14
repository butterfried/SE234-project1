package camt.cbsd;

import camt.cbsd.dao.CourseDao;
import camt.cbsd.services.CourseServiceImpl;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Lab05ApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}
	CourseDao courseDao;
	CourseServiceImpl courseService;

	@Test
	public void getCourseCountTest(){
		courseService = new CourseServiceImpl();
		courseService.setCourseDao(courseDao);
		assertThat(courseService.getCourseCount(),is(equalTo(3)));

	}


}
