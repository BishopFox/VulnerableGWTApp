package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QFCDSPerson extends PersistableExpressionImpl<FCDSPerson> implements PersistableExpression<FCDSPerson>
{
    public static final QFCDSPerson jdoCandidate = candidate("this");

    public static QFCDSPerson candidate(String name)
    {
        return new QFCDSPerson(null, name, 5);
    }

    public static QFCDSPerson candidate()
    {
        return jdoCandidate;
    }

    public static QFCDSPerson parameter(String name)
    {
        return new QFCDSPerson(FCDSPerson.class, name, ExpressionType.PARAMETER);
    }

    public static QFCDSPerson variable(String name)
    {
        return new QFCDSPerson(FCDSPerson.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> personid;
    public final StringExpression firstname;
    public final StringExpression lastname;
    public final StringExpression middlename;
    public final DateTimeExpression birthdate;
    public final org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSAddress address;
    public final MapExpression phoneNumbers;

    public QFCDSPerson(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.personid = new NumericExpressionImpl<Long>(this, "personid");
        this.firstname = new StringExpressionImpl(this, "firstname");
        this.lastname = new StringExpressionImpl(this, "lastname");
        this.middlename = new StringExpressionImpl(this, "middlename");
        this.birthdate = new DateTimeExpressionImpl(this, "birthdate");
        if (depth > 0)
        {
            this.address = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSAddress(this, "address", depth-1);
        }
        else
        {
            this.address = null;
        }
        this.phoneNumbers = new MapExpressionImpl(this, "phoneNumbers");
    }

    public QFCDSPerson(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.personid = new NumericExpressionImpl<Long>(this, "personid");
        this.firstname = new StringExpressionImpl(this, "firstname");
        this.lastname = new StringExpressionImpl(this, "lastname");
        this.middlename = new StringExpressionImpl(this, "middlename");
        this.birthdate = new DateTimeExpressionImpl(this, "birthdate");
        this.address = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSAddress(this, "address", 5);
        this.phoneNumbers = new MapExpressionImpl(this, "phoneNumbers");
    }
}
