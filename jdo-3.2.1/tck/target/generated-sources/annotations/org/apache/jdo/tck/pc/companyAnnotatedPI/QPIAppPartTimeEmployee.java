package org.apache.jdo.tck.pc.companyAnnotatedPI;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPIAppPartTimeEmployee extends PersistableExpressionImpl<PIAppPartTimeEmployee> implements PersistableExpression<PIAppPartTimeEmployee>
{
    public static final QPIAppPartTimeEmployee jdoCandidate = candidate("this");

    public static QPIAppPartTimeEmployee candidate(String name)
    {
        return new QPIAppPartTimeEmployee(null, name, 5);
    }

    public static QPIAppPartTimeEmployee candidate()
    {
        return jdoCandidate;
    }

    public static QPIAppPartTimeEmployee parameter(String name)
    {
        return new QPIAppPartTimeEmployee(PIAppPartTimeEmployee.class, name, ExpressionType.PARAMETER);
    }

    public static QPIAppPartTimeEmployee variable(String name)
    {
        return new QPIAppPartTimeEmployee(PIAppPartTimeEmployee.class, name, ExpressionType.VARIABLE);
    }


    public QPIAppPartTimeEmployee(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPIAppPartTimeEmployee(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
