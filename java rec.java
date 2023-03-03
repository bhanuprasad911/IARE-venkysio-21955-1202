import java.util.*;
class HelloWorld {
    ArrayList<String> list=new ArrayList<>();
    String temp="";
    void reverse(String s,int i,int n){
        if(i>=n){
            list.add(temp);
            return;
        }
        if(s.charAt(i)==' '){
            list.add(temp);
            temp=" ";
        }
        else{
            temp=s.charAt(i)+temp;
        }
        reverse(s,i+1,n);
    }
    
    public static void main(String[] args) {
        HelloWorld obj=new HelloWorld(); 
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        obj.reverse(s,0,s.length());
        for(String res:obj.list){
            System.out.print(res+" ");
        }
        System.out.println();
    }
}