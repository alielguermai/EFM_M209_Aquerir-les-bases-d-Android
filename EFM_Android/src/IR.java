public  class IR {
    static int salaire;
    static boolean[] tranches;
    static double[] tauxIR = {0,0.1,0.2,0.3,0.34,0.38};
    static double getIR(double sal) {
        double salaire=sal*12;
        tranches= new boolean[]{salaire >= 0 && salaire <= 30000, salaire >= 30001 && salaire <= 50000, salaire >= 50001 && salaire <= 60000,
                salaire >= 60001 && salaire <= 80000, salaire >= 81000 && salaire <= 180000, salaire >= 180001};
        for (int i = 0; i < 6; i++) {
            if (tranches[i]) {
                return (salaire*tauxIR[i]);
            }
        }
        return 0;
    }
}

