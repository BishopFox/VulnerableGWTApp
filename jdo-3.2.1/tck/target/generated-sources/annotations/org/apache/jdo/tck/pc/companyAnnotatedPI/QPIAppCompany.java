package org.apache.jdo.tck.pc.companyAnnotatedPI;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPIAppCompany extends PersistableExpressionImpl<PIAppCompany> implements PersistableExpression<PIAppCompany>
{
    public static final QPIAppCompany jdoCandidate = candidate("this");

    public static QPIAppCompany candidate(String name)
    {
        return new QPIAppCompany(null, name, 5);
    }

    public static QPIAppCompany candidate()
    {
        return jdoCandidate;
    }

    public static QPIAppCompany parameter(String name)
    {
        return new QPIAppCompany(PIAppCompany.class, name, ExpressionType.PARAMETER);
    }

    public static QPIAppCompany variable(String name)
    {
        return new QPIAppCompany(PIAppCompany.class, name, ExpressionType.VARIABLE);
    }


    public QPIAppCompany(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPIAppCompany(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
