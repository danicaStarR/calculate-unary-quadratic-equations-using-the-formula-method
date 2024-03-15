import java.util.*;
/** 

 @author: DanicaStar
 @Date: 22-10-04

*/
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        println("Welcome to Program,type '.exit' to exit,type else to start.");
        while (true) {
            
            println("程序运行中 键入回车开始==================");
            
            String inputStr = sc.nextLine();
            
            if(inputStr.equals(".exit")) {
                println("::结束");
                break;
            } else{
                print("输入 'a' =");
                double a = Double.valueOf(sc.nextLine());
                print("输入 'b' =");
                double b = Double.valueOf(sc.nextLine());
                print("输入 'c' =");
                double c = Double.valueOf(sc.nextLine());
                
                // preview
                preview(new double[]{a,b,c});
                
                /* b²-4ac
                
                    1. Δ>0
                        root has 2 && not equal
                    2. Δ=0
                        root has 2 && equal
                    3. Δ<0
                        no root
                */
                double rootE = equalRoot(new double[]{a,b,c});
                
                if(rootE > 0) {
                    frmt("Δ=%.2f²-4x%.2fx%.2f\n= %.4f \n",b,a,c,rootE);
                    calcIfRootEHasTwoNotEqRoot(new double[]{a,b,c},rootE,sc);
                } else if (rootE == 0) {
                    frmt("有两个相同实数解！\nΔ=%.2f²-4x%.2fx%.2f\n= %.4f \n",b,a,c,rootE);
                    calcIfRootEHasEqRoot(new double[]{a,b,c},rootE,sc);
                } else if (rootE < 0) {
                    frmt("方程无实数根！！,且Δ=%.2f²-4x%.2fx%.2f\n= %.4f \n",b,a,c,rootE);
                }
                
            } 
            println("==================\n");
        }// while end
    }

    
    // Simplify the code
    public static void println(Object print) {
        System.out.println(print);
    }
    public static void print(Object print) {
        System.out.print(print);
    }
    public static void frmt(String print,Object... parms) {
        System.out.format(print,parms);
    }
    
    public static void preview(double[] data) {
        print("\n");
        // 0.00x²±0.00x±0.00=0
        frmt("%.2fx²+%.2fx+%.2f=0",data[0],data[1],data[2]);
        print("\n");
    }
    
    private static double equalRoot(double[] data) {
        
        double a = data[0];
        double b = data[1];
        double c = data[2];
        
        // b²-4ac
        
        double reslut = (b*b)-(4*a*c);
        
        return reslut;
    }
    
    public static void calcIfRootEHasTwoNotEqRoot(double data[],double Δ,Scanner sc) {
        double a = data[0];
        double b = data[1];
        
        double fenziReslut = 0;
        double fenmuReslut = 0;
        
        double sqrtΔ = Math.sqrt(Δ);
        boolean isInfinty = String.valueOf(sqrtΔ).length() >= 15;
        
        if (isInfinty) {
            println("字符位数大于18，应该是无理数\n");
            frmt("   -%.4f±√%.4f\n",b,Δ);
         println("――――――――――――――――――――");
            frmt("   2    x    %.3f   \n",a);
        } else if (isInfinty == false) {
           // System.out.println(isInfinty);
            print("√Δ不是无理数，用分数表示吗？【y/n】");
            if (sc.nextLine().equals("y")) {
                double d = 2*a;
                if(d==0) System.exit(0);
                frmt("      -%.4f±%.20f        \n",b,sqrtΔ);
             println("x= ―――――――――――――――――――― > 0  ");
                frmt("          %.3f           \n",d);
                
               // double d = 2*a;
                

                fenziReslut = -b+sqrtΔ;

                fenmuReslut = d;

                println("x1="+String.valueOf(fenziReslut/fenmuReslut));

                fenziReslut = -b-sqrtΔ;

                println("x2="+String.valueOf(fenziReslut/fenmuReslut));
            } else {
                double d = 2*a;
                if(d==0) System.exit(0);
                
                fenziReslut = -b+sqrtΔ;
                
                fenmuReslut = d;
                
                println("x1="+String.valueOf(fenziReslut/fenmuReslut));
                
                fenziReslut = -b-sqrtΔ;
                
                println("x2="+String.valueOf(fenziReslut/fenmuReslut));
            }
        }
      }
      
    public static void calcIfRootEHasEqRoot(double data[],double Δ,Scanner sc) {
        double a = data[0];
        double b = data[1];

        double fenziReslut = 0;
        double fenmuReslut = 0;

        double sqrtΔ = Math.sqrt(Δ);
        boolean isInfinty = String.valueOf(sqrtΔ).length() >= 18;

        if (isInfinty) {
            println("字符位数大于18，应该是无理数\n");
            frmt("   -%.4f±√%.4f%n",b,Δ);
            println("――――――――――――――――――――");
            frmt("   2    x    %.3f   ",a);
        } else if (isInfinty == false) {
            
            print("√Δ不是无理数，用分数表示吗？【y/n】");
            if (sc.nextLine().equals("y")) {
                double d = 2*a;
                if(d==0) System.exit(0);
                frmt("      -%.4f±%.20f        \n",b,sqrtΔ);
                println("x= ―――――――――――――――――――― > 0  ");
                frmt("          %.3f            \n",d);
                fenziReslut = -b+sqrtΔ;

                fenmuReslut = d;

                println("x1="+String.valueOf(fenziReslut/fenmuReslut));

                fenziReslut = -b-sqrtΔ;

                println("x2="+String.valueOf(fenziReslut/fenmuReslut));
            } else {
                double d = 2*a;
                if(d==0) System.exit(0);

                fenziReslut = -b;

                fenmuReslut = d;

                println("x="+String.valueOf(fenziReslut/fenmuReslut));

               }
        }
        }
}
