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
import jio.System.*;

public abstract class AsyncResultTResult<TResult> extends AsyncResult implements IAsyncResult {
  protected NObject javonetHandle;
  /** GenericConstructor */
  public AsyncResultTResult(AsyncCallback asyncCallback, Object state, Class<?> TResult) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.getType("Renci.SshNet.Common.AsyncResult`1", getReturnObjectName(TResult))
              .create();
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AsyncResultTResult(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void SetAsCompleted(TResult result, java.lang.Boolean completedSynchronously) {
    try {
      javonetHandle.invoke("SetAsCompleted", result, completedSynchronously);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public TResult AsyncResult___EndInvoke(Class<?> returnType) {
    try {
      Object res = javonetHandle.invoke("EndInvoke");
      if (res == null) return null;
      return (TResult) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
