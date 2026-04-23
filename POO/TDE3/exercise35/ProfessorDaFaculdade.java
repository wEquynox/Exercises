package TDE3.exercise35;

public class ProfessorDaFaculdade extends EmpregadoDaFaculdade{
    
    protected int horasAula;

    public double getGastos() {
        return super.getGastos() + (this.horasAula * 10);
    }
}
