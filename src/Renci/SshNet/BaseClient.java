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
import jio.System.*;
import Renci.SshNet.Common.*;

public abstract class BaseClient implements IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  public ConnectionInfo getConnectionInfo() {
    try {
      Object res = javonetHandle.<NObject>get("ConnectionInfo");
      if (res == null) return null;
      return new ConnectionInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsConnected() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsConnected");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setKeepAliveInterval(TimeSpan value) {
    try {
      javonetHandle.set("KeepAliveInterval", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public TimeSpan getKeepAliveInterval() {
    try {
      Object res = javonetHandle.<NObject>get("KeepAliveInterval");
      if (res == null) return null;
      return new TimeSpan((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public BaseClient(NObject handle) {
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
  /** Method */

  public void Connect() {
    try {
      javonetHandle.invoke("Connect");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Disconnect() {
    try {
      javonetHandle.invoke("Disconnect");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void SendKeepAlive() {
    try {
      javonetHandle.invoke("SendKeepAlive");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ExceptionEventArgs>> _ErrorOccurredListeners =
      new java.util.ArrayList<EventHandlerTEventArgs<ExceptionEventArgs>>();

  public void addErrorOccurred(EventHandlerTEventArgs<ExceptionEventArgs> toAdd) {
    _ErrorOccurredListeners.add(toAdd);
  }

  public void removeErrorOccurred(EventHandlerTEventArgs<ExceptionEventArgs> toRemove) {
    _ErrorOccurredListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<HostKeyEventArgs>> _HostKeyReceivedListeners =
      new java.util.ArrayList<EventHandlerTEventArgs<HostKeyEventArgs>>();

  public void addHostKeyReceived(EventHandlerTEventArgs<HostKeyEventArgs> toAdd) {
    _HostKeyReceivedListeners.add(toAdd);
  }

  public void removeHostKeyReceived(EventHandlerTEventArgs<HostKeyEventArgs> toRemove) {
    _HostKeyReceivedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
