package sjtu.dolo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import sjtu.dolo.mapper.SectionMapper;
import sjtu.dolo.mapper.StudentMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceTest {

    @Test
    public void contextLoads() {

    }

    @Autowired
    private StudentService studentService;

    @MockBean
    private StudentMapper studentMapper;

    @MockBean
    private SectionMapper sectionMapper;


}
