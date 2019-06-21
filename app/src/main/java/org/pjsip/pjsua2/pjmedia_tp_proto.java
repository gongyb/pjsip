/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pjmedia_tp_proto {
  public final static pjmedia_tp_proto PJMEDIA_TP_PROTO_NONE = new pjmedia_tp_proto("PJMEDIA_TP_PROTO_NONE", pjsua2JNI.PJMEDIA_TP_PROTO_NONE_get());
  public final static pjmedia_tp_proto PJMEDIA_TP_PROTO_UNKNOWN = new pjmedia_tp_proto("PJMEDIA_TP_PROTO_UNKNOWN", pjsua2JNI.PJMEDIA_TP_PROTO_UNKNOWN_get());
  public final static pjmedia_tp_proto PJMEDIA_TP_PROTO_UDP = new pjmedia_tp_proto("PJMEDIA_TP_PROTO_UDP", pjsua2JNI.PJMEDIA_TP_PROTO_UDP_get());
  public final static pjmedia_tp_proto PJMEDIA_TP_PROTO_RTP = new pjmedia_tp_proto("PJMEDIA_TP_PROTO_RTP", pjsua2JNI.PJMEDIA_TP_PROTO_RTP_get());
  public final static pjmedia_tp_proto PJMEDIA_TP_PROTO_DTLS = new pjmedia_tp_proto("PJMEDIA_TP_PROTO_DTLS", pjsua2JNI.PJMEDIA_TP_PROTO_DTLS_get());
  public final static pjmedia_tp_proto PJMEDIA_TP_PROFILE_RTCP_FB = new pjmedia_tp_proto("PJMEDIA_TP_PROFILE_RTCP_FB", pjsua2JNI.PJMEDIA_TP_PROFILE_RTCP_FB_get());
  public final static pjmedia_tp_proto PJMEDIA_TP_PROFILE_SRTP = new pjmedia_tp_proto("PJMEDIA_TP_PROFILE_SRTP", pjsua2JNI.PJMEDIA_TP_PROFILE_SRTP_get());
  public final static pjmedia_tp_proto PJMEDIA_TP_PROFILE_AVP = new pjmedia_tp_proto("PJMEDIA_TP_PROFILE_AVP", pjsua2JNI.PJMEDIA_TP_PROFILE_AVP_get());
  public final static pjmedia_tp_proto PJMEDIA_TP_PROTO_RTP_AVP = new pjmedia_tp_proto("PJMEDIA_TP_PROTO_RTP_AVP", pjsua2JNI.PJMEDIA_TP_PROTO_RTP_AVP_get());
  public final static pjmedia_tp_proto PJMEDIA_TP_PROTO_RTP_SAVP = new pjmedia_tp_proto("PJMEDIA_TP_PROTO_RTP_SAVP", pjsua2JNI.PJMEDIA_TP_PROTO_RTP_SAVP_get());
  public final static pjmedia_tp_proto PJMEDIA_TP_PROTO_DTLS_SRTP = new pjmedia_tp_proto("PJMEDIA_TP_PROTO_DTLS_SRTP", pjsua2JNI.PJMEDIA_TP_PROTO_DTLS_SRTP_get());
  public final static pjmedia_tp_proto PJMEDIA_TP_PROTO_RTP_AVPF = new pjmedia_tp_proto("PJMEDIA_TP_PROTO_RTP_AVPF", pjsua2JNI.PJMEDIA_TP_PROTO_RTP_AVPF_get());
  public final static pjmedia_tp_proto PJMEDIA_TP_PROTO_RTP_SAVPF = new pjmedia_tp_proto("PJMEDIA_TP_PROTO_RTP_SAVPF", pjsua2JNI.PJMEDIA_TP_PROTO_RTP_SAVPF_get());
  public final static pjmedia_tp_proto PJMEDIA_TP_PROTO_DTLS_SRTPF = new pjmedia_tp_proto("PJMEDIA_TP_PROTO_DTLS_SRTPF", pjsua2JNI.PJMEDIA_TP_PROTO_DTLS_SRTPF_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static pjmedia_tp_proto swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + pjmedia_tp_proto.class + " with value " + swigValue);
  }

  private pjmedia_tp_proto(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private pjmedia_tp_proto(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private pjmedia_tp_proto(String swigName, pjmedia_tp_proto swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static pjmedia_tp_proto[] swigValues = { PJMEDIA_TP_PROTO_NONE, PJMEDIA_TP_PROTO_UNKNOWN, PJMEDIA_TP_PROTO_UDP, PJMEDIA_TP_PROTO_RTP, PJMEDIA_TP_PROTO_DTLS, PJMEDIA_TP_PROFILE_RTCP_FB, PJMEDIA_TP_PROFILE_SRTP, PJMEDIA_TP_PROFILE_AVP, PJMEDIA_TP_PROTO_RTP_AVP, PJMEDIA_TP_PROTO_RTP_SAVP, PJMEDIA_TP_PROTO_DTLS_SRTP, PJMEDIA_TP_PROTO_RTP_AVPF, PJMEDIA_TP_PROTO_RTP_SAVPF, PJMEDIA_TP_PROTO_DTLS_SRTPF };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

