package org.apache.jdo.tck.pc.companyAnnotatedPI;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPIAppFullTimeEmployee extends PersistableExpressionImpl<PIAppFullTimeEmployee> implements PersistableExpression<PIAppFullTimeEmployee>
{
    public static final QPIAppFullTimeEmployee jdoCandidate = candidate("this");

    public static QPIAppFullTimeEmployee candidate(String name)
    {
        return new QPIAppFullTimeEmployee(null, name, 5);
    }

    public static QPIAppFullTimeEmployee candidate()
    {
        return jdoCandidate;
    }

    public static QPIAppFullTimeEmployee parameter(String name)
    {
        return new QPIAppFullTimeEmployee(PIAppFullTimeEmployee.class, name, ExpressionType.PARAMETER);
    }

    public static QPIAppFullTimeEmployee variable(String name)
    {
        return new QPIAppFullTimeEmployee(PIAppFullTimeEmployee.class, name, ExpressionType.VARIABLE);
    }


    public QPIAppFullTimeEmployee(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPIAppFullTimeEmployee(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
