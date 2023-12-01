package BuilderPattern;

public class ConstructorMethodRefrence {
    class User
    {
        private int uid;
        private String name;
        @Override
        public String toString() {
            return "User[uid="+uid+",name= "+name+"]";
        }
        public User(int uid,String name)
        {
            this.uid=uid;
            this.name=name;
        }
    }
    Interface Inter1
    {
        public User create(int uid, String name);
    }
    public class ConstructorMethodRefrence
    {
        public static void main(String args[])
        {
            Inter1 i=User::new;
            System.out.println(i.create(12,"raina"));
        }
    }
}
