package org.cakesolutions.scala.methods;

import java.lang.ref.*;
import scala.runtime.*;
import java.lang.reflect.*;
import scala.*;

public final class Methods$
{
    public static final Methods$ MODULE$;
    private static Class[] reflParams$Cache1;
    private static volatile SoftReference reflPoly$Cache1;
    private static Class[] reflParams$Cache2;
    private static volatile SoftReference reflPoly$Cache2;
    
    static {
        Methods$.reflParams$Cache1 = new Class[0];
        Methods$.reflPoly$Cache1 = new SoftReference((T)new EmptyMethodCache());
        Methods$.reflParams$Cache2 = new Class[0];
        Methods$.reflPoly$Cache2 = new SoftReference((T)new EmptyMethodCache());
        new Methods$();
    }
    
    public static Method reflMethod$Method1(final Class x$1) {
        MethodCache methodCache1 = Methods$.reflPoly$Cache1.get();
        if (methodCache1 == null) {
            methodCache1 = (MethodCache)new EmptyMethodCache();
            Methods$.reflPoly$Cache1 = new SoftReference((T)methodCache1);
        }
        Method method1 = methodCache1.find(x$1);
        if (method1 != null) {
            return method1;
        }
        method1 = ScalaRunTime$.MODULE$.ensureAccessible(x$1.getMethod("operation", (Class[])Methods$.reflParams$Cache1));
        Methods$.reflPoly$Cache1 = new SoftReference((T)methodCache1.add(x$1, method1));
        return method1;
    }
    
    public static Method reflMethod$Method2(final Class x$1) {
        MethodCache methodCache2 = Methods$.reflPoly$Cache2.get();
        if (methodCache2 == null) {
            methodCache2 = (MethodCache)new EmptyMethodCache();
            Methods$.reflPoly$Cache2 = new SoftReference((T)methodCache2);
        }
        Method method2 = methodCache2.find(x$1);
        if (method2 != null) {
            return method2;
        }
        method2 = ScalaRunTime$.MODULE$.ensureAccessible(x$1.getMethod("value", (Class[])Methods$.reflParams$Cache2));
        Methods$.reflPoly$Cache2 = new SoftReference((T)methodCache2.add(x$1, method2));
        return method2;
    }
    
    public int sum(final int a, final int b) {
        return a + b;
    }
    
    public int curriedSum(final int a, final int b) {
        return a + b;
    }
    
    public int sumWithImplicits(final int a, final int b) {
        return a + b;
    }
    
    public int sumWithDefault(final int a, final int b) {
        return a + b;
    }
    
    public int sumWithDefault$default$1() {
        return 5;
    }
    
    public int sumWithDefault$default$2() {
        return 7;
    }
    
    public int intOperation(final int a, final int b, final Function2<Object, Object, Object> f) {
        return f.apply$mcIII$sp(a, b);
    }
    
    public int structural(final Object op) {
        try {
            return BoxesRunTime.unboxToInt((Object)reflMethod$Method1(op.getClass()).invoke(op, new Object[0]));
        }
        catch (InvocationTargetException ex) {
            throw ex.getCause();
        }
    }
    
    public int structuralField(final Object f) {
        try {
            return BoxesRunTime.unboxToInt((Object)reflMethod$Method2(f.getClass()).invoke(f, new Object[0]));
        }
        catch (InvocationTargetException ex) {
            throw ex.getCause();
        }
    }
    
    public void main(final String[] args) {
        Predef$.MODULE$.assert(this.sum(5, 7) == 12);
        final Predef$ module$ = Predef$.MODULE$;
        final int x$6 = 5;
        final int x$7 = 7;
        module$.assert(this.sum(x$7, x$6) == 12);
        final Function1 sum5 = (Function1)new Methods$$anonfun.Methods$$anonfun$1();
        Predef$.MODULE$.assert(sum5.apply$mcII$sp(7) == 12);
        Predef$.MODULE$.assert(this.curriedSum(5, 7) == 12);
        final int b = 7;
        Predef$.MODULE$.assert(this.sumWithImplicits(5, b) == 12);
        Predef$.MODULE$.assert(this.sumWithImplicits(5, 8) == 13);
        Predef$.MODULE$.assert(this.sumWithDefault(5, 7) == 12);
        Predef$.MODULE$.assert(this.sumWithDefault(this.sumWithDefault$default$1(), this.sumWithDefault$default$2()) == 12);
        final Predef$ module$2 = Predef$.MODULE$;
        final int x$8 = 5;
        final int x$9 = this.sumWithDefault$default$1();
        module$2.assert(this.sumWithDefault(x$9, x$8) == 10);
        Predef$.MODULE$.assert(this.intOperation(5, 7, (Function2<Object, Object, Object>)new Methods$$anonfun$main.Methods$$anonfun$main$1()) == 12);
        final Function2 f = (Function2)new Methods$$anonfun.Methods$$anonfun$2();
        Predef$.MODULE$.assert(this.intOperation(5, 7, (Function2<Object, Object, Object>)f) == 12);
        Predef$.MODULE$.assert(this.intOperation(5, 7, (Function2<Object, Object, Object>)new Methods$$anonfun$main.Methods$$anonfun$main$2()) == 12);
        Predef$.MODULE$.assert(this.intOperation(5, 7, (Function2<Object, Object, Object>)new Methods$$anonfun$main.Methods$$anonfun$main$3()) == 12);
        final Function3 partial = (Function3)new Methods$$anonfun.Methods$$anonfun$4();
        Predef$.MODULE$.assert(this.intOperation(5, 7, (Function2<Object, Object, Object>)new Methods$$anonfun$main.Methods$$anonfun$main$4(partial)) == 12);
        final Function1 partialMethod = (Function1)new Methods$$anonfun.Methods$$anonfun$3();
        Predef$.MODULE$.assert(partialMethod.apply$mcII$sp(7) == 12);
        Predef$.MODULE$.assert(this.structural(new SumOperation(5, 7)) == 12);
        Predef$.MODULE$.assert(this.structural(new ZeroOperation()) == 0);
        Predef$.MODULE$.assert(this.structural(new Methods$$anon.Methods$$anon$1()) == 12);
        Predef$.MODULE$.assert(this.structuralField(new IntValue(12)) == 12);
    }
    
    private Methods$() {
        MODULE$ = this;
    }
}
