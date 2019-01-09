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

public class DerData {
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

  public DerData() {
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Common.DerData");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DerData(java.lang.Byte[] data) {
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Common.DerData", new Object[] {data});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DerData(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Byte[] Encode(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("Encode");
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public BigInteger ReadBigInteger() {
    try {
      Object res = javonetHandle.invoke("ReadBigInteger");
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Integer ReadInteger() {
    try {
      java.lang.Integer res = javonetHandle.invoke("ReadInteger");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void Write(java.lang.Boolean data) {
    try {
      javonetHandle.invoke("Write", data);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Write(java.lang.Long data) {
    try {
      javonetHandle.invoke("Write", data);
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

  public void Write(ObjectIdentifier identifier) {
    try {
      javonetHandle.invoke("Write", identifier);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void WriteNull() {
    try {
      javonetHandle.invoke("WriteNull");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Write(DerData data) {
    try {
      javonetHandle.invoke("Write", data);
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
