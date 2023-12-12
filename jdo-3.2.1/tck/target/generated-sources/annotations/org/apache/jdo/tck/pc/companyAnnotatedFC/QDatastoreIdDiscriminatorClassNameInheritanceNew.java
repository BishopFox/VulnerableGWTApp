package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QDatastoreIdDiscriminatorClassNameInheritanceNew extends PersistableExpressionImpl<DatastoreIdDiscriminatorClassNameInheritanceNew> implements PersistableExpression<DatastoreIdDiscriminatorClassNameInheritanceNew>
{
    public static final QDatastoreIdDiscriminatorClassNameInheritanceNew jdoCandidate = candidate("this");

    public static QDatastoreIdDiscriminatorClassNameInheritanceNew candidate(String name)
    {
        return new QDatastoreIdDiscriminatorClassNameInheritanceNew(null, name, 5);
    }

    public static QDatastoreIdDiscriminatorClassNameInheritanceNew candidate()
    {
        return jdoCandidate;
    }

    public static QDatastoreIdDiscriminatorClassNameInheritanceNew parameter(String name)
    {
        return new QDatastoreIdDiscriminatorClassNameInheritanceNew(DatastoreIdDiscriminatorClassNameInheritanceNew.class, name, ExpressionType.PARAMETER);
    }

    public static QDatastoreIdDiscriminatorClassNameInheritanceNew variable(String name)
    {
        return new QDatastoreIdDiscriminatorClassNameInheritanceNew(DatastoreIdDiscriminatorClassNameInheritanceNew.class, name, ExpressionType.VARIABLE);
    }


    public QDatastoreIdDiscriminatorClassNameInheritanceNew(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QDatastoreIdDiscriminatorClassNameInheritanceNew(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
