package jp.sobue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application Launch Class.
 *
 * @author ssobue
 */
@SpringBootApplication
public class BeanInjectionDemoApplication {

  /**
   * Application Launch Method.
   *
   * @param args Command Line Arguments
   */
  public static void main(String[] args) {
    SpringApplication.run(BeanInjectionDemoApplication.class, args);
  }
}
