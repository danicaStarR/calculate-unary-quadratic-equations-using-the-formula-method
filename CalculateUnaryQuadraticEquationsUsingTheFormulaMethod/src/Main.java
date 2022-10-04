import java.util.*;
/** 

 @author: DanicaStar
 @Date: 22-10-04

*/
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        println("Welcome to Program,type '.exit' to exit,type 'c' to start.");
        while (true) {
            
            println("程序运行中==================");
            
            String inputStr = sc.nextLine();
            
            if(inputStr.equals(".exit")) {
                println("::结束");
                break;
            } else if(inputStr.equals("c")) {
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
                    calcIfRootEHasTwoEqRoot(new double[]{a,b,c},rootE);
                } else if (rootE == 0) {
                    
                } else if (rootE < 0) {
                    frmt("方程无实数根,且Δ = %.4f",rootE);
                }
                
            } else {
                println("no cmd");
            }
            
            println("==================");
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
        
        double reslut = (b*b)-4*a*c;
        
        return reslut;
    }
    
    public static void calcIfRootEHasTwoEqRoot(double data[],double Δ) {
        double a = data[0];
        double b = data[1];
        double c = data[2];
        
        double sqrtΔ = Math.sqrt(Δ);
        
    }
}
