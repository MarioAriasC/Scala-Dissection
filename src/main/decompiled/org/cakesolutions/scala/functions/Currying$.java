package org.cakesolutions.scala.functions;

import scala.*;

public final class Currying$
{
    public static final Currying$ MODULE$;
    private final Function3<String, String, String, String> concat;
    
    static {
        new Currying$();
    }
    
    private Function3<String, String, String, String> concat() {
        return this.concat;
    }
    
    public void main(final String[] args) {
        final Function1 curried = this.concat().curried();
        final Predef$ module$ = Predef$.MODULE$;
        final Object apply = ((Function1)((Function1)curried.apply((Object)"Hello,")).apply((Object)"World")).apply((Object)"!");
        final String s = "Hello, World !";
        boolean b = false;
        Label_0068: {
            Label_0067: {
                if (apply == null) {
                    if (s != null) {
                        break Label_0067;
                    }
                }
                else if (!apply.equals(s)) {
                    break Label_0067;
                }
                b = true;
                break Label_0068;
            }
            b = false;
        }
        module$.assert(b);
    }
    
    private Currying$() {
        MODULE$ = this;
        this.concat = (Function3<String, String, String, String>)new Currying$$anonfun.Currying$$anonfun$1();
    }
}
