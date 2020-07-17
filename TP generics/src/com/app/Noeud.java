package com.app;


public class Noeud <E extends Comparable>{
    private E value;
    private Noeud<E> leftNode;
    private Noeud<E> rightNode;

    public Noeud() {
        this(null);
    }

    public Noeud(E value) {
        this(value,null,null);
    }

    public Noeud(E value, Noeud leftNode, Noeud rightNode) {
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;

    }


    public E getValue() {
        return value;
    }

    public Noeud getLeftNode() {
        return leftNode;
    }

    public Noeud getRightNode() {
        return rightNode;
    }


    public void setValue(E value) {
        this.value = value;
    }

    public void setLeftNode(Noeud leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Noeud rightNode) {
        this.rightNode = rightNode;
    }


    public void setLeftNodeValue(E leftNodeValue) {
        this.leftNode.value = leftNodeValue;
    }

    public void setRightNodeValue(E rightNodeValue) {
        this.rightNode.value = rightNodeValue;
    }



    @Override
    public String toString() {
        String toResult=  "Noeud{" +
                "value=" + value +
                ", leftNode=" + leftNode.value +
                ", rightNode=" + rightNode.value +
                '}';

        return toResult;

    }

}
