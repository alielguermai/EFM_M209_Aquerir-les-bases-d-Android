public class Agent extends Employe {
    private double primeResponsabilite;
    @Override
    public double salaireAPayer(){
        return (this.getSalaireBase()+primeResponsabilite)*(1-getIR(this.getSalaireBase()));
    }
}
