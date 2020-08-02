package com.example.mvvmhelloword;

public class Model {

    String name = "Alexander";
    String number = "4";
    String editText = "";

    public Model(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public Model() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEditText() {
        return editText;
    }

    public void setEditText(String editText) {
        this.editText = editText;
    }
}
