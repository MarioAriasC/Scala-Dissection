package org.cakesolutions.scala.functions;

import scala.*;

public final class Composition$
{
    public static final Composition$ MODULE$;
    private final Function1<String, String> toUpperCase;
    private final Function1<String, String> trim;
    private final Function1<Object, Object> add2;
    private final Function1<Object, Object> multiplyBy5;
    
    static {
        new Composition$();
    }
    
    private Function1<String, String> toUpperCase() {
        return this.toUpperCase;
    }
    
    private Function1<String, String> trim() {
        return this.trim;
    }
    
    private Function1<Object, Object> add2() {
        return this.add2;
    }
    
    private Function1<Object, Object> multiplyBy5() {
        return this.multiplyBy5;
    }
    
    public void main(final String[] args) {
        final Function1 trimUpperCase = this.trim().andThen((Function1)this.toUpperCase());
        final Predef$ module$ = Predef$.MODULE$;
        final Object apply = trimUpperCase.apply((Object)" foo     ");
        final String s = "FOO";
        boolean b = false;
        Label_0052: {
            Label_0051: {
                if (apply == null) {
                    if (s != null) {
                        break Label_0051;
                    }
                }
                else if (!apply.equals(s)) {
                    break Label_0051;
                }
                b = true;
                break Label_0052;
            }
            b = false;
        }
        module$.assert(b);
        final Function1 add2multiply5 = this.add2().andThen((Function1)this.multiplyBy5());
        Predef$.MODULE$.assert(add2multiply5.apply$mcII$sp(2) == 20);
        Predef$.MODULE$.assert(this.add2().compose((Function1)this.multiplyBy5()).apply$mcII$sp(2) == 12);
    }
    
    private Composition$() {
        MODULE$ = this;
        this.toUpperCase = (Function1<String, String>)new Composition$$anonfun.Composition$$anonfun$3();
        this.trim = (Function1<String, String>)new Composition$$anonfun.Composition$$anonfun$4();
        this.add2 = (Function1<Object, Object>)new Composition$$anonfun.Composition$$anonfun$1();
        this.multiplyBy5 = (Function1<Object, Object>)new Composition$$anonfun.Composition$$anonfun$2();
    }
}
