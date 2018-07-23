package com.leet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeysandRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();
        addKey(0, rooms,visited);
        return visited.size() == rooms.size();
    }
    private void addKey(int room,List<List<Integer>> rooms,Set<Integer> visited){
        visited.add(room);
        for (int key:
             rooms.get(room)) {
            if(!visited.contains(key)) addKey(key, rooms, visited);
        }
    }
}
