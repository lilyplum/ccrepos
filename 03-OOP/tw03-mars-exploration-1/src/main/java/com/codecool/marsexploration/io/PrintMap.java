package com.codecool.marsexploration.io;

import java.util.List;

public class PrintMap {
    public  final String ANSI_BLACK = "\u001B[30m";
    public  final String ANSI_RED = "\u001B[31m";
    public  final String ANSI_GREEN = "\u001B[32m";
    public  final String ANSI_YELLOW = "\u001B[33m";
    public  final String ANSI_BLUE = "\u001B[34m";
    public  final String ANSI_PURPLE = "\u001B[35m";
    public  final String ANSI_CYAN = "\u001B[36m";
    public  final String ANSI_WHITE = "\u001B[37m";
    public void run(List<List<String>> map){

        int mapWidth = map.size();
        for(int i = 0;i< mapWidth;i++){
            for(int j= 0; j< mapWidth;j++){
                if(map.get(i).get(j).equals("#")){
                    System.out.print(ANSI_RED + map.get(i).get(j));
                }
                else if(map.get(i).get(j).equals("▲")){
                    System.out.print(ANSI_CYAN + map.get(i).get(j));
                }
                else if(map.get(i).get(j).equals("*")){
                    System.out.print(ANSI_YELLOW + map.get(i).get(j));
                }
                else if(map.get(i).get(j).equals("~")){
                    System.out.print(ANSI_BLUE + map.get(i).get(j));
                }
                else {
                    System.out.print(ANSI_WHITE + map.get(i).get(j));
                }
            }
            System.out.println();
        }
    }

}

