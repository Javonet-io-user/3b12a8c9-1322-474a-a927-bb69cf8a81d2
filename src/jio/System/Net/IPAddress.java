package jio.System.Net;

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
import jio.System.Net.*;

public class IPAddress {
  public NObject javonetHandle;

  public IPAddress(java.lang.Long newAddress) {
    try {
      javonetHandle = Javonet.New("System.Net.IPAddress", newAddress);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public IPAddress(java.lang.Byte[] address, java.lang.Long scopeid) {
    try {
      javonetHandle = Javonet.New("System.Net.IPAddress", new Object[] {address}, scopeid);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public IPAddress(java.lang.Byte[] address) {
    try {
      javonetHandle = Javonet.New("System.Net.IPAddress", new Object[] {address});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public IPAddress(NObject handle) {
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
