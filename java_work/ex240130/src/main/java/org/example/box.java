package org.example;

class box<T> {

    @Override
    public String toString() {
        return "box{" +
                "obj=" + obj +
                '}';
    }

    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
