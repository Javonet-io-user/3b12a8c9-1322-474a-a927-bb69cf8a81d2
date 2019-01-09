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

public class Shell implements IDisposable {
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

  public Shell(NObject handle) {
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
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<EventArgs>> _StartingListeners =
      new java.util.ArrayList<EventHandlerTEventArgs<EventArgs>>();

  public void addStarting(EventHandlerTEventArgs<EventArgs> toAdd) {
    _StartingListeners.add(toAdd);
  }

  public void removeStarting(EventHandlerTEventArgs<EventArgs> toRemove) {
    _StartingListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<EventArgs>> _StartedListeners =
      new java.util.ArrayList<EventHandlerTEventArgs<EventArgs>>();

  public void addStarted(EventHandlerTEventArgs<EventArgs> toAdd) {
    _StartedListeners.add(toAdd);
  }

  public void removeStarted(EventHandlerTEventArgs<EventArgs> toRemove) {
    _StartedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<EventArgs>> _StoppingListeners =
      new java.util.ArrayList<EventHandlerTEventArgs<EventArgs>>();

  public void addStopping(EventHandlerTEventArgs<EventArgs> toAdd) {
    _StoppingListeners.add(toAdd);
  }

  public void removeStopping(EventHandlerTEventArgs<EventArgs> toRemove) {
    _StoppingListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<EventArgs>> _StoppedListeners =
      new java.util.ArrayList<EventHandlerTEventArgs<EventArgs>>();

  public void addStopped(EventHandlerTEventArgs<EventArgs> toAdd) {
    _StoppedListeners.add(toAdd);
  }

  public void removeStopped(EventHandlerTEventArgs<EventArgs> toRemove) {
    _StoppedListeners.remove(toRemove);
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
