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
import jio.System.*;
import jio.System.Threading.*;

public abstract class AsyncResult implements IAsyncResult {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Boolean getEndInvokeCalled() {
    try {
      java.lang.Boolean res = javonetHandle.get("EndInvokeCalled");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public Object getAsyncState() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.IAsyncResult").invoke("get_AsyncState");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getCompletedSynchronously() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.IAsyncResult")
              .invoke("get_CompletedSynchronously");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public WaitHandle getAsyncWaitHandle() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.IAsyncResult").invoke("get_AsyncWaitHandle");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsCompleted() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("jio.System.IAsyncResult").invoke("get_IsCompleted");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public AsyncResult(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void SetAsCompleted(
      jio.System.Exception exception, java.lang.Boolean completedSynchronously) {
    try {
      javonetHandle.invoke("SetAsCompleted", exception, completedSynchronously);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void EndInvoke() {
    try {
      javonetHandle.invoke("EndInvoke");
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
