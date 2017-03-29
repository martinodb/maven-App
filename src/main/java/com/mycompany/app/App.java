package com.mycompany.app;
import org.apache.commons.lang3.ArrayUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        if(ArrayUtils.contains(args, "-snn")){
			System.out.println("it does.");
			} else {
				System.out.println("it does not.");
				}
    }
}
