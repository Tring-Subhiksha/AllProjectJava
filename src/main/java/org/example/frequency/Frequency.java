package org.example.frequency;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Frequency{
    private Frequency(){

    }
    static void countwords(Map<String, Integer> words) throws FileNotFoundException {
        Scanner file = new Scanner(new File("src/main/java/org/example/frequency/sample.txt"));
        while (file.hasNext()) {
            String word = file.next();
            Integer count = words.get(word);
            if (count != null)
                count++;
            else
                count = 1;
            words.put(word, count);
        }
        file.close();
        Queue<Map.Entry<String,Integer>> pq=new PriorityQueue<>((a, b)-> b.getValue()-a.getValue());
        Logger l= Logger.getLogger("subhi");

        pq.addAll(words.entrySet());
        while(!pq.isEmpty())
        {

            l.log(Level.INFO,()-> ""+pq.poll());
        }

    }


    public static void words() throws FileNotFoundException {
        Map<String,Integer> words= new HashMap<>();
        countwords(words);

    }


}