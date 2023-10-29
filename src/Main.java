import linkedlist.MyLinkedList;
import linkedlist.Node;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

       ArrayList<Integer> arrayList = new ArrayList<>();
       ArrayList<Integer> resultList = new ArrayList<>();
       MyArrayList a = new MyArrayList();

       arrayList.add(1);
       a.add(1);
       a.add(2);
       a.add(3);
       a.add(4);
       a.add(5);
       a.add(6);
       a.add(7);
       a.add(8);
       a.add(10);
       a.add(700);
       a.add(8);
       a.add(1);
       a.add(2);
       System.out.println(a);

       a.add(0, 756);
       System.out.println(a);

       a.add(2, 354);
       System.out.println(a);

       a.remove(2);
       System.out.println(a);

       System.out.println(a.contains(12));


       for (int i = 0; i < arrayList.size(); i++) {
          System.out.println(arrayList.get(i));
       }

       Iterator<Integer> iterator = arrayList.iterator();

       while (iterator.hasNext()){
          System.out.println(iterator.next());
       }

       for (Integer integer : arrayList){//foreach
          System.out.println(integer);
      //    arrayList.remove(2);
       }

       for (int i = 0; i < arrayList.size(); i++) {
          int integer = arrayList.get(i);
          if (integer >= 4) {
             resultList.add(integer);
          }
       }

       ListIterator<Integer> listIterator = arrayList.listIterator();

       System.out.println(a);
       System.out.println(a.contains(701));

       MyLinkedList myLinkedList = new MyLinkedList();
       myLinkedList.add(2);
       myLinkedList.add(3);
       myLinkedList.add(4);

       Node head = myLinkedList.getHead();

       System.out.println(head);
       System.out.println(head.getNext());
       System.out.println(head.getNext().getNext());

       int MyArrayListSize = a.getSize();
       System.out.println("Размер моего MyArrayList равен " + MyArrayListSize);

    }
}