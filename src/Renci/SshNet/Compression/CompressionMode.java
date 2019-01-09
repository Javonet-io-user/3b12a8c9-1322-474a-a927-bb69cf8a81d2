package Renci.SshNet.Compression;

public enum CompressionMode {
  Compress(0L),
  Decompress(1L),
  ;
  private long numVal;

  CompressionMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
