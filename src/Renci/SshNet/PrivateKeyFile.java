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
import Renci.SshNet.Security.*;
import jio.System.IO.*;
import jio.System.*;

public class PrivateKeyFile implements IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  public HostAlgorithm getHostKey() {
    try {
      Object res = javonetHandle.<NObject>get("HostKey");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public PrivateKeyFile(Stream privateKey) {
    try {
      javonetHandle = Javonet.New("Renci.SshNet.PrivateKeyFile", privateKey);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PrivateKeyFile(java.lang.String fileName) {
    try {
      javonetHandle = Javonet.New("Renci.SshNet.PrivateKeyFile", fileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PrivateKeyFile(java.lang.String fileName, java.lang.String passPhrase) {
    try {
      javonetHandle = Javonet.New("Renci.SshNet.PrivateKeyFile", fileName, passPhrase);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PrivateKeyFile(Stream privateKey, java.lang.String passPhrase) {
    try {
      javonetHandle = Javonet.New("Renci.SshNet.PrivateKeyFile", privateKey, passPhrase);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PrivateKeyFile(NObject handle) {
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
