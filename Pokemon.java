public class Pokemon {
    private String name;
    private int hp;
    private int xp;
    private String sound;
    private String food;

    public Pokemon(String name, int hp, int xp, String sound, String food) {
        this.name = name;
        this.hp = hp;
        this.xp = xp;
        this.sound = sound;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
