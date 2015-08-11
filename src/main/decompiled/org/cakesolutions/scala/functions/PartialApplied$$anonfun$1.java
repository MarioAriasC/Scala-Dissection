package org.cakesolutions.scala.functions;

import scala.runtime.*;
import scala.*;
import scala.collection.*;

public final class PartialApplied$$anonfun$1 extends AbstractFunction3<String, String, String, String> implements Serializable {
    public static final long serialVersionUID = 0L;
    
    public final String apply(final String prefix, final String content, final String suffix) {
        return new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[] { "", " ", " ", "" })).s((Seq)Predef$.MODULE$.genericWrapArray((Object)new Object[] { prefix, content, suffix }));
    }
}