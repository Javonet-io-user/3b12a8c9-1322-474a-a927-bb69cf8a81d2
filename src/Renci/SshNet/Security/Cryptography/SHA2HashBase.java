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

public abstract class SHA2HashBase extends HashAlgorithm implements IDisposable, ICryptoTransform {
  protected NObject javonetHandle;
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

  public SHA2HashBase(NObject handle) {
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
