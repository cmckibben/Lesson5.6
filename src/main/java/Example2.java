public class Example2 {
    public static void main(String[] args) {
    Pokemon poke = new Pokemon();
    System.out.println("Main 1:");
    System.out.println(poke);

    modify(poke);

    System.out.println("\nMain 2:");
    System.out.println(poke);
  }
  public static void modify(Pokemon pokemon) {
    pokemon.gainWeight();
    System.out.println("\nmodify(Pokemon pokemon)");
    System.out.println(pokemon);
  }
}
