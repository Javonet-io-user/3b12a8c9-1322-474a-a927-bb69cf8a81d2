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

public class ChannelWindowAdjustMessage extends ChannelMessage {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Long getBytesToAdd() {
    try {
      java.lang.Long res = javonetHandle.get("BytesToAdd");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ChannelWindowAdjustMessage() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Messages.Connection.ChannelWindowAdjustMessage");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ChannelWindowAdjustMessage(java.lang.Long localChannelNumber, java.lang.Long bytesToAdd) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.Messages.Connection.ChannelWindowAdjustMessage",
              localChannelNumber,
              bytesToAdd);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ChannelWindowAdjustMessage(NObject handle) {
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
