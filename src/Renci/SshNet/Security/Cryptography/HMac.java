package Renci.SshNet.Security.Cryptography;

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
import jio.System.Security.Cryptography.*;
import Renci.SshNet.Security.Cryptography.*;
import jio.System.*;

public class HMac<T> extends KeyedHashAlgorithm implements IDisposable, ICryptoTransform {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setKey(java.lang.Byte[] value) {
    try {
      javonetHandle.set("Key", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Byte[] getKey(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("Key");
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GenericConstructor */

  public HMac(java.lang.Byte[] key, java.lang.Integer hashSizeValue, Class<?> T) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.getType("Renci.SshNet.Security.Cryptography.HMac`1", getReturnObjectName(T))
              .create();
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  public HMac(java.lang.Byte[] key, Class<?> T) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.getType("Renci.SshNet.Security.Cryptography.HMac`1", getReturnObjectName(T))
              .create();
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public HMac(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Initialize() {
    try {
      javonetHandle.invoke("Initialize");
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
