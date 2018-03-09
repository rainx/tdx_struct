// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cc.rainx.struct.hq.getsecuritylist;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;

public class GetSecurityListReq extends KaitaiStruct {
    public static GetSecurityListReq fromFile(String fileName) throws IOException {
        return new GetSecurityListReq(new ByteBufferKaitaiStream(fileName));
    }

    public GetSecurityListReq(KaitaiStream _io) {
        this(_io, null, null);
    }

    public GetSecurityListReq(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public GetSecurityListReq(KaitaiStream _io, KaitaiStruct _parent, GetSecurityListReq _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.magic = this._io.ensureFixedContents(new byte[] { 12, 1, 24, 100, 1, 1, 6, 0, 6, 0, 80, 4 });
        this.market = this._io.readU2le();
        this.start = this._io.readU2le();
    }
    private byte[] magic;
    private int market;
    private int start;
    private GetSecurityListReq _root;
    private KaitaiStruct _parent;
    public byte[] magic() { return magic; }
    public int market() { return market; }
    public int start() { return start; }
    public GetSecurityListReq _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
