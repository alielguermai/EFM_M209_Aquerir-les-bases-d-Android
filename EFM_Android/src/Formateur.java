public class Formateur extends Employe {
    private int heureSup;
    private double remunerationHSup=70;

    public double getRemunerationHSup() {
        return remunerationHSup;
    }

    public void setRemunerationHSup(double remunerationHSup) {
        this.remunerationHSup = remunerationHSup;
    }
    public Formateur(){
        heureSup=0;
    }

    @Override
    public String toString() {
        return "Formateur{" +
                "heureSup=" + heureSup +
                "- remunerationHSup=" + remunerationHSup +
                "} " + super.toString();
    }
    @Override
    public double salaireAPayer(){
        return (this.getSalaireBase()*heureSup*remunerationHSup)*(1-getIR(this.getSalaireBase()));
    }
}
