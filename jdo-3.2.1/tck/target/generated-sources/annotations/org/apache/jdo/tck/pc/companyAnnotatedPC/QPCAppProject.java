package org.apache.jdo.tck.pc.companyAnnotatedPC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCAppProject extends PersistableExpressionImpl<PCAppProject> implements PersistableExpression<PCAppProject>
{
    public static final QPCAppProject jdoCandidate = candidate("this");

    public static QPCAppProject candidate(String name)
    {
        return new QPCAppProject(null, name, 5);
    }

    public static QPCAppProject candidate()
    {
        return jdoCandidate;
    }

    public static QPCAppProject parameter(String name)
    {
        return new QPCAppProject(PCAppProject.class, name, ExpressionType.PARAMETER);
    }

    public static QPCAppProject variable(String name)
    {
        return new QPCAppProject(PCAppProject.class, name, ExpressionType.VARIABLE);
    }


    public QPCAppProject(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPCAppProject(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
