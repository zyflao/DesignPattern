package Test;

import Dao.Singleton;

public class SingletonTest
{
    public static void main(String[] args)
    {
        Singleton instance01=Singleton.INSTANCE01;
        instance01.setName("terje");
        System.out.println(instance01.getName());
        
        Singleton instance02=Singleton.INSTANCE01;
        System.out.println(instance02.getName());
        
        Singleton instance03=Singleton.INSTANCE02;
        instance03.setName("liu");
        System.out.println(instance03.getName());
        
        Singleton instance04=Singleton.INSTANCE02;
        instance04.setName("liu");
        System.out.println(instance04.getName());

    }

}