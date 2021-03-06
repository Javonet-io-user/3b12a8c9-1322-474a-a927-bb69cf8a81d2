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
import Renci.SshNet.Common.*;
import jio.System.*;

public class KeyExchangeDiffieHellmanGroup1Sha1 extends KeyExchangeDiffieHellmanGroupSha1
    implements IKeyExchange, IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.String getNameAsKeyExchangeDiffieHellmanGroup1Sha1() {
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
  /** GetProperty */

  public BigInteger getGroupPrimeAsKeyExchangeDiffieHellmanGroup1Sha1() {
    try {
      Object res = javonetHandle.<NObject>get("GroupPrime");
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public KeyExchangeDiffieHellmanGroup1Sha1() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Security.KeyExchangeDiffieHellmanGroup1Sha1");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public KeyExchangeDiffieHellmanGroup1Sha1(NObject handle) {
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
