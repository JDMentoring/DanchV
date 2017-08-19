package ua.smartprog.lessons.lesson_52;

import ua.smartprog.bankProject.domain.Account;

import java.util.List;

/**
 * Created by Тарас on 19.08.2017.
 */
public class MyArrList<T> {
    private Node[] nodeList = new Node[10];
    private int curIndex = 0;

    public void add(Node obj){
        if(curIndex == nodeList.length - 1){

        }
        if(curIndex > 0){
            nodeList[curIndex] = obj;
            nodeList[curIndex - 1].setPointer(obj);
        }
        else{
            nodeList[curIndex] = obj;
        }
        curIndex++;
    }

    public T getElement(int indx){
        return (T) nodeList[indx].getObject();
    }

    private void remove(int indx){
        nodeList[indx] = null;
        nodeList[indx - 1].setPointer(nodeList[indx + 1]);
    }

    private int size(){
        return curIndex;
    }

    private void resize(int newLength) {
        Node[] newArray = new Node[newLength];
        System.arraycopy(nodeList, 0, newArray, 0, curIndex);
        nodeList = newArray;
    }
}
