package kingdom;

public abstract class Animals
{
  private static int maxId = 0;
  public int id;
  public String name;
  public int year;

  public Animals()
  {
    maxId++;
    id = maxId;
  }

  public Animals(String name, int year)
  {
    this.name = name;
    this.year = year;
  }

  public abstract String action();
  public abstract String move();
  public abstract String breath();
  public abstract String reproduce();
  public abstract String getName();
  public abstract int getYear();

  @Override
  public String toString()
  {
    return name + " " + year;
  }

}