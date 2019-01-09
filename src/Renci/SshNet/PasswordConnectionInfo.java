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
import Renci.SshNet.Common.*;

public class PasswordConnectionInfo extends ConnectionInfo implements IDisposable {
  protected NObject javonetHandle;

  public PasswordConnectionInfo(
      java.lang.String host, java.lang.String username, java.lang.String password) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.PasswordConnectionInfo", host, username, password);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "PasswordExpired",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AuthenticationPasswordChangeEventArgs> handler :
                  _PasswordExpiredListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AuthenticationPasswordChangeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PasswordConnectionInfo(
      java.lang.String host,
      java.lang.Integer port,
      java.lang.String username,
      java.lang.String password) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Renci.SshNet.PasswordConnectionInfo", host, port, username, password);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "PasswordExpired",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AuthenticationPasswordChangeEventArgs> handler :
                  _PasswordExpiredListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AuthenticationPasswordChangeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PasswordConnectionInfo(
      java.lang.String host,
      java.lang.Integer port,
      java.lang.String username,
      java.lang.String password,
      ProxyTypes proxyType,
      java.lang.String proxyHost,
      java.lang.Integer proxyPort) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.PasswordConnectionInfo",
              host,
              port,
              username,
              password,
              NEnum.fromJavaEnum(proxyType),
              proxyHost,
              proxyPort);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "PasswordExpired",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AuthenticationPasswordChangeEventArgs> handler :
                  _PasswordExpiredListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AuthenticationPasswordChangeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PasswordConnectionInfo(
      java.lang.String host,
      java.lang.Integer port,
      java.lang.String username,
      java.lang.String password,
      ProxyTypes proxyType,
      java.lang.String proxyHost,
      java.lang.Integer proxyPort,
      java.lang.String proxyUsername) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.PasswordConnectionInfo",
              host,
              port,
              username,
              password,
              NEnum.fromJavaEnum(proxyType),
              proxyHost,
              proxyPort,
              proxyUsername);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "PasswordExpired",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AuthenticationPasswordChangeEventArgs> handler :
                  _PasswordExpiredListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AuthenticationPasswordChangeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PasswordConnectionInfo(
      java.lang.String host,
      java.lang.String username,
      java.lang.String password,
      ProxyTypes proxyType,
      java.lang.String proxyHost,
      java.lang.Integer proxyPort) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.PasswordConnectionInfo",
              host,
              username,
              password,
              NEnum.fromJavaEnum(proxyType),
              proxyHost,
              proxyPort);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "PasswordExpired",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AuthenticationPasswordChangeEventArgs> handler :
                  _PasswordExpiredListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AuthenticationPasswordChangeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PasswordConnectionInfo(
      java.lang.String host,
      java.lang.String username,
      java.lang.String password,
      ProxyTypes proxyType,
      java.lang.String proxyHost,
      java.lang.Integer proxyPort,
      java.lang.String proxyUsername) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.PasswordConnectionInfo",
              host,
              username,
              password,
              NEnum.fromJavaEnum(proxyType),
              proxyHost,
              proxyPort,
              proxyUsername);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "PasswordExpired",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AuthenticationPasswordChangeEventArgs> handler :
                  _PasswordExpiredListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AuthenticationPasswordChangeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PasswordConnectionInfo(
      java.lang.String host,
      java.lang.String username,
      java.lang.String password,
      ProxyTypes proxyType,
      java.lang.String proxyHost,
      java.lang.Integer proxyPort,
      java.lang.String proxyUsername,
      java.lang.String proxyPassword) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.PasswordConnectionInfo",
              host,
              username,
              password,
              NEnum.fromJavaEnum(proxyType),
              proxyHost,
              proxyPort,
              proxyUsername,
              proxyPassword);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "PasswordExpired",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AuthenticationPasswordChangeEventArgs> handler :
                  _PasswordExpiredListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AuthenticationPasswordChangeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PasswordConnectionInfo(
      java.lang.String host, java.lang.String username, java.lang.Byte[] password) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.PasswordConnectionInfo", host, username, new Object[] {password});
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "PasswordExpired",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AuthenticationPasswordChangeEventArgs> handler :
                  _PasswordExpiredListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AuthenticationPasswordChangeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PasswordConnectionInfo(
      java.lang.String host,
      java.lang.Integer port,
      java.lang.String username,
      java.lang.Byte[] password) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.PasswordConnectionInfo", host, port, username, new Object[] {password});
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "PasswordExpired",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AuthenticationPasswordChangeEventArgs> handler :
                  _PasswordExpiredListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AuthenticationPasswordChangeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PasswordConnectionInfo(
      java.lang.String host,
      java.lang.Integer port,
      java.lang.String username,
      java.lang.Byte[] password,
      ProxyTypes proxyType,
      java.lang.String proxyHost,
      java.lang.Integer proxyPort) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.PasswordConnectionInfo",
              host,
              port,
              username,
              new Object[] {password},
              NEnum.fromJavaEnum(proxyType),
              proxyHost,
              proxyPort);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "PasswordExpired",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AuthenticationPasswordChangeEventArgs> handler :
                  _PasswordExpiredListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AuthenticationPasswordChangeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PasswordConnectionInfo(
      java.lang.String host,
      java.lang.Integer port,
      java.lang.String username,
      java.lang.Byte[] password,
      ProxyTypes proxyType,
      java.lang.String proxyHost,
      java.lang.Integer proxyPort,
      java.lang.String proxyUsername) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.PasswordConnectionInfo",
              host,
              port,
              username,
              new Object[] {password},
              NEnum.fromJavaEnum(proxyType),
              proxyHost,
              proxyPort,
              proxyUsername);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "PasswordExpired",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AuthenticationPasswordChangeEventArgs> handler :
                  _PasswordExpiredListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AuthenticationPasswordChangeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PasswordConnectionInfo(
      java.lang.String host,
      java.lang.String username,
      java.lang.Byte[] password,
      ProxyTypes proxyType,
      java.lang.String proxyHost,
      java.lang.Integer proxyPort) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.PasswordConnectionInfo",
              host,
              username,
              new Object[] {password},
              NEnum.fromJavaEnum(proxyType),
              proxyHost,
              proxyPort);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "PasswordExpired",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AuthenticationPasswordChangeEventArgs> handler :
                  _PasswordExpiredListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AuthenticationPasswordChangeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PasswordConnectionInfo(
      java.lang.String host,
      java.lang.String username,
      java.lang.Byte[] password,
      ProxyTypes proxyType,
      java.lang.String proxyHost,
      java.lang.Integer proxyPort,
      java.lang.String proxyUsername) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.PasswordConnectionInfo",
              host,
              username,
              new Object[] {password},
              NEnum.fromJavaEnum(proxyType),
              proxyHost,
              proxyPort,
              proxyUsername);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "PasswordExpired",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AuthenticationPasswordChangeEventArgs> handler :
                  _PasswordExpiredListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AuthenticationPasswordChangeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PasswordConnectionInfo(
      java.lang.String host,
      java.lang.String username,
      java.lang.Byte[] password,
      ProxyTypes proxyType,
      java.lang.String proxyHost,
      java.lang.Integer proxyPort,
      java.lang.String proxyUsername,
      java.lang.String proxyPassword) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.PasswordConnectionInfo",
              host,
              username,
              new Object[] {password},
              NEnum.fromJavaEnum(proxyType),
              proxyHost,
              proxyPort,
              proxyUsername,
              proxyPassword);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "PasswordExpired",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AuthenticationPasswordChangeEventArgs> handler :
                  _PasswordExpiredListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AuthenticationPasswordChangeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PasswordConnectionInfo(
      java.lang.String host,
      java.lang.Integer port,
      java.lang.String username,
      java.lang.Byte[] password,
      ProxyTypes proxyType,
      java.lang.String proxyHost,
      java.lang.Integer proxyPort,
      java.lang.String proxyUsername,
      java.lang.String proxyPassword) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.PasswordConnectionInfo",
              host,
              port,
              username,
              new Object[] {password},
              NEnum.fromJavaEnum(proxyType),
              proxyHost,
              proxyPort,
              proxyUsername,
              proxyPassword);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "PasswordExpired",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AuthenticationPasswordChangeEventArgs> handler :
                  _PasswordExpiredListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AuthenticationPasswordChangeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PasswordConnectionInfo(NObject handle) {
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
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AuthenticationPasswordChangeEventArgs>>
      _PasswordExpiredListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AuthenticationPasswordChangeEventArgs>>();

  public void addPasswordExpired(
      EventHandlerTEventArgs<AuthenticationPasswordChangeEventArgs> toAdd) {
    _PasswordExpiredListeners.add(toAdd);
  }

  public void removePasswordExpired(
      EventHandlerTEventArgs<AuthenticationPasswordChangeEventArgs> toRemove) {
    _PasswordExpiredListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
