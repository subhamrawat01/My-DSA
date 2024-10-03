public class PatternPrinting{
    void pattern1(int n){
        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void pattern2(int n){
        for(int i =0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void pattern3(int n){
        for(int i =0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    void pattern4(int n){
        for(int i =0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
    void pattern5(int n){
        for(int i =0; i<n; i++){
            for(int j =0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void pattern6(int n){
        for(int i=0; i<n; i++){
            for(int j =0; j<n-i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    void pattern7(int n){
        int space1 = n-1 , star = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<space1; j++) System.out.print(" ");
            for(int j =0; j<star; j++) System.out.print("*");
            for(int j=0; j<space1; j++) System.out.print(" ");
            System.out.println();
        space1--;
        star+=2;
        }   
    }
    void pattern8(int n){
        int space = 0, star = 2*n-1;
        for(int i =0; i<n; i++){
            for(int j =0; j<space; j++) System.out.print(" ");
            for(int j =0; j<star; j++) System.out.print("*");
            for(int j =0; j<space; j++) System.out.print(" ");
            System.out.println();
            space++;
            star-=2;
        }
    }
    public static void main(String[] args){
        PatternPrinting obj = new PatternPrinting();
        obj.pattern8(5);
        
    }
}
