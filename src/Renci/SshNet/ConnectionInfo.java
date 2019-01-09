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
import jio.System.*;
import jio.System.Collections.Generic.*;
import Renci.SshNet.Security.*;
import Renci.SshNet.Messages.Connection.*;
import jio.System.Text.*;
import Renci.SshNet.Common.*;

public class ConnectionInfo {
  protected NObject javonetHandle;
  /** GetProperty */
  public IDictionary<java.lang.String, jio.System.Type> getKeyExchangeAlgorithms() {
    try {
      Object res = javonetHandle.<NObject>get("KeyExchangeAlgorithms");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public IDictionary<java.lang.String, CipherInfo> getEncryptions() {
    try {
      Object res = javonetHandle.<NObject>get("Encryptions");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public IDictionary<java.lang.String, HashInfo> getHmacAlgorithms() {
    try {
      Object res = javonetHandle.<NObject>get("HmacAlgorithms");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public IDictionary<java.lang.String, FuncTTResult<java.lang.Byte[], KeyHostAlgorithm>>
      getHostKeyAlgorithms() {
    try {
      Object res = javonetHandle.<NObject>get("HostKeyAlgorithms");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public IEnumerable<AuthenticationMethod> getAuthenticationMethods() {
    try {
      Object res = javonetHandle.<NObject>get("AuthenticationMethods");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public IDictionary<java.lang.String, jio.System.Type> getCompressionAlgorithms() {
    try {
      Object res = javonetHandle.<NObject>get("CompressionAlgorithms");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public IDictionary<java.lang.String, RequestInfo> getChannelRequests() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Renci.SshNet.IConnectionInfo")
              .invoke("get_ChannelRequests");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsAuthenticated() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsAuthenticated");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.String getHost() {
    try {
      java.lang.String res = javonetHandle.get("Host");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.Integer getPort() {
    try {
      java.lang.Integer res = javonetHandle.get("Port");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.String getUsername() {
    try {
      java.lang.String res = javonetHandle.get("Username");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public ProxyTypes getProxyType() {
    try {
      Object res = javonetHandle.<NEnum>get("ProxyType");
      if (res == null) return null;
      return ProxyTypes.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.String getProxyHost() {
    try {
      java.lang.String res = javonetHandle.get("ProxyHost");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.Integer getProxyPort() {
    try {
      java.lang.Integer res = javonetHandle.get("ProxyPort");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.String getProxyUsername() {
    try {
      java.lang.String res = javonetHandle.get("ProxyUsername");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getProxyPassword() {
    try {
      java.lang.String res = javonetHandle.get("ProxyPassword");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setTimeout(TimeSpan value) {
    try {
      javonetHandle.set("Timeout", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public TimeSpan getTimeout() {
    try {
      Object res =
          javonetHandle.explicitInterface("Renci.SshNet.IConnectionInfo").invoke("get_Timeout");
      if (res == null) return null;
      return new TimeSpan((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setEncoding(Encoding value) {
    try {
      javonetHandle.set("Encoding", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Encoding getEncoding() {
    try {
      Object res =
          javonetHandle.explicitInterface("Renci.SshNet.IConnectionInfo").invoke("get_Encoding");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setRetryAttempts(java.lang.Integer value) {
    try {
      javonetHandle.set("RetryAttempts", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getRetryAttempts() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Renci.SshNet.IConnectionInfo")
              .invoke("get_RetryAttempts");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setMaxSessions(java.lang.Integer value) {
    try {
      javonetHandle.set("MaxSessions", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getMaxSessions() {
    try {
      java.lang.Integer res = javonetHandle.get("MaxSessions");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.String getCurrentKeyExchangeAlgorithm() {
    try {
      java.lang.String res = javonetHandle.get("CurrentKeyExchangeAlgorithm");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getCurrentServerEncryption() {
    try {
      java.lang.String res = javonetHandle.get("CurrentServerEncryption");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getCurrentClientEncryption() {
    try {
      java.lang.String res = javonetHandle.get("CurrentClientEncryption");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getCurrentServerHmacAlgorithm() {
    try {
      java.lang.String res = javonetHandle.get("CurrentServerHmacAlgorithm");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getCurrentClientHmacAlgorithm() {
    try {
      java.lang.String res = javonetHandle.get("CurrentClientHmacAlgorithm");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getCurrentHostKeyAlgorithm() {
    try {
      java.lang.String res = javonetHandle.get("CurrentHostKeyAlgorithm");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getCurrentServerCompressionAlgorithm() {
    try {
      java.lang.String res = javonetHandle.get("CurrentServerCompressionAlgorithm");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getServerVersion() {
    try {
      java.lang.String res = javonetHandle.get("ServerVersion");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getClientVersion() {
    try {
      java.lang.String res = javonetHandle.get("ClientVersion");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getCurrentClientCompressionAlgorithm() {
    try {
      java.lang.String res = javonetHandle.get("CurrentClientCompressionAlgorithm");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public ConnectionInfo(
      java.lang.String host,
      java.lang.String username,
      AuthenticationMethod[] authenticationMethods) {
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.ConnectionInfo", host, username, new Object[] {authenticationMethods});
      javonetHandle.addEventListener(
          "AuthenticationBanner",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AuthenticationBannerEventArgs> handler :
                  _AuthenticationBannerListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AuthenticationBannerEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ConnectionInfo(
      java.lang.String host,
      java.lang.Integer port,
      java.lang.String username,
      AuthenticationMethod[] authenticationMethods) {
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.ConnectionInfo",
              host,
              port,
              username,
              new Object[] {authenticationMethods});
      javonetHandle.addEventListener(
          "AuthenticationBanner",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AuthenticationBannerEventArgs> handler :
                  _AuthenticationBannerListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AuthenticationBannerEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ConnectionInfo(
      java.lang.String host,
      java.lang.Integer port,
      java.lang.String username,
      ProxyTypes proxyType,
      java.lang.String proxyHost,
      java.lang.Integer proxyPort,
      java.lang.String proxyUsername,
      java.lang.String proxyPassword,
      AuthenticationMethod[] authenticationMethods) {
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.ConnectionInfo",
              host,
              port,
              username,
              NEnum.fromJavaEnum(proxyType),
              proxyHost,
              proxyPort,
              proxyUsername,
              proxyPassword,
              new Object[] {authenticationMethods});
      javonetHandle.addEventListener(
          "AuthenticationBanner",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AuthenticationBannerEventArgs> handler :
                  _AuthenticationBannerListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AuthenticationBannerEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ConnectionInfo(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AuthenticationBannerEventArgs>>
      _AuthenticationBannerListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AuthenticationBannerEventArgs>>();

  public void addAuthenticationBanner(EventHandlerTEventArgs<AuthenticationBannerEventArgs> toAdd) {
    _AuthenticationBannerListeners.add(toAdd);
  }

  public void removeAuthenticationBanner(
      EventHandlerTEventArgs<AuthenticationBannerEventArgs> toRemove) {
    _AuthenticationBannerListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
