package arraylist_evolua;

import java.util.ArrayList;
import java.util.Arrays;

/***********************
 ARRAYLIST EVOLUA SUMARE
      09/09/2022
***********************/
public class ArrayList_Evolua {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("******** ARRAY LIST **********\n");
        
        ArrayList<String> banda = new ArrayList<>();
        banda.add("Guns");
        //System.out.println(Arrays.toString(banda.toArray()));
        
        // criando mais uma banda
        banda.add("Metallica");
        //System.out.println(Arrays.toString(banda.toArray()));
        
        // criando mais uma banda
        banda.add("Nirvana");
        //System.out.println(Arrays.toString(banda.toArray()));
        
        // criando varias bandas
         banda.add("Tiao Carrero e Pardim");
         banda.add("Secos e Molhados");
         banda.add("Tadeu e Tadano");
         banda.add("ChicoAmado e Xodo");
         banda.add("ToIndo e JaFui");
        System.out.println(Arrays.toString(banda.toArray()));
        
        System.out.println("Selecionando indice 0: " + banda.get(0));
        System.out.println("Selecionando indice 3: " + banda.get(3));
        
         // update de nome da banda
        banda.set(banda.indexOf("Guns") , "Mamonas Sabao Cra Cra"); //???
        System.out.println(Arrays.toString(banda.toArray()));
        System.out.println("Selecionando indice 0 apos update: " + banda.get(0));
        
         // movendo indice para nova banda
        banda.add(banda.indexOf("Mamonas Sabao Cra Cra") , "Mamonas Sabado de SOl"); //???
        System.out.println(Arrays.toString(banda.toArray()));
        System.out.println("Selecionando indice 0 apos mudar indice: " + banda.get(0));
        
        
        // apagar banda
        //banda.remove("Guns");
        //System.out.println(Arrays.toString(banda.toArray()));
        //System.out.println("Selecionando indice 0 apos remocao Guns: " + banda.get(0));
         
        // apagando a lista TODA -> DANGER
        //banda.clear();
        //System.out.println("Lista atualizada: " + Arrays.toString(banda.toArray())); 
        
       
         
         
         
    }
    
}
