package Renci.SshNet;

public enum ProxyTypes {
  None(0L),
  Socks4(1L),
  Socks5(2L),
  Http(3L),
  ;
  private long numVal;

  ProxyTypes(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
