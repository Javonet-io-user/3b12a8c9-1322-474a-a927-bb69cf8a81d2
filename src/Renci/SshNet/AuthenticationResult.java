package Renci.SshNet;

public enum AuthenticationResult {
  Success(0L),
  PartialSuccess(1L),
  Failure(2L),
  ;
  private long numVal;

  AuthenticationResult(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
