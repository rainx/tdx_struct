// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

(function (root, factory) {
  if (typeof define === 'function' && define.amd) {
    define(['kaitai-struct/KaitaiStream'], factory);
  } else if (typeof module === 'object' && module.exports) {
    module.exports = factory(require('kaitai-struct/KaitaiStream'));
  } else {
    root.GetSecurityListRespBody = factory(root.KaitaiStream);
  }
}(this, function (KaitaiStream) {
var GetSecurityListRespBody = (function() {
  function GetSecurityListRespBody(_io, _parent, _root) {
    this._io = _io;
    this._parent = _parent;
    this._root = _root || this;

    this._read();
  }
  GetSecurityListRespBody.prototype._read = function() {
    this.num = this._io.readU2le();
    this.securityList = new Array(this.num);
    for (var i = 0; i < this.num; i++) {
      this.securityList[i] = new SecurityListEntry(this._io, this, this._root);
    }
  }

  var SecurityListEntry = GetSecurityListRespBody.SecurityListEntry = (function() {
    function SecurityListEntry(_io, _parent, _root) {
      this._io = _io;
      this._parent = _parent;
      this._root = _root || this;

      this._read();
    }
    SecurityListEntry.prototype._read = function() {
      this.code = KaitaiStream.bytesToStr(this._io.readBytes(6), "GBK");
      this.volUnit = this._io.readU2le();
      this.name = KaitaiStream.bytesToStr(this._io.readBytes(8), "GBK");
      this.notUsed1Skip4 = this._io.readBytes(4);
      this.decimalPoint = this._io.readU1();
      this.preClose = this._io.readF4le();
      this.notUsed2Skip4 = this._io.readS4le();
    }

    return SecurityListEntry;
  })();

  return GetSecurityListRespBody;
})();
return GetSecurityListRespBody;
}));
