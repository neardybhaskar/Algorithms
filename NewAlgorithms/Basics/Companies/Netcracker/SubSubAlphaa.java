package Netcracker;

class Alphaa
{
    static String s = " ";
    protected Alphaa()
    {
        s += "alpha ";
    }
}
class SubAlphaa extends Alphaa
{
    private SubAlphaa()
    {
        s += "sub ";
    }
}

public class SubSubAlphaa extends Alphaa
{
    private SubSubAlphaa()
    {
        s += "subsub ";
    }
    public static void main(String[] args)
    {
        new SubSubAlphaa();
        System.out.println(s);
    }
}