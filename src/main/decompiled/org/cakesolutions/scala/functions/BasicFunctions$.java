package org.cakesolutions.scala.functions;

import scala.*;
import scala.runtime.*;

public final class BasicFunctions$
{
    public static final BasicFunctions$ MODULE$;
    private final Function2<String, String, String> concat;
    private final Function2<Object, Object, Object> org$cakesolutions$scala$functions$BasicFunctions$$sumInts;
    private final Function2<Object, Object, Object> sumDoubles;
    private final Function2<Object, Object, String> sumIntsToString;
    
    static {
        new BasicFunctions$();
    }
    
    private Function2<String, String, String> concat() {
        return this.concat;
    }
    
    public Function2<Object, Object, Object> org$cakesolutions$scala$functions$BasicFunctions$$sumInts() {
        return this.org$cakesolutions$scala$functions$BasicFunctions$$sumInts;
    }
    
    private Function2<Object, Object, Object> sumDoubles() {
        return this.sumDoubles;
    }
    
    private Function2<Object, Object, String> sumIntsToString() {
        return this.sumIntsToString;
    }
    
    public void main(final String[] args) {
        Predef$.MODULE$.println(this.concat().apply((Object)"Hello, ", (Object)"World!"));
        Predef$.MODULE$.println((Object)BoxesRunTime.boxToInteger(this.org$cakesolutions$scala$functions$BasicFunctions$$sumInts().apply$mcIII$sp(1, 2)));
        Predef$.MODULE$.println((Object)BoxesRunTime.boxToDouble(this.sumDoubles().apply$mcDDD$sp(1.0, 2.0)));
        Predef$.MODULE$.println(this.sumIntsToString().apply((Object)BoxesRunTime.boxToInteger(1), (Object)BoxesRunTime.boxToInteger(2)));
    }
    
    private BasicFunctions$() {
        MODULE$ = this;
        this.concat = (Function2<String, String, String>)new BasicFunctions$$anonfun.BasicFunctions$$anonfun$3();
        this.org$cakesolutions$scala$functions$BasicFunctions$$sumInts = (Function2<Object, Object, Object>)new BasicFunctions$$anonfun.BasicFunctions$$anonfun$1();
        this.sumDoubles = (Function2<Object, Object, Object>)new BasicFunctions$$anonfun.BasicFunctions$$anonfun$2();
        this.sumIntsToString = (Function2<Object, Object, String>)new BasicFunctions$$anonfun.BasicFunctions$$anonfun$4();
    }
}
