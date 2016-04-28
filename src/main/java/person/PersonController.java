package person;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonController{
  public static final String template = "my name is %s!";
  public static final String template2 = "I work at %s!";
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/person")
  public Person person(@RequestParam(value="name", defaultValue="gabbers") String name, @RequestParam(value="company", defaultValue="workday") String company){
    return new Person(counter.incrementAndGet(), String.format(template,name), String.format(template2, company));
  }
}
