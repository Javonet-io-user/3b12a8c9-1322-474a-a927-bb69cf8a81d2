package jio.System;

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
import jio.System.*;

public class TimeSpan extends ValueType
    implements IComparable, IComparableT<TimeSpan>, IEquatable<TimeSpan>, IFormattable {
  protected NObject javonetHandle;

  public TimeSpan(java.lang.Long ticks) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.TimeSpan", ticks);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TimeSpan(java.lang.Integer hours, java.lang.Integer minutes, java.lang.Integer seconds) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.TimeSpan", hours, minutes, seconds);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TimeSpan(
      java.lang.Integer days,
      java.lang.Integer hours,
      java.lang.Integer minutes,
      java.lang.Integer seconds) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.TimeSpan", days, hours, minutes, seconds);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TimeSpan(
      java.lang.Integer days,
      java.lang.Integer hours,
      java.lang.Integer minutes,
      java.lang.Integer seconds,
      java.lang.Integer milliseconds) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.TimeSpan", days, hours, minutes, seconds, milliseconds);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TimeSpan(NObject handle) {
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
