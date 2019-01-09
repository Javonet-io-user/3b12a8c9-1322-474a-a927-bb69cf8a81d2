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
import jio.System.Text.RegularExpressions.*;
import jio.System.*;

public class ExpectAction {
  protected NObject javonetHandle;
  /** GetProperty */
  public Regex getExpect() {
    try {
      Object res = javonetHandle.<NObject>get("Expect");
      if (res == null) return null;
      return new Regex((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Action<java.lang.String> getAction() {
    try {
      Object res = javonetHandle.<NObject>get("Action");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ExpectAction(Regex expect, Action<java.lang.String> action) {
    try {
      javonetHandle = Javonet.New("Renci.SshNet.ExpectAction", expect, action);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ExpectAction(java.lang.String expect, Action<java.lang.String> action) {
    try {
      javonetHandle = Javonet.New("Renci.SshNet.ExpectAction", expect, action);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ExpectAction(NObject handle) {
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
