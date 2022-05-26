package ebac.com.modulo22.hz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Modulo23 {

    public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            System.out.println(("Digite os nomes e o sexo(ex.: Felipe-M,Cintia-F,...)" +
                    "M = masculino e F = feminino:"));

            String resposta = s.next();
            List<String> sexo;
            sexo = separadorNome(resposta, ",");

            verificaSexo(sexo);



        }

        public static Boolean verificaSexo(List<String> sexo) {
            List<String> sexoMasc = new ArrayList<>();
            List<String> sexoFem = new ArrayList<>();


            sexoMasc = avaliarSexo(sexo, (n)-> n.contains("-M")) ;
            sexoFem = avaliarSexo(sexo, (n)-> n.contains("-F")) ;

            imprimir(sexoMasc, sexoFem);
            return true;
        }

        private static void imprimir(List sexoMasc, List sexoFem) {
            System.out.println("Grupo Masculino:");
            sexoMasc.stream().forEach(System.out::println);
            System.out.println("\n================");
            System.out.println("Grupo Feminino:");
            sexoFem.stream().forEach(System.out::println);
        }

        public static List<String> avaliarSexo(List<String> sexo, Predicate<String> predicate){
            List<String> list = new ArrayList<>();
            sexo.forEach(n -> {
                if (predicate.test(n)){
                    list.add(n);
                }
            });
            return list;
        }

        private static List<String> separadorNome(String n, String separador) {
            List<String> vetNome = List.of(n.split(separador));
            return vetNome;
        }
}
