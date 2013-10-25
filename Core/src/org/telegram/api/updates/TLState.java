
package org.telegram.api.updates;

import org.telegram.tl.*;
import java.io.*;

import static org.telegram.tl.StreamingUtils.*;
public class TLState extends TLObject {

    public static final int CLASS_ID = 0xa56c2a3e;

    public int getClassId() {
        return CLASS_ID;
    }


    protected int pts;

    protected int qts;

    protected int date;

    protected int seq;

    protected int unreadCount;


    public int getPts() {
        return pts;
    }

    public void setPts(int value) {
        this.pts = value;
    }

    public int getQts() {
        return qts;
    }

    public void setQts(int value) {
        this.qts = value;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int value) {
        this.date = value;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int value) {
        this.seq = value;
    }

    public int getUnreadCount() {
        return unreadCount;
    }

    public void setUnreadCount(int value) {
        this.unreadCount = value;
    }


    @Override
    public void serializeBody(OutputStream stream) throws IOException {

        writeInt(this.pts, stream);
        writeInt(this.qts, stream);
        writeInt(this.date, stream);
        writeInt(this.seq, stream);
        writeInt(this.unreadCount, stream);
    }


    @Override
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {

        this.pts = readInt(stream);
        this.qts = readInt(stream);
        this.date = readInt(stream);
        this.seq = readInt(stream);
        this.unreadCount = readInt(stream);
    }

}
