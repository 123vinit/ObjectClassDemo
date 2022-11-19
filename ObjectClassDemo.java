package AccesControl;

import java.util.Objects;

/*
  by default every class inherited object
  class
  its present in lang package
 */
public class ObjectClassDemo {
    int num;int val;
    ObjectClassDemo(int num,int val){
        this.num=num;
        this.val=val;
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj){
        return this.num==((ObjectClassDemo)obj).num;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    @Override
    public String toString(){
        return super.toString();
    }
    @Override
    protected void finalize() throws Throwable{
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectClassDemo obj=new ObjectClassDemo(12,54);
        ObjectClassDemo obj2=new ObjectClassDemo(12,4);

        if(obj == obj2){
            System.out.println("obj is eqals to obj2");
        }
        if(obj.equals(obj2)){
            System.out.println("obj is eqals to obj2");
        }
       // System.out.println(obj.hashCode());
        /*
            instance operator
            check perticular obj is instance of class or not
            return "true" or "false"
         */
        System.out.println(obj instanceof ObjectClassDemo);
     /*
       getClass method return class of a perticular
       object
      */
        System.out.println(obj.getClass());
    }


}
