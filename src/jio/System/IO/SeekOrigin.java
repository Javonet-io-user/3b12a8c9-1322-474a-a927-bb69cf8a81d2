package jio.System.IO;

public enum SeekOrigin {
  Begin(0L),
  Current(1L),
  End(2L),
  ;
  private long numVal;

  SeekOrigin(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
