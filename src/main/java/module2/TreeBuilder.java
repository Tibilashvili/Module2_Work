package module2;

import java.util.*;

public class TreeBuilder {

    protected Map<Character, Integer> buildRepitionsMap(String str){
        Map<Character, Integer> numberOfRepetitions = new HashMap<Character, Integer>();
        for (char ch: str.toCharArray()){
            if (numberOfRepetitions.containsKey(ch)){
                int counter = numberOfRepetitions.get(ch);
                numberOfRepetitions.put(ch, ++counter);
            }

            else {
                numberOfRepetitions.put(ch, 1);
            }
        }

        return numberOfRepetitions;
    }


    protected Node buildTree(Map<Character, Integer> map) {
        Queue<Node> nodeQueue = createQueue(map);

        while (nodeQueue.size() > 1) {
            Node node1 = nodeQueue.poll();
            Node node2 = nodeQueue.poll();
            Node node = new Node('\0', node1.getWeight() + node2.getWeight(), node1, node2);
            nodeQueue.add(node);
        }

        return nodeQueue.poll();
    }

    private static Queue<Node> createQueue(Map<Character, Integer> map) {
        Queue<Node> priorityQueue = new PriorityQueue<Node>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            priorityQueue.add(new Node(entry.getKey(), entry.getValue(), null, null));
        }
        return priorityQueue;
    }


}
