package Clase;

public class Matematica {
    private double num1;
    private double num2;

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Matematica() {
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double devolverMayor(){
        if(this.num1 > this.num2){
            return this.num1;
        } else {
            return this.num2;
        }
    }

    public double calcularPotencia() {
        double r1=0, r2=0;
        r1 = Math.round(num1);
        System.out.println(r1);
        r2 = Math.round(num2);
        System.out.println(r2);
        if(this.num1 > this.num2){
            return Math.pow(r1,r2);
        } else {
            return Math.pow(r2,r1);
        }
    }

    public double calculaRaiz() {
        int e1= (int) num1;
        System.out.println(e1);
        int e2= (int) num2;
        System.out.println(e2);
        if(this.num1 < this.num2){
            return Math.sqrt(e1);
        } else {
            return Math.sqrt(e2);
        }
    }
}
