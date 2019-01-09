package Renci.SshNet.Security.Cryptography.Ciphers.Paddings;

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
import Renci.SshNet.Security.Cryptography.Ciphers.*;
import Renci.SshNet.Security.Cryptography.Ciphers.Paddings.*;

public class PKCS7Padding extends CipherPadding {
  protected NObject javonetHandle;

  public PKCS7Padding() {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Renci.SshNet.Security.Cryptography.Ciphers.Paddings.PKCS7Padding");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PKCS7Padding(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Byte[] Pad(
      java.lang.Integer blockSize, java.lang.Byte[] input, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("Pad", blockSize, new Object[] {input});
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Byte[] Pad(
      java.lang.Byte[] input, java.lang.Integer length, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("Pad", new Object[] {input}, length);
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
