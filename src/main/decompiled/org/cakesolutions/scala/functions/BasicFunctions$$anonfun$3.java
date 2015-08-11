package org.cakesolutions.scala.functions;

import scala.runtime.*;
import scala.*;
import scala.collection.mutable.*;

public final class BasicFunctions$$anonfun$3 extends AbstractFunction2<String, String, String> implements Serializable {
    public static final long serialVersionUID = 0L;
    
    public final String apply(final String a, final String b) {
        return new StringBuilder().append((Object)a).append((Object)b).toString();
    }
}