package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QDatastoreIdDiscriminatorClassNameInheritanceSuperclass extends PersistableExpressionImpl<DatastoreIdDiscriminatorClassNameInheritanceSuperclass> implements PersistableExpression<DatastoreIdDiscriminatorClassNameInheritanceSuperclass>
{
    public static final QDatastoreIdDiscriminatorClassNameInheritanceSuperclass jdoCandidate = candidate("this");

    public static QDatastoreIdDiscriminatorClassNameInheritanceSuperclass candidate(String name)
    {
        return new QDatastoreIdDiscriminatorClassNameInheritanceSuperclass(null, name, 5);
    }

    public static QDatastoreIdDiscriminatorClassNameInheritanceSuperclass candidate()
    {
        return jdoCandidate;
    }

    public static QDatastoreIdDiscriminatorClassNameInheritanceSuperclass parameter(String name)
    {
        return new QDatastoreIdDiscriminatorClassNameInheritanceSuperclass(DatastoreIdDiscriminatorClassNameInheritanceSuperclass.class, name, ExpressionType.PARAMETER);
    }

    public static QDatastoreIdDiscriminatorClassNameInheritanceSuperclass variable(String name)
    {
        return new QDatastoreIdDiscriminatorClassNameInheritanceSuperclass(DatastoreIdDiscriminatorClassNameInheritanceSuperclass.class, name, ExpressionType.VARIABLE);
    }


    public QDatastoreIdDiscriminatorClassNameInheritanceSuperclass(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QDatastoreIdDiscriminatorClassNameInheritanceSuperclass(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
