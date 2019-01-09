package jio.System.IO;

public enum FileAccess {
  Read(1L),
  Write(2L),
  ReadWrite(3L),
  ;
  private long numVal;

  FileAccess(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
