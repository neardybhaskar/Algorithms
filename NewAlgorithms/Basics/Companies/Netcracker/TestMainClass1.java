package Netcracker;

class Aa
{

}

class Bb extends Aa
{

}

class Cc extends Bb
{

}

public class TestMainClass1
{
    static void overloadedMethod(Aa a)
    {
        System.out.println("ONE");
    }

    static void overloadedMethod(Bb b)
    {
        System.out.println("TWO");
    }

    static void overloadedMethod(Object obj)
    {
        System.out.println("THREE");
    }

    public static void main(String[] args)
    {
        Cc c = new Cc();

        overloadedMethod(c);
    }
}