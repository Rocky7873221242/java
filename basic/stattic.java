public class stattic {
    
        static int mfunc1()
        {
            System.out.println("Inside Func1");
            return 10;
        }
    
        static int mfunc2()
        {
            System.out.println("Inside Func2");
            
            
            return 10;
        }
    
        static int mfunc3(){
            System.out.println("Inside Func3");
            return mfunc2()+mfunc1();
        }
    
        public static void main(String[] args){
            System.out.println(mfunc3());
        }
    }

