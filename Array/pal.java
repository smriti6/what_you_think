public class pal {
    public static void main(String[] args) {
        String a="smams";
        String b="";
        int c=0;
        for(int i=4;i>=0;i--){
            b+=a.charAt(i);
        }
        System.out.println(b);

        for(int i=0;i<4;i++){
            if(a.charAt(i)==b.charAt(i)){
                c++;
            }
            
        }
        if(c>1){
            System.out.println("PAlindrom");
        }
        else{
            System.out.println("Not Palindrom");
        }
       
        
    }
}
