package aula_08_08_2022;

public class atividade_5_cinco {
    public static void main(String[] args) {

        //Determinado pais tem populacao de 5 milhoes de habitantes com taxa de natalidade de 4 % e mortalidade de 1,1 %.
        //Um segundo pais tem 7 milhoes de pessoas e natalidade de 2% e mortalidade de 0,8% .
        //Em quanto tempo o pais 1 ira ultrapassar o pais 2?
        //Quantos milhoes de população tera o pais 1 e o pais 2 quando isso ocorrer?

        double populacaopais1=5000000;
        double populaçaopais2=7000000;
        int ano=0;

        System.out.println("População inicial pais 1:");
        System.out.println(populacaopais1);
        System.out.println("População inicial pais 2:");
        System.out.println(populaçaopais2);
        System.out.println(" ");
        System.out.println(" ");


        for (int i =0;i<1000;i++){
            populacaopais1=populacaopais1+populacaopais1*0.04-(populacaopais1*0.011);
            populaçaopais2=populaçaopais2+populaçaopais2*0.02-(populaçaopais2*0.008);
            ano++;

            if (populacaopais1>populaçaopais2){
                i=999;
            }
        }

        System.out.println("Populaçao 1 pais:");
        System.out.println(populacaopais1);
        System.out.println(" ");
        System.out.println("Populaçao 2 pais:");
        System.out.println(populaçaopais2);
        System.out.println(" ");
        System.out.println("Levou "+ ano +" anos para população do pais 1 passar a do pais 2!");


    }
}
