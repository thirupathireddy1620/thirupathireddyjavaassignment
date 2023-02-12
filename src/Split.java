//B.Thirupathi reddy
//Div : 4b19
//ERP:210303126080

 class SplitExample{
    public static void main(String args[]){
        String s1="java string split method by javatpoint";
        String[] words=s1.split("\\s");
//using java foreach loop to print elements of string array
        for(String w:words){
            System.out.println(w);
        }
    }
}