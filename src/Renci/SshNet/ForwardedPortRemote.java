package Renci.SshNet;

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
import Renci.SshNet.*;
import jio.System.Net.*;
import jio.System.*;

public class ForwardedPortRemote extends ForwardedPort implements IForwardedPort, IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Boolean getIsStartedAsForwardedPortRemote() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsStarted");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public IPAddress getBoundHostAddress() {
    try {
      Object res = javonetHandle.<NObject>get("BoundHostAddress");
      if (res == null) return null;
      return new IPAddress((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.String getBoundHost() {
    try {
      java.lang.String res = javonetHandle.get("BoundHost");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.Long getBoundPort() {
    try {
      java.lang.Long res = javonetHandle.get("BoundPort");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public IPAddress getHostAddress() {
    try {
      Object res = javonetHandle.<NObject>get("HostAddress");
      if (res == null) return null;
      return new IPAddress((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.String getHost() {
    try {
      java.lang.String res = javonetHandle.get("Host");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.Long getPort() {
    try {
      java.lang.Long res = javonetHandle.get("Port");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ForwardedPortRemote(
      IPAddress boundHostAddress,
      java.lang.Long boundPort,
      IPAddress hostAddress,
      java.lang.Long port) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.ForwardedPortRemote", boundHostAddress, boundPort, hostAddress, port);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ForwardedPortRemote(java.lang.Long boundPort, java.lang.String host, java.lang.Long port) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.ForwardedPortRemote", boundPort, host, port);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ForwardedPortRemote(
      java.lang.String boundHost,
      java.lang.Long boundPort,
      java.lang.String host,
      java.lang.Long port) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Renci.SshNet.ForwardedPortRemote", boundHost, boundPort, host, port);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ForwardedPortRemote(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Dispose() {
    try {
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
