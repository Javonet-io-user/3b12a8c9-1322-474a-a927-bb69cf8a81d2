package Renci.SshNet.Security;

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
import Renci.SshNet.Security.*;
import Renci.SshNet.Common.*;
import jio.System.*;

public class DsaKey extends Key implements IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  public BigInteger getP() {
    try {
      Object res = javonetHandle.<NObject>get("P");
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public BigInteger getQ() {
    try {
      Object res = javonetHandle.<NObject>get("Q");
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public BigInteger getG() {
    try {
      Object res = javonetHandle.<NObject>get("G");
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public BigInteger getY() {
    try {
      Object res = javonetHandle.<NObject>get("Y");
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public BigInteger getX() {
    try {
      Object res = javonetHandle.<NObject>get("X");
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Integer getKeyLengthAsDsaKey() {
    try {
      java.lang.Integer res = javonetHandle.get("KeyLength");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setPublicAsDsaKey(BigInteger[] value) {
    try {
      javonetHandle.set("Public", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public BigInteger[] getPublicAsDsaKey(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("Public");
      if (res == null) return null;
      return (BigInteger[]) Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public DsaKey() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Security.DsaKey");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DsaKey(java.lang.Byte[] data) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Security.DsaKey", new Object[] {data});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DsaKey(BigInteger p, BigInteger q, BigInteger g, BigInteger y, BigInteger x) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Security.DsaKey", p, q, g, y, x);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DsaKey(NObject handle) {
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
