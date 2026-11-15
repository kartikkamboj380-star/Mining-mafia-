package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SY0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap f23242a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f23243b = 0;

    public static C4880qY0 a() {
        List listB = b("audio/raw", false, false);
        if (listB.isEmpty()) {
            return null;
        }
        return (C4880qY0) listB.get(0);
    }

    public static synchronized List b(String str, boolean z9, boolean z10) {
        try {
            GY0 gy0 = new GY0(str, z9, z10);
            HashMap map = f23242a;
            List list = (List) map.get(gy0);
            if (list != null) {
                return list;
            }
            ArrayList arrayListH = h(gy0, new KY0(z9, z10, str.equals("video/mv-hevc")));
            if (z9) {
                arrayListH.isEmpty();
            }
            if ("audio/raw".equals(str)) {
                if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayListH.size() == 1 && ((C4880qY0) arrayListH.get(0)).f32656a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListH.add(C4880qY0.a("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                j(arrayListH, LY0.f20540a);
            }
            if (Build.VERSION.SDK_INT < 32 && arrayListH.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((C4880qY0) arrayListH.get(0)).f32656a)) {
                arrayListH.add((C4880qY0) arrayListH.remove(0));
            }
            AbstractC5931yu0 abstractC5931yu0U = AbstractC5931yu0.u(arrayListH);
            map.put(gy0, abstractC5931yu0U);
            return abstractC5931yu0U;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static List c(FY0 fy0, JY0 jy0, boolean z9, boolean z10) {
        List listA = fy0.a(jy0.f19929o, z9, z10);
        List listD = d(fy0, jy0, z9, z10);
        int i10 = AbstractC5931yu0.f35482c;
        C5553vu0 c5553vu0 = new C5553vu0();
        c5553vu0.i(listA);
        c5553vu0.i(listD);
        return c5553vu0.j();
    }

    public static List d(FY0 fy0, JY0 jy0, boolean z9, boolean z10) {
        String strG = g(jy0);
        return strG == null ? AbstractC5931yu0.l() : fy0.a(strG, z9, z10);
    }

    public static List e(List list, final JY0 jy0) {
        ArrayList arrayList = new ArrayList(list);
        j(arrayList, new OY0() { // from class: com.google.android.gms.internal.ads.NY0
            @Override // com.google.android.gms.internal.ads.OY0
            public final /* synthetic */ int zza(Object obj) {
                int i10 = SY0.f23243b;
                return ((C4880qY0) obj).d(jy0) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static MediaCodecInfo.CodecProfileLevel f(int i10, int i11) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i10;
        codecProfileLevel.level = i11;
        return codecProfileLevel;
    }

    public static String g(JY0 jy0) {
        Pair pairD;
        String str = jy0.f19929o;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (pairD = GM.d(jy0)) != null) {
            int iIntValue = ((Integer) pairD.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return MimeTypes.VIDEO_H265;
            }
            if (iIntValue == 512) {
                return MimeTypes.VIDEO_H264;
            }
            if (iIntValue == 1024) {
                return MimeTypes.VIDEO_AV1;
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return MimeTypes.VIDEO_H265;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0181  */
    /* JADX WARN: Code duplicated, block: B:101:0x0183 A[DONT_INVERT, PHI: r3
      0x0183: PHI (r3v7 boolean) = (r3v6 boolean), (r3v8 boolean) binds: [B:98:0x017d, B:100:0x0181] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x0185 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x0202 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c A[EDGE_INSN: B:38:0x009c->B:62:0x00f4 BREAK  A[LOOP:1: B:23:0x0066->B:27:0x0074]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0122  */
    /* JADX WARN: Code duplicated, block: B:75:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0126  */
    /* JADX WARN: Code duplicated, block: B:79:0x0130 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:128:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x013c A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:128:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0144  */
    /* JADX WARN: Code duplicated, block: B:86:0x0147  */
    /* JADX WARN: Code duplicated, block: B:89:0x0153 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:128:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0158 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:128:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0168 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:128:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x017b  */
    /* JADX WARN: Code duplicated, block: B:99:0x017f A[DONT_INVERT] */
    private static ArrayList h(GY0 gy0, IY0 iy0) throws HY0 {
        String str;
        int i10;
        int i11;
        String str2;
        String str3;
        String str4;
        boolean zA;
        boolean z9;
        int i12;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        boolean zIsHardwareAccelerated;
        boolean zI;
        boolean z10;
        String strA;
        boolean zIsVendor;
        GY0 gy1 = gy0;
        IY0 iy1 = iy0;
        String str5 = "secure-playback";
        String str6 = "tunneled-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str7 = gy1.f19068a;
            int iZza = iy1.zza();
            boolean zZzc = iy1.zzc();
            int i13 = 0;
            while (i13 < iZza) {
                MediaCodecInfo mediaCodecInfoB = iy1.b(i13);
                if (Build.VERSION.SDK_INT < 29 || !mediaCodecInfoB.isAlias()) {
                    int i14 = iZza;
                    String name = mediaCodecInfoB.getName();
                    if (mediaCodecInfoB.isEncoder() || (!zZzc && name.endsWith(".secure"))) {
                        str = str6;
                        i10 = i13;
                        i11 = i14;
                    } else {
                        String[] supportedTypes = mediaCodecInfoB.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= length) {
                                if (!str7.equals("video/dolby-vision")) {
                                    if (!str7.equals("video/mv-hevc")) {
                                        if (!str7.equals("audio/alac") || !"OMX.lge.alac.decoder".equals(name)) {
                                            if (!str7.equals("audio/flac") || !"OMX.lge.flac.decoder".equals(name)) {
                                                if (!str7.equals("audio/ac3") || !"OMX.lge.ac3.decoder".equals(name)) {
                                                    str2 = null;
                                                    break;
                                                }
                                                str2 = "audio/lg-ac3";
                                                break;
                                            }
                                            str2 = "audio/x-lg-flac";
                                            break;
                                        }
                                        str2 = "audio/x-lg-alac";
                                        break;
                                    }
                                    if (!"c2.qti.mvhevc.decoder".equals(name) && !"c2.qti.mvhevc.decoder.secure".equals(name)) {
                                        str2 = null;
                                        break;
                                    }
                                    str2 = "video/x-mvhevc";
                                    break;
                                }
                                if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    if (!"OMX.RTK.video.decoder".equals(name) && !"OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str2 = null;
                                        break;
                                    }
                                    str2 = "video/dv_hevc";
                                    break;
                                }
                                str2 = "video/hevcdv";
                                break;
                            }
                            int i16 = i15;
                            str2 = supportedTypes[i16];
                            if (str2.equalsIgnoreCase(str7)) {
                                break;
                            }
                            i15 = i16 + 1;
                        }
                        if (str2 != null) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoB.getCapabilitiesForType(str2);
                                boolean zA2 = iy1.a(str6, str2, capabilitiesForType);
                                boolean zC = iy1.c(str6, str2, capabilitiesForType);
                                str = str6;
                                if (gy1.f19070c) {
                                    if (zA2) {
                                        zA = iy1.a(str5, str2, capabilitiesForType);
                                        boolean zC2 = iy1.c(str5, str2, capabilitiesForType);
                                        z9 = gy1.f19069b;
                                        if (z9) {
                                            if (z9) {
                                                if (zA) {
                                                    zA = true;
                                                }
                                            }
                                            i12 = Build.VERSION.SDK_INT;
                                            str5 = str5;
                                            if (i12 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoB.isHardwareAccelerated();
                                                codecCapabilities = capabilitiesForType;
                                            } else {
                                                codecCapabilities = capabilitiesForType;
                                                if (i(mediaCodecInfoB, str7)) {
                                                    zIsHardwareAccelerated = false;
                                                } else {
                                                    zIsHardwareAccelerated = true;
                                                }
                                            }
                                            zI = i(mediaCodecInfoB, str7);
                                            z10 = zIsHardwareAccelerated;
                                            if (i12 >= 29) {
                                                zIsVendor = mediaCodecInfoB.isVendor();
                                            } else {
                                                strA = AbstractC1483As0.a(mediaCodecInfoB.getName());
                                                if (strA.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (!zZzc) {
                                                if (z9 != zA) {
                                                    zA = true;
                                                    if (zZzc) {
                                                    }
                                                    boolean z11 = zIsVendor;
                                                    i10 = i13;
                                                    i11 = i14;
                                                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = codecCapabilities;
                                                    str3 = str2;
                                                    str4 = name;
                                                    if (!zZzc) {
                                                        continue;
                                                    }
                                                }
                                                boolean z12 = zIsVendor;
                                                i10 = i13;
                                                i11 = i14;
                                                str3 = str2;
                                                str4 = name;
                                                arrayList.add(C4880qY0.a(name, str7, str3, codecCapabilities, z10, zI, z12, false, false));
                                            } else {
                                                if (zZzc) {
                                                }
                                                boolean z13 = zIsVendor;
                                                i10 = i13;
                                                i11 = i14;
                                                MediaCodecInfo.CodecCapabilities codecCapabilities3 = codecCapabilities;
                                                str3 = str2;
                                                str4 = name;
                                                if (!zZzc) {
                                                    continue;
                                                }
                                            }
                                            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 24 + str3.length() + 1);
                                            sb.append("Failed to query codec ");
                                            sb.append(str4);
                                            sb.append(" (");
                                            sb.append(str3);
                                            sb.append(")");
                                            YU.e("MediaCodecUtil", sb.toString());
                                            throw e;
                                        }
                                        if (z9) {
                                            if (zA) {
                                                zA = true;
                                            }
                                        }
                                        i12 = Build.VERSION.SDK_INT;
                                        str5 = str5;
                                        if (i12 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoB.isHardwareAccelerated();
                                            codecCapabilities = capabilitiesForType;
                                        } else {
                                            codecCapabilities = capabilitiesForType;
                                            if (i(mediaCodecInfoB, str7)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                        }
                                        zI = i(mediaCodecInfoB, str7);
                                        z10 = zIsHardwareAccelerated;
                                        if (i12 >= 29) {
                                            zIsVendor = mediaCodecInfoB.isVendor();
                                        } else {
                                            strA = AbstractC1483As0.a(mediaCodecInfoB.getName());
                                            if (strA.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (!zZzc) {
                                            if (zZzc) {
                                            }
                                            boolean z14 = zIsVendor;
                                            i10 = i13;
                                            i11 = i14;
                                            MediaCodecInfo.CodecCapabilities codecCapabilities4 = codecCapabilities;
                                            str3 = str2;
                                            str4 = name;
                                            if (!zZzc) {
                                                continue;
                                            }
                                        } else {
                                            if (z9 != zA) {
                                                zA = true;
                                                if (zZzc) {
                                                }
                                                boolean z15 = zIsVendor;
                                                i10 = i13;
                                                i11 = i14;
                                                MediaCodecInfo.CodecCapabilities codecCapabilities5 = codecCapabilities;
                                                str3 = str2;
                                                str4 = name;
                                                if (!zZzc) {
                                                    continue;
                                                }
                                            }
                                            boolean z16 = zIsVendor;
                                            i10 = i13;
                                            i11 = i14;
                                            str3 = str2;
                                            str4 = name;
                                            arrayList.add(C4880qY0.a(name, str7, str3, codecCapabilities, z10, zI, z16, false, false));
                                        }
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 24 + str3.length() + 1);
                                        sb2.append("Failed to query codec ");
                                        sb2.append(str4);
                                        sb2.append(" (");
                                        sb2.append(str3);
                                        sb2.append(")");
                                        YU.e("MediaCodecUtil", sb2.toString());
                                        throw e;
                                    }
                                } else if (!zC) {
                                    zA = iy1.a(str5, str2, capabilitiesForType);
                                    boolean zC3 = iy1.c(str5, str2, capabilitiesForType);
                                    z9 = gy1.f19069b;
                                    if (z9 || !zC3) {
                                        if (z9) {
                                            if (zA) {
                                                zA = true;
                                            }
                                        }
                                        i12 = Build.VERSION.SDK_INT;
                                        str5 = str5;
                                        if (i12 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoB.isHardwareAccelerated();
                                            codecCapabilities = capabilitiesForType;
                                        } else {
                                            codecCapabilities = capabilitiesForType;
                                            if (i(mediaCodecInfoB, str7)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                        }
                                        zI = i(mediaCodecInfoB, str7);
                                        z10 = zIsHardwareAccelerated;
                                        if (i12 >= 29) {
                                            zIsVendor = mediaCodecInfoB.isVendor();
                                        } else {
                                            strA = AbstractC1483As0.a(mediaCodecInfoB.getName());
                                            if (strA.startsWith("omx.google.") || strA.startsWith("c2.android.") || strA.startsWith("c2.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = true;
                                            }
                                        }
                                        if (!zZzc) {
                                            if (z9 != zA) {
                                                zA = true;
                                                if (zZzc) {
                                                }
                                                boolean z17 = zIsVendor;
                                                i10 = i13;
                                                i11 = i14;
                                                MediaCodecInfo.CodecCapabilities codecCapabilities6 = codecCapabilities;
                                                str3 = str2;
                                                str4 = name;
                                                if (!zZzc) {
                                                    continue;
                                                }
                                            }
                                            boolean z18 = zIsVendor;
                                            i10 = i13;
                                            i11 = i14;
                                            str3 = str2;
                                            str4 = name;
                                            arrayList.add(C4880qY0.a(name, str7, str3, codecCapabilities, z10, zI, z18, false, false));
                                        } else if (!zZzc || z9) {
                                            boolean z19 = zIsVendor;
                                            i10 = i13;
                                            i11 = i14;
                                            MediaCodecInfo.CodecCapabilities codecCapabilities7 = codecCapabilities;
                                            str3 = str2;
                                            str4 = name;
                                            if (!zZzc && zA) {
                                                StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 7);
                                                sb3.append(str4);
                                                sb3.append(".secure");
                                                arrayList.add(C4880qY0.a(sb3.toString(), str7, str3, codecCapabilities7, z10, zI, z19, false, true));
                                                return arrayList;
                                            }
                                        } else {
                                            boolean z110 = zIsVendor;
                                            i10 = i13;
                                            i11 = i14;
                                            str3 = str2;
                                            try {
                                                str4 = name;
                                                try {
                                                    arrayList.add(C4880qY0.a(name, str7, str3, codecCapabilities, z10, zI, z110, false, false));
                                                } catch (Exception e10) {
                                                    e = e10;
                                                }
                                            } catch (Exception e11) {
                                                e = e11;
                                                str4 = name;
                                                StringBuilder sb4 = new StringBuilder(String.valueOf(str4).length() + 24 + str3.length() + 1);
                                                sb4.append("Failed to query codec ");
                                                sb4.append(str4);
                                                sb4.append(" (");
                                                sb4.append(str3);
                                                sb4.append(")");
                                                YU.e("MediaCodecUtil", sb4.toString());
                                                throw e;
                                            }
                                        }
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(str4).length() + 24 + str3.length() + 1);
                                        sb5.append("Failed to query codec ");
                                        sb5.append(str4);
                                        sb5.append(" (");
                                        sb5.append(str3);
                                        sb5.append(")");
                                        YU.e("MediaCodecUtil", sb5.toString());
                                        throw e;
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                                str3 = str2;
                            }
                        } else {
                            str = str6;
                        }
                        i10 = i13;
                        i11 = i14;
                    }
                } else {
                    str5 = str5;
                    str = str6;
                    i11 = iZza;
                    i10 = i13;
                }
                i13 = i10 + 1;
                iy1 = iy0;
                iZza = i11;
                str5 = str5;
                str6 = str;
                gy1 = gy0;
            }
            return arrayList;
        } catch (Exception e13) {
            throw new HY0(e13, null);
        }
    }

    private static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (A8.a(str)) {
            return true;
        }
        String strA = AbstractC1483As0.a(mediaCodecInfo.getName());
        if (strA.startsWith("arc.")) {
            return false;
        }
        if (strA.startsWith("omx.google.") || strA.startsWith("omx.ffmpeg.") || ((strA.startsWith("omx.sec.") && strA.contains(".sw.")) || strA.equals("omx.qcom.video.decoder.hevcswvdec") || strA.startsWith("c2.android.") || strA.startsWith("c2.google."))) {
            return true;
        }
        return (strA.startsWith("omx.") || strA.startsWith("c2.")) ? false : true;
    }

    private static void j(List list, final OY0 oy0) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.MY0
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                int i10 = SY0.f23243b;
                OY0 oy1 = oy0;
                return oy1.zza(obj2) - oy1.zza(obj);
            }
        });
    }
}
