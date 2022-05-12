package com.jarvis.techlab.newfeature.textblock;

/**
 * @author jarvis
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月12日 12:59:00
 */
public class TextBlockTestClass {
    /**
     * 使用“”“表示文本块
     * 加上\表示不换行
     * @return
     */
    public static String getStr(){
        String query = """
           SELECT * from USER \
           WHERE `id` = 1 \
           ORDER BY `id`, `name`;\
           """;
        return query;
    }

    public static void main(String[] args) {
        System.out.println(TextBlockTestClass.getStr());
    }
}
