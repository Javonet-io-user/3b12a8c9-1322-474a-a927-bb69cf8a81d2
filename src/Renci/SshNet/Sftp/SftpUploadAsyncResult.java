package Renci.SshNet.Sftp;

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
import Renci.SshNet.Sftp.*;
import jio.System.*;

public class SftpUploadAsyncResult extends AsyncResult implements IAsyncResult {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setIsUploadCanceled(java.lang.Boolean value) {
    try {
      javonetHandle.set("IsUploadCanceled", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsUploadCanceled() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsUploadCanceled");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.math.BigInteger getUploadedBytes() {
    try {
      java.math.BigInteger res = javonetHandle.get("UploadedBytes");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public SftpUploadAsyncResult(AsyncCallback asyncCallback, Object state) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.Sftp.SftpUploadAsyncResult", asyncCallback, state);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SftpUploadAsyncResult(NObject handle) {
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
