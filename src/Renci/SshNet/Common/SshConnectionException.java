package Renci.SshNet.Common;

import Common.Activation;
import static Common.Helper.Convert;
import static Common.Helper.getGetObjectName;
import static Common.Helper.getReturnObjectName;
import static Common.Helper.ConvertToConcreteInterfaceImplementation;
import Common.Helper;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import Renci.SshNet.Common.*;
import Renci.SshNet.Messages.Transport.*;
import jio.System.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Runtime.InteropServices.*;

public class SshConnectionException extends SshException implements ISerializable, _Exception {
  protected NObject javonetHandle;
  /** GetProperty */
  public DisconnectReason getDisconnectReason() {
    try {
      Object res = javonetHandle.<NEnum>get("DisconnectReason");
      if (res == null) return null;
      return DisconnectReason.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public SshConnectionException() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Common.SshConnectionException");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SshConnectionException(java.lang.String message) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Common.SshConnectionException", message);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SshConnectionException(java.lang.String message, DisconnectReason disconnectReasonCode) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.Common.SshConnectionException",
              message,
              NEnum.fromJavaEnum(disconnectReasonCode));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SshConnectionException(
      java.lang.String message, DisconnectReason disconnectReasonCode, jio.System.Exception inner) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.Common.SshConnectionException",
              message,
              NEnum.fromJavaEnum(disconnectReasonCode),
              inner);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SshConnectionException(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
