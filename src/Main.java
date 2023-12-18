public class Main {

    public static void main(String[] args){
        Material m=new Material("iron",2.3);
        Subject s=new Subject("Statue",m,2.3);
        m.ToString();
        s.ToString();
        s.GetMass();

    }
}