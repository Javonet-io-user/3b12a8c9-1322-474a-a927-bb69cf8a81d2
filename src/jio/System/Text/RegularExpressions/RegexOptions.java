package jio.System.Text.RegularExpressions;

public enum RegexOptions {
  None(0L),
  IgnoreCase(1L),
  Multiline(2L),
  ExplicitCapture(4L),
  Compiled(8L),
  Singleline(16L),
  IgnorePatternWhitespace(32L),
  RightToLeft(64L),
  ECMAScript(256L),
  CultureInvariant(512L),
  ;
  private long numVal;

  RegexOptions(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
