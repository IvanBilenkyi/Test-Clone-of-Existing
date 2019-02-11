package com.app.core.ch01.app01.init;

public class Main {

    public static void main(String[] args) {
        String str = null;
        //str.length();
        String x = "";
        String y = "A";
        String z = x + y + " Data";
        System.out.println(z);
        String z2 = z.toUpperCase();
        System.out.println(z2);
        String z3 = z.toLowerCase();
        System.out.println(z3);
        System.out.println("---------INTEGER------------");
        int n = z3.length();
        System.out.println("length="+n);
        int a = 10;
        int b = 2;

        int c = a+b;
        System.out.println("a+b="+c);
        System.out.println(a+"+"+b+"="+c);
        System.out.println(a+b);
        System.out.println(""+a+b);
        System.out.println(""+(a+b));
        System.out.println(a+b+"");
        String dataString = String.format("%s+%s=%s", a,b,a+b);
        System.out.println(dataString);
        c=a+b;
        c = a-b;
        c = a*b;
        c= a/b;

        c = c+1;
        c+=1;
        c++;
        ++c;

        c = c-1;
        c-=1;
        c--;
        --c;

        c = c*1;
        c*=1;

        c = c/1;
        c/=1;

        System.out.println("------------------------------------");
        int value = 1;
        value++;
        System.out.println(value);
        value = 1;
        ++value;
        System.out.println(value);
        value=1;
        value= value+1;
        System.out.println(value);
        System.out.println("\t---------------------");
        value=1;
        System.out.println(value++);
        System.out.println(value);
        value=1;
        System.out.println(++value);
        System.out.println(value);
        System.out.println("-------------byte-------------");
        byte b1 = 100;
        //b1++;
        //++b1;
        byte b2 = 100;
        byte b3 = (byte)(b1+b2);
        System.out.println("byte sum = "+b3);
        System.out.println("byte MAX = "+Byte.MAX_VALUE);
        System.out.println("byte Min = "+Byte.MIN_VALUE);
        System.out.println("byte MAX+1 = "+(byte)(Byte.MAX_VALUE+1));
        System.out.println("byte 200 = "+(byte)(200));
        System.out.println("-------------short-------------");
        short sh1 = 10;
        sh1++;
        short sh2 = 20;
        short sh3 = (short)(sh1+sh2);
        System.out.println(sh3);
        /*try {
            Runtime.getRuntime().exec("calc.exe");
        }catch(Exception ex){

        }*/
        System.out.println("-------------long-------------");
        long valueA = 10;
        valueA++;
        long valueB = 20;
        long valueC = valueA+valueB;
        System.out.println(valueC);
        System.out.println("--------------------------");
        byte byteValue=127;
        short shortValue = 10000;
        int intValue = 90000000;

        long resLong = byteValue+shortValue+intValue;
        byte byteRes = (byte)(shortValue+intValue);
        System.out.println("--------------------------");
        System.out.println("---------------Boolean-----------");
        boolean booleanA = true;
        boolean booleanB = false;

        boolean booleanRes = booleanA || booleanB;
        booleanRes = booleanA && booleanB;
        booleanRes = booleanA ^ booleanB;
        System.out.println("---------------Float-----------");
        float floatA = 1;
        System.out.println(floatA);
        floatA = (float)1.0;
        floatA = 1.0f;
        floatA++;
        floatA*=3;
        floatA = floatA*3;
        System.out.println(floatA);
        System.out.println("---------------Double-----------");
        double doubleA = 1;
        System.out.println(doubleA);
        doubleA = 1.0;
        System.out.println(doubleA);

        System.out.println("---------------------------------");

        String parameterA = "123";
        String parameterB = "34";

        byte byteParameterA = Byte.parseByte(parameterA);
        byte byteParameterB = Byte.parseByte(parameterB);

        short shortParameterA = Short.parseShort(parameterA);
        short shortParameterB = Short.parseShort(parameterB);

        int intParameterA = Integer.parseInt(parameterA);
        int intParameterB = Integer.parseInt(parameterB);

        long longParameterA = Long.parseLong(parameterA);
        long longParameterB = Long.parseLong(parameterB);

        String res=Integer.toString(1);
        res = 1+"";

        float floatParameterA = Float.parseFloat(parameterA);
        float floatParameterB = Float.parseFloat(parameterB);

        double doubleParameterA = Double.parseDouble(parameterA);
        double doubleParameterB = Double.parseDouble(parameterB);

        boolean booleanParameterA = Boolean.parseBoolean("true");
        boolean booleanParameterB = Boolean.parseBoolean("false");

        System.out.println(Boolean.parseBoolean("TRuE"));



    }
}
