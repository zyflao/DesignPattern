package SingletonDao;

public enum Singleton {
	HR,DX,SY,BJ;
	 Singleton(){
		System.out.println("bengin");
	}
    private String name;
    
    public String getName()
    {
       return name;
    }
     public void setName(String name)
    {
       this.name = name;
    }
     
     public static void main(String[] args)
     {
         Singleton HR=Singleton.HR;
         HR.setName("怀柔");
         System.out.println(HR.getName());
       
         
        /* Singleton instance02=Singleton.HR;
         System.out.println(instance02.getName());
         
         Singleton DX=Singleton.DX;
         DX.setName("大兴");
         System.out.println(DX.getName());
         
         Singleton SY=Singleton.SY;
         SY.setName("顺义");
         System.out.println(SY.getName());
         System.out.println(DX.getName());*/
     }
 }
