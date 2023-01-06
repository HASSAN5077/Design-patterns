package Singelton;

public class SingletonClass {
    private static SingletonClass instance;
    private SingletonClass(){

    }
    public static SingletonClass createInstance(){
        if(instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }
}
