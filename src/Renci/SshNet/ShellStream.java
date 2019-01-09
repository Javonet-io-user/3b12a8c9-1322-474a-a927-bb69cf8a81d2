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
import jio.System.IO.*;
import Renci.SshNet.*;
import jio.System.*;
import jio.System.Text.RegularExpressions.*;
import Renci.SshNet.Common.*;

public class ShellStream extends Stream implements IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Boolean getDataAvailable() {
    try {
      java.lang.Boolean res = javonetHandle.get("DataAvailable");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getCanRead() {
    try {
      java.lang.Boolean res = javonetHandle.get("CanRead");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getCanSeek() {
    try {
      java.lang.Boolean res = javonetHandle.get("CanSeek");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getCanWrite() {
    try {
      java.lang.Boolean res = javonetHandle.get("CanWrite");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Long getLength() {
    try {
      java.lang.Long res = javonetHandle.get("Length");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setPosition(java.lang.Long value) {
    try {
      javonetHandle.set("Position", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Long getPosition() {
    try {
      java.lang.Long res = javonetHandle.get("Position");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ShellStream(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Flush() {
    try {
      javonetHandle.invoke("Flush");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer Read(
      java.lang.Byte[] buffer, java.lang.Integer offset, java.lang.Integer count) {
    try {
      java.lang.Integer res = javonetHandle.invoke("Read", new Object[] {buffer}, offset, count);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Long Seek(java.lang.Long offset, SeekOrigin origin) {
    try {
      java.lang.Long res = javonetHandle.invoke("Seek", offset, NEnum.fromJavaEnum(origin));
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void SetLength(java.lang.Long value) {
    try {
      javonetHandle.invoke("SetLength", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Write(java.lang.Byte[] buffer, java.lang.Integer offset, java.lang.Integer count) {
    try {
      javonetHandle.invoke("Write", new Object[] {buffer}, offset, count);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Expect(ExpectAction[] expectActions) {
    try {
      javonetHandle.invoke("Expect", new Object[] {expectActions});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Expect(TimeSpan timeout, ExpectAction[] expectActions) {
    try {
      javonetHandle.invoke("Expect", timeout, new Object[] {expectActions});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public IAsyncResult BeginExpect(ExpectAction[] expectActions) {
    try {
      Object res = javonetHandle.invoke("BeginExpect", new Object[] {expectActions});
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IAsyncResult BeginExpect(AsyncCallback callback, ExpectAction[] expectActions) {
    try {
      Object res = javonetHandle.invoke("BeginExpect", callback, new Object[] {expectActions});
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IAsyncResult BeginExpect(
      AsyncCallback callback, Object state, ExpectAction[] expectActions) {
    try {
      Object res =
          javonetHandle.invoke("BeginExpect", callback, state, new Object[] {expectActions});
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IAsyncResult BeginExpect(
      TimeSpan timeout, AsyncCallback callback, Object state, ExpectAction[] expectActions) {
    try {
      Object res =
          javonetHandle.invoke(
              "BeginExpect", timeout, callback, state, new Object[] {expectActions});
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.String EndExpect(IAsyncResult asyncResult) {
    try {
      java.lang.String res = javonetHandle.invoke("EndExpect", asyncResult);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String Expect(java.lang.String text) {
    try {
      java.lang.String res = javonetHandle.invoke("Expect", text);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String Expect(java.lang.String text, TimeSpan timeout) {
    try {
      java.lang.String res = javonetHandle.invoke("Expect", text, timeout);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String Expect(Regex regex) {
    try {
      java.lang.String res = javonetHandle.invoke("Expect", regex);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String Expect(Regex regex, TimeSpan timeout) {
    try {
      java.lang.String res = javonetHandle.invoke("Expect", regex, timeout);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ReadLine() {
    try {
      java.lang.String res = javonetHandle.invoke("ReadLine");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ReadLine(TimeSpan timeout) {
    try {
      java.lang.String res = javonetHandle.invoke("ReadLine", timeout);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String Read() {
    try {
      java.lang.String res = javonetHandle.invoke("Read");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void Write(java.lang.String text) {
    try {
      javonetHandle.invoke("Write", text);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void WriteLine(java.lang.String line) {
    try {
      javonetHandle.invoke("WriteLine", line);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ShellDataEventArgs>> _DataReceivedListeners =
      new java.util.ArrayList<EventHandlerTEventArgs<ShellDataEventArgs>>();

  public void addDataReceived(EventHandlerTEventArgs<ShellDataEventArgs> toAdd) {
    _DataReceivedListeners.add(toAdd);
  }

  public void removeDataReceived(EventHandlerTEventArgs<ShellDataEventArgs> toRemove) {
    _DataReceivedListeners.remove(toRemove);
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
