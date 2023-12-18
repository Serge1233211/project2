public class Subject {
    String n;
    Material m;
    double v;

    public Subject(String name, Material material, double volume) {
        v = volume;
        n = name;
        m = material;
    }

    public void GetMass() {
        System.out.println("mass:"+m.getD()*v);
    }
    public void ToString(){
        System.out.println("material;"+m.getN()+ ", name: "+n+", density: "+m.getD()+", Volume; "+v);
    }
}

