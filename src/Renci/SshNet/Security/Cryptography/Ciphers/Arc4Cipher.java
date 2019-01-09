package Renci.SshNet.Security.Cryptography.Ciphers;

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
import Renci.SshNet.Security.Cryptography.Ciphers.*;

public class Arc4Cipher extends StreamCipher {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Byte getMinimumSizeAsArc4Cipher() {
    try {
      java.lang.Byte res = javonetHandle.get("MinimumSize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public Arc4Cipher(java.lang.Byte[] key, java.lang.Boolean dischargeFirstBytes) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.Security.Cryptography.Ciphers.Arc4Cipher",
              new Object[] {key},
              dischargeFirstBytes);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Arc4Cipher(NObject handle) {
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
  /** Method */

  public java.lang.Byte[] Encrypt(
      java.lang.Byte[] input,
      java.lang.Integer offset,
      java.lang.Integer length,
      Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("Encrypt", new Object[] {input}, offset, length);
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Byte[] Decrypt(java.lang.Byte[] input, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("Decrypt", new Object[] {input});
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
