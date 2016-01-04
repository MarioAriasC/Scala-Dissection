package org.cakesolutions.scala.methods;

import scala.reflect.*;
import scala.collection.*;
import scala.runtime.*;
import scala.*;

@ScalaSignature(bytes = "\u0006\u0001\u0005\u001db\u0001B\u0001\u0003\u0001.\u0011AbU;n\u001fB,'/\u0019;j_:T!a\u0001\u0003\u0002\u000f5,G\u000f[8eg*\u0011QAB\u0001\u0006g\u000e\fG.\u0019\u0006\u0003\u000f!\tQbY1lKN|G.\u001e;j_:\u001c(\"A\u0005\u0002\u0007=\u0014xm\u0001\u0001\u0014\t\u0001a\u0011\u0003\u0006\t\u0003\u001b=i\u0011A\u0004\u0006\u0002\u000b%\u0011\u0001C\u0004\u0002\u0007\u0003:L(+\u001a4\u0011\u00055\u0011\u0012BA\n\u000f\u0005\u001d\u0001&o\u001c3vGR\u0004\"!D\u000b\n\u0005Yq!\u0001D*fe&\fG.\u001b>bE2,\u0007\u0002\u0003\r\u0001\u0005+\u0007I\u0011A\r\u0002\u0003\u0005,\u0012A\u0007\t\u0003\u001bmI!\u0001\b\b\u0003\u0007%sG\u000f\u0003\u0005\u001f\u0001\tE\t\u0015!\u0003\u001b\u0003\t\t\u0007\u0005\u0003\u0005!\u0001\tU\r\u0011\"\u0001\u001a\u0003\u0005\u0011\u0007\u0002\u0003\u0012\u0001\u0005#\u0005\u000b\u0011\u0002\u000e\u0002\u0005\t\u0004\u0003\"\u0002\u0013\u0001\t\u0003)\u0013A\u0002\u001fj]&$h\bF\u0002'Q%\u0002\"a\n\u0001\u000e\u0003\tAQ\u0001G\u0012A\u0002iAQ\u0001I\u0012A\u0002iAQa\u000b\u0001\u0005\u00021\n\u0011b\u001c9fe\u0006$\u0018n\u001c8\u0015\u0003iAqA\f\u0001\u0002\u0002\u0013\u0005q&\u0001\u0003d_BLHc\u0001\u00141c!9\u0001$\fI\u0001\u0002\u0004Q\u0002b\u0002\u0011.!\u0003\u0005\rA\u0007\u0005\bg\u0001\t\n\u0011\"\u00015\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uIE*\u0012!\u000e\u0016\u00035YZ\u0013a\u000e\t\u0003quj\u0011!\u000f\u0006\u0003um\n\u0011\"\u001e8dQ\u0016\u001c7.\u001a3\u000b\u0005qr\u0011AC1o]>$\u0018\r^5p]&\u0011a(\u000f\u0002\u0012k:\u001c\u0007.Z2lK\u00124\u0016M]5b]\u000e,\u0007b\u0002!\u0001#\u0003%\t\u0001N\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00133\u0011\u001d\u0011\u0005!!A\u0005B\r\u000bQ\u0002\u001d:pIV\u001cG\u000f\u0015:fM&DX#\u0001#\u0011\u0005\u0015SU\"\u0001$\u000b\u0005\u001dC\u0015\u0001\u00027b]\u001eT\u0011!S\u0001\u0005U\u00064\u0018-\u0003\u0002L\r\n11\u000b\u001e:j]\u001eDq!\u0014\u0001\u0002\u0002\u0013\u0005\u0011$\u0001\u0007qe>$Wo\u0019;Be&$\u0018\u0010C\u0004P\u0001\u0005\u0005I\u0011\u0001)\u0002\u001dA\u0014x\u000eZ;di\u0016cW-\\3oiR\u0011\u0011\u000b\u0016\t\u0003\u001bIK!a\u0015\b\u0003\u0007\u0005s\u0017\u0010C\u0004V\u001d\u0006\u0005\t\u0019\u0001\u000e\u0002\u0007a$\u0013\u0007C\u0004X\u0001\u0005\u0005I\u0011\t-\u0002\u001fA\u0014x\u000eZ;di&#XM]1u_J,\u0012!\u0017\t\u00045v\u000bV\"A.\u000b\u0005qs\u0011AC2pY2,7\r^5p]&\u0011al\u0017\u0002\t\u0013R,'/\u0019;pe\"9\u0001\rAA\u0001\n\u0003\t\u0017\u0001C2b]\u0016\u000bX/\u00197\u0015\u0005\t,\u0007CA\u0007d\u0013\t!gBA\u0004C_>dW-\u00198\t\u000fU{\u0016\u0011!a\u0001#\"9q\rAA\u0001\n\u0003b\u0013\u0001\u00035bg\"\u001cu\u000eZ3\t\u000f%\u0004\u0011\u0011!C!U\u0006AAo\\*ue&tw\rF\u0001E\u0011\u001da\u0007!!A\u0005B5\fa!Z9vC2\u001cHC\u00012o\u0011\u001d)6.!AA\u0002E;q\u0001\u001d\u0002\u0002\u0002#\u0005\u0011/\u0001\u0007Tk6|\u0005/\u001a:bi&|g\u000e\u0005\u0002(e\u001a9\u0011AAA\u0001\u0012\u0003\u00198c\u0001:u)A)Q\u000f\u001f\u000e\u001bM5\taO\u0003\u0002x\u001d\u00059!/\u001e8uS6,\u0017BA=w\u0005E\t%m\u001d;sC\u000e$h)\u001e8di&|gN\r\u0005\u0006II$\ta\u001f\u000b\u0002c\"9\u0011N]A\u0001\n\u000bR\u0007b\u0002@s\u0003\u0003%\ti`\u0001\u0006CB\u0004H.\u001f\u000b\u0006M\u0005\u0005\u00111\u0001\u0005\u00061u\u0004\rA\u0007\u0005\u0006Au\u0004\rA\u0007\u0005\n\u0003\u000f\u0011\u0018\u0011!CA\u0003\u0013\tq!\u001e8baBd\u0017\u0010\u0006\u0003\u0002\f\u0005]\u0001#B\u0007\u0002\u000e\u0005E\u0011bAA\b\u001d\t1q\n\u001d;j_:\u0004R!DA\n5iI1!!\u0006\u000f\u0005\u0019!V\u000f\u001d7fe!I\u0011\u0011DA\u0003\u0003\u0003\u0005\rAJ\u0001\u0004q\u0012\u0002\u0004\"CA\u000fe\u0006\u0005I\u0011BA\u0010\u0003-\u0011X-\u00193SKN|GN^3\u0015\u0005\u0005\u0005\u0002cA#\u0002$%\u0019\u0011Q\u0005$\u0003\r=\u0013'.Z2u\u0001")
public class SumOperation implements Product, Serializable
{
    private final int a;
    private final int b;
    
    public static Option<Tuple2<Object, Object>> unapply(final SumOperation x$0) {
        return SumOperation$.MODULE$.unapply(x$0);
    }
    
    public static SumOperation apply(final int a, final int b) {
        return SumOperation$.MODULE$.apply(a, b);
    }
    
    public static Function1<Tuple2<Object, Object>, SumOperation> tupled() {
        return (Function1<Tuple2<Object, Object>, SumOperation>)SumOperation$.MODULE$.tupled();
    }
    
    public static Function1<Object, Function1<Object, SumOperation>> curried() {
        return (Function1<Object, Function1<Object, SumOperation>>)SumOperation$.MODULE$.curried();
    }
    
    public int a() {
        return this.a;
    }
    
    public int b() {
        return this.b;
    }
    
    public int operation() {
        return this.a() + this.b();
    }
    
    public SumOperation copy(final int a, final int b) {
        return new SumOperation(a, b);
    }
    
    public int copy$default$1() {
        return this.a();
    }
    
    public int copy$default$2() {
        return this.b();
    }
    
    public String productPrefix() {
        return "SumOperation";
    }
    
    public int productArity() {
        return 2;
    }
    
    public Object productElement(final int x$1) {
        Integer n = null;
        switch (x$1) {
            default: {
                throw new IndexOutOfBoundsException(BoxesRunTime.boxToInteger(x$1).toString());
            }
            case 1: {
                n = BoxesRunTime.boxToInteger(this.b());
                break;
            }
            case 0: {
                n = BoxesRunTime.boxToInteger(this.a());
                break;
            }
        }
        return n;
    }
    
    public Iterator<Object> productIterator() {
        return (Iterator<Object>)ScalaRunTime$.MODULE$.typedProductIterator((Product)this);
    }
    
    public boolean canEqual(final Object x$1) {
        return x$1 instanceof SumOperation;
    }
    
    @Override
    public int hashCode() {
        return Statics.finalizeHash(Statics.mix(Statics.mix(-889275714, this.a()), this.b()), 2);
    }
    
    @Override
    public String toString() {
        return ScalaRunTime$.MODULE$._toString((Product)this);
    }
    
    @Override
    public boolean equals(final Object x$1) {
        if (this != x$1) {
            if (x$1 instanceof SumOperation) {
                final SumOperation sumOperation = (SumOperation)x$1;
                if (this.a() == sumOperation.a() && this.b() == sumOperation.b() && sumOperation.canEqual(this)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public SumOperation(final int a, final int b) {
        this.a = a;
        this.b = b;
        Product$class.$init$((Product)this);
    }
}
