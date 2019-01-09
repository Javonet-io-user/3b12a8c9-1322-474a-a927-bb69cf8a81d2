package Renci.SshNet.Messages.Connection;

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
import Renci.SshNet.Messages.Connection.*;

public class ChannelOpenConfirmationMessage extends ChannelMessage {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Long getRemoteChannelNumber() {
    try {
      java.lang.Long res = javonetHandle.get("RemoteChannelNumber");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Long getInitialWindowSize() {
    try {
      java.lang.Long res = javonetHandle.get("InitialWindowSize");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Long getMaximumPacketSize() {
    try {
      java.lang.Long res = javonetHandle.get("MaximumPacketSize");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ChannelOpenConfirmationMessage() {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Renci.SshNet.Messages.Connection.ChannelOpenConfirmationMessage");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ChannelOpenConfirmationMessage(
      java.lang.Long localChannelNumber,
      java.lang.Long initialWindowSize,
      java.lang.Long maximumPacketSize,
      java.lang.Long remoteChannelNumber) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.Messages.Connection.ChannelOpenConfirmationMessage",
              localChannelNumber,
              initialWindowSize,
              maximumPacketSize,
              remoteChannelNumber);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ChannelOpenConfirmationMessage(NObject handle) {
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
