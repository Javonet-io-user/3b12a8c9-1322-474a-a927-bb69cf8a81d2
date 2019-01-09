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
import jio.System.Text.*;
import jio.System.IO.*;
import Renci.SshNet.Common.*;
import jio.System.Collections.Generic.*;
import jio.System.*;

public class SshClient extends BaseClient implements IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  public IEnumerable<ForwardedPort> getForwardedPorts() {
    try {
      Object res = javonetHandle.<NObject>get("ForwardedPorts");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public SshClient(ConnectionInfo connectionInfo) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.SshClient", connectionInfo);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SshClient(
      java.lang.String host,
      java.lang.Integer port,
      java.lang.String username,
      java.lang.String password) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.SshClient", host, port, username, password);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SshClient(java.lang.String host, java.lang.String username, java.lang.String password) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Renci.SshNet.SshClient", host, username, password);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SshClient(
      java.lang.String host,
      java.lang.Integer port,
      java.lang.String username,
      PrivateKeyFile[] keyFiles) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Renci.SshNet.SshClient", host, port, username, new Object[] {keyFiles});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SshClient(java.lang.String host, java.lang.String username, PrivateKeyFile[] keyFiles) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Renci.SshNet.SshClient", host, username, new Object[] {keyFiles});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SshClient(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void AddForwardedPort(ForwardedPort port) {
    try {
      javonetHandle.invoke("AddForwardedPort", port);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void RemoveForwardedPort(ForwardedPort port) {
    try {
      javonetHandle.invoke("RemoveForwardedPort", port);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public SshCommand CreateCommand(java.lang.String commandText) {
    try {
      Object res = javonetHandle.invoke("CreateCommand", commandText);
      if (res == null) return null;
      return new SshCommand((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public SshCommand CreateCommand(java.lang.String commandText, Encoding encoding) {
    try {
      Object res = javonetHandle.invoke("CreateCommand", commandText, encoding);
      if (res == null) return null;
      return new SshCommand((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public SshCommand RunCommand(java.lang.String commandText) {
    try {
      Object res = javonetHandle.invoke("RunCommand", commandText);
      if (res == null) return null;
      return new SshCommand((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Shell CreateShell(
      Stream input,
      Stream output,
      Stream extendedOutput,
      java.lang.String terminalName,
      java.lang.Long columns,
      java.lang.Long rows,
      java.lang.Long width,
      java.lang.Long height,
      IDictionary<TerminalModes, java.lang.Long> terminalModes,
      java.lang.Integer bufferSize) {
    try {
      Object res =
          javonetHandle.invoke(
              "CreateShell",
              input,
              output,
              extendedOutput,
              terminalName,
              columns,
              rows,
              width,
              height,
              terminalModes,
              bufferSize);
      if (res == null) return null;
      return new Shell((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Shell CreateShell(
      Stream input,
      Stream output,
      Stream extendedOutput,
      java.lang.String terminalName,
      java.lang.Long columns,
      java.lang.Long rows,
      java.lang.Long width,
      java.lang.Long height,
      IDictionary<TerminalModes, java.lang.Long> terminalModes) {
    try {
      Object res =
          javonetHandle.invoke(
              "CreateShell",
              input,
              output,
              extendedOutput,
              terminalName,
              columns,
              rows,
              width,
              height,
              terminalModes);
      if (res == null) return null;
      return new Shell((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Shell CreateShell(Stream input, Stream output, Stream extendedOutput) {
    try {
      Object res = javonetHandle.invoke("CreateShell", input, output, extendedOutput);
      if (res == null) return null;
      return new Shell((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Shell CreateShell(
      Encoding encoding,
      java.lang.String input,
      Stream output,
      Stream extendedOutput,
      java.lang.String terminalName,
      java.lang.Long columns,
      java.lang.Long rows,
      java.lang.Long width,
      java.lang.Long height,
      IDictionary<TerminalModes, java.lang.Long> terminalModes,
      java.lang.Integer bufferSize) {
    try {
      Object res =
          javonetHandle.invoke(
              "CreateShell",
              encoding,
              input,
              output,
              extendedOutput,
              terminalName,
              columns,
              rows,
              width,
              height,
              terminalModes,
              bufferSize);
      if (res == null) return null;
      return new Shell((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Shell CreateShell(
      Encoding encoding,
      java.lang.String input,
      Stream output,
      Stream extendedOutput,
      java.lang.String terminalName,
      java.lang.Long columns,
      java.lang.Long rows,
      java.lang.Long width,
      java.lang.Long height,
      IDictionary<TerminalModes, java.lang.Long> terminalModes) {
    try {
      Object res =
          javonetHandle.invoke(
              "CreateShell",
              encoding,
              input,
              output,
              extendedOutput,
              terminalName,
              columns,
              rows,
              width,
              height,
              terminalModes);
      if (res == null) return null;
      return new Shell((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Shell CreateShell(
      Encoding encoding, java.lang.String input, Stream output, Stream extendedOutput) {
    try {
      Object res = javonetHandle.invoke("CreateShell", encoding, input, output, extendedOutput);
      if (res == null) return null;
      return new Shell((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public ShellStream CreateShellStream(
      java.lang.String terminalName,
      java.lang.Long columns,
      java.lang.Long rows,
      java.lang.Long width,
      java.lang.Long height,
      java.lang.Integer bufferSize) {
    try {
      Object res =
          javonetHandle.invoke(
              "CreateShellStream", terminalName, columns, rows, width, height, bufferSize);
      if (res == null) return null;
      return new ShellStream((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public ShellStream CreateShellStream(
      java.lang.String terminalName,
      java.lang.Long columns,
      java.lang.Long rows,
      java.lang.Long width,
      java.lang.Long height,
      java.lang.Integer bufferSize,
      IDictionary<TerminalModes, java.lang.Long> terminalModeValues) {
    try {
      Object res =
          javonetHandle.invoke(
              "CreateShellStream",
              terminalName,
              columns,
              rows,
              width,
              height,
              bufferSize,
              terminalModeValues);
      if (res == null) return null;
      return new ShellStream((NObject) res);
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
