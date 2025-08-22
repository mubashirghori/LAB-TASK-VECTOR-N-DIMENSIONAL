public class Main {
    public static void main(String[] args) {
        Vectornd v1=new Vectornd(1.0, 2.0, 3.0, 4.0);
        Vectornd v2=new Vectornd(4.0, 3.0, 2.0, 1.0);
        System.out.println("================4D VECTOR===================");

        System.out.println("V1 :" + v1);
        System.out.println("V2 :" + v2);
        System.out.println("ADDITION OF V1 AND V2 :"+ v1.add(v2));
        System.out.println("DOT PRODUCT OF V1 and V2 : "+ v1.dotproduct(v2));
        System.out.println("CLONE OF V1 : "+ v1.clone());
        System.out.println("CLONE OF V2 : "+ v2.clone());
        System.out.println("MAGNITUDE OF V1 :"+ v1.magnitude());
        System.out.println("MAGNITUDE OF V2 :"+ v2.magnitude());

        Vectornd v3=new Vectornd(3.0,2.0,-1.0,4.0,-9.0,6.0);
        Vectornd v4=new Vectornd(3.0,2.0,-1.0,4.0,-9.0,6.0);
        

        System.out.println("================6D VECTOR===================");

          System.out.println("V3 :" + v3);
        System.out.println("V4 :" + v4);
        System.out.println("ADDITION OF V3 AND V4 :"+ v3.add(v4));
        System.out.println("DOT PRODUCT OF V3 and V4 : "+ v3.dotproduct(v4));
        System.out.println("CLONE OF V3 : "+ v3.clone());
        System.out.println("CLONE OF V4 : "+ v4.clone());
        System.out.println("MAGNITUDE OF V3 :"+ v3.magnitude());
        System.out.println("MAGNITUDE OF V4 :"+ v4.magnitude());

        System.out.println("This Program is for n-dimensional vector and we can create a vector of any dimension with it.");


    }
}
