public class Principal {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(35);
        IngressoVIP ingressoVIP = new IngressoVIP(35, 50);

        System.out.println("Valor do ingresso: " + ingresso.getIngresso());
        
        System.out.println("Valor do ingresso: " + ingresso.getIngresso());
        System.out.println("Valor do ingressoVIP: " + ingressoVIP.getIgressoVIP());

        
    }
}