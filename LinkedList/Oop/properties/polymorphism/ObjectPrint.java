package Oop.properties.polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num){
        this.num = num;
    }

    @Override // coz this is overriding the actual toString() method of the object class
    public String toString(){
        return ""+num;
    } // @ runtime it is determined that this method will be run by java


    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);
        System.out.println(obj.toString());
        // if toString() is not specified in the superclass then
        // java will automatically call the object toString() method
        // this gives Oop.properties.polymorphism.ObjectPrint@e9e54c2
    }
}
