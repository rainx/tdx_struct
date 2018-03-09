// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cc.rainx.struct.hq.getsecuritylist;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.ArrayList;
import java.nio.charset.Charset;

public class GetSecurityListRespBody extends KaitaiStruct {
    public static GetSecurityListRespBody fromFile(String fileName) throws IOException {
        return new GetSecurityListRespBody(new ByteBufferKaitaiStream(fileName));
    }

    public GetSecurityListRespBody(KaitaiStream _io) {
        this(_io, null, null);
    }

    public GetSecurityListRespBody(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public GetSecurityListRespBody(KaitaiStream _io, KaitaiStruct _parent, GetSecurityListRespBody _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.num = this._io.readU2le();
        securityList = new ArrayList<SecurityListEntry>((int) (num()));
        for (int i = 0; i < num(); i++) {
            this.securityList.add(new SecurityListEntry(this._io, this, _root));
        }
    }
    public static class SecurityListEntry extends KaitaiStruct {
        public static SecurityListEntry fromFile(String fileName) throws IOException {
            return new SecurityListEntry(new ByteBufferKaitaiStream(fileName));
        }

        public SecurityListEntry(KaitaiStream _io) {
            this(_io, null, null);
        }

        public SecurityListEntry(KaitaiStream _io, GetSecurityListRespBody _parent) {
            this(_io, _parent, null);
        }

        public SecurityListEntry(KaitaiStream _io, GetSecurityListRespBody _parent, GetSecurityListRespBody _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.code = new String(this._io.readBytes(6), Charset.forName("GBK"));
            this.volUnit = this._io.readU2le();
            this.name = new String(this._io.readBytes(8), Charset.forName("GBK"));
            this.notUsed1Skip4 = this._io.readBytes(4);
            this.decimalPoint = this._io.readU1();
            this.preClose = this._io.readF4le();
            this.notUsed2Skip4 = this._io.readS4le();
        }
        private String code;
        private int volUnit;
        private String name;
        private byte[] notUsed1Skip4;
        private int decimalPoint;
        private float preClose;
        private int notUsed2Skip4;
        private GetSecurityListRespBody _root;
        private GetSecurityListRespBody _parent;
        public String code() { return code; }
        public int volUnit() { return volUnit; }
        public String name() { return name; }
        public byte[] notUsed1Skip4() { return notUsed1Skip4; }
        public int decimalPoint() { return decimalPoint; }
        public float preClose() { return preClose; }
        public int notUsed2Skip4() { return notUsed2Skip4; }
        public GetSecurityListRespBody _root() { return _root; }
        public GetSecurityListRespBody _parent() { return _parent; }
    }
    private int num;
    private ArrayList<SecurityListEntry> securityList;
    private GetSecurityListRespBody _root;
    private KaitaiStruct _parent;
    public int num() { return num; }
    public ArrayList<SecurityListEntry> securityList() { return securityList; }
    public GetSecurityListRespBody _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
