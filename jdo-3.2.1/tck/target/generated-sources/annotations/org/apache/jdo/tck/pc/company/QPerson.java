package org.apache.jdo.tck.pc.company;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPerson extends PersistableExpressionImpl<Person> implements PersistableExpression<Person>
{
    public static final QPerson jdoCandidate = candidate("this");

    public static QPerson candidate(String name)
    {
        return new QPerson(null, name, 5);
    }

    public static QPerson candidate()
    {
        return jdoCandidate;
    }

    public static QPerson parameter(String name)
    {
        return new QPerson(Person.class, name, ExpressionType.PARAMETER);
    }

    public static QPerson variable(String name)
    {
        return new QPerson(Person.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> personid;
    public final StringExpression firstname;
    public final StringExpression lastname;
    public final StringExpression middlename;
    public final DateTimeExpression birthdate;
    public final ObjectExpression<org.apache.jdo.tck.pc.company.Address> address;
    public final MapExpression phoneNumbers;

    public QPerson(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.personid = new NumericExpressionImpl<Long>(this, "personid");
        this.firstname = new StringExpressionImpl(this, "firstname");
        this.lastname = new StringExpressionImpl(this, "lastname");
        this.middlename = new StringExpressionImpl(this, "middlename");
        this.birthdate = new DateTimeExpressionImpl(this, "birthdate");
        this.address = new ObjectExpressionImpl<org.apache.jdo.tck.pc.company.Address>(this, "address");
        this.phoneNumbers = new MapExpressionImpl(this, "phoneNumbers");
    }

    public QPerson(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.personid = new NumericExpressionImpl<Long>(this, "personid");
        this.firstname = new StringExpressionImpl(this, "firstname");
        this.lastname = new StringExpressionImpl(this, "lastname");
        this.middlename = new StringExpressionImpl(this, "middlename");
        this.birthdate = new DateTimeExpressionImpl(this, "birthdate");
        this.address = new ObjectExpressionImpl<org.apache.jdo.tck.pc.company.Address>(this, "address");
        this.phoneNumbers = new MapExpressionImpl(this, "phoneNumbers");
    }
}
