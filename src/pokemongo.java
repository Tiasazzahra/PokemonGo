import java.security.PublicKey;
import java.util.ArrayList;

public class pokemongo {

    private String Bug;
    private String Dark;
    private String Dragon;
    private String Elictric;
    private String Fairly;
    private String Fighting;
    private String Fire;
    private String Flying;
    private String Ghost;
    private String Grass;
    private String Ground;
    private String Ice;
    private String Normal;
    private String Poiso;
    private String Psychic;
    private String Rock;
    private String Steel;
    private String Water;

    public pokemongo(String Bug, String Dark, String Dragon, String Elictric, String Fairly){
        this.Bug = Bug;
        this.Dark= Dark;
        this.Dragon= Dragon;
        this.Elictric= Elictric;
        this.Fairly=Fairly;

    }
    public String getBug(){
        return this.Bug;
    }
    public void setBug(String bug){
        this.Bug = Bug;
    }
    public String getDark(){
        return this.Dark;
    }
    public void setDark(String JumlahCC){
        this.Dark = Dark;
    }
    public String getDragon(){
        return this.Dragon;
    }
    public void setDragon(String Dragon){
        this.Dragon = Dragon;
    }
    public String getElectric(){
        return this.Elictric;
    }
    public void setElictric(String Electric){
        this.Dragon = Dragon;
    }
    public String getFairly(){
        return this.Fairly;
    }
    public void setFairly(){
        this.Fairly = Fairly;
    }

    public static void main(String[] args){
        ArrayList Pokemongo = new ArrayList();
        Pokemongo = new pokemongo;
        Pokemongo.set("Bug");
        Pokemongo.set("Dark");
        Pokemongo.set("Dragon");
        Pokemongo.set("Electric");
        Pokemongo.set("Fairly");
        Pokemongo.add(pokemongo);
    }

    public void Printpokemongo(){
        System.out.println(Bug+" "+Dark+" "+Dragon+" "+Elictric+" "+Fairly);
    }

}




