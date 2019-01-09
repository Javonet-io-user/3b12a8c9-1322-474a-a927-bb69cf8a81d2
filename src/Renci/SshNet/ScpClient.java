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
import jio.System.IO.*;
import jio.System.*;
import Renci.SshNet.Common.*;

public class ScpClient extends BaseClient implements IDisposable {
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

  public ScpClient(ConnectionInfo connectionInfo) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.ScpClient", connectionInfo);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "Downloading",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ScpDownloadEventArgs> handler : _DownloadingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ScpDownloadEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Uploading",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ScpUploadEventArgs> handler : _UploadingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ScpUploadEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ScpClient(
      java.lang.String host,
      java.lang.Integer port,
      java.lang.String username,
      java.lang.String password) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.ScpClient", host, port, username, password);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "Downloading",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ScpDownloadEventArgs> handler : _DownloadingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ScpDownloadEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Uploading",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ScpUploadEventArgs> handler : _UploadingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ScpUploadEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ScpClient(java.lang.String host, java.lang.String username, java.lang.String password) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.ScpClient", host, username, password);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "Downloading",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ScpDownloadEventArgs> handler : _DownloadingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ScpDownloadEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Uploading",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ScpUploadEventArgs> handler : _UploadingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ScpUploadEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ScpClient(
      java.lang.String host,
      java.lang.Integer port,
      java.lang.String username,
      PrivateKeyFile[] keyFiles) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Renci.SshNet.ScpClient", host, port, username, new Object[] {keyFiles});
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "Downloading",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ScpDownloadEventArgs> handler : _DownloadingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ScpDownloadEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Uploading",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ScpUploadEventArgs> handler : _UploadingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ScpUploadEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ScpClient(java.lang.String host, java.lang.String username, PrivateKeyFile[] keyFiles) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Renci.SshNet.ScpClient", host, username, new Object[] {keyFiles});
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "Downloading",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ScpDownloadEventArgs> handler : _DownloadingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ScpDownloadEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Uploading",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ScpUploadEventArgs> handler : _UploadingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ScpUploadEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ScpClient(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Upload(Stream source, java.lang.String path) {
    try {
      javonetHandle.invoke("Upload", source, path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Download(java.lang.String filename, Stream destination) {
    try {
      javonetHandle.invoke("Download", filename, destination);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Upload(FileInfo fileInfo, java.lang.String path) {
    try {
      javonetHandle.invoke("Upload", fileInfo, path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Upload(DirectoryInfo directoryInfo, java.lang.String path) {
    try {
      javonetHandle.invoke("Upload", directoryInfo, path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Download(java.lang.String filename, FileInfo fileInfo) {
    try {
      javonetHandle.invoke("Download", filename, fileInfo);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Download(java.lang.String directoryName, DirectoryInfo directoryInfo) {
    try {
      javonetHandle.invoke("Download", directoryName, directoryInfo);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ScpDownloadEventArgs>> _DownloadingListeners =
      new java.util.ArrayList<EventHandlerTEventArgs<ScpDownloadEventArgs>>();

  public void addDownloading(EventHandlerTEventArgs<ScpDownloadEventArgs> toAdd) {
    _DownloadingListeners.add(toAdd);
  }

  public void removeDownloading(EventHandlerTEventArgs<ScpDownloadEventArgs> toRemove) {
    _DownloadingListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ScpUploadEventArgs>> _UploadingListeners =
      new java.util.ArrayList<EventHandlerTEventArgs<ScpUploadEventArgs>>();

  public void addUploading(EventHandlerTEventArgs<ScpUploadEventArgs> toAdd) {
    _UploadingListeners.add(toAdd);
  }

  public void removeUploading(EventHandlerTEventArgs<ScpUploadEventArgs> toRemove) {
    _UploadingListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
