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

public class StreamReader extends TextReader implements IDisposable {
  protected NObject javonetHandle;

  public StreamReader(Stream stream) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.IO.StreamReader", stream);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamReader(Stream stream, java.lang.Boolean detectEncodingFromByteOrderMarks) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.IO.StreamReader", stream, detectEncodingFromByteOrderMarks);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamReader(Stream stream, Encoding encoding) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.IO.StreamReader", stream, encoding);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamReader(
      Stream stream, Encoding encoding, java.lang.Boolean detectEncodingFromByteOrderMarks) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.IO.StreamReader", stream, encoding, detectEncodingFromByteOrderMarks);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamReader(
      Stream stream,
      Encoding encoding,
      java.lang.Boolean detectEncodingFromByteOrderMarks,
      java.lang.Integer bufferSize) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.IO.StreamReader",
              stream,
              encoding,
              detectEncodingFromByteOrderMarks,
              bufferSize);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamReader(
      Stream stream,
      Encoding encoding,
      java.lang.Boolean detectEncodingFromByteOrderMarks,
      java.lang.Integer bufferSize,
      java.lang.Boolean leaveOpen) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.IO.StreamReader",
              stream,
              encoding,
              detectEncodingFromByteOrderMarks,
              bufferSize,
              leaveOpen);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamReader(java.lang.String path) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.IO.StreamReader", path);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamReader(java.lang.String path, java.lang.Boolean detectEncodingFromByteOrderMarks) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.IO.StreamReader", path, detectEncodingFromByteOrderMarks);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamReader(java.lang.String path, Encoding encoding) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.IO.StreamReader", path, encoding);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamReader(
      java.lang.String path,
      Encoding encoding,
      java.lang.Boolean detectEncodingFromByteOrderMarks) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.IO.StreamReader", path, encoding, detectEncodingFromByteOrderMarks);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamReader(
      java.lang.String path,
      Encoding encoding,
      java.lang.Boolean detectEncodingFromByteOrderMarks,
      java.lang.Integer bufferSize) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.IO.StreamReader",
              path,
              encoding,
              detectEncodingFromByteOrderMarks,
              bufferSize);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamReader(NObject handle) {
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
