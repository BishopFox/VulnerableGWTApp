package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QFCAppMeetingRoom extends PersistableExpressionImpl<FCAppMeetingRoom> implements PersistableExpression<FCAppMeetingRoom>
{
    public static final QFCAppMeetingRoom jdoCandidate = candidate("this");

    public static QFCAppMeetingRoom candidate(String name)
    {
        return new QFCAppMeetingRoom(null, name, 5);
    }

    public static QFCAppMeetingRoom candidate()
    {
        return jdoCandidate;
    }

    public static QFCAppMeetingRoom parameter(String name)
    {
        return new QFCAppMeetingRoom(FCAppMeetingRoom.class, name, ExpressionType.PARAMETER);
    }

    public static QFCAppMeetingRoom variable(String name)
    {
        return new QFCAppMeetingRoom(FCAppMeetingRoom.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> roomid;
    public final StringExpression name;

    public QFCAppMeetingRoom(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.roomid = new NumericExpressionImpl<Long>(this, "roomid");
        this.name = new StringExpressionImpl(this, "name");
    }

    public QFCAppMeetingRoom(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.roomid = new NumericExpressionImpl<Long>(this, "roomid");
        this.name = new StringExpressionImpl(this, "name");
    }
}
