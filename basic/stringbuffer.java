class stringbuffer{
    public static void main(String [] args){
        StringBuffer str=new StringBuffer("pramod is a good boy");
    
    
    
        System.out.println("append():"+str.append(" with sambar"));
        System.out.println("insert():"+str.insert(0,"The Great"));
        System.out.println("delete():"+str.delete(0,10));
        System.out.println("replace():"+str.replace(12,12,"to eat "));
        System.out.println("capacity():"+str.capacity());
    }
    }
