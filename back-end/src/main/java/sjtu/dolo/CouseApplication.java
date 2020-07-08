package sjtu.dolo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("sjtu.dolo.mapper")
public class CouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouseApplication.class, args);
	}

}
