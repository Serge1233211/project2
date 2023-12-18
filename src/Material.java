public class Material {
    String n;
    double d;
    public Material(String name,double density){
        n=name;
        d=density;
    }

    public String getN() {
        return n;
    }

    public double getD() {
        return d;
    }

    public void ToString(){
        System.out.println("name: "+n+", density: "+d);
    }
}


