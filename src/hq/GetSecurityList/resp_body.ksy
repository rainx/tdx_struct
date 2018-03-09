meta:
  - id: get_security_list_resp_body
    endian: le
seq:
  - id: num
    type: u2
  - id: security_list
    type: security_list_entry
    repeat: expr
    repeat-expr: num
types:
  security_list_entry:
    seq:
      - id: code
        size: 6
        type: str
        encoding: GBK
      - id: vol_unit
        type: u2
      - id: name
        type: str
        encoding: GBK
        size: 8
      - id: not_used_1_skip4
        size: 4
      - id: decimal_point
        type: u1
      - id: pre_close
        type: float
      - id: not_used_2_skip4
        type: s4
