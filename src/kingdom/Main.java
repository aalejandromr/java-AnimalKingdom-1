package kingdom;
import java.util.*;

public class Main
{
  
  public static void printAnimals(ArrayList<Animals> animals, CheckAnimals tester)
  {
    for(Animals animal : animals)
    {
      if(tester.test(animal))
      {
        System.out.println(animal.getName());
      }
    }
  }
  public static void main(String[] args) {
    Mammal panda = new Mammal("Panda", 1896);
    Mammal zebra = new Mammal("Zebra", 1778);
    Mammal koala = new Mammal("Koala", 1816);
    Mammal sloth = new Mammal("Sloth", 1804);
    Mammal armadillo = new Mammal("Armadillo", 1758);
    Mammal raccoon = new Mammal("Raccoon", 1758);
    Mammal bigfoot = new Mammal("Big Foot", 2021);

    Bird pigeon = new Bird("Pigeon", 1837);
    Bird peacock = new Bird("Peacock", 1821);
    Bird toucan = new Bird("Toucan", 1758);
    Bird parrot = new Bird("Parrot", 1824);
    Bird swan = new Bird("Swan", 1758);

    Fish salmon = new Fish("Salmon", 1758);
    Fish catfish = new Fish("Catfish", 1817);
    Fish perch = new Fish("Perch", 1758);

    ArrayList<Animals> animalList = new ArrayList<>();
    animalList.add(panda);
    animalList.add(zebra);
    animalList.add(koala);
    animalList.add(sloth);
    animalList.add(armadillo);
    animalList.add(raccoon);
    animalList.add(bigfoot);
    animalList.add(pigeon);
    animalList.add(peacock);
    animalList.add(toucan);
    animalList.add(parrot);
    animalList.add(swan);
    animalList.add(salmon);
    animalList.add(catfish);
    animalList.add(perch);

    System.out.println();
    System.out.println("List all the animals in descending order by year named");
    animalList.sort((o1, o2) -> o2.getYear() - o1.getYear());
    animalList.forEach(o1 -> System.out.println(o1));
    System.out.println();
    System.out.println("List all the animals alphabetically");
    animalList.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
    animalList.forEach(o1 -> System.out.println(o1));
    System.out.println();
    System.out.println("List all the animals alphabetically");
    animalList.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
    animalList.forEach(o1 -> System.out.println(o1));

    System.out.println();
    System.out.println("List all the animals order by how they move");
    animalList.sort((o1, o2) -> o1.move().compareToIgnoreCase(o2.move()));
    animalList.forEach(o1 -> System.out.println(o1));

    System.out.println();
    System.out.println("List only those animals the breath with lungs");
    printAnimals(animalList, o1 -> o1.breath() == "lungs");

    System.out.println();
    System.out.println("List only those animals that breath with lungs and were named in 1758");
    printAnimals(animalList, o1 -> (o1.breath() == "lungs") && (o1.getYear() == 1758));
    
    System.out.println();
    System.out.println("List only those animals that lay eggs and breath with lungs");
    printAnimals(animalList, o1 -> (o1.breath() == "lungs") && (o1.reproduce() == "eggs"));

    System.out.println();
    System.out.println("List alphabetically only those animals that were named in 1758");
    printAnimals(animalList, o1 -> (o1.breath() == "lungs") && (o1.reproduce() == "eggs"));
    // printAnimals(animalList, (o1) -> o1.getYear() > o2.getYear());
  }
}