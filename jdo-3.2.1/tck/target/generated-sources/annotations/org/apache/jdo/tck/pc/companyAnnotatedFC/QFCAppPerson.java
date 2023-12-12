package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QFCAppPerson extends PersistableExpressionImpl<FCAppPerson> implements PersistableExpression<FCAppPerson>
{
    public static final QFCAppPerson jdoCandidate = candidate("this");

    public static QFCAppPerson candidate(String name)
    {
        return new QFCAppPerson(null, name, 5);
    }

    public static QFCAppPerson candidate()
    {
        return jdoCandidate;
    }

    public static QFCAppPerson parameter(String name)
    {
        return new QFCAppPerson(FCAppPerson.class, name, ExpressionType.PARAMETER);
    }

    public static QFCAppPerson variable(String name)
    {
        return new QFCAppPerson(FCAppPerson.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> personid;
    public final StringExpression firstname;
    public final StringExpression lastname;
    public final StringExpression middlename;
    public final DateTimeExpression birthdate;
    public final org.apache.jdo.tck.pc.companyAnnotatedFC.QFCAppAddress address;
    public final MapExpression phoneNumbers;

    public QFCAppPerson(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.personid = new NumericExpressionImpl<Long>(this, "personid");
        this.firstname = new StringExpressionImpl(this, "firstname");
        this.lastname = new StringExpressionImpl(this, "lastname");
        this.middlename = new StringExpressionImpl(this, "middlename");
        this.birthdate = new DateTimeExpressionImpl(this, "birthdate");
        if (depth > 0)
        {
            this.address = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCAppAddress(this, "address", depth-1);
        }
        else
        {
            this.address = null;
        }
        this.phoneNumbers = new MapExpressionImpl(this, "phoneNumbers");
    }

    public QFCAppPerson(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.personid = new NumericExpressionImpl<Long>(this, "personid");
        this.firstname = new StringExpressionImpl(this, "firstname");
        this.lastname = new StringExpressionImpl(this, "lastname");
        this.middlename = new StringExpressionImpl(this, "middlename");
        this.birthdate = new DateTimeExpressionImpl(this, "birthdate");
        this.address = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCAppAddress(this, "address", 5);
        this.phoneNumbers = new MapExpressionImpl(this, "phoneNumbers");
    }
}
