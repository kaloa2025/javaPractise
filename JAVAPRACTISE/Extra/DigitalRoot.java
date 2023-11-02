package Extra;

public class DigitalRoot {
        public int getsum(int n)
        {
            while(n<10)
            {
                int sum = 0;
                while(n>0)
                {
                    int remainder=n%10;
                    sum+=remainder;
                    n=n/10;
                }
                n=sum;
            }
            return n;
        }
        public static void main(String[] args) {
            DigitalRoot r=new DigitalRoot();
            System.out.println(r.getsum(34));
        }
}
