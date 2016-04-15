package SingletonTest;

import SingletonDao.Singleton;

public class SingletonTest
{
    public static void main(String[] args)
    {
        Singleton instance01=Singleton.HR;
        instance01.setName("terje");
        System.out.println(instance01.getName());
        
        Singleton instance02=Singleton.HR;
        System.out.println(instance02.getName());
        
        Singleton DX=Singleton.DX;
        DX.setName("liu");
        System.out.println(DX.getName());
        
        Singleton SY=Singleton.DX;
        SY.setName("liu");
        System.out.println(SY.getName());

    }

}