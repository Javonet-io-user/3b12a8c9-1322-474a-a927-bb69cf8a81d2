package jio.System.Globalization;

public enum NumberStyles {
  None(0L),
  AllowLeadingWhite(1L),
  AllowTrailingWhite(2L),
  AllowLeadingSign(4L),
  Integer(7L),
  AllowTrailingSign(8L),
  AllowParentheses(16L),
  AllowDecimalPoint(32L),
  AllowThousands(64L),
  Number(111L),
  AllowExponent(128L),
  Float(167L),
  AllowCurrencySymbol(256L),
  Currency(383L),
  Any(511L),
  AllowHexSpecifier(512L),
  HexNumber(515L),
  ;
  private long numVal;

  NumberStyles(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
