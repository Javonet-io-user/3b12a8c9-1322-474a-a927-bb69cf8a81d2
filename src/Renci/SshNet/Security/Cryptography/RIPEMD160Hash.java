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

public class RIPEMD160Hash extends HashAlgorithm implements IDisposable, ICryptoTransform {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Integer getHashSize() {
    try {
      java.lang.Integer res = javonetHandle.get("HashSize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Integer getInputBlockSize() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("jio.System.Security.Cryptography.ICryptoTransform")
              .invoke("get_InputBlockSize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Integer getOutputBlockSize() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("jio.System.Security.Cryptography.ICryptoTransform")
              .invoke("get_OutputBlockSize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getCanReuseTransform() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Security.Cryptography.ICryptoTransform")
              .invoke("get_CanReuseTransform");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getCanTransformMultipleBlocks() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Security.Cryptography.ICryptoTransform")
              .invoke("get_CanTransformMultipleBlocks");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public RIPEMD160Hash() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Security.Cryptography.RIPEMD160Hash");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RIPEMD160Hash(NObject handle) {
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
