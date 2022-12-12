import java.util.List;

public class Lambda {
  public static void main(String[] args) {
    // (name)=> {}
    Greetings hi = (name)->{System.out.println("Hello "+name);};
    // dont need to specify String name, since type interence lets it know name is string type
    // Lambda only looks at the signature method, instead of name

    hi.hello("Freddy");

    List<String> names = List.of("fred","barney","wilma","betty");
      for(String n: names){
      apply(hi,n);
  }
  Greetings reverseCase = Lambda::toUpperCase; // Reference method operator
  for (String n: names){
    apply(reverseCase,n);
  }

  }

  public static void apply(Greetings greeting, String value){
    greeting.hello(value);
  }
  public static void toUpperCase(String str){
    System.out.printf("%s: %s \n", str, str.toUpperCase());
  }

  

  
}
