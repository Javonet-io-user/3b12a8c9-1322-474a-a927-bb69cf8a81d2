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
import Renci.SshNet.Security.*;
import Renci.SshNet.Compression.*;
import Renci.SshNet.*;
import jio.System.*;

public abstract class Compressor extends Algorithm implements IDisposable {
  protected NObject javonetHandle;

  public Compressor(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Dispose() {
    try {
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Init(Session session) {
    try {
      javonetHandle.invoke("Init", session);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Byte[] Compress(java.lang.Byte[] data, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("Compress", new Object[] {data});
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Byte[] Compress(
      java.lang.Byte[] data,
      java.lang.Integer offset,
      java.lang.Integer length,
      Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("Compress", new Object[] {data}, offset, length);
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Byte[] Decompress(java.lang.Byte[] data, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("Decompress", new Object[] {data});
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Byte[] Decompress(
      java.lang.Byte[] data,
      java.lang.Integer offset,
      java.lang.Integer length,
      Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("Decompress", new Object[] {data}, offset, length);
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
