package Renci.SshNet;

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
import Renci.SshNet.*;
import jio.System.*;
import Renci.SshNet.Sftp.*;
import jio.System.Collections.Generic.*;
import jio.System.IO.*;
import jio.System.Text.*;

public class SftpClient extends BaseClient implements IDisposable {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setOperationTimeout(TimeSpan value) {
    try {
      javonetHandle.set("OperationTimeout", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public TimeSpan getOperationTimeout() {
    try {
      Object res = javonetHandle.<NObject>get("OperationTimeout");
      if (res == null) return null;
      return new TimeSpan((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setBufferSize(java.lang.Long value) {
    try {
      javonetHandle.set("BufferSize", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Long getBufferSize() {
    try {
      java.lang.Long res = javonetHandle.get("BufferSize");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.String getWorkingDirectory() {
    try {
      java.lang.String res = javonetHandle.get("WorkingDirectory");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.Integer getProtocolVersion() {
    try {
      java.lang.Integer res = javonetHandle.get("ProtocolVersion");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public SftpClient(ConnectionInfo connectionInfo) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.SftpClient", connectionInfo);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SftpClient(
      java.lang.String host,
      java.lang.Integer port,
      java.lang.String username,
      java.lang.String password) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.SftpClient", host, port, username, password);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SftpClient(java.lang.String host, java.lang.String username, java.lang.String password) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.SftpClient", host, username, password);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SftpClient(
      java.lang.String host,
      java.lang.Integer port,
      java.lang.String username,
      PrivateKeyFile[] keyFiles) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Renci.SshNet.SftpClient", host, port, username, new Object[] {keyFiles});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SftpClient(java.lang.String host, java.lang.String username, PrivateKeyFile[] keyFiles) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Renci.SshNet.SftpClient", host, username, new Object[] {keyFiles});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SftpClient(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void ChangeDirectory(java.lang.String path) {
    try {
      javonetHandle.invoke("ChangeDirectory", path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ChangePermissions(java.lang.String path, java.lang.Short mode) {
    try {
      javonetHandle.invoke("ChangePermissions", path, mode);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void CreateDirectory(java.lang.String path) {
    try {
      javonetHandle.invoke("CreateDirectory", path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void DeleteDirectory(java.lang.String path) {
    try {
      javonetHandle.invoke("DeleteDirectory", path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void DeleteFile(java.lang.String path) {
    try {
      javonetHandle.invoke("DeleteFile", path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void RenameFile(java.lang.String oldPath, java.lang.String newPath) {
    try {
      javonetHandle.invoke("RenameFile", oldPath, newPath);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void RenameFile(
      java.lang.String oldPath, java.lang.String newPath, java.lang.Boolean isPosix) {
    try {
      javonetHandle.invoke("RenameFile", oldPath, newPath, isPosix);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void SymbolicLink(java.lang.String path, java.lang.String linkPath) {
    try {
      javonetHandle.invoke("SymbolicLink", path, linkPath);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public IEnumerable<SftpFile> ListDirectory(
      java.lang.String path, Action<java.lang.Integer> listCallback) {
    try {
      Object res = javonetHandle.invoke("ListDirectory", path, listCallback);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IAsyncResult BeginListDirectory(
      java.lang.String path,
      AsyncCallback asyncCallback,
      Object state,
      Action<java.lang.Integer> listCallback) {
    try {
      Object res =
          javonetHandle.invoke("BeginListDirectory", path, asyncCallback, state, listCallback);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IEnumerable<SftpFile> EndListDirectory(IAsyncResult asyncResult) {
    try {
      Object res = javonetHandle.invoke("EndListDirectory", asyncResult);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public SftpFile Get(java.lang.String path) {
    try {
      Object res = javonetHandle.invoke("Get", path);
      if (res == null) return null;
      return new SftpFile((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean Exists(java.lang.String path) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Exists", path);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void DownloadFile(
      java.lang.String path, Stream output, Action<java.math.BigInteger> downloadCallback) {
    try {
      javonetHandle.invoke("DownloadFile", path, output, downloadCallback);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public IAsyncResult BeginDownloadFile(java.lang.String path, Stream output) {
    try {
      Object res = javonetHandle.invoke("BeginDownloadFile", path, output);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IAsyncResult BeginDownloadFile(
      java.lang.String path, Stream output, AsyncCallback asyncCallback) {
    try {
      Object res = javonetHandle.invoke("BeginDownloadFile", path, output, asyncCallback);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IAsyncResult BeginDownloadFile(
      java.lang.String path,
      Stream output,
      AsyncCallback asyncCallback,
      Object state,
      Action<java.math.BigInteger> downloadCallback) {
    try {
      Object res =
          javonetHandle.invoke(
              "BeginDownloadFile", path, output, asyncCallback, state, downloadCallback);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void EndDownloadFile(IAsyncResult asyncResult) {
    try {
      javonetHandle.invoke("EndDownloadFile", asyncResult);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void UploadFile(
      Stream input, java.lang.String path, Action<java.math.BigInteger> uploadCallback) {
    try {
      javonetHandle.invoke("UploadFile", input, path, uploadCallback);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void UploadFile(
      Stream input,
      java.lang.String path,
      java.lang.Boolean canOverride,
      Action<java.math.BigInteger> uploadCallback) {
    try {
      javonetHandle.invoke("UploadFile", input, path, canOverride, uploadCallback);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public IAsyncResult BeginUploadFile(Stream input, java.lang.String path) {
    try {
      Object res = javonetHandle.invoke("BeginUploadFile", input, path);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IAsyncResult BeginUploadFile(
      Stream input, java.lang.String path, AsyncCallback asyncCallback) {
    try {
      Object res = javonetHandle.invoke("BeginUploadFile", input, path, asyncCallback);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IAsyncResult BeginUploadFile(
      Stream input,
      java.lang.String path,
      AsyncCallback asyncCallback,
      Object state,
      Action<java.math.BigInteger> uploadCallback) {
    try {
      Object res =
          javonetHandle.invoke(
              "BeginUploadFile", input, path, asyncCallback, state, uploadCallback);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IAsyncResult BeginUploadFile(
      Stream input,
      java.lang.String path,
      java.lang.Boolean canOverride,
      AsyncCallback asyncCallback,
      Object state,
      Action<java.math.BigInteger> uploadCallback) {
    try {
      Object res =
          javonetHandle.invoke(
              "BeginUploadFile", input, path, canOverride, asyncCallback, state, uploadCallback);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void EndUploadFile(IAsyncResult asyncResult) {
    try {
      javonetHandle.invoke("EndUploadFile", asyncResult);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public SftpFileSytemInformation GetStatus(java.lang.String path) {
    try {
      Object res = javonetHandle.invoke("GetStatus", path);
      if (res == null) return null;
      return new SftpFileSytemInformation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void AppendAllLines(java.lang.String path, IEnumerable<java.lang.String> contents) {
    try {
      javonetHandle.invoke("AppendAllLines", path, contents);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void AppendAllLines(
      java.lang.String path, IEnumerable<java.lang.String> contents, Encoding encoding) {
    try {
      javonetHandle.invoke("AppendAllLines", path, contents, encoding);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void AppendAllText(java.lang.String path, java.lang.String contents) {
    try {
      javonetHandle.invoke("AppendAllText", path, contents);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void AppendAllText(java.lang.String path, java.lang.String contents, Encoding encoding) {
    try {
      javonetHandle.invoke("AppendAllText", path, contents, encoding);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public StreamWriter AppendText(java.lang.String path) {
    try {
      Object res = javonetHandle.invoke("AppendText", path);
      if (res == null) return null;
      return new StreamWriter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public StreamWriter AppendText(java.lang.String path, Encoding encoding) {
    try {
      Object res = javonetHandle.invoke("AppendText", path, encoding);
      if (res == null) return null;
      return new StreamWriter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public SftpFileStream Create(java.lang.String path) {
    try {
      Object res = javonetHandle.invoke("Create", path);
      if (res == null) return null;
      return new SftpFileStream((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public SftpFileStream Create(java.lang.String path, java.lang.Integer bufferSize) {
    try {
      Object res = javonetHandle.invoke("Create", path, bufferSize);
      if (res == null) return null;
      return new SftpFileStream((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public StreamWriter CreateText(java.lang.String path) {
    try {
      Object res = javonetHandle.invoke("CreateText", path);
      if (res == null) return null;
      return new StreamWriter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public StreamWriter CreateText(java.lang.String path, Encoding encoding) {
    try {
      Object res = javonetHandle.invoke("CreateText", path, encoding);
      if (res == null) return null;
      return new StreamWriter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Delete(java.lang.String path) {
    try {
      javonetHandle.invoke("Delete", path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public DateTime GetLastAccessTime(java.lang.String path) {
    try {
      Object res = javonetHandle.invoke("GetLastAccessTime", path);
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DateTime GetLastAccessTimeUtc(java.lang.String path) {
    try {
      Object res = javonetHandle.invoke("GetLastAccessTimeUtc", path);
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DateTime GetLastWriteTime(java.lang.String path) {
    try {
      Object res = javonetHandle.invoke("GetLastWriteTime", path);
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DateTime GetLastWriteTimeUtc(java.lang.String path) {
    try {
      Object res = javonetHandle.invoke("GetLastWriteTimeUtc", path);
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public SftpFileStream Open(java.lang.String path, FileMode mode) {
    try {
      Object res = javonetHandle.invoke("Open", path, NEnum.fromJavaEnum(mode));
      if (res == null) return null;
      return new SftpFileStream((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public SftpFileStream Open(java.lang.String path, FileMode mode, FileAccess access) {
    try {
      Object res =
          javonetHandle.invoke("Open", path, NEnum.fromJavaEnum(mode), NEnum.fromJavaEnum(access));
      if (res == null) return null;
      return new SftpFileStream((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public SftpFileStream OpenRead(java.lang.String path) {
    try {
      Object res = javonetHandle.invoke("OpenRead", path);
      if (res == null) return null;
      return new SftpFileStream((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public StreamReader OpenText(java.lang.String path) {
    try {
      Object res = javonetHandle.invoke("OpenText", path);
      if (res == null) return null;
      return new StreamReader((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public SftpFileStream OpenWrite(java.lang.String path) {
    try {
      Object res = javonetHandle.invoke("OpenWrite", path);
      if (res == null) return null;
      return new SftpFileStream((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Byte[] ReadAllBytes(java.lang.String path, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("ReadAllBytes", path);
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.String[] ReadAllLines(java.lang.String path, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("ReadAllLines", path);
      if (res == null) return null;
      return (java.lang.String[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.String[] ReadAllLines(
      java.lang.String path, Encoding encoding, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("ReadAllLines", path, encoding);
      if (res == null) return null;
      return (java.lang.String[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.String ReadAllText(java.lang.String path) {
    try {
      java.lang.String res = javonetHandle.invoke("ReadAllText", path);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ReadAllText(java.lang.String path, Encoding encoding) {
    try {
      java.lang.String res = javonetHandle.invoke("ReadAllText", path, encoding);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public IEnumerable<java.lang.String> ReadLines(java.lang.String path) {
    try {
      Object res = javonetHandle.invoke("ReadLines", path);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IEnumerable<java.lang.String> ReadLines(java.lang.String path, Encoding encoding) {
    try {
      Object res = javonetHandle.invoke("ReadLines", path, encoding);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void SetLastAccessTime(java.lang.String path, DateTime lastAccessTime) {
    try {
      javonetHandle.invoke("SetLastAccessTime", path, lastAccessTime);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void SetLastAccessTimeUtc(java.lang.String path, DateTime lastAccessTimeUtc) {
    try {
      javonetHandle.invoke("SetLastAccessTimeUtc", path, lastAccessTimeUtc);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void SetLastWriteTime(java.lang.String path, DateTime lastWriteTime) {
    try {
      javonetHandle.invoke("SetLastWriteTime", path, lastWriteTime);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void SetLastWriteTimeUtc(java.lang.String path, DateTime lastWriteTimeUtc) {
    try {
      javonetHandle.invoke("SetLastWriteTimeUtc", path, lastWriteTimeUtc);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void WriteAllBytes(java.lang.String path, java.lang.Byte[] bytes) {
    try {
      javonetHandle.invoke("WriteAllBytes", path, new Object[] {bytes});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void WriteAllLines(java.lang.String path, IEnumerable<java.lang.String> contents) {
    try {
      javonetHandle.invoke("WriteAllLines", path, contents);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void WriteAllLines(java.lang.String path, java.lang.String[] contents) {
    try {
      javonetHandle.invoke("WriteAllLines", path, new Object[] {contents});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void WriteAllLines(
      java.lang.String path, IEnumerable<java.lang.String> contents, Encoding encoding) {
    try {
      javonetHandle.invoke("WriteAllLines", path, contents, encoding);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void WriteAllLines(java.lang.String path, java.lang.String[] contents, Encoding encoding) {
    try {
      javonetHandle.invoke("WriteAllLines", path, new Object[] {contents}, encoding);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void WriteAllText(java.lang.String path, java.lang.String contents) {
    try {
      javonetHandle.invoke("WriteAllText", path, contents);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void WriteAllText(java.lang.String path, java.lang.String contents, Encoding encoding) {
    try {
      javonetHandle.invoke("WriteAllText", path, contents, encoding);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public SftpFileAttributes GetAttributes(java.lang.String path) {
    try {
      Object res = javonetHandle.invoke("GetAttributes", path);
      if (res == null) return null;
      return new SftpFileAttributes((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void SetAttributes(java.lang.String path, SftpFileAttributes fileAttributes) {
    try {
      javonetHandle.invoke("SetAttributes", path, fileAttributes);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public IEnumerable<FileInfo> SynchronizeDirectories(
      java.lang.String sourcePath,
      java.lang.String destinationPath,
      java.lang.String searchPattern) {
    try {
      Object res =
          javonetHandle.invoke(
              "SynchronizeDirectories", sourcePath, destinationPath, searchPattern);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IAsyncResult BeginSynchronizeDirectories(
      java.lang.String sourcePath,
      java.lang.String destinationPath,
      java.lang.String searchPattern,
      AsyncCallback asyncCallback,
      Object state) {
    try {
      Object res =
          javonetHandle.invoke(
              "BeginSynchronizeDirectories",
              sourcePath,
              destinationPath,
              searchPattern,
              asyncCallback,
              state);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IEnumerable<FileInfo> EndSynchronizeDirectories(IAsyncResult asyncResult) {
    try {
      Object res = javonetHandle.invoke("EndSynchronizeDirectories", asyncResult);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
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
