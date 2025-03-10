import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nombre;
        int fecha;
        int telefono,opc, nm=0, nt=0, nmo=0, nd=0, nr=0;
        int valort = 0;
        int vt = 320000, vtt=0;
        int vm = 80000, vtm=0;
        int vmo = 940000, vtmo=0;
        int vd = 230000, vtd=0;
        int vr = 180000, vtr=0;

        System.out.println("INGRESE SUS DATOS");
        System.out.println("NOMBRE: ");
        nombre = teclado.nextLine();
        System.out.println("TELEFONO: ");
        telefono = teclado.nextInt();
        System.out.println("FECHA DE LA COMPRA:");
        fecha = teclado.nextInt();

        do {
            System.out.println("""
                    MENU
                    1. MOUSE  80.000
                    2. TECLADOS  320.000
                    3. MONITOR  940.000
                    4. DISCOS DUROS  230.000
                    5. RAM  180.000
                    6. SALIR
                    """);
            opc = teclado.nextInt();

            switch(opc) {

                case 1 ->{
                    System.out.println("NUMERO DE MOUSE QUE QUIERE COMPRAR: ");
                    nm = teclado.nextInt();
                    vtm= (vm * nm);
                    valort = valort + vtm;


                }
                case 2 ->{
                    System.out.println("NUMERO DE TECLADOS QUE QUIERE COMPRAR: ");
                    nt = teclado.nextInt();
                    vtt= (vt * nt);
                    valort = valort + vtt;

                }
                case 3 ->{
                    System.out.println("NUMERO DE MONITORES QUE QUIERE COMPRAR: ");
                    nmo = teclado.nextInt();
                    vtmo = (vmo * nmo);
                    valort = valort +  vtmo;
                }
                case 4 ->{
                    System.out.println("NUMERO DE DISCOS DUROS QUE QUIERE COMPRAR: ");
                    nd = teclado.nextInt();
                    vtd = (vd * nd);
                    valort = valort + vtd;
                }
                case 5 ->{
                    System.out.println("NUMERO DE RAM QUE QUIERE COMPRAR: ");
                    nr = teclado.nextInt();
                    vtr = (vr * nr);
                    valort = valort + vtr;

                }

            }


        }while(opc<6);;
        System.out.println("-------------------------------------------------------");
        System.out.println("RECIBO");
        System.out.println("NOMBRE DEL CLIENTE: " + nombre + "   FECHA: " + fecha);
        System.out.println("TELEFONO: " + telefono);
        System.out.println("PRODUCTO          CANTIDAD          V/UNI          V/TOTAL");
        System.out.println("TECLADO              " + nt + "              " + vt + "            " + vtt);
        System.out.println("MOUSE                " + nm + "              " + vm + "             " + vtm);
        System.out.println("MONITOR              " + nmo + "             " + vmo + "             " + vtmo);
        System.out.println("DISCO DURO           " + nd + "              " + vd + "            " + vtd);
        System.out.println("RAM                  " + nr + "              " + vr + "            " + vtr);
        System.out.println("--------------------------------------------------------");
        System.out.println("VALOT TOTAL: " + valort);
        System.out.println("VALOR IVA: " + valort * 0.16);
        System.out.println("TOTAL: " + (valort + (valort * 0.16)));

    }
}