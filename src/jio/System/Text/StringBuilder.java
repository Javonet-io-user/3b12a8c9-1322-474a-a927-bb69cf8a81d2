package jio.System.Text;

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
import jio.System.Text.*;
import jio.System.Runtime.Serialization.*;

public class StringBuilder implements ISerializable {
  protected NObject javonetHandle;

  public StringBuilder() {
    try {
      javonetHandle = Javonet.New("System.Text.StringBuilder");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StringBuilder(java.lang.Integer capacity) {
    try {
      javonetHandle = Javonet.New("System.Text.StringBuilder", capacity);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StringBuilder(java.lang.String value) {
    try {
      javonetHandle = Javonet.New("System.Text.StringBuilder", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StringBuilder(java.lang.String value, java.lang.Integer capacity) {
    try {
      javonetHandle = Javonet.New("System.Text.StringBuilder", value, capacity);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StringBuilder(
      java.lang.String value,
      java.lang.Integer startIndex,
      java.lang.Integer length,
      java.lang.Integer capacity) {
    try {
      javonetHandle = Javonet.New("System.Text.StringBuilder", value, startIndex, length, capacity);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StringBuilder(java.lang.Integer capacity, java.lang.Integer maxCapacity) {
    try {
      javonetHandle = Javonet.New("System.Text.StringBuilder", capacity, maxCapacity);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StringBuilder(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void GetObjectData(SerializationInfo info, StreamingContext context) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.Serialization.ISerializable")
          .invoke("GetObjectData", info, context);
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
