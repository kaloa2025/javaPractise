package Generic;

// public class Data<T> {
//     private T t;
//     public void setT(T t)
//     {
//         this.t=t;
//     }    
//     public T getT()
//     {
//         return t;
//     }
// }

public class Data<T,V> {
    private T t;
    private V v;
    private T a;
    public void setT(T t)
    {
        this.t=t;
    }    
    public T getT()
    {
        return t;
    }
    public void setV(V v) {
        this.v = v;
    }
    public V getV() {
        return v;
    }
    public void setA(T a) {
        this.a = a;
    }
    public T getA() {
        return a;
    }
}
