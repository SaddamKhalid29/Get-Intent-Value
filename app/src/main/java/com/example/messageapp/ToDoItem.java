package com.example.messageapp;

public class ToDoItem {

    //Creating Variable
    private String Title;
    private Boolean IsCompleted;
    private  String Description;

    //Getter and Setter Generated
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Boolean getCompleted() {
        return IsCompleted;
    }

    public void setCompleted(Boolean completed) {
        IsCompleted = completed;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public ToDoItem(){
        Title ="No Title";
        Description="Nothing";
        IsCompleted=false;
    }

    public ToDoItem(String s){
        String[] values=s.split(",");
        Title=values[0];
        Description =values[1];
        if(values[2].equals("true")){
            IsCompleted=true;
        }
        else{
            IsCompleted=false;
        }
    }

    //toString method
    @Override
    public String toString() {
        return Title +","+ Description +","+ IsCompleted;
    }
}
