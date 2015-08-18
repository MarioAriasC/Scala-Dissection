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
        final Predef$ module$ = Predef$.MODULE$;
        final Object apply = this.concat().apply((Object)"Hello, ", (Object)"World!");
        final String s = "Hello, World!";
        boolean b = false;
        Label_0043: {
            Label_0042: {
                if (apply == null) {
                    if (s != null) {
                        break Label_0042;
                    }
                }
                else if (!apply.equals(s)) {
                    break Label_0042;
                }
                b = true;
                break Label_0043;
            }
            b = false;
        }
        module$.assert(b);
        Predef$.MODULE$.assert(this.org$cakesolutions$scala$functions$BasicFunctions$$sumInts().apply$mcIII$sp(1, 2) == 3);
        Predef$.MODULE$.assert(this.sumDoubles().apply$mcDDD$sp(1.0, 2.0) == 3.0);
        final Predef$ module$2 = Predef$.MODULE$;
        final Object apply2 = this.sumIntsToString().apply((Object)BoxesRunTime.boxToInteger(1), (Object)BoxesRunTime.boxToInteger(2));
        final String s2 = "3";
        boolean b2 = false;
        Label_0150: {
            Label_0149: {
                if (apply2 == null) {
                    if (s2 != null) {
                        break Label_0149;
                    }
                }
                else if (!apply2.equals(s2)) {
                    break Label_0149;
                }
                b2 = true;
                break Label_0150;
            }
            b2 = false;
        }
        module$2.assert(b2);
    }
    
    private BasicFunctions$() {
        MODULE$ = this;
        this.concat = (Function2<String, String, String>)new BasicFunctions$$anonfun.BasicFunctions$$anonfun$3();
        this.org$cakesolutions$scala$functions$BasicFunctions$$sumInts = (Function2<Object, Object, Object>)new BasicFunctions$$anonfun.BasicFunctions$$anonfun$1();
        this.sumDoubles = (Function2<Object, Object, Object>)new BasicFunctions$$anonfun.BasicFunctions$$anonfun$2();
        this.sumIntsToString = (Function2<Object, Object, String>)new BasicFunctions$$anonfun.BasicFunctions$$anonfun$4();
    }
}
