package ebac.com.modulo22.hz;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Modulo12 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println(("Digite os nomes e o sexo(ex.: Felipe-M,Cintia-F,...)" +
                "M = masculino e F = feminino:"));

        String resposta = s.next();
        String[] sexo;
        sexo = separadorNome(resposta, ",");

        verificaSexo(sexo);

    }

    private static void verificaSexo(String[] sexo) {
        Map<String, Integer> sexoMasc = new TreeMap<>();
        Map<String, Integer> sexoFem = new TreeMap<>();
        String a;
        for (int i = 0; i< sexo.length; i++){
            String f = sexo[i];
            if (f.contains("-M")){
                a=f.replace("-M", "");
                sexoMasc.put(a,i);
            }else if (f.contains("-F")){
                a=f.replace("-F", "");
                sexoFem.put(a,i);
            }
        }
        imprimir(sexoMasc, sexoFem);
    }

    private static void imprimir(Map<String, Integer> sexoMasc, Map<String, Integer> sexoFem) {
        System.out.println("Grupo Masculino:");
        sexoMasc.keySet().stream().forEach(System.out::println);
        System.out.println("\n================");
        System.out.println("Grupo Feminino:");
        sexoFem.keySet().stream().forEach(System.out::println);
    }


    private static String[] separadorNome(String n, String separador) {
        String[] vetNome = n.split(separador);
        return vetNome;
    }
}
