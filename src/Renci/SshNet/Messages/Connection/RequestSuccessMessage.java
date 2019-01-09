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
import jio.System.*;

public class RequestSuccessMessage extends Message {
  protected NObject javonetHandle;
  /** GetProperty */
  public Nullable<java.lang.Long> getBoundPort() {
    try {
      Object res = javonetHandle.<NObject>get("BoundPort");
      if (res == null) return null;
      return new Nullable<java.lang.Long>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public RequestSuccessMessage() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Messages.Connection.RequestSuccessMessage");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RequestSuccessMessage(java.lang.Long boundPort) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Renci.SshNet.Messages.Connection.RequestSuccessMessage", boundPort);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RequestSuccessMessage(NObject handle) {
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
