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
import jio.System.Text.*;
import jio.System.*;

public class SshDataStream extends MemoryStream implements IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Boolean getIsEndOfData() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsEndOfData");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public SshDataStream(java.lang.Integer capacity) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Common.SshDataStream", capacity);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SshDataStream(java.lang.Byte[] buffer) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Common.SshDataStream", new Object[] {buffer});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SshDataStream(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Write(java.lang.Long value) {
    try {
      javonetHandle.invoke("Write", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Write(java.math.BigInteger value) {
    try {
      javonetHandle.invoke("Write", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Write(BigInteger data) {
    try {
      javonetHandle.invoke("Write", data);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Write(java.lang.Byte[] data) {
    try {
      javonetHandle.invoke("Write", new Object[] {data});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Byte[] ReadBinary(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("ReadBinary");
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void WriteBinary(java.lang.Byte[] buffer) {
    try {
      javonetHandle.invoke("WriteBinary", new Object[] {buffer});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void WriteBinary(
      java.lang.Byte[] buffer, java.lang.Integer offset, java.lang.Integer count) {
    try {
      javonetHandle.invoke("WriteBinary", new Object[] {buffer}, offset, count);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Write(java.lang.String s, Encoding encoding) {
    try {
      javonetHandle.invoke("Write", s, encoding);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public BigInteger ReadBigInt() {
    try {
      Object res = javonetHandle.invoke("ReadBigInt");
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Long ReadUInt32() {
    try {
      java.lang.Long res = javonetHandle.invoke("ReadUInt32");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.math.BigInteger ReadUInt64() {
    try {
      java.math.BigInteger res = javonetHandle.invoke("ReadUInt64");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.String ReadString(Encoding encoding) {
    try {
      java.lang.String res = javonetHandle.invoke("ReadString", encoding);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.Byte[] ToArray(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("ToArray");
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
