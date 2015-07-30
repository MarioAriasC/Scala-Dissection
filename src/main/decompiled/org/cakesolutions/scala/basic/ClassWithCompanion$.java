package org.cakesolutions.scala.basic;

public final class ClassWithCompanion$
{
    public static final ClassWithCompanion$ MODULE$;
    private final String CONSTANT;
    
    static {
        new ClassWithCompanion$();
    }
    
    public String CONSTANT() {
        return this.CONSTANT;
    }
    
    private ClassWithCompanion$() {
        MODULE$ = this;
        this.CONSTANT = "A constant";
    }
}
