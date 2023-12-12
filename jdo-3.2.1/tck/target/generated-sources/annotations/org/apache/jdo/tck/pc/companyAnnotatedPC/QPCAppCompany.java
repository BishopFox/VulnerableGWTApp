package org.apache.jdo.tck.pc.companyAnnotatedPC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCAppCompany extends PersistableExpressionImpl<PCAppCompany> implements PersistableExpression<PCAppCompany>
{
    public static final QPCAppCompany jdoCandidate = candidate("this");

    public static QPCAppCompany candidate(String name)
    {
        return new QPCAppCompany(null, name, 5);
    }

    public static QPCAppCompany candidate()
    {
        return jdoCandidate;
    }

    public static QPCAppCompany parameter(String name)
    {
        return new QPCAppCompany(PCAppCompany.class, name, ExpressionType.PARAMETER);
    }

    public static QPCAppCompany variable(String name)
    {
        return new QPCAppCompany(PCAppCompany.class, name, ExpressionType.VARIABLE);
    }


    public QPCAppCompany(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPCAppCompany(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
