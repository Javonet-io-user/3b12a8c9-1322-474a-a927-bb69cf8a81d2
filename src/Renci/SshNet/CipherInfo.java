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
import Renci.SshNet.Security.Cryptography.*;
import jio.System.*;

public class CipherInfo {
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

  public FuncT1T2TResult<java.lang.Byte[], java.lang.Byte[], Cipher> getCipher() {
    try {
      Object res = javonetHandle.<NObject>get("Cipher");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public CipherInfo(
      java.lang.Integer keySize,
      FuncT1T2TResult<java.lang.Byte[], java.lang.Byte[], Cipher> cipher) {
    try {
      javonetHandle = Javonet.New("Renci.SshNet.CipherInfo", keySize, cipher);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CipherInfo(NObject handle) {
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
