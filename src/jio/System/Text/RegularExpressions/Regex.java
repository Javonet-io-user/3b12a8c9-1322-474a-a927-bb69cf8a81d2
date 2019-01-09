package jio.System.Text.RegularExpressions;

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
import jio.System.Text.RegularExpressions.*;
import jio.System.*;
import jio.System.Runtime.Serialization.*;

public class Regex implements ISerializable {
  protected NObject javonetHandle;

  public Regex(java.lang.String pattern) {
    try {
      javonetHandle = Javonet.New("System.Text.RegularExpressions.Regex", pattern);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Regex(java.lang.String pattern, RegexOptions options) {
    try {
      javonetHandle =
          Javonet.New("System.Text.RegularExpressions.Regex", pattern, NEnum.fromJavaEnum(options));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Regex(java.lang.String pattern, RegexOptions options, TimeSpan matchTimeout) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Text.RegularExpressions.Regex",
              pattern,
              NEnum.fromJavaEnum(options),
              matchTimeout);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Regex(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void GetObjectData(SerializationInfo si, StreamingContext context) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.Serialization.ISerializable")
          .invoke("GetObjectData", si, context);
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
