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
import Renci.SshNet.*;
import jio.System.Security.Cryptography.*;
import jio.System.*;

public class HashInfo {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Integer getKeySize() {
    try {
      java.lang.Integer res = javonetHandle.get("KeySize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public FuncTTResult<java.lang.Byte[], HashAlgorithm> getHashAlgorithm() {
    try {
      Object res = javonetHandle.<NObject>get("HashAlgorithm");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public HashInfo(java.lang.Integer keySize, FuncTTResult<java.lang.Byte[], HashAlgorithm> hash) {
    try {
      javonetHandle = Javonet.New("Renci.SshNet.HashInfo", keySize, hash);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public HashInfo(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
