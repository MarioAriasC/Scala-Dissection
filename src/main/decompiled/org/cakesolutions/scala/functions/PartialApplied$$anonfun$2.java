package org.cakesolutions.scala.functions;

import scala.runtime.*;
import scala.*;

public final class PartialApplied$$anonfun$2 extends AbstractFunction2<String, String, String> implements Serializable {
    public static final long serialVersionUID = 0L;
    
    public final String apply(final String x$1, final String x$2) {
        return (String)PartialApplied$.MODULE$.org$cakesolutions$scala$functions$PartialApplied$$concat().apply((Object)"Hello,", (Object)x$1, (Object)x$2);
    }
}