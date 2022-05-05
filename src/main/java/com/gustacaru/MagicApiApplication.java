package com.gustacaru;

// import com.gustacaru.model.Course;
// import com.gustacaru.repository.CourseRepository;

// import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MagicApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(MagicApiApplication.class, args);
  }

  // @Bean
  // CommandLineRunner initDataBase(CourseRepository courseRepository) {
  //   return args -> {
  //     courseRepository.deleteAll();

  //     Course c1 = new Course();
  //     // c1.setName("testeteste com teste");
  //     // c1.setCategory("estudos brutos");

  //     courseRepository.save(c1);
  //   };
  // }

}
