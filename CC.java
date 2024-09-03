
public class CC{
    private String nom;
    private String prenom;
    private int age;

    public CC(String nom, String prenom, int age){
        this.nom = nom;
        this.prenom=prenom;
        this.age=age;
    }

    public String getNom(){
        return this.nom;
    }
    public String getPrenom(){
        return this.prenom;

    }
    public int getAge(){
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int ajouter(int a){
        return this.age + a;
    }




}