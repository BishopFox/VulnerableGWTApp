package org.apache.jdo.tck.pc.companyAnnotatedPI;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPIDSCompany extends PersistableExpressionImpl<PIDSCompany> implements PersistableExpression<PIDSCompany>
{
    public static final QPIDSCompany jdoCandidate = candidate("this");

    public static QPIDSCompany candidate(String name)
    {
        return new QPIDSCompany(null, name, 5);
    }

    public static QPIDSCompany candidate()
    {
        return jdoCandidate;
    }

    public static QPIDSCompany parameter(String name)
    {
        return new QPIDSCompany(PIDSCompany.class, name, ExpressionType.PARAMETER);
    }

    public static QPIDSCompany variable(String name)
    {
        return new QPIDSCompany(PIDSCompany.class, name, ExpressionType.VARIABLE);
    }


    public QPIDSCompany(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPIDSCompany(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
