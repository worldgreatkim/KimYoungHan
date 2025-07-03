package collection.array;

import java.util.Arrays;
//동적으로 배열의 크기가 늘어나게 만들기 . 추가가 될때 문제가 생기니깐 여길 건드리면 될듯?
public class MyArrayListV2 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];

    }
    public MyArrayListV2(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(Object e){
        //코드 추가
        if(size == elementData.length){
            grow();
        }
        elementData[size] = e;
        size++;
    }

    //코드 추가 >> 배열을 새로 만들고 기존 배열의 값들을 복사해온다.
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
//        Object[] newArr = new Object[newCapacity];
//        for(int i = 0; i < elementData.length; i++){
//            newArr[i] = elementData[i];
//        }

        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public Object get(int index){
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o){
        for (int i = 0; i < size; i++) {
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

    public String toString(){
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size= " + size + ", capacity = " + elementData.length;

    }
}
