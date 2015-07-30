package org.cakesolutions.scala.basic;

import scala.reflect.*;

@ScalaSignature(bytes = "\u0006\u0001\u00112A!\u0001\u0002\u0001\u0017\tY1+[7qY\u0016\u001cE.Y:t\u0015\t\u0019A!A\u0003cCNL7M\u0003\u0002\u0006\r\u0005)1oY1mC*\u0011q\u0001C\u0001\u000eG\u0006\\Wm]8mkRLwN\\:\u000b\u0003%\t1a\u001c:h\u0007\u0001\u0019\"\u0001\u0001\u0007\u0011\u00055yQ\"\u0001\b\u000b\u0003\u0015I!\u0001\u0005\b\u0003\r\u0005s\u0017PU3g\u0011\u0015\u0011\u0002\u0001\"\u0001\u0014\u0003\u0019a\u0014N\\5u}Q\tA\u0003\u0005\u0002\u0016\u00015\t!\u0001C\u0003\u0018\u0001\u0011\u0005\u0001$A\u0003iK2dw\u000eF\u0001\u001a!\tQr$D\u0001\u001c\u0015\taR$\u0001\u0003mC:<'\"\u0001\u0010\u0002\t)\fg/Y\u0005\u0003Am\u0011aa\u0015;sS:<\u0007\"\u0002\u0012\u0001\t\u0003\u0019\u0013\u0001\u00025pY\u0006,\u0012!\u0007")
public class SimpleClass
{
    public String hello() {
        return "Hello";
    }
    
    public String hola() {
        String message = this.hello();
        message = "Hola";
        return message;
    }
}
