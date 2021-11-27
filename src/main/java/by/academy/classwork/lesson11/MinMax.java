package by.academy.classwork.lesson11;


public class MinMax <T extends Number>{

    private T[] arr;

    public MinMax(){
        super();
    }

    public MinMax(T[] arr){
        super();
        this.arr = arr;
    }

    public double maxT (){
        double result = 0.0;

        for (T value : arr ){
            if (result < value.doubleValue() ){
                result = value.doubleValue();
            }
        }

        return result;
    }

    public double minT (){
        double result = 0;

        for (T value : arr ){
            if (result > value.doubleValue() ){
                result = value.doubleValue();
            }
        }
        return result;
    }

    public static void main(String... args){

        Integer[] a = {1,5,3,2,6,8,4,2,9};

        MinMax<Integer> qw = new MinMax<>(a);

        System.out.println(qw.maxT());
        System.out.println(qw.minT());
    }

}
