package Renci.SshNet.Common;

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
import Renci.SshNet.Common.*;

public class AuthenticationPrompt {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Integer getId() {
    try {
      java.lang.Integer res = javonetHandle.get("Id");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsEchoed() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsEchoed");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.String getRequest() {
    try {
      java.lang.String res = javonetHandle.get("Request");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setResponse(java.lang.String value) {
    try {
      javonetHandle.set("Response", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getResponse() {
    try {
      java.lang.String res = javonetHandle.get("Response");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public AuthenticationPrompt(
      java.lang.Integer id, java.lang.Boolean isEchoed, java.lang.String request) {
    try {
      javonetHandle =
          Javonet.New("Renci.SshNet.Common.AuthenticationPrompt", id, isEchoed, request);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AuthenticationPrompt(NObject handle) {
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
