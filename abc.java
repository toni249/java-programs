class swap1
{
    // swap1(int a,int b)
    // {
    //     int temp=a;
    //     a=b;
    //     b=temp;
    // }
    int a,b;

     swap1 fun(swap1 obj)
    {
        int temp=obj.a;
        obj.a=obj.b;
        obj.b=temp;
        return obj;
        
    }


}
class abc
{

    // int a,b;

    // abc (int x,int y)
    // {
    //     this.a=x;
    //     this.b=y;
    // }

    public static void main (String[] args)
    {
       int  a1=34,b1=67;
       
        swap1 obj= new swap1();
        obj.a=a1;obj.b=b1;
        System.out.println(obj.a+" "+obj.b);
        obj.fun(obj);
        System.out.println(obj.a+" "+obj.b);
        


    }


}