package Renci.SshNet.Common;

public enum TerminalModes {
  TTY_OP_END(0L),
  VINTR(1L),
  VQUIT(2L),
  VERASE(3L),
  VKILL(4L),
  VEOF(5L),
  VEOL(6L),
  VEOL2(7L),
  VSTART(8L),
  VSTOP(9L),
  VSUSP(10L),
  VDSUSP(11L),
  VREPRINT(12L),
  VWERASE(13L),
  VLNEXT(14L),
  VFLUSH(15L),
  VSWTCH(16L),
  VSTATUS(17L),
  VDISCARD(18L),
  IGNPAR(30L),
  PARMRK(31L),
  INPCK(32L),
  ISTRIP(33L),
  INLCR(34L),
  IGNCR(35L),
  ICRNL(36L),
  IUCLC(37L),
  IXON(38L),
  IXANY(39L),
  IXOFF(40L),
  IMAXBEL(41L),
  ISIG(50L),
  ICANON(51L),
  XCASE(52L),
  ECHO(53L),
  ECHOE(54L),
  ECHOK(55L),
  ECHONL(56L),
  NOFLSH(57L),
  TOSTOP(58L),
  IEXTEN(59L),
  ECHOCTL(60L),
  ECHOKE(61L),
  PENDIN(62L),
  OPOST(70L),
  OLCUC(71L),
  ONLCR(72L),
  OCRNL(73L),
  ONOCR(74L),
  ONLRET(75L),
  CS7(90L),
  CS8(91L),
  PARENB(92L),
  PARODD(93L),
  TTY_OP_ISPEED(128L),
  TTY_OP_OSPEED(129L),
  ;
  private long numVal;

  TerminalModes(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
