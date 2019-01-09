package Renci.SshNet.Messages.Transport;

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
import Renci.SshNet.Messages.Transport.*;

public class KeyExchangeInitMessage extends Message implements IKeyExchangedAllowed {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Byte[] getCookie(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("Cookie");
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setKeyExchangeAlgorithms(java.lang.String[] value) {
    try {
      javonetHandle.set("KeyExchangeAlgorithms", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String[] getKeyExchangeAlgorithms(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("KeyExchangeAlgorithms");
      if (res == null) return null;
      return (java.lang.String[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setServerHostKeyAlgorithms(java.lang.String[] value) {
    try {
      javonetHandle.set("ServerHostKeyAlgorithms", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String[] getServerHostKeyAlgorithms(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("ServerHostKeyAlgorithms");
      if (res == null) return null;
      return (java.lang.String[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setEncryptionAlgorithmsClientToServer(java.lang.String[] value) {
    try {
      javonetHandle.set("EncryptionAlgorithmsClientToServer", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String[] getEncryptionAlgorithmsClientToServer(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("EncryptionAlgorithmsClientToServer");
      if (res == null) return null;
      return (java.lang.String[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setEncryptionAlgorithmsServerToClient(java.lang.String[] value) {
    try {
      javonetHandle.set("EncryptionAlgorithmsServerToClient", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String[] getEncryptionAlgorithmsServerToClient(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("EncryptionAlgorithmsServerToClient");
      if (res == null) return null;
      return (java.lang.String[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setMacAlgorithmsClientToServer(java.lang.String[] value) {
    try {
      javonetHandle.set("MacAlgorithmsClientToServer", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String[] getMacAlgorithmsClientToServer(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("MacAlgorithmsClientToServer");
      if (res == null) return null;
      return (java.lang.String[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setMacAlgorithmsServerToClient(java.lang.String[] value) {
    try {
      javonetHandle.set("MacAlgorithmsServerToClient", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String[] getMacAlgorithmsServerToClient(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("MacAlgorithmsServerToClient");
      if (res == null) return null;
      return (java.lang.String[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setCompressionAlgorithmsClientToServer(java.lang.String[] value) {
    try {
      javonetHandle.set("CompressionAlgorithmsClientToServer", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String[] getCompressionAlgorithmsClientToServer(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("CompressionAlgorithmsClientToServer");
      if (res == null) return null;
      return (java.lang.String[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setCompressionAlgorithmsServerToClient(java.lang.String[] value) {
    try {
      javonetHandle.set("CompressionAlgorithmsServerToClient", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String[] getCompressionAlgorithmsServerToClient(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("CompressionAlgorithmsServerToClient");
      if (res == null) return null;
      return (java.lang.String[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setLanguagesClientToServer(java.lang.String[] value) {
    try {
      javonetHandle.set("LanguagesClientToServer", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String[] getLanguagesClientToServer(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("LanguagesClientToServer");
      if (res == null) return null;
      return (java.lang.String[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setLanguagesServerToClient(java.lang.String[] value) {
    try {
      javonetHandle.set("LanguagesServerToClient", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String[] getLanguagesServerToClient(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("LanguagesServerToClient");
      if (res == null) return null;
      return (java.lang.String[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setFirstKexPacketFollows(java.lang.Boolean value) {
    try {
      javonetHandle.set("FirstKexPacketFollows", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getFirstKexPacketFollows() {
    try {
      java.lang.Boolean res = javonetHandle.get("FirstKexPacketFollows");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setReserved(java.lang.Long value) {
    try {
      javonetHandle.set("Reserved", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Long getReserved() {
    try {
      java.lang.Long res = javonetHandle.get("Reserved");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public KeyExchangeInitMessage() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Messages.Transport.KeyExchangeInitMessage");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public KeyExchangeInitMessage(NObject handle) {
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
