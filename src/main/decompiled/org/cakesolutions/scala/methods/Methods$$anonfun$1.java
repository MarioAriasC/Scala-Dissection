package org.cakesolutions.scala.methods;

import scala.*;
import scala.runtime.*;

public final class Methods$$anonfun$1 extends AbstractFunction1$mcII$sp implements Serializable {
    public static final long serialVersionUID = 0L;
    
    public final int apply(final int b) {
        return this.apply$mcII$sp(b);
    }
    
    public int apply$mcII$sp(final int b) {
        return Methods$.MODULE$.curriedSum(5, b);
    }
}