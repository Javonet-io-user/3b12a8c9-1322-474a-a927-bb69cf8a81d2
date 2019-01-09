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
import jio.System.*;

public abstract class KeyExchangeDiffieHellmanGroupExchangeShaBase extends KeyExchangeDiffieHellman
    implements IKeyExchange, IDisposable {
  protected NObject javonetHandle;

  public KeyExchangeDiffieHellmanGroupExchangeShaBase(NObject handle) {
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
