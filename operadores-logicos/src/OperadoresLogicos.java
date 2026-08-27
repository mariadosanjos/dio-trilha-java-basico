public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;
        boolean condicao3 = true;
        boolean condicao4 = false;

        System.out.println("condicao1 && condicao2 " + (condicao1 && condicao2));
        System.out.println("condicao1 && condicao3 " + (condicao1 && condicao3));
        System.out.println("condicao2 || condicao3 " + (condicao2 || condicao3));
        System.out.println("condicao2 || condicao4 " + (condicao2 || condicao4));

        System.out.println("condicao1 ^ condicao3 " + (condicao1 ^ condicao3));
        System.out.println("condicao1 ^ condicao2 " + (condicao1 ^ condicao2));
        System.out.println("!condicao1 " + (!condicao1));
        System.out.println("!condicao2 " + (!condicao2));
    }

}
