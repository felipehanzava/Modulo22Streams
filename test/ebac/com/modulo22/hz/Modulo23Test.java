package ebac.com.modulo22.hz;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Modulo23Test extends Modulo23{

    @Test
    public void testAvaliarSexo(){
        Modulo23 mod = new Modulo23();
        List<String>listaFem = new ArrayList<>();

        listaFem.add("Cintia-F");
        listaFem.add("Sonia-F");
        listaFem.add("Bangela-F");
        listaFem.add("Meg-F");

        Assert.assertTrue(verificaSexo(listaFem));


    }

}
