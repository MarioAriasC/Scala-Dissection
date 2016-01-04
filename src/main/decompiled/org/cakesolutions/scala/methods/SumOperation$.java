package org.cakesolutions.scala.methods;

import scala.*;
import scala.runtime.*;

public final class SumOperation$ extends AbstractFunction2<Object, Object, SumOperation> implements Serializable
{
    public static final SumOperation$ MODULE$;
    
    static {
        new SumOperation$();
    }
    
    public final String toString() {
        return "SumOperation";
    }
    
    public SumOperation apply(final int a, final int b) {
        return new SumOperation(a, b);
    }
    
    public Option<Tuple2<Object, Object>> unapply(final SumOperation x$0) {
        return (Option<Tuple2<Object, Object>>)((x$0 == null) ? None$.MODULE$ : new Some((Object)new Tuple2$mcII$sp(x$0.a(), x$0.b())));
    }
    
    private Object readResolve() {
        return SumOperation$.MODULE$;
    }
    
    private SumOperation$() {
        MODULE$ = this;
    }
}
