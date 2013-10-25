
package org.telegram.api;


import org.telegram.tl.*;
import java.io.*;

import static org.telegram.tl.StreamingUtils.*;

public class TLInputEncryptedFileUploaded extends TLAbsInputEncryptedFile {
    public static final int CLASS_ID = 0x64bd0306;

    public int getClassId() {
        return CLASS_ID;
    }


    protected long id;

    protected int parts;

    protected String md5Checksum;

    protected int keyFingerprint;


    public long getId() {
        return id;
    }

    public void setId(long value) {
        this.id = value;
    }

    public int getParts() {
        return parts;
    }

    public void setParts(int value) {
        this.parts = value;
    }

    public String getMd5Checksum() {
        return md5Checksum;
    }

    public void setMd5Checksum(String value) {
        this.md5Checksum = value;
    }

    public int getKeyFingerprint() {
        return keyFingerprint;
    }

    public void setKeyFingerprint(int value) {
        this.keyFingerprint = value;
    }


    @Override
    public void serializeBody(OutputStream stream) throws IOException {

        writeLong(this.id, stream);
        writeInt(this.parts, stream);
        writeTLString(this.md5Checksum, stream);
        writeInt(this.keyFingerprint, stream);
    }


    @Override
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {

        this.id = readLong(stream);
        this.parts = readInt(stream);
        this.md5Checksum = readTLString(stream);
        this.keyFingerprint = readInt(stream);
    }

}
