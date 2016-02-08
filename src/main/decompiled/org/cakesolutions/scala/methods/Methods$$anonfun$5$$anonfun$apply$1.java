package org.cakesolutions.scala.methods;

import scala.*;
import scala.runtime.*;

public final class Methods$$anonfun$5$$anonfun$apply$1 extends AbstractFunction1$mcII$sp implements Serializable {
    public static final long serialVersionUID = 0L;
    private final int b$1;
    
    public final int apply(final int c) {
        return this.apply$mcII$sp(c);
    }
    
    public int apply$mcII$sp(final int c) {
        return Methods$.MODULE$.curriedSum3(4, this.b$1, c);
    }
}