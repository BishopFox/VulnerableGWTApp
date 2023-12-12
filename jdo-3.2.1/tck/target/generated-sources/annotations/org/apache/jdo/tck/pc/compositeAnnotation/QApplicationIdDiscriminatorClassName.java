package org.apache.jdo.tck.pc.compositeAnnotation;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QApplicationIdDiscriminatorClassName extends PersistableExpressionImpl<ApplicationIdDiscriminatorClassName> implements PersistableExpression<ApplicationIdDiscriminatorClassName>
{
    public static final QApplicationIdDiscriminatorClassName jdoCandidate = candidate("this");

    public static QApplicationIdDiscriminatorClassName candidate(String name)
    {
        return new QApplicationIdDiscriminatorClassName(null, name, 5);
    }

    public static QApplicationIdDiscriminatorClassName candidate()
    {
        return jdoCandidate;
    }

    public static QApplicationIdDiscriminatorClassName parameter(String name)
    {
        return new QApplicationIdDiscriminatorClassName(ApplicationIdDiscriminatorClassName.class, name, ExpressionType.PARAMETER);
    }

    public static QApplicationIdDiscriminatorClassName variable(String name)
    {
        return new QApplicationIdDiscriminatorClassName(ApplicationIdDiscriminatorClassName.class, name, ExpressionType.VARIABLE);
    }


    public QApplicationIdDiscriminatorClassName(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QApplicationIdDiscriminatorClassName(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
