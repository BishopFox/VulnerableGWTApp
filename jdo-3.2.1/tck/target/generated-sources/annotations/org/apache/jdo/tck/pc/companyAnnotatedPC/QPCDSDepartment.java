package org.apache.jdo.tck.pc.companyAnnotatedPC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCDSDepartment extends PersistableExpressionImpl<PCDSDepartment> implements PersistableExpression<PCDSDepartment>
{
    public static final QPCDSDepartment jdoCandidate = candidate("this");

    public static QPCDSDepartment candidate(String name)
    {
        return new QPCDSDepartment(null, name, 5);
    }

    public static QPCDSDepartment candidate()
    {
        return jdoCandidate;
    }

    public static QPCDSDepartment parameter(String name)
    {
        return new QPCDSDepartment(PCDSDepartment.class, name, ExpressionType.PARAMETER);
    }

    public static QPCDSDepartment variable(String name)
    {
        return new QPCDSDepartment(PCDSDepartment.class, name, ExpressionType.VARIABLE);
    }


    public QPCDSDepartment(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPCDSDepartment(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
