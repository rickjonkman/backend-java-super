public class Main {

    public static void main(String[] args) {
//        FirePokemon firePokemon = new FirePokemon("Charmander", 100, 1, "* CHAR CHAR *", "gasoline", 1000);
//        GrassPokemon grassPokemon = new GrassPokemon("Bulbasaur", 100, 1, "* BULB BULB *", "grass", 1000);
//        ElectricPokemon electricPokemon = new ElectricPokemon("Pikachu", 100, 1, "* PIKA *", "light-bulbs", 1000);
//        WaterPokemon waterPokemon = new WaterPokemon("Squirtle", 100, 1, "* Squirt *", "seaweed", 1000);

        //      POKEMONS AANMAKEN ALS OBJECT
        FirePokemon firePokemon = new FirePokemon("Charmander", 68, 58, "* CHAR *", "gasoline", 48, false);
        GrassPokemon grassPokemon = new GrassPokemon("Tangela", 70, 40, "*TANGA*", "grass", 38, true);
        ElectricPokemon electricPokemon = new ElectricPokemon("Pikachu", 85, 82, "*PIKA*", "lightbulbs", 72);
        WaterPokemon waterPokemon = new WaterPokemon("Squirtle", 58, 70, "*SPLASH*", "seaweed", 35);


//        TEST: DE METHODS MET RETURN WAARDES WERKEN NOG NIET. DE VOID METHODS WERKEN WEL.
        grassPokemon.sound();
        firePokemon.toEat();
        electricPokemon.sound();
        waterPokemon.toEat();
        electricPokemon.isBatteryFull();
    }
}
