package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // Question No 1
        CharacterRemover characterRemoverObject =  new CharacterRemover();
        String output = characterRemoverObject.removeCharacters("abcdefgh",0,5);
        System.out.println(output);


        // Question No 3
        List<Script> listOfScripts = new ArrayList<>();

        Script obj1 = new Script("100","test","2022/8/26: 09:05");
        Script obj2 = new Script("101","test1","2022/8/26: 09:05");
        Script obj3 = new Script("101","test2","2022/8/26: 09:05");
        Script obj4 = new Script("103","test3","2022/8/26: 09:05");
        Script obj5 = new Script("103","test4","2022/8/26: 09:05");
        Script obj6 = new Script("106","test5","2022/8/26: 09:05");
        listOfScripts.add(obj1);
        listOfScripts.add(obj2);
        listOfScripts.add(obj3);
        listOfScripts.add(obj4);
        listOfScripts.add(obj5);
        listOfScripts.add(obj6);

        System.out.println(filter(listOfScripts,"uuid","101"));

    }

    public static List<String> filter(List<Script> scripts, String filterBy, String filterValue) {
        List<String> output = new ArrayList<>();
        for (Script script : scripts) {
            if (Objects.equals(filterBy, "uuid")) {
                if (Objects.equals(script.getUuid(), filterValue)) {
                    output.add("'uuid: " + script.getUuid() + ", name: "+ script.getName() + ", createTime: "+ script.getCreateTime()+"'");
                }
            } else if (Objects.equals(filterBy, "name")) {
                if (Objects.equals(script.getName(), filterValue)) {
                    output.add("'uuid: " + script.getUuid() + ", name: "+ script.getName() + ", createTime: "+ script.getCreateTime()+"'");
                }
            } else if (Objects.equals(filterBy, "createTime")) {
                if (Objects.equals(script.getName(), filterValue)) {
                    output.add("'uuid: " + script.getUuid() + ", name: "+ script.getName() + ", createTime: "+ script.getCreateTime()+"'");
                }
            }

        }
        return output;
    }
}