package org.apache.jdo.tck.pc.companyAnnotatedPI;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPIAppDepartment extends PersistableExpressionImpl<PIAppDepartment> implements PersistableExpression<PIAppDepartment>
{
    public static final QPIAppDepartment jdoCandidate = candidate("this");

    public static QPIAppDepartment candidate(String name)
    {
        return new QPIAppDepartment(null, name, 5);
    }

    public static QPIAppDepartment candidate()
    {
        return jdoCandidate;
    }

    public static QPIAppDepartment parameter(String name)
    {
        return new QPIAppDepartment(PIAppDepartment.class, name, ExpressionType.PARAMETER);
    }

    public static QPIAppDepartment variable(String name)
    {
        return new QPIAppDepartment(PIAppDepartment.class, name, ExpressionType.VARIABLE);
    }


    public QPIAppDepartment(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPIAppDepartment(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
