package org.cakesolutions.scala.methods;

import scala.*;
import scala.runtime.*;

public final class Methods$$anonfun$main$4 extends AbstractFunction2$mcIII$sp implements Serializable {
    public static final long serialVersionUID = 0L;
    private final Function3 partial$1;
    
    public final int apply(final int x$3, final int x$4) {
        return this.apply$mcIII$sp(x$3, x$4);
    }
    
    public int apply$mcIII$sp(final int x$3, final int x$4) {
        return BoxesRunTime.unboxToInt(this.partial$1.apply((Object)BoxesRunTime.boxToInteger(x$3), (Object)BoxesRunTime.boxToInteger(x$4), (Object)BoxesRunTime.boxToInteger(0)));
    }
}