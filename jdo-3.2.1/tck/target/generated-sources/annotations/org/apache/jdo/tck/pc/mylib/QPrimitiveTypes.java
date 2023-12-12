package org.apache.jdo.tck.pc.mylib;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPrimitiveTypes extends PersistableExpressionImpl<PrimitiveTypes> implements PersistableExpression<PrimitiveTypes>
{
    public static final QPrimitiveTypes jdoCandidate = candidate("this");

    public static QPrimitiveTypes candidate(String name)
    {
        return new QPrimitiveTypes(null, name, 5);
    }

    public static QPrimitiveTypes candidate()
    {
        return jdoCandidate;
    }

    public static QPrimitiveTypes parameter(String name)
    {
        return new QPrimitiveTypes(PrimitiveTypes.class, name, ExpressionType.PARAMETER);
    }

    public static QPrimitiveTypes variable(String name)
    {
        return new QPrimitiveTypes(PrimitiveTypes.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> id;
    public final BooleanExpression booleanNotNull;
    public final BooleanExpression booleanNull;
    public final ByteExpression byteNotNull;
    public final ByteExpression byteNull;
    public final NumericExpression<Short> shortNotNull;
    public final NumericExpression<Short> shortNull;
    public final NumericExpression<Integer> intNotNull;
    public final NumericExpression<Integer> intNull;
    public final NumericExpression<Long> longNotNull;
    public final NumericExpression<Long> longNull;
    public final NumericExpression<Float> floatNotNull;
    public final NumericExpression<Float> floatNull;
    public final NumericExpression<Double> doubleNotNull;
    public final NumericExpression<Double> doubleNull;
    public final CharacterExpression charNotNull;
    public final CharacterExpression charNull;
    public final DateTimeExpression dateNull;
    public final StringExpression stringNull;
    public final NumericExpression<java.math.BigDecimal> bigDecimal;
    public final NumericExpression<java.math.BigInteger> bigInteger;
    public final NumericExpression<Long> PrimitiveTypes;

    public QPrimitiveTypes(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.id = new NumericExpressionImpl<Long>(this, "id");
        this.booleanNotNull = new BooleanExpressionImpl(this, "booleanNotNull");
        this.booleanNull = new BooleanExpressionImpl(this, "booleanNull");
        this.byteNotNull = new ByteExpressionImpl(this, "byteNotNull");
        this.byteNull = new ByteExpressionImpl(this, "byteNull");
        this.shortNotNull = new NumericExpressionImpl<Short>(this, "shortNotNull");
        this.shortNull = new NumericExpressionImpl<Short>(this, "shortNull");
        this.intNotNull = new NumericExpressionImpl<Integer>(this, "intNotNull");
        this.intNull = new NumericExpressionImpl<Integer>(this, "intNull");
        this.longNotNull = new NumericExpressionImpl<Long>(this, "longNotNull");
        this.longNull = new NumericExpressionImpl<Long>(this, "longNull");
        this.floatNotNull = new NumericExpressionImpl<Float>(this, "floatNotNull");
        this.floatNull = new NumericExpressionImpl<Float>(this, "floatNull");
        this.doubleNotNull = new NumericExpressionImpl<Double>(this, "doubleNotNull");
        this.doubleNull = new NumericExpressionImpl<Double>(this, "doubleNull");
        this.charNotNull = new CharacterExpressionImpl(this, "charNotNull");
        this.charNull = new CharacterExpressionImpl(this, "charNull");
        this.dateNull = new DateTimeExpressionImpl(this, "dateNull");
        this.stringNull = new StringExpressionImpl(this, "stringNull");
        this.bigDecimal = new NumericExpressionImpl<java.math.BigDecimal>(this, "bigDecimal");
        this.bigInteger = new NumericExpressionImpl<java.math.BigInteger>(this, "bigInteger");
        this.PrimitiveTypes = new NumericExpressionImpl<Long>(this, "PrimitiveTypes");
    }

    public QPrimitiveTypes(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.id = new NumericExpressionImpl<Long>(this, "id");
        this.booleanNotNull = new BooleanExpressionImpl(this, "booleanNotNull");
        this.booleanNull = new BooleanExpressionImpl(this, "booleanNull");
        this.byteNotNull = new ByteExpressionImpl(this, "byteNotNull");
        this.byteNull = new ByteExpressionImpl(this, "byteNull");
        this.shortNotNull = new NumericExpressionImpl<Short>(this, "shortNotNull");
        this.shortNull = new NumericExpressionImpl<Short>(this, "shortNull");
        this.intNotNull = new NumericExpressionImpl<Integer>(this, "intNotNull");
        this.intNull = new NumericExpressionImpl<Integer>(this, "intNull");
        this.longNotNull = new NumericExpressionImpl<Long>(this, "longNotNull");
        this.longNull = new NumericExpressionImpl<Long>(this, "longNull");
        this.floatNotNull = new NumericExpressionImpl<Float>(this, "floatNotNull");
        this.floatNull = new NumericExpressionImpl<Float>(this, "floatNull");
        this.doubleNotNull = new NumericExpressionImpl<Double>(this, "doubleNotNull");
        this.doubleNull = new NumericExpressionImpl<Double>(this, "doubleNull");
        this.charNotNull = new CharacterExpressionImpl(this, "charNotNull");
        this.charNull = new CharacterExpressionImpl(this, "charNull");
        this.dateNull = new DateTimeExpressionImpl(this, "dateNull");
        this.stringNull = new StringExpressionImpl(this, "stringNull");
        this.bigDecimal = new NumericExpressionImpl<java.math.BigDecimal>(this, "bigDecimal");
        this.bigInteger = new NumericExpressionImpl<java.math.BigInteger>(this, "bigInteger");
        this.PrimitiveTypes = new NumericExpressionImpl<Long>(this, "PrimitiveTypes");
    }
}
