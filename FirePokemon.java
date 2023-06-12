class FirePokemon extends Pokemon {
    private int gasoline;
    private boolean flyAbility;

//      CONSTRUCTOR FIRE POKEMON
    public FirePokemon(String name, int hp, int xp, String sound, String food, int gasoline, boolean flyAbility) {
        super(name, xp, hp, sound, food);
        this.gasoline = gasoline;
        this.flyAbility = flyAbility;
    }

//      OVERRIDE METHODS VAN DE SUPER CLASS

    @Override
    public void toEat() {
        System.out.println(this.getName() + " is eating " + this.getFood());
        setHp(10);
    }

    @Override
    public String sound() {
        return getSound();
    }

    //      GETTER & SETTER GASOLINE FIRE POKEMON
    public int getGasoline() {
        return gasoline;
    }

    public void setGasoline(int gasoline) {
        this.gasoline = gasoline;
    }
}
