package kingdom;

public class Mammal extends Animals
{
  public Mammal(String name, int year)
  {
    super(name, year);
  }

  public int getId()
  {
    return id;
  }
  @Override
  public String getName()
  {
    return name;
  }
  @Override
  public int getYear()
  {
    return year;
  }

  @Override
  public String action()
  {
    return "";
  };

  @Override
  public String move()
  {
    return "walk";
  };

  @Override
  public String breath()
  {
    return "lungs";
  };

  @Override
  public String reproduce()
  {
    return "live births";
  };
}
