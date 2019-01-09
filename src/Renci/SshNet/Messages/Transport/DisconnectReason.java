package Renci.SshNet.Messages.Transport;

public enum DisconnectReason {
  None(0L),
  HostNotAllowedToConnect(1L),
  ProtocolError(2L),
  KeyExchangeFailed(3L),
  Reserved(4L),
  MacError(5L),
  CompressionError(6L),
  ServiceNotAvailable(7L),
  ProtocolVersionNotSupported(8L),
  HostKeyNotVerifiable(9L),
  ConnectionLost(10L),
  ByApplication(11L),
  TooManyConnections(12L),
  AuthenticationCanceledByUser(13L),
  NoMoreAuthenticationMethodsAvailable(14L),
  IllegalUserName(15L),
  ;
  private long numVal;

  DisconnectReason(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
