package com.app.core.ch07.app01.exceptions.sample1;

public class Main {

    public static void main(String[] args) {
        try {
            String s = "";
            int n=s.length();
            System.out.println("length="+n);

         //   int i = 0;
         //   int res = 10/i;
        //Class.forName("com.mysql.jdbc.Driver");


        }catch(NullPointerException ex){
            // ex.printStackTrace();
            System.out.println("Nullpointer");
        } catch(Exception ex){
            // ex.printStackTrace();
            System.out.println("Exception");
        } catch(Throwable ex){
            // ex.printStackTrace();
            System.out.println("Throwable");
        } finally {
            System.out.println("finally()");
        }

        //String s2 = null;
        //s2.length();

    }

}
