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
import Renci.SshNet.Sftp.*;
import jio.System.Collections.Generic.*;
import Renci.SshNet.Common.*;
import jio.System.*;

public class SftpListDirectoryAsyncResult extends AsyncResultTResult<IEnumerable<SftpFile>>
    implements IAsyncResult {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Integer getFilesRead() {
    try {
      java.lang.Integer res = javonetHandle.get("FilesRead");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public SftpListDirectoryAsyncResult(AsyncCallback asyncCallback, Object state) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Renci.SshNet.Sftp.SftpListDirectoryAsyncResult", asyncCallback, state);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SftpListDirectoryAsyncResult(NObject handle) {
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
