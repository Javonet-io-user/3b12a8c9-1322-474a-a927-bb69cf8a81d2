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

public abstract class BlockCipher extends SymmetricCipher {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Byte getMinimumSizeAsBlockCipher() {
    try {
      java.lang.Byte res = javonetHandle.get("MinimumSize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Byte getBlockSize() {
    try {
      java.lang.Byte res = javonetHandle.get("BlockSize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public BlockCipher(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Byte[] Encrypt(
      java.lang.Byte[] data,
      java.lang.Integer offset,
      java.lang.Integer length,
      Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("Encrypt", new Object[] {data}, offset, length);
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Byte[] Decrypt(java.lang.Byte[] data, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("Decrypt", new Object[] {data});
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
