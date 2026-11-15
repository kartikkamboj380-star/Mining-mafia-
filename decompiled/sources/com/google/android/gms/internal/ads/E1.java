package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class E1 implements O1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f18332c = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final D1 f18333d = new D1(B1.f17450a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final D1 f18334e = new D1(A1.f17225a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f18335f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractC5931yu0 f18336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5576w5 f18337b = new C4821q5();

    private final void b(int i10, List list) {
        switch (i10) {
            case 0:
                list.add(new C5704x6());
                break;
            case 1:
                list.add(new A6());
                break;
            case 2:
                list.add(new D6(0));
                break;
            case 3:
                list.add(new E2(0));
                break;
            case 4:
                I1 i1A = f18333d.a(0);
                if (i1A == null) {
                    list.add(new W2(0));
                } else {
                    list.add(i1A);
                }
                break;
            case 5:
                list.add(new Z2());
                break;
            case 6:
                list.add(new Y3(this.f18337b, 0));
                break;
            case 7:
                list.add(new C3435f4(0));
                break;
            case 8:
                InterfaceC5576w5 interfaceC5576w5 = this.f18337b;
                list.add(new F4(interfaceC5576w5, 0, null, null, AbstractC5931yu0.l(), null));
                list.add(new N4(interfaceC5576w5, 0));
                break;
            case 9:
                list.add(new C3311e5());
                break;
            case 10:
                list.add(new C3819i7());
                break;
            case 11:
                if (this.f18336a == null) {
                    this.f18336a = AbstractC5931yu0.l();
                }
                list.add(new C5202t7(1, 0, this.f18337b, new L90(0L), new F6(0, this.f18336a), 112800));
                break;
            case 12:
                list.add(new G7());
                break;
            case 14:
                list.add(new C3559g3(0));
                break;
            case 15:
                I1 i1A2 = f18334e.a(new Object[0]);
                if (i1A2 != null) {
                    list.add(i1A2);
                }
                break;
            case 16:
                list.add(new I2(0, this.f18337b));
                break;
            case 17:
                list.add(new C4569o5());
                break;
            case 18:
                list.add(new L7());
                break;
            case 19:
                list.add(new R2());
                break;
            case 20:
                list.add(new C3433f3(0));
                break;
            case 21:
                list.add(new Q2());
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:142:0x0204  */
    @Override // com.google.android.gms.internal.ads.O1
    public final synchronized I1[] a(Uri uri, Map map) {
        ArrayList arrayList;
        int i10;
        int i11;
        try {
            arrayList = new ArrayList(21);
            List list = (List) map.get(CommonGatewayClient.HEADER_CONTENT_TYPE);
            String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
            if (str != null) {
                switch (A8.h(str)) {
                    case "audio/ac3":
                    case "audio/eac3":
                    case "audio/eac3-joc":
                        i10 = 0;
                        break;
                    case "audio/ac4":
                        i10 = 1;
                        break;
                    case "audio/amr":
                    case "audio/3gpp":
                    case "audio/amr-wb":
                        i10 = 3;
                        break;
                    case "audio/flac":
                        i10 = 4;
                        break;
                    case "video/x-flv":
                        i10 = 5;
                        break;
                    case "audio/midi":
                        i10 = 15;
                        break;
                    case "video/x-matroska":
                    case "audio/x-matroska":
                    case "video/webm":
                    case "audio/webm":
                    case "application/webm":
                        i10 = 6;
                        break;
                    case "audio/mpeg":
                        i10 = 7;
                        break;
                    case "video/mp4":
                    case "audio/mp4":
                    case "application/mp4":
                        i10 = 8;
                        break;
                    case "audio/ogg":
                        i10 = 9;
                        break;
                    case "video/mp2p":
                        i10 = 10;
                        break;
                    case "video/mp2t":
                        i10 = 11;
                        break;
                    case "audio/wav":
                        i10 = 12;
                        break;
                    case "text/vtt":
                        i10 = 13;
                        break;
                    case "image/jpeg":
                        i10 = 14;
                        break;
                    case "video/x-msvideo":
                        i10 = 16;
                        break;
                    case "image/png":
                        i10 = 17;
                        break;
                    case "image/webp":
                        i10 = 18;
                        break;
                    case "image/bmp":
                        i10 = 19;
                        break;
                    case "image/heif":
                    case "image/heic":
                        i10 = 20;
                        break;
                    case "image/avif":
                        i10 = 21;
                        break;
                    default:
                        i10 = -1;
                        break;
                }
            } else {
                i10 = -1;
            }
            if (i10 != -1) {
                b(i10, arrayList);
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                i11 = -1;
            } else if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                i11 = 0;
            } else if (lastPathSegment.endsWith(".ac4")) {
                i11 = 1;
            } else if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
                i11 = 2;
            } else if (lastPathSegment.endsWith(".amr")) {
                i11 = 3;
            } else if (lastPathSegment.endsWith(".flac")) {
                i11 = 4;
            } else if (lastPathSegment.endsWith(".flv")) {
                i11 = 5;
            } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                i11 = 15;
            } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
                i11 = 6;
            } else if (lastPathSegment.endsWith(".mp3")) {
                i11 = 7;
            } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                i11 = 8;
            } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                i11 = 9;
            } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                i11 = 10;
            } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                i11 = 11;
            } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                i11 = 12;
            } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                i11 = 13;
            } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                i11 = 14;
            } else if (lastPathSegment.endsWith(".avi")) {
                i11 = 16;
            } else if (lastPathSegment.endsWith(".png")) {
                i11 = 17;
            } else if (lastPathSegment.endsWith(".webp")) {
                i11 = 18;
            } else if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
                i11 = 19;
            } else if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
                i11 = 20;
            } else if (lastPathSegment.endsWith(".avif")) {
                i11 = 21;
            } else {
                i11 = -1;
            }
            if (i11 != -1 && i11 != i10) {
                b(i11, arrayList);
            }
            int[] iArr = f18332c;
            for (int i12 = 0; i12 < 21; i12++) {
                int i13 = iArr[i12];
                if (i13 != i10 && i13 != i11) {
                    b(i13, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (I1[]) arrayList.toArray(new I1[0]);
    }

    @Override // com.google.android.gms.internal.ads.O1
    public final synchronized I1[] zza() {
        return a(Uri.EMPTY, new HashMap());
    }
}
