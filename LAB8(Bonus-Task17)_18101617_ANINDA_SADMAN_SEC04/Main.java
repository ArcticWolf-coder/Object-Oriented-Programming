import java.util.*;

public class Main {
    
    public static boolean f[][]=new boolean [52] [52];
    public static int a;
    public static int b;
    public static char o;
    public static boolean d;
    public static int n;
    public static int m;
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        for ( int i = 0; i < 52; i++ )
        {
            for ( int j = 0; j < 52; j++ )
                f [i] [j] = false;
        }

        m=sc.nextInt();
        n=sc.nextInt();

        while ( sc.hasNext() )
        {
            a=sc.nextInt();
            b=sc.nextInt();
            o=sc.next().charAt(0);
            String s=sc.next();


            d = false;

            for ( int i = 0; i<s.length() && !d; i++ )
                check (s.charAt(i));

            if ( !d )
                System.out.println (a+" "+b+" "+o);
        }
    }

    static void check (char x)
    {
        if ( o == 'S' && x == 'R' )
            o = 'W';
        else if ( o == 'S' && x == 'L' )
            o = 'E';

        else if ( o == 'N' && x == 'R' )
            o = 'E';
        else if ( o == 'N' && x == 'L' )
            o = 'W';

        else if ( o == 'E' && x == 'R' )
            o = 'S';
        else if ( o == 'E' && x == 'L' )
            o = 'N';

        else if ( o == 'W' && x == 'R' )
            o = 'N';
        else if ( o == 'W' && x == 'L' )
            o = 'S';

        if ( x == 'F' )
        {
            switch ( o )
            {
                case 'N' :
                    if ( n == b && f [a] [b] == true )
                        break;
                    else if ( n == b && f [a] [b] == false )
                    {
                        f [a] [b] = true;
                        System.out.println (a+" "+b+" "+o+" LOST");
                        d = true;
                        break;
                    }
                    b++;
                    break;

                case 'S' :
                    if ( b == 0 && f [a] [b] == true )
                        break;
                    else if ( b == 0 && f [a] [b] == false )
                    {
                        f [a] [b] = true;
                        System.out.println (a+" "+b+" "+o+" LOST");
                        d = true;
                        break;
                    }
                    b--;
                    break;

                case 'E' :
                    if ( m == a && f [a] [b] == true )
                        break;
                    else if ( m == a && f [a] [b] == false )
                    {
                        f [a] [b] = true;
                        System.out.println (a+" "+b+" "+o+" LOST");
                        d = true;
                        break;
                    }
                    a++;
                    break;

                case 'W' :
                    if ( a == 0 && f [a] [b] == true )
                        break;
                    else if ( a == 0 && f [a] [b] == false )
                    {
                        f [a] [b] = true;
                        System.out.println (a+" "+b+" "+o+" LOST");
                        d = true;
                        break;
                    }
                    a--;
            }
        }
    }
    
}