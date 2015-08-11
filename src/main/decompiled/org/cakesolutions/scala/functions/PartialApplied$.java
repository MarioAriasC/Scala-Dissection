package org.cakesolutions.scala.functions;

import scala.*;

public final class PartialApplied$
{
    public static final PartialApplied$ MODULE$;
    private final Function3<String, String, String, String> org$cakesolutions$scala$functions$PartialApplied$$concat;
    private final Function2<String, String, String> org$cakesolutions$scala$functions$PartialApplied$$hello;
    private final Function1<String, String> helloXBang;
    
    static {
        new PartialApplied$();
    }
    
    public Function3<String, String, String, String> org$cakesolutions$scala$functions$PartialApplied$$concat() {
        return this.org$cakesolutions$scala$functions$PartialApplied$$concat;
    }
    
    public Function2<String, String, String> org$cakesolutions$scala$functions$PartialApplied$$hello() {
        return this.org$cakesolutions$scala$functions$PartialApplied$$hello;
    }
    
    private Function1<String, String> helloXBang() {
        return this.helloXBang;
    }
    
    public void main(final String[] args) {
        final Predef$ module$ = Predef$.MODULE$;
        final Object apply = this.helloXBang().apply((Object)"World");
        final String s = "Hello, World !";
        boolean b = false;
        Label_0041: {
            Label_0040: {
                if (apply == null) {
                    if (s != null) {
                        break Label_0040;
                    }
                }
                else if (!apply.equals(s)) {
                    break Label_0040;
                }
                b = true;
                break Label_0041;
            }
            b = false;
        }
        module$.assert(b);
    }
    
    private PartialApplied$() {
        MODULE$ = this;
        this.org$cakesolutions$scala$functions$PartialApplied$$concat = (Function3<String, String, String, String>)new PartialApplied$$anonfun.PartialApplied$$anonfun$1();
        this.org$cakesolutions$scala$functions$PartialApplied$$hello = (Function2<String, String, String>)new PartialApplied$$anonfun.PartialApplied$$anonfun$2();
        this.helloXBang = (Function1<String, String>)new PartialApplied$$anonfun.PartialApplied$$anonfun$3();
    }
}
