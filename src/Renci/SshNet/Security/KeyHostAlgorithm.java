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

public class KeyHostAlgorithm extends HostAlgorithm {
  protected NObject javonetHandle;
  /** GetProperty */
  public Key getKey() {
    try {
      Object res = javonetHandle.<NObject>get("Key");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Byte[] getDataAsKeyHostAlgorithm(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("Data");
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public KeyHostAlgorithm(java.lang.String name, Key key) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Security.KeyHostAlgorithm", name, key);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public KeyHostAlgorithm(java.lang.String name, Key key, java.lang.Byte[] data) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Renci.SshNet.Security.KeyHostAlgorithm", name, key, new Object[] {data});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public KeyHostAlgorithm(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Byte[] Sign(java.lang.Byte[] data, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("Sign", new Object[] {data});
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean VerifySignature(java.lang.Byte[] data, java.lang.Byte[] signature) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke("VerifySignature", new Object[] {data}, new Object[] {signature});
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
