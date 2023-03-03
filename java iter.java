import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(String temp:s.split(" ")){
            String res="";
            for(int i=0;i<temp.length();i++){
                res=temp.charAt(i)+res;
            }
            System.out.print(res+" ");
        }
        System.out.println();
    }
    


}