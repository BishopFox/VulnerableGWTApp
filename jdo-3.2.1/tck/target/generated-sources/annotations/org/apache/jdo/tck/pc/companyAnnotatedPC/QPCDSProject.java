package org.apache.jdo.tck.pc.companyAnnotatedPC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCDSProject extends PersistableExpressionImpl<PCDSProject> implements PersistableExpression<PCDSProject>
{
    public static final QPCDSProject jdoCandidate = candidate("this");

    public static QPCDSProject candidate(String name)
    {
        return new QPCDSProject(null, name, 5);
    }

    public static QPCDSProject candidate()
    {
        return jdoCandidate;
    }

    public static QPCDSProject parameter(String name)
    {
        return new QPCDSProject(PCDSProject.class, name, ExpressionType.PARAMETER);
    }

    public static QPCDSProject variable(String name)
    {
        return new QPCDSProject(PCDSProject.class, name, ExpressionType.VARIABLE);
    }


    public QPCDSProject(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPCDSProject(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
