package com.java.Oracle;

/**
 * Created by prasun.pallav on 3/26/2019.
 */

import java.util.*;

public class CityTraffic {
    public static String CityTraffic(String[] strArr) {
        Map<Integer, List<Integer>> vertexEdgesMap = new HashMap<>();
        for (String str : strArr) {
            String[] tokens = str.split(":");
            int key = Integer.parseInt(tokens[0]);
            String[] values = tokens[1].substring(1, tokens[1].length() - 1).split(",");
            List<Integer> edges = new ArrayList<>();
            for (String value : values) {
                edges.add(Integer.parseInt(value));
            }
            vertexEdgesMap.put(key, edges);
        }
        return getMaxPopulation(vertexEdgesMap);
    }

    public static String getMaxPopulation(Map<Integer, List<Integer>> vertexEdgesMap) {
        TreeMap<Integer, Integer> cityWiseTraffic = new TreeMap<>();
        for (Map.Entry<Integer, List<Integer>> vertexToEdges : vertexEdgesMap.entrySet()) {
            List<Integer> node = vertexToEdges.getValue();
            Set<Integer> s = new HashSet<>();
            s.add(vertexToEdges.getKey());
            int maxPopulationForACity = Integer.MIN_VALUE;
            for (int i : node) {
                s.add(i);
                maxPopulationForACity = Math.max(maxPopulationForACity, getAllPopulationForANode(i, s, vertexEdgesMap));
                s.remove(i);
            }
            cityWiseTraffic.put(vertexToEdges.getKey(), maxPopulationForACity);
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry m : cityWiseTraffic.entrySet()) {
            sb.append(m.getKey()).append(":").append(m.getValue()).append(",");
        }
//        cityWiseTraffic.forEach((k,v) -> {sb.append(k+":"+v+",");});
        return sb.replace(sb.length() - 1, sb.length(), "").toString();
    }

    public static int getAllPopulationForANode(int currNodeIndx, Set<Integer> visitedNode, Map<Integer, List<Integer>> vertexEdgesMap) {
        int total = 0;
        List<Integer> node = vertexEdgesMap.get(currNodeIndx);
        for (int i : node) {
            if (visitedNode.contains(i)) continue;
            visitedNode.add(currNodeIndx);
            total += getAllPopulationForANode(i, visitedNode, vertexEdgesMap);
        }
        return total + currNodeIndx;
    }

    public static void main(String[] args) {
        String s[] = new String[] {"1:[5]", "2:[5]", "3:[5]", "4:[5]", "5:[1,2,3,4]"};
        System.out.print(CityTraffic(s));
    }
}