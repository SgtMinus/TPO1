package task2;


import javafx.util.Pair;
import java.util.ArrayList;
import java.util.LinkedList;

public class ChainMap {
    public ArrayList<LinkedList<Pair<Integer,Integer>>> collection;
    private Integer size;
    private final Integer fillFactor = 2;

    public ChainMap(Integer size) {
        this.size = size;
        this.collection = new ArrayList<>(size);
        for (int i = 0; i<size; i++)
        {
            this.collection.add(new LinkedList<>());
        }
    }

    public ChainMap() {
        this.size = 16;
        this.collection = new ArrayList<>(size);
        for (int i = 0; i<size; i++)
        {
            this.collection.add(new LinkedList<>());
        }
    }

    public void put(Integer key, Integer value)
    {
        Integer currentHash = hash(key);
        LinkedList<Pair<Integer,Integer>> currentChain = collection.get(currentHash);
        if (currentChain.size() == 0)
        {
            currentChain.add(new Pair<>(key,value));
            return;
        }
        for (int i = 0; i<currentChain.size(); i++)
        {
            if (currentChain.get(i).getKey().equals(key))
            {
                currentChain.set(i, new Pair<>(key,value));
                return;
            }
        }
        currentChain.add(new Pair<>(key,value));
        if (currentChain.size()/size > fillFactor)
            expand();
    }


    public Integer get(Integer key)
    {
        Integer currentHash = hash(key);
        LinkedList<Pair<Integer,Integer>> currentChain = collection.get(currentHash);
        for (Pair<Integer, Integer> pair:currentChain)
        {
            if (pair.getKey().equals(key))
                return pair.getValue();
        }
        return null;
    }

    public void remove(Integer key)
    {
        Integer currentHash = hash(key);
        LinkedList<Pair<Integer,Integer>> currentChain = collection.get(currentHash);
        for (Pair<Integer, Integer> pair:currentChain)
        {
            if (pair.getKey().equals(key))
                currentChain.remove(pair);
        }
    }

    public Boolean containsKey(Integer key)
    {
        Integer currentHash = hash(key);
        LinkedList<Pair<Integer,Integer>> currentChain = collection.get(currentHash);
        for (Pair<Integer, Integer> pair:currentChain)
        {
            if (pair.getKey().equals(key))
                return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean containsValue(Integer value)
    {
        for (LinkedList<Pair<Integer,Integer>> currentChain:collection)
        {
            for (Pair<Integer, Integer> pair:currentChain)
            {
                if (pair.getValue().equals(value))
                    return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private Integer hash(Integer key)
    {
        return key%size;
    }

    private void expand()
    {
        ChainMap newMap = new ChainMap(this.size*2);
        for (LinkedList<Pair<Integer,Integer>> currentChain:collection)
        {
            for (Pair<Integer, Integer> pair:currentChain)
            {
                newMap.put(pair.getKey(), pair.getValue());
            }
        }
        this.size = newMap.size;
        this.collection = newMap.collection;
    }

}
