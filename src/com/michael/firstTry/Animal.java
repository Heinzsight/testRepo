package com.michael.firstTry;

public class Animal {

    //variables (private means the variable can only be change by the methods (in this case the getters/setters in this class)
    private double height;
    private double weight;
    private String name;
    private String breed;

    //Methods (Constructor and getters and setters)
    Animal(double h, double w, String n, String b) //this is the constructor and it is called whenever you use the keyword "new" to create an object
    {
        height = h;
        weight = w;
        name = n;
        breed = b;
    }

    public void setHeight(double h)
    {
        this.height = h;
    }

    public double getHeight()
    {
        return height;
    }


    public void setWeight(double w)
    {
        this.weight = w;
    }

    public double getWeight()
    {
        return weight;
    }


    public void setName(String n)
    {
        this.name = n;
    }

    public String getName()
    {
        return name;
    }


    public void setBreed(String b)
    {
        this.breed = b;
    }

    public String getBreed()
    {
        return breed;
    }
}
