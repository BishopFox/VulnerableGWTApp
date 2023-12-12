package org.apache.jdo.tck.pc.company;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QCompany extends PersistableExpressionImpl<Company> implements PersistableExpression<Company>
{
    public static final QCompany jdoCandidate = candidate("this");

    public static QCompany candidate(String name)
    {
        return new QCompany(null, name, 5);
    }

    public static QCompany candidate()
    {
        return jdoCandidate;
    }

    public static QCompany parameter(String name)
    {
        return new QCompany(Company.class, name, ExpressionType.PARAMETER);
    }

    public static QCompany variable(String name)
    {
        return new QCompany(Company.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> companyid;
    public final StringExpression name;
    public final DateTimeExpression founded;
    public final ObjectExpression<org.apache.jdo.tck.pc.company.Address> address;
    public final CollectionExpression departments;

    public QCompany(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.companyid = new NumericExpressionImpl<Long>(this, "companyid");
        this.name = new StringExpressionImpl(this, "name");
        this.founded = new DateTimeExpressionImpl(this, "founded");
        this.address = new ObjectExpressionImpl<org.apache.jdo.tck.pc.company.Address>(this, "address");
        this.departments = new CollectionExpressionImpl(this, "departments");
    }

    public QCompany(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.companyid = new NumericExpressionImpl<Long>(this, "companyid");
        this.name = new StringExpressionImpl(this, "name");
        this.founded = new DateTimeExpressionImpl(this, "founded");
        this.address = new ObjectExpressionImpl<org.apache.jdo.tck.pc.company.Address>(this, "address");
        this.departments = new CollectionExpressionImpl(this, "departments");
    }
}
