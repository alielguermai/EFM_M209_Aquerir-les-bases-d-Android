import java.time.LocalDate;
import java.util.concurrent.ExecutionException;

public class Employe extends IR implements IEmploye {
    private static int mtle;
    private String nom;
    private int dateNaissance;
    private int dateEmbauche;
    private double salaireBase;
    private int mtleActuelle;
    public Employe(){
        nom="";
        dateNaissance=0;
        dateEmbauche=0;
        salaireBase=0;
        mtleActuelle=mtle;
        mtle++;
    }

    public double getSalaireBase() {
        return salaireBase;
    }

    public void setSalaireBase(double salaireBase) {
        this.salaireBase = salaireBase;
    }

    public int getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(int dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(int dateEmbauche) {
        int age=this.age();
        try{
            if (age<16){
                throw(new Exception("L'age doit etre plus grand que 16 !"));
            }
            this.dateEmbauche = dateEmbauche;
        }
        catch (Exception e) {
            System.out.println("L'age doit etre plus grand que 16 !");
        }
    }
    static LocalDate currentDate = LocalDate.now();
    @Override
    public int age() {
        return currentDate.getYear()-dateNaissance;
    }

    @Override
    public int andciennete() {
        return currentDate.getYear()-dateEmbauche;
    }

    @Override
    public int dateRetraite(int ageRetraite) {
        return dateNaissance+ageRetraite;
    }
    public double salaireAPayer(){
        return getIR(salaireBase);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                "- dateNaissance=" + dateNaissance +
                "- dateEmbauche=" + dateEmbauche +
                "- salaireBase=" + salaireBase +
                "- mtleActuelle=" + mtleActuelle +
                '}';
    }

    public boolean equals(Employe emp) {
        return this.mtleActuelle==emp.mtleActuelle;
    }
}
