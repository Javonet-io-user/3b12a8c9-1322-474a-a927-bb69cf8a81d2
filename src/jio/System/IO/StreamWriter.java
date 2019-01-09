package jio.System.IO;

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
import jio.System.IO.*;
import jio.System.Text.*;
import jio.System.*;

public class StreamWriter extends TextWriter implements IDisposable {
  protected NObject javonetHandle;

  public StreamWriter(Stream stream) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.IO.StreamWriter", stream);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamWriter(Stream stream, Encoding encoding) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.IO.StreamWriter", stream, encoding);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamWriter(Stream stream, Encoding encoding, java.lang.Integer bufferSize) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.IO.StreamWriter", stream, encoding, bufferSize);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamWriter(
      Stream stream, Encoding encoding, java.lang.Integer bufferSize, java.lang.Boolean leaveOpen) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.IO.StreamWriter", stream, encoding, bufferSize, leaveOpen);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamWriter(java.lang.String path) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.IO.StreamWriter", path);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamWriter(java.lang.String path, java.lang.Boolean append) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.IO.StreamWriter", path, append);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamWriter(java.lang.String path, java.lang.Boolean append, Encoding encoding) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.IO.StreamWriter", path, append, encoding);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamWriter(
      java.lang.String path,
      java.lang.Boolean append,
      Encoding encoding,
      java.lang.Integer bufferSize) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.IO.StreamWriter", path, append, encoding, bufferSize);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamWriter(NObject handle) {
    super(handle);
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
