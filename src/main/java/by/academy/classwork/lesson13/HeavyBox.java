package by.academy.classwork.lesson13;

import java.util.*;

public class HeavyBox implements Comparable<HeavyBox> {

    int weight;
    int width;
    int height;
    int depth;

    public HeavyBox(int weight,int width,int height, int depth  ){
        super();
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public int compareTo(HeavyBox o) {
        return -(weight - o.weight);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HeavyBox{");
        sb.append("weight=").append(weight);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", depth=").append(depth);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String... args){
//
//        List<HeavyBox> heavyBoxes = new ArrayList<>();
//        Object[] newHeavyBox = heavyBoxes.toArray();
//        HeavyBox a = new HeavyBox(1,2,3,4);
//        HeavyBox b = new HeavyBox(5,6,7,8);
//        HeavyBox c = new HeavyBox(9,10,11,12);
//        HeavyBox d = new HeavyBox(13,14,15,16);
//        heavyBoxes.add(a);
//        heavyBoxes.add(b);
//        heavyBoxes.add(c);
//        heavyBoxes.add(d);
//
//        for (HeavyBox box : heavyBoxes){
//            System.out.println(Arrays.toString(newHeavyBox));
//        }

        TreeSet<HeavyBox> set = new TreeSet<>();

        HeavyBox a = new HeavyBox(13,2,3,4);
        HeavyBox b = new HeavyBox(9,6,7,8);
        HeavyBox c = new HeavyBox(5,10,11,12);
        HeavyBox d = new HeavyBox(2,14,15,16);


        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);

        System.out.println(set);

        Iterator<HeavyBox> iterator = set.iterator();
        while (iterator.hasNext()){
            HeavyBox element = iterator.next();
            System.out.print(element.width + " ");
        }

    }
}
