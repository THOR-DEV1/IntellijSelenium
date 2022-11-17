package com.example;

public class constructorJAVA {
    int i;
    String name;
    static int j=0;
    constructorJAVA(String s,int n){//constructor
        System.out.print("Constructor called"+"\n");
        name=s;
        i=n;
        j++;
        System.out.print(j+"\n");
    }
    static void ss() {
        System.out.print("hello world 2.0"+"\n");
    }
    public void set(){
       System.out.print("Roll no "+i+" name is "+name+"\n");

    }
    public static void main(String[] args){
        constructorJAVA cj=new constructorJAVA("Vineel",1);//object
        constructorJAVA ck=new constructorJAVA("Sandeep",2);//object
        constructorJAVA cl=new constructorJAVA("Hari",3);//object
        System.out.print("hello world"+"\n");
        constructorJAVA.ss();
        cj.set();
        ck.set();
        cl.set();
    }
}
