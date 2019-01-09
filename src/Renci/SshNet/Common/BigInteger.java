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
import jio.System.*;
import Renci.SshNet.Common.*;
import jio.System.Globalization.*;

public class BigInteger extends ValueType
    implements IComparable, IFormattable, IComparableT<BigInteger>, IEquatable<BigInteger> {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Integer getBitLength() {
    try {
      java.lang.Integer res = javonetHandle.get("BitLength");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsEven() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsEven");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsOne() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsOne");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsPowerOfTwo() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsPowerOfTwo");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsZero() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsZero");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public static BigInteger getMinusOne() {
    try {
      Object res = Javonet.getType("BigInteger").<NObject>get("MinusOne");
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public static BigInteger getOne() {
    try {
      Object res = Javonet.getType("BigInteger").<NObject>get("One");
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Integer getSign() {
    try {
      java.lang.Integer res = javonetHandle.get("Sign");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public static BigInteger getZero() {
    try {
      Object res = Javonet.getType("BigInteger").<NObject>get("Zero");
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public BigInteger(java.lang.Short sign, java.lang.Long[] data) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Common.BigInteger", sign, new Object[] {data});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BigInteger(java.lang.Integer value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Common.BigInteger", value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BigInteger(java.lang.Long value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Common.BigInteger", value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BigInteger(java.math.BigInteger value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Common.BigInteger", value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BigInteger(java.lang.Double value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Common.BigInteger", value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BigInteger(java.lang.Float value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Common.BigInteger", value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BigInteger(java.math.BigDecimal value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Common.BigInteger", value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BigInteger(java.lang.Byte[] value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Common.BigInteger", new Object[] {value});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BigInteger(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Integer CompareTo(Object obj) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.IComparable").invoke("CompareTo", obj);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.String ToString(java.lang.String format, IFormatProvider provider) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("jio.System.IFormattable")
              .invoke("ToString", format, provider);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.Integer CompareTo(BigInteger other) {
    try {
      java.lang.Integer res = javonetHandle.invoke("CompareTo", other);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Boolean Equals(BigInteger other) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Equals", other);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public static BigInteger Abs(BigInteger value) {
    try {
      Object res = Javonet.getType("BigInteger").invoke("Abs", value);
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static BigInteger Add(BigInteger left, BigInteger right) {
    try {
      Object res = Javonet.getType("BigInteger").invoke("Add", left, right);
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Integer CompareTo(java.math.BigInteger other) {
    try {
      java.lang.Integer res = javonetHandle.invoke("CompareTo", other);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public static BigInteger Random(java.lang.Integer bitLength) {
    try {
      Object res = Javonet.getType("BigInteger").invoke("Random", bitLength);
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static BigInteger Divide(BigInteger dividend, BigInteger divisor) {
    try {
      Object res = Javonet.getType("BigInteger").invoke("Divide", dividend, divisor);
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static BigInteger DivRem(BigInteger dividend, BigInteger divisor, BigInteger remainder) {
    try {
      Object res = Javonet.getType("BigInteger").invoke("DivRem", dividend, divisor, remainder);
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean Equals(java.lang.Long other) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Equals", other);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean Equals(Object obj) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Equals", obj);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean Equals(java.math.BigInteger other) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Equals", other);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Integer GetHashCode() {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetHashCode");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public static BigInteger GreatestCommonDivisor(BigInteger left, BigInteger right) {
    try {
      Object res = Javonet.getType("BigInteger").invoke("GreatestCommonDivisor", left, right);
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static java.lang.Double Log(BigInteger value, java.lang.Double baseValue) {
    try {
      java.lang.Double res = Javonet.getType("BigInteger").invoke("Log", value, baseValue);
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** Method */

  public static java.lang.Double Log(BigInteger value) {
    try {
      java.lang.Double res = Javonet.getType("BigInteger").invoke("Log", value);
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** Method */

  public static java.lang.Double Log10(BigInteger value) {
    try {
      java.lang.Double res = Javonet.getType("BigInteger").invoke("Log10", value);
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** Method */

  public static BigInteger Max(BigInteger left, BigInteger right) {
    try {
      Object res = Javonet.getType("BigInteger").invoke("Max", left, right);
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static BigInteger Min(BigInteger left, BigInteger right) {
    try {
      Object res = Javonet.getType("BigInteger").invoke("Min", left, right);
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static BigInteger ModPow(BigInteger value, BigInteger exponent, BigInteger modulus) {
    try {
      Object res = Javonet.getType("BigInteger").invoke("ModPow", value, exponent, modulus);
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static BigInteger ModInverse(BigInteger bi, BigInteger modulus) {
    try {
      Object res = Javonet.getType("BigInteger").invoke("ModInverse", bi, modulus);
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static BigInteger PositiveMod(BigInteger dividend, BigInteger divisor) {
    try {
      Object res = Javonet.getType("BigInteger").invoke("PositiveMod", dividend, divisor);
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static BigInteger Multiply(BigInteger left, BigInteger right) {
    try {
      Object res = Javonet.getType("BigInteger").invoke("Multiply", left, right);
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static BigInteger Negate(BigInteger value) {
    try {
      Object res = Javonet.getType("BigInteger").invoke("Negate", value);
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static BigInteger Parse(
      java.lang.String value, NumberStyles style, IFormatProvider provider) {
    try {
      Object res =
          Javonet.getType("BigInteger").invoke("Parse", value, NEnum.fromJavaEnum(style), provider);
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static BigInteger Parse(java.lang.String value, IFormatProvider provider) {
    try {
      Object res = Javonet.getType("BigInteger").invoke("Parse", value, provider);
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static BigInteger Parse(java.lang.String value, NumberStyles style) {
    try {
      Object res = Javonet.getType("BigInteger").invoke("Parse", value, NEnum.fromJavaEnum(style));
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static BigInteger Pow(BigInteger value, java.lang.Integer exponent) {
    try {
      Object res = Javonet.getType("BigInteger").invoke("Pow", value, exponent);
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static BigInteger Remainder(BigInteger dividend, BigInteger divisor) {
    try {
      Object res = Javonet.getType("BigInteger").invoke("Remainder", dividend, divisor);
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static BigInteger Subtract(BigInteger left, BigInteger right) {
    try {
      Object res = Javonet.getType("BigInteger").invoke("Subtract", left, right);
      if (res == null) return null;
      return new BigInteger((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Byte[] ToByteArray(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("ToByteArray");
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.String ToString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ToString(IFormatProvider provider) {
    try {
      java.lang.String res = javonetHandle.invoke("ToString", provider);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ToString(java.lang.String format) {
    try {
      java.lang.String res = javonetHandle.invoke("ToString", format);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static java.lang.Boolean TryParse(
      java.lang.String value, NumberStyles style, CultureInfo cultureInfo, BigInteger result) {
    try {
      java.lang.Boolean res =
          Javonet.getType("BigInteger")
              .invoke("TryParse", value, NEnum.fromJavaEnum(style), cultureInfo, result);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public static java.lang.Boolean TryParse(java.lang.String value, BigInteger result) {
    try {
      java.lang.Boolean res = Javonet.getType("BigInteger").invoke("TryParse", value, result);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Integer CompareTo(java.lang.Long other) {
    try {
      java.lang.Integer res = javonetHandle.invoke("CompareTo", other);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public static java.lang.Integer Compare(BigInteger left, BigInteger right) {
    try {
      java.lang.Integer res = Javonet.getType("BigInteger").invoke("Compare", left, right);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
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
