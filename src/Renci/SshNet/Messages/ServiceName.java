package Renci.SshNet.Messages;

public enum ServiceName {
  UserAuthentication(0L),
  Connection(1L),
  ;
  private long numVal;

  ServiceName(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
