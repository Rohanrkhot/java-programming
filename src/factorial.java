import java.util.Scanner;

/**
 * Created by mahesh on 08/08/2017.
 */
public class factorial
{
    Scanner ne=new Scanner(System.in);        int j=1;

    public static void main(String[] args) {
        factorial gh=new factorial();
        gh.vm();

    }
    void vm(){
        int a=ne.nextInt();
        for(int i=1;i<=a;i++){
j=j*i;
    }            System.out.println(j+"");

    }}
