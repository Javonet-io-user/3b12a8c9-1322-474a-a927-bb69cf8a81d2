package Renci.SshNet.Security;

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
import Renci.SshNet.Security.*;
import Renci.SshNet.*;
import Renci.SshNet.Messages.Transport.*;
import Renci.SshNet.Security.Cryptography.*;
import jio.System.Security.Cryptography.*;
import Renci.SshNet.Compression.*;
import jio.System.*;

public interface IKeyExchange extends IDisposable {
  public void Start(Session session, KeyExchangeInitMessage message);

  public void Finish();

  public Cipher CreateClientCipher();

  public Cipher CreateServerCipher();

  public HashAlgorithm CreateServerHash();

  public HashAlgorithm CreateClientHash();

  public Compressor CreateCompressor();

  public Compressor CreateDecompressor();
}
