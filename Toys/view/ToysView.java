package Toys.view;

import java.util.List;

import Toys.classes.Toy;

public class ToysView {

    List<Toy> toys;

    public ToysView(List<Toy> toys){
        this.toys = toys;
    }

    public void ShowToys(){
        for(Toy toy: toys){
            System.out.println(toy.toString());
        }
    }
    
}
