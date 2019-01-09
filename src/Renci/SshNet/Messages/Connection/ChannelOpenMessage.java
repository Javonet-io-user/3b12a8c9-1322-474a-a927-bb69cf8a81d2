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
import Renci.SshNet.Messages.*;
import Renci.SshNet.Messages.Connection.*;

public class ChannelOpenMessage extends Message {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Byte[] getChannelType(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("ChannelType");
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Long getLocalChannelNumber() {
    try {
      java.lang.Long res = javonetHandle.get("LocalChannelNumber");
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
  /** GetProperty */

  public ChannelOpenInfo getInfo() {
    try {
      Object res = javonetHandle.<NObject>get("Info");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ChannelOpenMessage() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Messages.Connection.ChannelOpenMessage");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ChannelOpenMessage(
      java.lang.Long channelNumber,
      java.lang.Long initialWindowSize,
      java.lang.Long maximumPacketSize,
      ChannelOpenInfo info) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.Messages.Connection.ChannelOpenMessage",
              channelNumber,
              initialWindowSize,
              maximumPacketSize,
              info);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ChannelOpenMessage(NObject handle) {
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
