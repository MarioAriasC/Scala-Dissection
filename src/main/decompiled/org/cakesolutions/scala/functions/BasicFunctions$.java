package org.cakesolutions.scala.functions;

import scala.*;
import scala.runtime.*;

public final class BasicFunctions$
{
    public static final BasicFunctions$ MODULE$;
    private final Function2<String, String, String> concat;
    private final Function2<Object, Object, Object> org$cakesolutions$scala$functions$BasicFunctions$$sumInts;
    private final Function2<Object, Object, Object> sumDoubles;
    private final Function3<Object, Object, Object, Object> sumLongs;
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
    
    private Function3<Object, Object, Object, Object> sumLongs() {
        return this.sumLongs;
    }
    
    private Function2<Object, Object, String> sumIntsToString() {
        return this.sumIntsToString;
    }
    
    public void main(final String[] args) {
        final String helloWorld = (String)this.concat().apply((Object)"Hello, ", (Object)"World!");
        final Predef$ module$ = Predef$.MODULE$;
        final String s = helloWorld;
        final String s2 = "Hello, World!";
        boolean b = false;
        Label_0048: {
            Label_0047: {
                if (s == null) {
                    if (s2 != null) {
                        break Label_0047;
                    }
                }
                else if (!s.equals(s2)) {
                    break Label_0047;
                }
                b = true;
                break Label_0048;
            }
            b = false;
        }
        module$.assert(b);
        final Predef$ module$2 = Predef$.MODULE$;
        final Object apply = this.sumIntsToString().apply((Object)BoxesRunTime.boxToInteger(1), (Object)BoxesRunTime.boxToInteger(2));
        final String s3 = "3";
        boolean b2 = false;
        Label_0101: {
            Label_0100: {
                if (apply == null) {
                    if (s3 != null) {
                        break Label_0100;
                    }
                }
                else if (!apply.equals(s3)) {
                    break Label_0100;
                }
                b2 = true;
                break Label_0101;
            }
            b2 = false;
        }
        module$2.assert(b2);
        Predef$.MODULE$.assert(this.org$cakesolutions$scala$functions$BasicFunctions$$sumInts().apply$mcIII$sp(1, 2) == 3);
        Predef$.MODULE$.assert(this.sumDoubles().apply$mcDDD$sp(1.0, 2.0) == 3.0);
        Predef$.MODULE$.assert(BoxesRunTime.unboxToLong(this.sumLongs().apply((Object)BoxesRunTime.boxToLong(1L), (Object)BoxesRunTime.boxToLong(2L), (Object)BoxesRunTime.boxToLong(3L))) == 6L);
    }
    
    private BasicFunctions$() {
        MODULE$ = this;
        this.concat = (Function2<String, String, String>)new BasicFunctions$$anonfun.BasicFunctions$$anonfun$3();
        this.org$cakesolutions$scala$functions$BasicFunctions$$sumInts = (Function2<Object, Object, Object>)new BasicFunctions$$anonfun.BasicFunctions$$anonfun$1();
        this.sumDoubles = (Function2<Object, Object, Object>)new BasicFunctions$$anonfun.BasicFunctions$$anonfun$2();
        this.sumLongs = (Function3<Object, Object, Object, Object>)new BasicFunctions$$anonfun.BasicFunctions$$anonfun$4();
        this.sumIntsToString = (Function2<Object, Object, String>)new BasicFunctions$$anonfun.BasicFunctions$$anonfun$5();
    }
}
