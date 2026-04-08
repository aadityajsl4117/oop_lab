class Person1 {
     private String name;
     private int age;
    public String getname(){
            return name;

    }
    public void setname(String name)
    {
        this.name=name;

    }
     public int getage() {
        return age;
     }
    public void  setage(int age)
    {
        if(age>0)
        {
            this.age=age;
        }
        else{
                System.out.println("invaldi age");
            }

        }
        public class Person{
            public static void main(String[] args)
            {
                Person1 p= new Person1();
                p.setname("aaditya");
                p.setage(18);
                System.out.println(p.getname());
                
            }
        }
    }




