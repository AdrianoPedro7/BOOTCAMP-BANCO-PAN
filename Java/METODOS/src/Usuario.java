public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();


        System.out.println("TV ligada ? " + smartTv.ligada);
        
        

        smartTv.ligar();

        System.out.println("Novo STATUS TV ligada ? " + smartTv.ligada);

        smartTv.desligar();

        System.out.println("Novo STATUS TV ligada ? " + smartTv.ligada);

        
        smartTv.aumentarVolume();
        
        smartTv.diminuirVolume();

        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(11);
        System.out.println("Novo canal: " + smartTv.canal);
        

    }
}
