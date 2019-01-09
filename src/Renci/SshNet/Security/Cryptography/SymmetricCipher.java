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
import Renci.SshNet.Security.Cryptography.*;

public abstract class SymmetricCipher extends Cipher {
  protected NObject javonetHandle;

  public SymmetricCipher(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Integer EncryptBlock(
      java.lang.Byte[] inputBuffer,
      java.lang.Integer inputOffset,
      java.lang.Integer inputCount,
      java.lang.Byte[] outputBuffer,
      java.lang.Integer outputOffset) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "EncryptBlock",
              new Object[] {inputBuffer},
              inputOffset,
              inputCount,
              new Object[] {outputBuffer},
              outputOffset);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer DecryptBlock(
      java.lang.Byte[] inputBuffer,
      java.lang.Integer inputOffset,
      java.lang.Integer inputCount,
      java.lang.Byte[] outputBuffer,
      java.lang.Integer outputOffset) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "DecryptBlock",
              new Object[] {inputBuffer},
              inputOffset,
              inputCount,
              new Object[] {outputBuffer},
              outputOffset);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
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
