public class C15 {
    
    static int soma(int n){
        if(n<=9) return n;
        return n%10 + soma(n/10);
    }
    public static void main(String[] args) {
        int n;
        n=soma(132);
        System.out.println(n);
    }
}