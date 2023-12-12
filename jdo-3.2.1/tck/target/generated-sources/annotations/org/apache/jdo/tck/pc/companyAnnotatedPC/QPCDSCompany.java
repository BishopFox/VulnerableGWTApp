package org.apache.jdo.tck.pc.companyAnnotatedPC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCDSCompany extends PersistableExpressionImpl<PCDSCompany> implements PersistableExpression<PCDSCompany>
{
    public static final QPCDSCompany jdoCandidate = candidate("this");

    public static QPCDSCompany candidate(String name)
    {
        return new QPCDSCompany(null, name, 5);
    }

    public static QPCDSCompany candidate()
    {
        return jdoCandidate;
    }

    public static QPCDSCompany parameter(String name)
    {
        return new QPCDSCompany(PCDSCompany.class, name, ExpressionType.PARAMETER);
    }

    public static QPCDSCompany variable(String name)
    {
        return new QPCDSCompany(PCDSCompany.class, name, ExpressionType.VARIABLE);
    }


    public QPCDSCompany(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPCDSCompany(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
