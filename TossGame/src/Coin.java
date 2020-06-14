import java.util.Random;

public class Coin {

    private String side;

    public static final String HEAD = "Heads";
    public static final String TAIL = "Tails";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String flip(){

        if(new Random().nextBoolean()){
            setSide(HEAD);
        }else {
            setSide(TAIL);
        }

        return getSide();
    }
}
