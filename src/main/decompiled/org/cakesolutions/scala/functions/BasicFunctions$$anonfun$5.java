package org.cakesolutions.scala.functions;

import scala.*;
import scala.collection.*;
import scala.runtime.*;

public final class BasicFunctions$$anonfun$5 extends AbstractFunction2<Object, Object, String> implements Serializable {
    public static final long serialVersionUID = 0L;
    
    public final String apply(final int x, final int y) {
        return new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[] { "", "" })).s((Seq)Predef$.MODULE$.genericWrapArray((Object)new Object[] { BoxesRunTime.boxToInteger(BasicFunctions$.MODULE$.org$cakesolutions$scala$functions$BasicFunctions$$sumInts().apply$mcIII$sp(x, y)) }));
    }
}