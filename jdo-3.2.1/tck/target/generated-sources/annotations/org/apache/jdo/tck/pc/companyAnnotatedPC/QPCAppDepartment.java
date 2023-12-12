package org.apache.jdo.tck.pc.companyAnnotatedPC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCAppDepartment extends PersistableExpressionImpl<PCAppDepartment> implements PersistableExpression<PCAppDepartment>
{
    public static final QPCAppDepartment jdoCandidate = candidate("this");

    public static QPCAppDepartment candidate(String name)
    {
        return new QPCAppDepartment(null, name, 5);
    }

    public static QPCAppDepartment candidate()
    {
        return jdoCandidate;
    }

    public static QPCAppDepartment parameter(String name)
    {
        return new QPCAppDepartment(PCAppDepartment.class, name, ExpressionType.PARAMETER);
    }

    public static QPCAppDepartment variable(String name)
    {
        return new QPCAppDepartment(PCAppDepartment.class, name, ExpressionType.VARIABLE);
    }


    public QPCAppDepartment(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPCAppDepartment(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
