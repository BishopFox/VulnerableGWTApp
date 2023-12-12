package org.apache.jdo.tck.pc.companyAnnotatedPI;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPIDSProject extends PersistableExpressionImpl<PIDSProject> implements PersistableExpression<PIDSProject>
{
    public static final QPIDSProject jdoCandidate = candidate("this");

    public static QPIDSProject candidate(String name)
    {
        return new QPIDSProject(null, name, 5);
    }

    public static QPIDSProject candidate()
    {
        return jdoCandidate;
    }

    public static QPIDSProject parameter(String name)
    {
        return new QPIDSProject(PIDSProject.class, name, ExpressionType.PARAMETER);
    }

    public static QPIDSProject variable(String name)
    {
        return new QPIDSProject(PIDSProject.class, name, ExpressionType.VARIABLE);
    }


    public QPIDSProject(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPIDSProject(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
