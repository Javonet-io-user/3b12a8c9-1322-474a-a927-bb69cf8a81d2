package Renci.SshNet;

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
import Renci.SshNet.*;
import jio.System.Collections.Generic.*;
import jio.System.*;

public class PrivateKeyConnectionInfo extends ConnectionInfo implements IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  public ICollection<PrivateKeyFile> getKeyFiles() {
    try {
      Object res = javonetHandle.<NObject>get("KeyFiles");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public PrivateKeyConnectionInfo(
      java.lang.String host, java.lang.String username, PrivateKeyFile[] keyFiles) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.PrivateKeyConnectionInfo", host, username, new Object[] {keyFiles});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PrivateKeyConnectionInfo(
      java.lang.String host,
      java.lang.Integer port,
      java.lang.String username,
      PrivateKeyFile[] keyFiles) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.PrivateKeyConnectionInfo",
              host,
              port,
              username,
              new Object[] {keyFiles});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PrivateKeyConnectionInfo(
      java.lang.String host,
      java.lang.Integer port,
      java.lang.String username,
      ProxyTypes proxyType,
      java.lang.String proxyHost,
      java.lang.Integer proxyPort,
      PrivateKeyFile[] keyFiles) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.PrivateKeyConnectionInfo",
              host,
              port,
              username,
              NEnum.fromJavaEnum(proxyType),
              proxyHost,
              proxyPort,
              new Object[] {keyFiles});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PrivateKeyConnectionInfo(
      java.lang.String host,
      java.lang.Integer port,
      java.lang.String username,
      ProxyTypes proxyType,
      java.lang.String proxyHost,
      java.lang.Integer proxyPort,
      java.lang.String proxyUsername,
      PrivateKeyFile[] keyFiles) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.PrivateKeyConnectionInfo",
              host,
              port,
              username,
              NEnum.fromJavaEnum(proxyType),
              proxyHost,
              proxyPort,
              proxyUsername,
              new Object[] {keyFiles});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PrivateKeyConnectionInfo(
      java.lang.String host,
      java.lang.String username,
      ProxyTypes proxyType,
      java.lang.String proxyHost,
      java.lang.Integer proxyPort,
      PrivateKeyFile[] keyFiles) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.PrivateKeyConnectionInfo",
              host,
              username,
              NEnum.fromJavaEnum(proxyType),
              proxyHost,
              proxyPort,
              new Object[] {keyFiles});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PrivateKeyConnectionInfo(
      java.lang.String host,
      java.lang.String username,
      ProxyTypes proxyType,
      java.lang.String proxyHost,
      java.lang.Integer proxyPort,
      java.lang.String proxyUsername,
      PrivateKeyFile[] keyFiles) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.PrivateKeyConnectionInfo",
              host,
              username,
              NEnum.fromJavaEnum(proxyType),
              proxyHost,
              proxyPort,
              proxyUsername,
              new Object[] {keyFiles});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PrivateKeyConnectionInfo(
      java.lang.String host,
      java.lang.String username,
      ProxyTypes proxyType,
      java.lang.String proxyHost,
      java.lang.Integer proxyPort,
      java.lang.String proxyUsername,
      java.lang.String proxyPassword,
      PrivateKeyFile[] keyFiles) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.PrivateKeyConnectionInfo",
              host,
              username,
              NEnum.fromJavaEnum(proxyType),
              proxyHost,
              proxyPort,
              proxyUsername,
              proxyPassword,
              new Object[] {keyFiles});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PrivateKeyConnectionInfo(
      java.lang.String host,
      java.lang.Integer port,
      java.lang.String username,
      ProxyTypes proxyType,
      java.lang.String proxyHost,
      java.lang.Integer proxyPort,
      java.lang.String proxyUsername,
      java.lang.String proxyPassword,
      PrivateKeyFile[] keyFiles) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.PrivateKeyConnectionInfo",
              host,
              port,
              username,
              NEnum.fromJavaEnum(proxyType),
              proxyHost,
              proxyPort,
              proxyUsername,
              proxyPassword,
              new Object[] {keyFiles});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PrivateKeyConnectionInfo(NObject handle) {
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
