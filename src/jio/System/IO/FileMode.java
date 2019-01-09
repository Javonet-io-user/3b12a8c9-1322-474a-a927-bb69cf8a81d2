package jio.System.IO;

public enum FileMode {
  CreateNew(1L),
  Create(2L),
  Open(3L),
  OpenOrCreate(4L),
  Truncate(5L),
  Append(6L),
  ;
  private long numVal;

  FileMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
