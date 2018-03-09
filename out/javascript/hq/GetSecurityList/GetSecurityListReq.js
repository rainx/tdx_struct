// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

(function (root, factory) {
  if (typeof define === 'function' && define.amd) {
    define(['kaitai-struct/KaitaiStream'], factory);
  } else if (typeof module === 'object' && module.exports) {
    module.exports = factory(require('kaitai-struct/KaitaiStream'));
  } else {
    root.GetSecurityListReq = factory(root.KaitaiStream);
  }
}(this, function (KaitaiStream) {
var GetSecurityListReq = (function() {
  function GetSecurityListReq(_io, _parent, _root) {
    this._io = _io;
    this._parent = _parent;
    this._root = _root || this;

    this._read();
  }
  GetSecurityListReq.prototype._read = function() {
    this.magic = this._io.ensureFixedContents([12, 1, 24, 100, 1, 1, 6, 0, 6, 0, 80, 4]);
    this.market = this._io.readU2le();
    this.start = this._io.readU2le();
  }

  return GetSecurityListReq;
})();
return GetSecurityListReq;
}));
