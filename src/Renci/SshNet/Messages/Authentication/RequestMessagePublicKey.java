package Renci.SshNet.Messages.Authentication;

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
import Renci.SshNet.Messages.Authentication.*;
import Renci.SshNet.Messages.*;

public class RequestMessagePublicKey extends RequestMessage {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Byte[] getPublicKeyAlgorithmName(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("PublicKeyAlgorithmName");
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Byte[] getPublicKeyData(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("PublicKeyData");
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setSignature(java.lang.Byte[] value) {
    try {
      javonetHandle.set("Signature", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Byte[] getSignature(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("Signature");
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public RequestMessagePublicKey(
      ServiceName serviceName,
      java.lang.String username,
      java.lang.String keyAlgorithmName,
      java.lang.Byte[] keyData) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.Messages.Authentication.RequestMessagePublicKey",
              NEnum.fromJavaEnum(serviceName),
              username,
              keyAlgorithmName,
              new Object[] {keyData});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RequestMessagePublicKey(
      ServiceName serviceName,
      java.lang.String username,
      java.lang.String keyAlgorithmName,
      java.lang.Byte[] keyData,
      java.lang.Byte[] signature) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Renci.SshNet.Messages.Authentication.RequestMessagePublicKey",
              NEnum.fromJavaEnum(serviceName),
              username,
              keyAlgorithmName,
              new Object[] {keyData},
              new Object[] {signature});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RequestMessagePublicKey(NObject handle) {
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
