package org.cakesolutions.scala.basic.calculator;

import scala.reflect.*;

@ScalaSignature(bytes = "\u0006\u0001\u00112A!\u0001\u0002\u0001\u001b\ty!)Y:jG\u000e\u000bGnY;mCR|'O\u0003\u0002\u0004\t\u0005Q1-\u00197dk2\fGo\u001c:\u000b\u0005\u00151\u0011!\u00022bg&\u001c'BA\u0004\t\u0003\u0015\u00198-\u00197b\u0015\tI!\"A\u0007dC.,7o\u001c7vi&|gn\u001d\u0006\u0002\u0017\u0005\u0019qN]4\u0004\u0001M1\u0001AD\n\u00185u\u0001\"aD\t\u000e\u0003AQ\u0011aB\u0005\u0003%A\u0011a!\u00118z%\u00164\u0007C\u0001\u000b\u0016\u001b\u0005\u0011\u0011B\u0001\f\u0003\u0005E\tE\rZ5uS>tw\n]3sCRLwN\u001c\t\u0003)aI!!\u0007\u0002\u0003)M+(\r\u001e:bGRLwN\\(qKJ\fG/[8o!\t!2$\u0003\u0002\u001d\u0005\t9R*\u001e7uSBd\u0017nY1uS>tw\n]3sCRLwN\u001c\t\u0003)yI!a\b\u0002\u0003#\u0011Kg/[:j_:|\u0005/\u001a:bi&|g\u000eC\u0003\"\u0001\u0011\u0005!%\u0001\u0004=S:LGO\u0010\u000b\u0002GA\u0011A\u0003\u0001")
public class BasicCalculator implements AdditionOperation, SubtractionOperation, MultiplicationOperation, DivisionOperation
{
    @Override
    public double division(final double x, final double y) {
        return DivisionOperation$class.division(this, x, y);
    }
    
    @Override
    public double multiplication(final double x, final double y) {
        return MultiplicationOperation$class.multiplication(this, x, y);
    }
    
    @Override
    public double subtraction(final double x, final double y) {
        return SubtractionOperation$class.subtraction(this, x, y);
    }
    
    @Override
    public double addition(final double x, final double y) {
        return AdditionOperation$class.addition(this, x, y);
    }
    
    public BasicCalculator() {
        AdditionOperation$class.$init$(this);
        SubtractionOperation$class.$init$(this);
        MultiplicationOperation$class.$init$(this);
        DivisionOperation$class.$init$(this);
    }
}
