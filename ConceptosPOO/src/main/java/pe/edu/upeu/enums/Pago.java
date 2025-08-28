package pe.edu.upeu.enums;

enum TIPO_PAGO {Efectivo, Credito, Transferencia, Yape}

enum MES {Enero, Febrero, ect}

public class Pago {
    TIPO_PAGO tipo;
    MES mes;
    double monto;
    String cuenta;
    double impuestos;

    public static void main(String[] args) {
        Pago p = new Pago();
        p.tipo=TIPO_PAGO.Efectivo;
        p.mes=MES.Enero;
        p.monto=100;
        p.cuenta="1234 5678 9154 1865";
        p.impuestos=10;

        System.out.println("Tipo de pago: "+p.tipo);
        System.out.println("Mes: "+p.mes);
        System.out.println("Monto: "+p.monto);
        System.out.println("Cuenta: "+p.cuenta);
        System.out.println("Impuestos: "+p.impuestos);

        for (TIPO_PAGO t: TIPO_PAGO.values()){
            System.out.println("Tipo de pago: "+t);
        }
    }

}
