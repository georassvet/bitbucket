package main.java.collection;

import java.util.NoSuchElementException;

public class MyIntCol {
    private Integer[] array;
    private int pos;

    public MyIntCol() {
        array = new Integer[10];
    }
    public boolean isEmpty(){
        return pos==0;
    }

    public void add(Integer integer) throws ClassCastException {
        if(integer==null) throw new ClassCastException();
        if (pos >= array.length) {
            resize();               // resize array
        }
        updateArray(integer);       // update array values on new value
        array[pos++] = integer;     // add new value
    }

    public void remove(Integer integer) throws NoSuchElementException {
        if(pos>0) {
            int index = getIndexByVal(integer);

            if (index == -1) { throw new NoSuchElementException(); }

            Integer[] newArray = new Integer[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i == index) { continue; }
                newArray[j++] = array[i];
            }
            array = newArray;
            pos--;
            updateArray(-integer);
        }
        else { System.out.println("Collection is empty"); }
    }

    public Integer searchByIndex(int index)throws NoSuchElementException{
        if(index < pos){
            return getValue(index);
        }
        else{
            throw new NoSuchElementException();
        }
    }

    public Integer searchByValue(Integer value) throws NoSuchElementException{
        for (int i = 0; i <pos; i++) {
            if(array[i].equals(value)){ return i; }
                return value;
        }
        throw new NoSuchElementException();
    }

    public int maxValue(){
        int result = array[0];
        for (int i = 1; i < pos; i++) {
            if(result<array[i]){
                result = array[i];
            }
        }
        return result;
    }

    public int minValue(){
        int result = array[0];
        for (int i = 1; i < pos; i++) {
            if(result>array[i]){
                result = array[i];
            }
        }
        return result;
    }
    public int getAvg(){
        int sum=0;
        int counter=0;
        for (int i = 0; i < pos; i++) {
            sum+=array[i];
            counter++;
        }
        return sum/counter;
    }
    private int getIndexByVal(Integer integer){
        for (int i = 0; i < array.length ; i++) {
            if(array[i].equals(integer)){ return i; }
        }
        return -1;
    }

    private void resize(){
        Integer[] newArray = new Integer[array.length+10];
        for (int i = 0; i < array.length ; i++) {
            newArray[i]=array[i];
        }
        array=newArray;
    }

    private void updateArray(Integer integer){
        for (int i = 0; i < pos ; i++) {
            array[i]+=integer;
        }
    }

    @Override
    public String toString() {
        StringBuilder string =new StringBuilder();
        string.append("[");
        for (int i = 0; i <pos ; i++) {
            string.append(array[i] + ", ");
        }
        String result= string.toString();
        result = result.replaceFirst("[, \\t]+$","");
        return result+"]";
    }
    private int getValue(int index){
        return array[index];
    }

    public static void main(String[] args) {
        MyIntCol collection =new MyIntCol();

        for (int i = 0; i < 5; i++) {
            collection.add(i);
            System.out.println(collection);
        }
        collection.add(null);

        System.out.println("collection.maxValue() = " + collection.maxValue());
        System.out.println("collection.minValue() = " + collection.minValue());
        System.out.println("collection.getAvg() = " + collection.getAvg());
        System.out.println("collection.searchByIndex(2) = " + collection.searchByIndex(2));
        try {
            System.out.println("collection.searchByIndex(20) = " + collection.searchByIndex(20));
            System.out.println("collection.searchByValue() = " + collection.searchByValue(20));
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        collection.remove(collection.searchByIndex(0));
        collection.remove(collection.searchByIndex(0));

        System.out.println(collection);

    }
}