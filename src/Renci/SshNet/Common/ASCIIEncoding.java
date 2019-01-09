package Renci.SshNet.Common;

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
import jio.System.Text.*;
import Renci.SshNet.Common.*;
import jio.System.*;

public class ASCIIEncoding extends Encoding implements ICloneable {
  protected NObject javonetHandle;

  public ASCIIEncoding() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Common.ASCIIEncoding");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ASCIIEncoding(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Integer GetByteCount(
      java.lang.Character[] chars, java.lang.Integer index, java.lang.Integer count) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke("GetByteCount", new Object[] {chars}, index, count);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetBytes(
      java.lang.Character[] chars,
      java.lang.Integer charIndex,
      java.lang.Integer charCount,
      java.lang.Byte[] bytes,
      java.lang.Integer byteIndex) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "GetBytes",
              new Object[] {chars},
              charIndex,
              charCount,
              new Object[] {bytes},
              byteIndex);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetCharCount(
      java.lang.Byte[] bytes, java.lang.Integer index, java.lang.Integer count) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke("GetCharCount", new Object[] {bytes}, index, count);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetChars(
      java.lang.Byte[] bytes,
      java.lang.Integer byteIndex,
      java.lang.Integer byteCount,
      java.lang.Character[] chars,
      java.lang.Integer charIndex) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "GetChars",
              new Object[] {bytes},
              byteIndex,
              byteCount,
              new Object[] {chars},
              charIndex);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetMaxByteCount(java.lang.Integer charCount) {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetMaxByteCount", charCount);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetMaxCharCount(java.lang.Integer byteCount) {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetMaxCharCount", byteCount);
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
