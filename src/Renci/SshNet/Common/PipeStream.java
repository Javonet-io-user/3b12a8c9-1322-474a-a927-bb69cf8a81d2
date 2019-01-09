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
import jio.System.IO.*;
import Renci.SshNet.Common.*;
import jio.System.*;

public class PipeStream extends Stream implements IDisposable {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setMaxBufferLength(java.lang.Long value) {
    try {
      javonetHandle.set("MaxBufferLength", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Long getMaxBufferLength() {
    try {
      java.lang.Long res = javonetHandle.get("MaxBufferLength");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setBlockLastReadBuffer(java.lang.Boolean value) {
    try {
      javonetHandle.set("BlockLastReadBuffer", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBlockLastReadBuffer() {
    try {
      java.lang.Boolean res = javonetHandle.get("BlockLastReadBuffer");
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

  public PipeStream() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Common.PipeStream");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PipeStream(NObject handle) {
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

  public void Write(java.lang.Byte[] buffer, java.lang.Integer offset, java.lang.Integer count) {
    try {
      javonetHandle.invoke("Write", new Object[] {buffer}, offset, count);
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
