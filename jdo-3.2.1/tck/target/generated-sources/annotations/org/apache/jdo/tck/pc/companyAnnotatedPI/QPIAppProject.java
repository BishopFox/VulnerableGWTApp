package org.apache.jdo.tck.pc.companyAnnotatedPI;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPIAppProject extends PersistableExpressionImpl<PIAppProject> implements PersistableExpression<PIAppProject>
{
    public static final QPIAppProject jdoCandidate = candidate("this");

    public static QPIAppProject candidate(String name)
    {
        return new QPIAppProject(null, name, 5);
    }

    public static QPIAppProject candidate()
    {
        return jdoCandidate;
    }

    public static QPIAppProject parameter(String name)
    {
        return new QPIAppProject(PIAppProject.class, name, ExpressionType.PARAMETER);
    }

    public static QPIAppProject variable(String name)
    {
        return new QPIAppProject(PIAppProject.class, name, ExpressionType.VARIABLE);
    }


    public QPIAppProject(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPIAppProject(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
