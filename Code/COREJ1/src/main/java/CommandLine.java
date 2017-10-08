class CommandLine
{
    public static void main(String[] a)
    {
        if(a.length<1)
            System.out.println("No command line arguments passed!");
        else {
            System.out.println("Number of arguments = " + a.length);
            for (int i = 0; i < a.length; i++) {
                System.out.println("  a[" + i + "] = " + a[i]);
            }
        }
    }
}
