package jp.sobue;

import java.util.Map;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

/**
 * Bean Injection Configuration.
 *
 * @author ssobue
 */
@Configuration
public class BeanInjectionDemoConfiguration implements InitializingBean {

  /** All Beans Map. */
  private final Map<String, Object> objectMap;

  /**
   * Constructor.
   *
   * @param objectMap All Beans Map.
   */
  public BeanInjectionDemoConfiguration(Map<String, Object> objectMap) {
    this.objectMap = objectMap;
  }

  /** Invoke set all bean properties supplied. */
  @Override
  public void afterPropertiesSet() {
    for (Map.Entry<String, Object> values : objectMap.entrySet()) {
      System.out.println(
          "Bean:" + values.getKey() + " Class:" + values.getValue().getClass().getName());
    }
  }
}
