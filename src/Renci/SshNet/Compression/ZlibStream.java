package Renci.SshNet.Compression;

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
import Renci.SshNet.Compression.*;
import jio.System.IO.*;

public class ZlibStream {
  protected NObject javonetHandle;

  public ZlibStream(Stream stream, CompressionMode mode) {
    try {
      javonetHandle =
          Javonet.New("Renci.SshNet.Compression.ZlibStream", stream, NEnum.fromJavaEnum(mode));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZlibStream(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Write(java.lang.Byte[] buffer, java.lang.Integer offset, java.lang.Integer count) {
    try {
      javonetHandle.invoke("Write", new Object[] {buffer}, offset, count);
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
