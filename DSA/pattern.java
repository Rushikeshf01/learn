import java.util.Scanner;

public class pattern {
    static void pattern1(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 0; j<n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        pattern7(n);
        pattern8(n);
    }
    static void pattern10(int n){
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<i+1;j++){
        //         System.out.print("*");
        //     }
        //     for(int j=0;j<n-i-1;j++){
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }
        // for(int i=n;i<(2*n-1);i++){
        //     for(int j=0;j<n-1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<(2*n-1)%i;j++){
        //         System.out.print("*");
        //     }
        //     for(int j=0;j<i%(n-1);j++){
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }
        for(int i=1;i<=2*n-1;i++){
            int stars = i;
            if(i>n) stars = 2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
        int start = 0;
        for(int i=0;i<n;i++){
            if(i%2==0) start = 1;
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
        int space = 2* (n-1);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            space-=2;
            System.out.println();
        }
    }
    static void pattern13(int n){
        int counter = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
    static void pattern14(int n){
        for(int i=1;i<=n;i++){
            char myChar = 'A';
            for(int j=1;j<=i;j++){
                System.out.print(myChar);
                myChar++;
            }
            System.out.println();
        }
        // for(int i=0;i<n;i++){
        //     for(char ch='A';ch <= 'A'+i; ch++){
        //         System.out.print(ch);
        //     }
        //     System.out.println();
        // }
    }
    static void pattern15(int n){
        // for(int i=0;i<n;i++){
        //     char myChar = 'A';
        //     for(int j=0;j<=n-i-1;j++){
        //         System.out.print(myChar);
        //         myChar++;
        //     }
        //     System.out.println();
        // }
        for(int i=0;i<n;i++){
                for(char ch='A';ch <= 'A'+(n-i-1); ch++){
                    System.out.print(ch);
                }
                System.out.println();
        }
    }
    static void pattern16(int n){
        char myChar = 'A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(myChar);
            }
            myChar++;
            System.out.println();
        }
    }
    static void pattern17(int n){
        for(int i=0;i<n;i++){
            char myChar = 'A';
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            int breakpoint = (2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){
                System.out.print(myChar);
                if(j<=breakpoint) myChar++;
                else myChar--;
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    static void pattern18(int n){
        char myChar = 'E';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(myChar+" ");
                myChar++;
            }
            myChar-=(i+2);
            System.out.println();
        }

    }
    static void pattern19(int n){
        int iniSi = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<iniSi;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            iniSi+=2;
            System.out.println();
        }
        iniSi=2*n - 2;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<iniSi;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            iniSi-=2;
            System.out.println();
        }

    }
    static void pattern20(int n){

        int spaces = 2*n - 2;
        for(int i=1;i<=2*n-1;i++){
            int stars = i;
            if(i>n) stars = 2*n - i;
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            for(int j=0;j<=spaces;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i<n) spaces -= 2;
            else spaces += 2;
        }
    }
    static void pattern21(int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == 0 || j == 0 || i == n-1 || j == n-1){
                      System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void pattern22(int n){

        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top = i;
                int left = j;
                int right = (2*n-2)-j;
                int bottom = (2*n-2)-i;

                System.out.print(n-(Math.min(Math.min(top,bottom), Math.min(right,left))));

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern22(n);
        sc.close();
    }
}
