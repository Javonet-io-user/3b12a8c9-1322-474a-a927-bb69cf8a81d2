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

public class KeyExchangeEllipticCurveDiffieHellman extends KeyExchange
    implements IKeyExchange, IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.String getNameAsKeyExchangeEllipticCurveDiffieHellman() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Renci.SshNet.Security.IKeyExchange").invoke("get_Name");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public KeyExchangeEllipticCurveDiffieHellman() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Security.KeyExchangeEllipticCurveDiffieHellman");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public KeyExchangeEllipticCurveDiffieHellman(NObject handle) {
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
