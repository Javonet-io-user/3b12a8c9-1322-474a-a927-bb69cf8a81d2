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
import jio.System.Xml.*;
import jio.System.*;

public class NetConfClient extends BaseClient implements IDisposable {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setOperationTimeout(TimeSpan value) {
    try {
      javonetHandle.set("OperationTimeout", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public TimeSpan getOperationTimeout() {
    try {
      Object res = javonetHandle.<NObject>get("OperationTimeout");
      if (res == null) return null;
      return new TimeSpan((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public XmlDocument getServerCapabilities() {
    try {
      Object res = javonetHandle.<NObject>get("ServerCapabilities");
      if (res == null) return null;
      return new XmlDocument((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public XmlDocument getClientCapabilities() {
    try {
      Object res = javonetHandle.<NObject>get("ClientCapabilities");
      if (res == null) return null;
      return new XmlDocument((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setAutomaticMessageIdHandling(java.lang.Boolean value) {
    try {
      javonetHandle.set("AutomaticMessageIdHandling", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getAutomaticMessageIdHandling() {
    try {
      java.lang.Boolean res = javonetHandle.get("AutomaticMessageIdHandling");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public NetConfClient(ConnectionInfo connectionInfo) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.NetConfClient", connectionInfo);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NetConfClient(
      java.lang.String host,
      java.lang.Integer port,
      java.lang.String username,
      java.lang.String password) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.NetConfClient", host, port, username, password);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NetConfClient(
      java.lang.String host, java.lang.String username, java.lang.String password) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.NetConfClient", host, username, password);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NetConfClient(
      java.lang.String host,
      java.lang.Integer port,
      java.lang.String username,
      PrivateKeyFile[] keyFiles) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Renci.SshNet.NetConfClient", host, port, username, new Object[] {keyFiles});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NetConfClient(
      java.lang.String host, java.lang.String username, PrivateKeyFile[] keyFiles) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Renci.SshNet.NetConfClient", host, username, new Object[] {keyFiles});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NetConfClient(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public XmlDocument SendReceiveRpc(XmlDocument rpc) {
    try {
      Object res = javonetHandle.invoke("SendReceiveRpc", rpc);
      if (res == null) return null;
      return new XmlDocument((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public XmlDocument SendReceiveRpc(java.lang.String xml) {
    try {
      Object res = javonetHandle.invoke("SendReceiveRpc", xml);
      if (res == null) return null;
      return new XmlDocument((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public XmlDocument SendCloseRpc() {
    try {
      Object res = javonetHandle.invoke("SendCloseRpc");
      if (res == null) return null;
      return new XmlDocument((NObject) res);
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
