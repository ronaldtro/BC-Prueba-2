public class Main {
    public static void main(String[] args) {
        probandoIf(3);
        probandoWhile(0);
        probandoDoWhile(3);
        probandoFor();
        probandoSwitch(4);
    }

    public static void probandoIf(int numeroIf){
        if(numeroIf>0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es negativo");
        }
    }

    public static void probandoWhile(int numeroWhile){
        while(numeroWhile<3){
            System.out.println("numeroWhile = "+numeroWhile);
            numeroWhile+=1;
        }
    }

    public static void probandoDoWhile(int numeroDoWhile){
        do{
            System.out.println("numeroDoWhile = "+numeroDoWhile);
        }while(numeroDoWhile<3);
    }

    public static void probandoFor(){
        for(int numeroFor=0; numeroFor<=3; numeroFor+=1){
            System.out.println("numeroFor = "+numeroFor);
        }
    }

    public static void probandoSwitch(int estacion){
        switch(estacion){
            case 1:
                System.out.println("Es primavera!");
                break;
            case 2:
                System.out.println("Es verano!");
                break;
            case 3:
                System.out.println("Es otoño");
                break;
            case 4:
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("Error, no corresponde a ninguna estacion");
        }
    }

}