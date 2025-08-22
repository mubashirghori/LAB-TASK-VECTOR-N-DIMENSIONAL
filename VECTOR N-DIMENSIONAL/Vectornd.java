import java.util.ArrayList;
import java.util.Iterator;
public class Vectornd implements Iterable<Double>, Cloneable{
    private ArrayList<Double> coordinates;
     // Constructor: variable arguments (nD vector k leya)
    public Vectornd(Double...values){
        coordinates=new ArrayList<>();
        for(double v : values){
            coordinates.add(v);
        }
    }
       //  value index mein set karna k leya
    public void set(int index , double value){
        coordinates.set(index,value);
    }
    
    //  value index sa get karna k leya
    public double get(int index){
        return coordinates.get(index);
    }
    
    // Magnitude nikalna k leya for N-DIMENSIONAL
    public double magnitude(){
        double sum=0;
        for(double n : coordinates){
            sum+= n*n;
        }
        return Math.sqrt(sum);
    }
    // Doo Vectors ko add karna k leyaa 
    public Vectornd add(Vectornd n){
        if(this.coordinates.size() != n.coordinates.size()){
            throw new IllegalArgumentException("vector must be same dimension");
        }
        Vectornd result= new Vectornd();
        for(int i =0; i<coordinates.size(); i++){
        result.coordinates.add(this.coordinates.get(i)+n.coordinates.get(i));
    }
    return result;
    }
    // doo vector ka dotproduct nikalna k leya
    public double dotproduct(Vectornd n){
    if(this.coordinates.size()!= n.coordinates.size()){
        throw new IllegalArgumentException("vector must be same dimension");
       }
       double sum=0;
       for(int i=0;i<coordinates.size();i++){
        sum+=this.coordinates.get(i)*n.coordinates.get(i);
       }
       return sum;
    }
    //doo vector baraber(equal) hai check karna k leyaa
    public boolean equals(Object o){
        if(this==o)return true;
        if(o== null || this.getClass()!=o.getClass())return false;
        Vectornd n=(Vectornd) o;
        return this.coordinates.equals(n.coordinates);
    }
    // vector ka clone bananay k leyaa
    @Override
    public Vectornd clone(){
        Vectornd copy=new Vectornd();
        for(double d : this.coordinates){
            copy.coordinates.add(d);
        }
        return copy;
    }
    // toString print karna ka leyaa
    @Override 
    public String toString(){
        return coordinates.toString();
    }
    //iterator for each loop support k leyaa
    @Override
    public Iterator<Double>iterator(){
        return coordinates.iterator();
    }
}