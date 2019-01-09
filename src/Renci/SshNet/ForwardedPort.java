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
import Renci.SshNet.Common.*;
import jio.System.*;

public abstract class ForwardedPort implements IForwardedPort {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Boolean getIsStarted() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsStarted");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public ForwardedPort(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Start() {
    try {
      javonetHandle.invoke("Start");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Stop() {
    try {
      javonetHandle.invoke("Stop");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void add_Closing(EventHandler value) {
    try {
      javonetHandle.explicitInterface("Renci.SshNet.IForwardedPort").invoke("add_Closing", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void remove_Closing(EventHandler value) {
    try {
      javonetHandle
          .explicitInterface("Renci.SshNet.IForwardedPort")
          .invoke("remove_Closing", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ExceptionEventArgs>> _ExceptionListeners =
      new java.util.ArrayList<EventHandlerTEventArgs<ExceptionEventArgs>>();

  public void addException(EventHandlerTEventArgs<ExceptionEventArgs> toAdd) {
    _ExceptionListeners.add(toAdd);
  }

  public void removeException(EventHandlerTEventArgs<ExceptionEventArgs> toRemove) {
    _ExceptionListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<PortForwardEventArgs>>
      _RequestReceivedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<PortForwardEventArgs>>();

  public void addRequestReceived(EventHandlerTEventArgs<PortForwardEventArgs> toAdd) {
    _RequestReceivedListeners.add(toAdd);
  }

  public void removeRequestReceived(EventHandlerTEventArgs<PortForwardEventArgs> toRemove) {
    _RequestReceivedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
