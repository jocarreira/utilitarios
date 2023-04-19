package org.example;

import com.jocarreira.html2react.parser.File2Script;
import com.jocarreira.html2react.util.FileUtil;
import com.jocarreira.html2react.util.HtmlToJsonConverter;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        /*
        //String content = "<lu><li>01-primeiro</li><li>02-segundo</li><li>03-terceiro</li></lu>";
        //String convert = HtmlToReactConverter.convert(content);
        File2Script f2s = new File2Script();
        //f2s.converteHtml2React("arquivo.html", "arquivo.json");
        f2s.converteHtml2Json("arquivo.html", "arquivo.json");
        String content = FileUtil.readFromFile("arquivo.json");
        System.out.println(content);
        */

        //String html = "<form><input type=\"text\" name=\"username\" value=\"John Doe\"><input type=\"submit\" value=\"Submit\"></form>";
        String html = FileUtil.readFromFile("C:\\MEUS_PROJETOS\\Html2React2\\listagem_acrescimos.html");
        String json = HtmlToJsonConverter.convert(html);
        System.out.println(json); // [{"input","text","username","John Doe",false},{"input","submit","","Submit",false}]
        FileUtil.writeToFile("C:\\MEUS_PROJETOS\\Html2React2\\listagem_acrescimos.json", json);

    }
}