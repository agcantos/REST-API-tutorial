package person;

public class Person{
  private final long id;
  private final String name;
  private final String company;

  public Person(long id, String name, String company){
    this.id = id;
    this.name = name;
    this.company = company;
  }

  public long getId(){
    return id;
  }

  public String getName(){
    return name;
  }


  public String getCompany(){
    return company;
  }
}
