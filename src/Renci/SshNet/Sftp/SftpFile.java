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
import jio.System.*;

public class SftpFile {
  protected NObject javonetHandle;
  /** GetProperty */
  public SftpFileAttributes getAttributes() {
    try {
      Object res = javonetHandle.<NObject>get("Attributes");
      if (res == null) return null;
      return new SftpFileAttributes((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.String getFullName() {
    try {
      java.lang.String res = javonetHandle.get("FullName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getName() {
    try {
      java.lang.String res = javonetHandle.get("Name");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setLastAccessTime(DateTime value) {
    try {
      javonetHandle.set("LastAccessTime", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public DateTime getLastAccessTime() {
    try {
      Object res = javonetHandle.<NObject>get("LastAccessTime");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setLastWriteTime(DateTime value) {
    try {
      javonetHandle.set("LastWriteTime", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public DateTime getLastWriteTime() {
    try {
      Object res = javonetHandle.<NObject>get("LastWriteTime");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setLastAccessTimeUtc(DateTime value) {
    try {
      javonetHandle.set("LastAccessTimeUtc", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public DateTime getLastAccessTimeUtc() {
    try {
      Object res = javonetHandle.<NObject>get("LastAccessTimeUtc");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setLastWriteTimeUtc(DateTime value) {
    try {
      javonetHandle.set("LastWriteTimeUtc", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public DateTime getLastWriteTimeUtc() {
    try {
      Object res = javonetHandle.<NObject>get("LastWriteTimeUtc");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Long getLength() {
    try {
      java.lang.Long res = javonetHandle.get("Length");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setUserId(java.lang.Integer value) {
    try {
      javonetHandle.set("UserId", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getUserId() {
    try {
      java.lang.Integer res = javonetHandle.get("UserId");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setGroupId(java.lang.Integer value) {
    try {
      javonetHandle.set("GroupId", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getGroupId() {
    try {
      java.lang.Integer res = javonetHandle.get("GroupId");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsSocket() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsSocket");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsSymbolicLink() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsSymbolicLink");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsRegularFile() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsRegularFile");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsBlockDevice() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsBlockDevice");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsDirectory() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsDirectory");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsCharacterDevice() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsCharacterDevice");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsNamedPipe() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsNamedPipe");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setOwnerCanRead(java.lang.Boolean value) {
    try {
      javonetHandle.set("OwnerCanRead", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getOwnerCanRead() {
    try {
      java.lang.Boolean res = javonetHandle.get("OwnerCanRead");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setOwnerCanWrite(java.lang.Boolean value) {
    try {
      javonetHandle.set("OwnerCanWrite", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getOwnerCanWrite() {
    try {
      java.lang.Boolean res = javonetHandle.get("OwnerCanWrite");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setOwnerCanExecute(java.lang.Boolean value) {
    try {
      javonetHandle.set("OwnerCanExecute", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getOwnerCanExecute() {
    try {
      java.lang.Boolean res = javonetHandle.get("OwnerCanExecute");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setGroupCanRead(java.lang.Boolean value) {
    try {
      javonetHandle.set("GroupCanRead", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getGroupCanRead() {
    try {
      java.lang.Boolean res = javonetHandle.get("GroupCanRead");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setGroupCanWrite(java.lang.Boolean value) {
    try {
      javonetHandle.set("GroupCanWrite", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getGroupCanWrite() {
    try {
      java.lang.Boolean res = javonetHandle.get("GroupCanWrite");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setGroupCanExecute(java.lang.Boolean value) {
    try {
      javonetHandle.set("GroupCanExecute", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getGroupCanExecute() {
    try {
      java.lang.Boolean res = javonetHandle.get("GroupCanExecute");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setOthersCanRead(java.lang.Boolean value) {
    try {
      javonetHandle.set("OthersCanRead", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getOthersCanRead() {
    try {
      java.lang.Boolean res = javonetHandle.get("OthersCanRead");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setOthersCanWrite(java.lang.Boolean value) {
    try {
      javonetHandle.set("OthersCanWrite", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getOthersCanWrite() {
    try {
      java.lang.Boolean res = javonetHandle.get("OthersCanWrite");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setOthersCanExecute(java.lang.Boolean value) {
    try {
      javonetHandle.set("OthersCanExecute", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getOthersCanExecute() {
    try {
      java.lang.Boolean res = javonetHandle.get("OthersCanExecute");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public SftpFile(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void SetPermissions(java.lang.Short mode) {
    try {
      javonetHandle.invoke("SetPermissions", mode);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Delete() {
    try {
      javonetHandle.invoke("Delete");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void MoveTo(java.lang.String destFileName) {
    try {
      javonetHandle.invoke("MoveTo", destFileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void UpdateStatus() {
    try {
      javonetHandle.invoke("UpdateStatus");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
