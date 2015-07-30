package org.cakesolutions.scala.basic.greeter;

import scala.reflect.*;

@ScalaSignature(bytes = "\u0006\u0001A2A!\u0001\u0002\u0001\u001b\tq1\u000b]1oSNDwI]3fi\u0016\u0014(BA\u0002\u0005\u0003\u001d9'/Z3uKJT!!\u0002\u0004\u0002\u000b\t\f7/[2\u000b\u0005\u001dA\u0011!B:dC2\f'BA\u0005\u000b\u00035\u0019\u0017m[3t_2,H/[8og*\t1\"A\u0002pe\u001e\u001c\u0001aE\u0002\u0001\u001dM\u0001\"aD\t\u000e\u0003AQ\u0011aB\u0005\u0003%A\u0011a!\u00118z%\u00164\u0007C\u0001\u000b\u0016\u001b\u0005\u0011\u0011B\u0001\f\u0003\u0005\u001d9%/Z3uKJDQ\u0001\u0007\u0001\u0005\u0002e\ta\u0001P5oSRtD#\u0001\u000e\u0011\u0005Q\u0001\u0001\"\u0002\u000f\u0001\t\u0003j\u0012!C4sK\u0016$\u0018N\\4t)\u0005q\u0002CA\u0010%\u001b\u0005\u0001#BA\u0011#\u0003\u0011a\u0017M\\4\u000b\u0003\r\nAA[1wC&\u0011Q\u0005\t\u0002\u0007'R\u0014\u0018N\\4\t\u000f\u0005\u0002!\u0019!C!OU\t\u0001\u0006\u0005\u0002*Y9\u0011qBK\u0005\u0003WA\ta\u0001\u0015:fI\u00164\u0017BA\u0013.\u0015\tY\u0003\u0003\u0003\u00040\u0001\u0001\u0006I\u0001K\u0001\u0006Y\u0006tw\r\t")
public class SpanishGreeter implements Greeter
{
    private final String lang;
    
    @Override
    public void org$cakesolutions$scala$basic$greeter$Greeter$_setter_$lang_$eq(final String x$1) {
    }
    
    @Override
    public String goodbye() {
        return Greeter$class.goodbye(this);
    }
    
    @Override
    public String greetings() {
        return "Saludos desde Scala";
    }
    
    @Override
    public String lang() {
        return this.lang;
    }
    
    public SpanishGreeter() {
        Greeter$class.$init$(this);
        this.lang = "ES";
    }
}
