
package org.telegram.api;

import org.telegram.tl.*;
import java.io.*;

import static org.telegram.tl.StreamingUtils.*;
public class TLInputPeerNotifySettings extends TLObject {

    public static final int CLASS_ID = 0x46a2ce98;

    public int getClassId() {
        return CLASS_ID;
    }


    protected int muteUntil;

    protected String sound;

    protected boolean showPreviews;

    protected int eventsMask;


    public int getMuteUntil() {
        return muteUntil;
    }

    public void setMuteUntil(int value) {
        this.muteUntil = value;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String value) {
        this.sound = value;
    }

    public boolean getShowPreviews() {
        return showPreviews;
    }

    public void setShowPreviews(boolean value) {
        this.showPreviews = value;
    }

    public int getEventsMask() {
        return eventsMask;
    }

    public void setEventsMask(int value) {
        this.eventsMask = value;
    }


    @Override
    public void serializeBody(OutputStream stream) throws IOException {

        writeInt(this.muteUntil, stream);
        writeTLString(this.sound, stream);
        writeTLBool(this.showPreviews, stream);
        writeInt(this.eventsMask, stream);
    }


    @Override
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {

        this.muteUntil = readInt(stream);
        this.sound = readTLString(stream);
        this.showPreviews = readTLBool(stream);
        this.eventsMask = readInt(stream);
    }

}
