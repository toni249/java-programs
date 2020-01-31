class employee
{
        int id;
        String name;
        int age;
        char sex;

        employee(int id,String name,int age,char s)
        {
            this.id=id;
            this.name=name;
            this.age=age;
            this.sex=s;
            
        }
        public void disp()
        {
            System.out.println(id+"\n"+name+"\n"+age+"\n"+sex);
        }
}
class java02
{
    public static void main(String[] args){
    employee obj = new employee(47, "bsdk", 69, 'O');
    obj.disp();
    }
}