package org.cakesolutions.scala.methods;

import scala.runtime.*;
import scala.*;

public final class IntValue$ extends AbstractFunction1<Object, IntValue> implements Serializable
{
    public static final IntValue$ MODULE$;
    
    static {
        new IntValue$();
    }
    
    public final String toString() {
        return "IntValue";
    }
    
    public IntValue apply(final int value) {
        return new IntValue(value);
    }
    
    public Option<Object> unapply(final IntValue x$0) {
        return (Option<Object>)((x$0 == null) ? None$.MODULE$ : new Some((Object)BoxesRunTime.boxToInteger(x$0.value())));
    }
    
    private Object readResolve() {
        return IntValue$.MODULE$;
    }
    
    private IntValue$() {
        MODULE$ = this;
    }
}
