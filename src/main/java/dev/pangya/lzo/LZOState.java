package dev.pangya.lzo;

enum LZOState {
    TOP,
    TRY_MATCH,
    LITERAL,
    MATCH,
    M3_M4_LEN,
    M3_M4_OFFSET,
    LAST,
    DONE
}