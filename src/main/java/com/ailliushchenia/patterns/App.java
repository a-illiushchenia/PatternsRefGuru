package com.ailliushchenia.patterns;

import com.ailliushchenia.patterns.builder.BuilderExample;
import com.ailliushchenia.patterns.prototype.PrototypeExample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Patterns!" );
        new BuilderExample().showBuilder();
        System.out.println();
        new PrototypeExample().showPrototype();
    }
}
