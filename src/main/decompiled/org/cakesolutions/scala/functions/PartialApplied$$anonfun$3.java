package org.cakesolutions.scala.functions;

import scala.runtime.*;
import scala.*;

public final class PartialApplied$$anonfun$3 extends AbstractFunction1<String, String> implements Serializable {
    public static final long serialVersionUID = 0L;
    
    public final String apply(final String x$3) {
        return (String)PartialApplied$.MODULE$.org$cakesolutions$scala$functions$PartialApplied$$hello().apply((Object)x$3, (Object)"!");
    }
}