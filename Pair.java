public class Pair<K, V> {
    private K one;
    private V two;
    Pair (K first, V second){
        this.one = first;
        this.two = second;
    }
    
    public K getFirst(){return this.one;}
    public V getSecond(){return this.two;}

    public void setFirst(K value){this.one = value;}
    public void setSecond(V value){this.two = value;}
}
