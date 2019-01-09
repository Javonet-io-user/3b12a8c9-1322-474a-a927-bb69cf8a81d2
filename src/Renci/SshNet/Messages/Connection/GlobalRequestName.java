package Renci.SshNet.Messages.Connection;

public enum GlobalRequestName {
  TcpIpForward(0L),
  CancelTcpIpForward(1L),
  ;
  private long numVal;

  GlobalRequestName(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
