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
    void pattern9(int n){
        int space1 = n-1, star = 1, space2 = n-1;
        for(int i =0; i<n; i++){
            for(int j = 0; j<space1; j++) System.out.print(" ");
            for(int j =0; j<star; j++) System.out.print("*");
            for(int j = 0; j<space2; j++) System.out.print(" ");
            System.out.println();
            star += 2;
            space1--;
            space2--;
        }
        space1 = 0; star = 2*n-1; space2 = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<space1; j++) System.out.print(" ");
            for(int j = 0; j<star; j++) System.out.print("*");
            for(int j = 0; j<space2; j++) System.out.print(" ");
            System.out.println();
            star -= 2;
            space1++;
            space2++;
        }
    }
    void pattern10(int n){
        for(int i =0; i<2*n-1;i++){
            int stars = i<n?i+1:2*n-1-i;
            for(int j = 0; j<stars; j++) System.out.print("*");
            System.out.println();
        }
    }
    public static void main(String[] args){
        PatternPrinting obj = new PatternPrinting();
        obj.pattern10(5);
        
    }
}
