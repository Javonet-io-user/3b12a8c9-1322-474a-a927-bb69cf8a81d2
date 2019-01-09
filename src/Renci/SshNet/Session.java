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
import Renci.SshNet.Common.*;
import Renci.SshNet.Messages.*;
import jio.System.*;
import Renci.SshNet.Messages.Authentication.*;
import Renci.SshNet.Messages.Connection.*;

public class Session implements IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  public SemaphoreLight getSessionSemaphore() {
    try {
      Object res =
          javonetHandle.explicitInterface("Renci.SshNet.ISession").invoke("get_SessionSemaphore");
      if (res == null) return null;
      return new SemaphoreLight((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsConnected() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("Renci.SshNet.ISession").invoke("get_IsConnected");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Byte[] getSessionId(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("SessionId");
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Message getClientInitMessage() {
    try {
      Object res = javonetHandle.<NObject>get("ClientInitMessage");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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

  public ConnectionInfo getConnectionInfo() {
    try {
      Object res = javonetHandle.<NObject>get("ConnectionInfo");
      if (res == null) return null;
      return new ConnectionInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Session(NObject handle) {
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

  public void Connect() {
    try {
      javonetHandle.explicitInterface("Renci.SshNet.ISession").invoke("Connect");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Disconnect() {
    try {
      javonetHandle.explicitInterface("Renci.SshNet.ISession").invoke("Disconnect");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void RegisterMessage(java.lang.String messageName) {
    try {
      javonetHandle
          .explicitInterface("Renci.SshNet.ISession")
          .invoke("RegisterMessage", messageName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void UnRegisterMessage(java.lang.String messageName) {
    try {
      javonetHandle
          .explicitInterface("Renci.SshNet.ISession")
          .invoke("UnRegisterMessage", messageName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ExceptionEventArgs>> _ErrorOccuredListeners =
      new java.util.ArrayList<EventHandlerTEventArgs<ExceptionEventArgs>>();

  public void addErrorOccured(EventHandlerTEventArgs<ExceptionEventArgs> toAdd) {
    _ErrorOccuredListeners.add(toAdd);
  }

  public void removeErrorOccured(EventHandlerTEventArgs<ExceptionEventArgs> toRemove) {
    _ErrorOccuredListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<EventArgs>> _DisconnectedListeners =
      new java.util.ArrayList<EventHandlerTEventArgs<EventArgs>>();

  public void addDisconnected(EventHandlerTEventArgs<EventArgs> toAdd) {
    _DisconnectedListeners.add(toAdd);
  }

  public void removeDisconnected(EventHandlerTEventArgs<EventArgs> toRemove) {
    _DisconnectedListeners.remove(toRemove);
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
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<MessageEventArgs<BannerMessage>>>
      _UserAuthenticationBannerReceivedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<MessageEventArgs<BannerMessage>>>();

  public void addUserAuthenticationBannerReceived(
      EventHandlerTEventArgs<MessageEventArgs<BannerMessage>> toAdd) {
    _UserAuthenticationBannerReceivedListeners.add(toAdd);
  }

  public void removeUserAuthenticationBannerReceived(
      EventHandlerTEventArgs<MessageEventArgs<BannerMessage>> toRemove) {
    _UserAuthenticationBannerReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<MessageEventArgs<RequestSuccessMessage>>>
      _RequestSuccessReceivedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<MessageEventArgs<RequestSuccessMessage>>>();

  public void addRequestSuccessReceived(
      EventHandlerTEventArgs<MessageEventArgs<RequestSuccessMessage>> toAdd) {
    _RequestSuccessReceivedListeners.add(toAdd);
  }

  public void removeRequestSuccessReceived(
      EventHandlerTEventArgs<MessageEventArgs<RequestSuccessMessage>> toRemove) {
    _RequestSuccessReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<MessageEventArgs<RequestFailureMessage>>>
      _RequestFailureReceivedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<MessageEventArgs<RequestFailureMessage>>>();

  public void addRequestFailureReceived(
      EventHandlerTEventArgs<MessageEventArgs<RequestFailureMessage>> toAdd) {
    _RequestFailureReceivedListeners.add(toAdd);
  }

  public void removeRequestFailureReceived(
      EventHandlerTEventArgs<MessageEventArgs<RequestFailureMessage>> toRemove) {
    _RequestFailureReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<MessageEventArgs<ChannelOpenMessage>>>
      _ChannelOpenReceivedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<MessageEventArgs<ChannelOpenMessage>>>();

  public void addChannelOpenReceived(
      EventHandlerTEventArgs<MessageEventArgs<ChannelOpenMessage>> toAdd) {
    _ChannelOpenReceivedListeners.add(toAdd);
  }

  public void removeChannelOpenReceived(
      EventHandlerTEventArgs<MessageEventArgs<ChannelOpenMessage>> toRemove) {
    _ChannelOpenReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<MessageEventArgs<ChannelOpenConfirmationMessage>>>
      _ChannelOpenConfirmationReceivedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<MessageEventArgs<ChannelOpenConfirmationMessage>>>();

  public void addChannelOpenConfirmationReceived(
      EventHandlerTEventArgs<MessageEventArgs<ChannelOpenConfirmationMessage>> toAdd) {
    _ChannelOpenConfirmationReceivedListeners.add(toAdd);
  }

  public void removeChannelOpenConfirmationReceived(
      EventHandlerTEventArgs<MessageEventArgs<ChannelOpenConfirmationMessage>> toRemove) {
    _ChannelOpenConfirmationReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<MessageEventArgs<ChannelOpenFailureMessage>>>
      _ChannelOpenFailureReceivedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<MessageEventArgs<ChannelOpenFailureMessage>>>();

  public void addChannelOpenFailureReceived(
      EventHandlerTEventArgs<MessageEventArgs<ChannelOpenFailureMessage>> toAdd) {
    _ChannelOpenFailureReceivedListeners.add(toAdd);
  }

  public void removeChannelOpenFailureReceived(
      EventHandlerTEventArgs<MessageEventArgs<ChannelOpenFailureMessage>> toRemove) {
    _ChannelOpenFailureReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<MessageEventArgs<ChannelWindowAdjustMessage>>>
      _ChannelWindowAdjustReceivedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<MessageEventArgs<ChannelWindowAdjustMessage>>>();

  public void addChannelWindowAdjustReceived(
      EventHandlerTEventArgs<MessageEventArgs<ChannelWindowAdjustMessage>> toAdd) {
    _ChannelWindowAdjustReceivedListeners.add(toAdd);
  }

  public void removeChannelWindowAdjustReceived(
      EventHandlerTEventArgs<MessageEventArgs<ChannelWindowAdjustMessage>> toRemove) {
    _ChannelWindowAdjustReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<MessageEventArgs<ChannelDataMessage>>>
      _ChannelDataReceivedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<MessageEventArgs<ChannelDataMessage>>>();

  public void addChannelDataReceived(
      EventHandlerTEventArgs<MessageEventArgs<ChannelDataMessage>> toAdd) {
    _ChannelDataReceivedListeners.add(toAdd);
  }

  public void removeChannelDataReceived(
      EventHandlerTEventArgs<MessageEventArgs<ChannelDataMessage>> toRemove) {
    _ChannelDataReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<MessageEventArgs<ChannelExtendedDataMessage>>>
      _ChannelExtendedDataReceivedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<MessageEventArgs<ChannelExtendedDataMessage>>>();

  public void addChannelExtendedDataReceived(
      EventHandlerTEventArgs<MessageEventArgs<ChannelExtendedDataMessage>> toAdd) {
    _ChannelExtendedDataReceivedListeners.add(toAdd);
  }

  public void removeChannelExtendedDataReceived(
      EventHandlerTEventArgs<MessageEventArgs<ChannelExtendedDataMessage>> toRemove) {
    _ChannelExtendedDataReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<MessageEventArgs<ChannelEofMessage>>>
      _ChannelEofReceivedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<MessageEventArgs<ChannelEofMessage>>>();

  public void addChannelEofReceived(
      EventHandlerTEventArgs<MessageEventArgs<ChannelEofMessage>> toAdd) {
    _ChannelEofReceivedListeners.add(toAdd);
  }

  public void removeChannelEofReceived(
      EventHandlerTEventArgs<MessageEventArgs<ChannelEofMessage>> toRemove) {
    _ChannelEofReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<MessageEventArgs<ChannelCloseMessage>>>
      _ChannelCloseReceivedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<MessageEventArgs<ChannelCloseMessage>>>();

  public void addChannelCloseReceived(
      EventHandlerTEventArgs<MessageEventArgs<ChannelCloseMessage>> toAdd) {
    _ChannelCloseReceivedListeners.add(toAdd);
  }

  public void removeChannelCloseReceived(
      EventHandlerTEventArgs<MessageEventArgs<ChannelCloseMessage>> toRemove) {
    _ChannelCloseReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<MessageEventArgs<ChannelRequestMessage>>>
      _ChannelRequestReceivedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<MessageEventArgs<ChannelRequestMessage>>>();

  public void addChannelRequestReceived(
      EventHandlerTEventArgs<MessageEventArgs<ChannelRequestMessage>> toAdd) {
    _ChannelRequestReceivedListeners.add(toAdd);
  }

  public void removeChannelRequestReceived(
      EventHandlerTEventArgs<MessageEventArgs<ChannelRequestMessage>> toRemove) {
    _ChannelRequestReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<MessageEventArgs<ChannelSuccessMessage>>>
      _ChannelSuccessReceivedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<MessageEventArgs<ChannelSuccessMessage>>>();

  public void addChannelSuccessReceived(
      EventHandlerTEventArgs<MessageEventArgs<ChannelSuccessMessage>> toAdd) {
    _ChannelSuccessReceivedListeners.add(toAdd);
  }

  public void removeChannelSuccessReceived(
      EventHandlerTEventArgs<MessageEventArgs<ChannelSuccessMessage>> toRemove) {
    _ChannelSuccessReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<MessageEventArgs<ChannelFailureMessage>>>
      _ChannelFailureReceivedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<MessageEventArgs<ChannelFailureMessage>>>();

  public void addChannelFailureReceived(
      EventHandlerTEventArgs<MessageEventArgs<ChannelFailureMessage>> toAdd) {
    _ChannelFailureReceivedListeners.add(toAdd);
  }

  public void removeChannelFailureReceived(
      EventHandlerTEventArgs<MessageEventArgs<ChannelFailureMessage>> toRemove) {
    _ChannelFailureReceivedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
