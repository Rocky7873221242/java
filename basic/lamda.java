
    interface Drawable{  
        public void draw();  
    }  
      
    public class lamda {  
        public static void main(String[] args) {  
            int width=10;  
              
            //with lambda  
            Drawable d2=()->  
                System.out.println("Drawing "+width*width*width);  
            
            d2.draw();  
        }  
     
}
