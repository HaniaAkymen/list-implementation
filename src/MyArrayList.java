import java.util.ArrayList;
import java.util.Arrays;

//В нашей реализации ArrayList (которая называется MyArrayList)
// реализуйте самостоятельно такие методы
// 1) size()  - метод, аналогичный методу size()
// из обычного arrayList - он возвращет реальный размер листа
// 2) add(index, value) - метод add, только который вставляет
// значение не в конец списка, а в любое произвольное место
// (место задается переменной index)
// 3) remove(int index) - аналог remove из классического ArrayList
// - удаляет элемент из листа по индексу

public class MyArrayList {

    private int[] array;

    private int size;

    public MyArrayList() {

        array = new int[10];
    }

    public int getSize(){
        return size;
    }


    public void add(int value){
        if (size == array.length){
            grow();
        }
        array[size] = value;
        size++;
    }

    public void add(int index, int value) {
        if (size == array.length){
            grow();
        }
        int lastIndex = size - 1;

        for (int i = lastIndex; i >= index; i--){
            array[i + 1] = array[i];
        }
        array[index] = value;
        size++;
    }

    public void remove(int index){
        if (index < 0 && index >= size){
            return;
        }
        for (int i = index + 1; i < size; i++){
            array[i - 1] = array[i];

        }
        array[size - 1] = 0;
        size --;
    }

    private void grow(){
        int[] newArray = new int[array.length * 2];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
    // метод Contains
    public boolean contains(int element){
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}
