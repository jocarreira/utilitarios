package com.jocarreira.html2react.util;

import com.google.gson.Gson;
import com.jocarreira.html2react.model.MenuItem;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class HtmlToJson {
    public static String convertHtmlToJson(String html) {
        Document doc = Jsoup.parse(html);
        Element root = doc.selectFirst("ul");
        List<MenuItem> menu = new ArrayList<>();
        int id = 1;
        for (Element li : root.select("li")) {
            menu.add(getMenuItem(li, id++));
        }
        Gson gson = new Gson();
        return gson.toJson(menu);
    }

    private static MenuItem getMenuItem(Element li, int id) {
        String label = li.selectFirst("a").text();
        String link = li.selectFirst("a").attr("href");
        MenuItem menuItem = new MenuItem(id, label, link);
        Element ul = li.selectFirst("ul");
        if (ul != null) {
            menuItem.setSubitems(getSubitems(ul, id));
        }
        return menuItem;
    }

    private static List<MenuItem> getSubitems(Element ul, int id) {
        List<MenuItem> subitems = new ArrayList<>();
        for (Element li : ul.select("li")) {
            subitems.add(getMenuItem(li, id++));
        }
        return subitems;
    }
}
