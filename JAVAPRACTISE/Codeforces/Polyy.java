package Codeforces;
import java.util.*;
public class Polyy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();

        String[] l=new String[n];
        for(int i=0;i<n;i++)
        {
           l[i]=sc.next();
        }
        for(int i=0;i<n;i++)
        {
            if(l[i].equals("Tetrahedron"))
            {count=count+4;}
             if(l[i].equals("Cube"))
            {count=count+6;}
             if(l[i].equals("Octahedron"))
            {count=count+8;}
             if(l[i].equals("Dodecahedron"))
            {count=count+12;}
             if(l[i].equals("Icosahedron"))
            {count=count+20;}
        }
        System.out.println(count);
    }
}
/*
 * . Tetrahedron has 4 triangular faces.
. Cube has 6 square faces.
.  has 8 triangular faces.
.  has 12 pentagonal faces.
.  has 20 triangular faces
 */