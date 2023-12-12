package org.apache.jdo.tck.pc.companyAnnotatedPI;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPIAppPerson extends PersistableExpressionImpl<PIAppPerson> implements PersistableExpression<PIAppPerson>
{
    public static final QPIAppPerson jdoCandidate = candidate("this");

    public static QPIAppPerson candidate(String name)
    {
        return new QPIAppPerson(null, name, 5);
    }

    public static QPIAppPerson candidate()
    {
        return jdoCandidate;
    }

    public static QPIAppPerson parameter(String name)
    {
        return new QPIAppPerson(PIAppPerson.class, name, ExpressionType.PARAMETER);
    }

    public static QPIAppPerson variable(String name)
    {
        return new QPIAppPerson(PIAppPerson.class, name, ExpressionType.VARIABLE);
    }


    public QPIAppPerson(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPIAppPerson(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
