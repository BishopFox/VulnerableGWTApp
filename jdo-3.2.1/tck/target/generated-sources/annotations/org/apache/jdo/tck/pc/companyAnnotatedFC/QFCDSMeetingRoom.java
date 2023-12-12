package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QFCDSMeetingRoom extends PersistableExpressionImpl<FCDSMeetingRoom> implements PersistableExpression<FCDSMeetingRoom>
{
    public static final QFCDSMeetingRoom jdoCandidate = candidate("this");

    public static QFCDSMeetingRoom candidate(String name)
    {
        return new QFCDSMeetingRoom(null, name, 5);
    }

    public static QFCDSMeetingRoom candidate()
    {
        return jdoCandidate;
    }

    public static QFCDSMeetingRoom parameter(String name)
    {
        return new QFCDSMeetingRoom(FCDSMeetingRoom.class, name, ExpressionType.PARAMETER);
    }

    public static QFCDSMeetingRoom variable(String name)
    {
        return new QFCDSMeetingRoom(FCDSMeetingRoom.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> roomid;
    public final StringExpression name;

    public QFCDSMeetingRoom(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.roomid = new NumericExpressionImpl<Long>(this, "roomid");
        this.name = new StringExpressionImpl(this, "name");
    }

    public QFCDSMeetingRoom(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.roomid = new NumericExpressionImpl<Long>(this, "roomid");
        this.name = new StringExpressionImpl(this, "name");
    }
}
