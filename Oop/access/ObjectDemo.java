package Oop.access;

public class ObjectDemo {
    int num;
    float val;
    public ObjectDemo(int num,float val) {
        this.num = num;
        this.val = val;
    }
    // these two we have already seen toString() is for printing in the pretty format
    @Override
    public String toString() {
        return super.toString();
    }

    // this is called during garbage collection
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    // this generates a random 15 digit int code that is given by a hashing algorithm
    // BUT HASHCODE DOESN'T MEAN THE ADDRESS IN JAVA THERE IS NO ADDRESSES
    // HASHCODE CAN BE USED TO SEE THE UNIQUENESS OF AN OBJECT
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        // we type cast the obj with ObjectDemo
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo demo = new ObjectDemo(12, 56.8f);
        ObjectDemo demo1 = new ObjectDemo(12, 78.9f);
        System.out.println(demo.hashCode());
        System.out.println(demo1.hashCode());
        // here java gets confused to whether check the num or val
//        if(demo<demo1){
//            System.out.println();
//        }
        // == only checks whether they're pointing to the same obj
        if(demo == demo1){
            System.out.println("Demo equal to Demo2");
        }

        // checks the content inside the obj
        if(demo.equals(demo1)){
            System.out.println("Demo00 equal to Demo2");
        }

        // 245257410
        //1705736037 since we created 2 objects we are getting like this
        System.out.println(demo.equals(demo1));
    }
}
