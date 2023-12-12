package org.apache.jdo.tck.pc.companyAnnotatedPI;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPIAppEmployee extends PersistableExpressionImpl<PIAppEmployee> implements PersistableExpression<PIAppEmployee>
{
    public static final QPIAppEmployee jdoCandidate = candidate("this");

    public static QPIAppEmployee candidate(String name)
    {
        return new QPIAppEmployee(null, name, 5);
    }

    public static QPIAppEmployee candidate()
    {
        return jdoCandidate;
    }

    public static QPIAppEmployee parameter(String name)
    {
        return new QPIAppEmployee(PIAppEmployee.class, name, ExpressionType.PARAMETER);
    }

    public static QPIAppEmployee variable(String name)
    {
        return new QPIAppEmployee(PIAppEmployee.class, name, ExpressionType.VARIABLE);
    }


    public QPIAppEmployee(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPIAppEmployee(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
