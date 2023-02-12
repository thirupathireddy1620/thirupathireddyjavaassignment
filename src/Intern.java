//B.Thirupathi reddy
//Div : 4b19
//ERP:210303126080


public class Intern{
    public static void main(String args[]){
        String s1=new String("hello");
        String s2="hello";
        String s3=s1.intern();
        System.out.println(s1==s2);
        System.out.println(s2==s3);
    }
}