package Renci.SshNet.Security;

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
import Renci.SshNet.*;
import Renci.SshNet.Messages.Transport.*;
import Renci.SshNet.Security.Cryptography.*;
import jio.System.Security.Cryptography.*;
import Renci.SshNet.Compression.*;
import Renci.SshNet.Common.*;
import jio.System.*;

public abstract class KeyExchange extends Algorithm implements IKeyExchange, IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  public BigInteger getSharedKey() {
    try {
      Object res = javonetHandle.<NObject>get("SharedKey");
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Byte[] getExchangeHash(Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Renci.SshNet.Security.IKeyExchange")
              .invoke("get_ExchangeHash");
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public KeyExchange(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Start(Session session, KeyExchangeInitMessage message) {
    try {
      javonetHandle
          .explicitInterface("Renci.SshNet.Security.IKeyExchange")
          .invoke("Start", session, message);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Finish() {
    try {
      javonetHandle.explicitInterface("Renci.SshNet.Security.IKeyExchange").invoke("Finish");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public Cipher CreateClientCipher() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Renci.SshNet.Security.IKeyExchange")
              .invoke("CreateClientCipher");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Cipher CreateServerCipher() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Renci.SshNet.Security.IKeyExchange")
              .invoke("CreateServerCipher");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public HashAlgorithm CreateServerHash() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Renci.SshNet.Security.IKeyExchange")
              .invoke("CreateServerHash");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public HashAlgorithm CreateClientHash() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Renci.SshNet.Security.IKeyExchange")
              .invoke("CreateClientHash");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Compressor CreateCompressor() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Renci.SshNet.Security.IKeyExchange")
              .invoke("CreateCompressor");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Compressor CreateDecompressor() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Renci.SshNet.Security.IKeyExchange")
              .invoke("CreateDecompressor");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Dispose() {
    try {
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<HostKeyEventArgs>> _HostKeyReceivedListeners =
      new java.util.ArrayList<EventHandlerTEventArgs<HostKeyEventArgs>>();

  public void addHostKeyReceived(EventHandlerTEventArgs<HostKeyEventArgs> toAdd) {
    _HostKeyReceivedListeners.add(toAdd);
  }

  public void removeHostKeyReceived(EventHandlerTEventArgs<HostKeyEventArgs> toRemove) {
    _HostKeyReceivedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
