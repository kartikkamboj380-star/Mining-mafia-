package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Scopes;
import com.google.protobuf.DescriptorProtos;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.MimeTypes;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3804i0 extends DY0 implements InterfaceC5691x0 {

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    private static final int[] f29171H1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    private static boolean f29172I1;

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    private static boolean f29173J1;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    private C3152cp f29174A1;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    private int f29175B1;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    private int f29176C1;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    private InterfaceC5439v0 f29177D1;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    private long f29178E1;

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    private long f29179F1;

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    private boolean f29180G1;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    private final Context f29181V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    private final boolean f29182W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    private final Y0 f29183X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    private final boolean f29184Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    private final C5817y0 f29185Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private final C5565w0 f29186a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private final long f29187b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private final PriorityQueue f29188c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private C3678h0 f29189d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private boolean f29190e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private boolean f29191f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private InterfaceC3303e1 f29192g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private boolean f29193h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private int f29194i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private List f29195j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private Surface f29196k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private C4054k0 f29197l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private C4816q20 f29198m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private boolean f29199n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private int f29200o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f29201p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private long f29202q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private int f29203r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private int f29204s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private int f29205t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private LS0 f29206u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private boolean f29207v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private long f29208w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private int f29209x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private long f29210y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    private C3152cp f29211z1;

    protected C3804i0(C3552g0 c3552g0) {
        super(2, c3552g0.g(), c3552g0.f(), false, 30.0f);
        Context applicationContext = c3552g0.e().getApplicationContext();
        this.f29181V0 = applicationContext;
        this.f29192g1 = null;
        this.f29183X0 = new Y0(c3552g0.h(), c3552g0.i());
        this.f29182W0 = this.f29192g1 == null;
        this.f29185Z0 = new C5817y0(applicationContext, this, 0L);
        this.f29186a1 = new C5565w0();
        this.f29184Y0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.f29198m1 = C4816q20.f32548c;
        this.f29200o1 = 1;
        this.f29201p1 = 0;
        this.f29211z1 = C3152cp.f27221d;
        this.f29176C1 = 0;
        this.f29174A1 = null;
        this.f29175B1 = -1000;
        this.f29178E1 = -9223372036854775807L;
        this.f29179F1 = -9223372036854775807L;
        this.f29188c1 = new PriorityQueue();
        this.f29187b1 = -9223372036854775807L;
        this.f29206u1 = null;
    }

    protected static final boolean A1(C4880qY0 c4880qY0) {
        return Build.VERSION.SDK_INT >= 35 && c4880qY0.f32663h;
    }

    private static List B1(Context context, FY0 fy0, JY0 jy0, boolean z9, boolean z10) {
        String str = jy0.f19929o;
        if (str == null) {
            return AbstractC5931yu0.l();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !AbstractC3300e0.a(context)) {
            List listD = SY0.d(fy0, jy0, z9, z10);
            if (!listD.isEmpty()) {
                return listD;
            }
        }
        return SY0.c(fy0, jy0, z9, z10);
    }

    private final void C1(Object obj) throws LQ0 {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.f29196k1 == surface) {
            if (surface != null) {
                K1();
                Surface surface2 = this.f29196k1;
                if (surface2 == null || !this.f29199n1) {
                    return;
                }
                this.f29183X0.g(surface2);
                return;
            }
            return;
        }
        this.f29196k1 = surface;
        if (this.f29192g1 == null) {
            this.f29185Z0.d(surface);
        }
        this.f29199n1 = false;
        int iZze = zze();
        InterfaceC4502nY0 interfaceC4502nY0D0 = d0();
        if (interfaceC4502nY0D0 != null && this.f29192g1 == null) {
            C4880qY0 c4880qY0G0 = g0();
            c4880qY0G0.getClass();
            if (!G1(c4880qY0G0) || this.f29190e1) {
                h0();
                Z();
            } else {
                Surface surfaceH1 = H1(c4880qY0G0);
                if (surfaceH1 != null) {
                    interfaceC4502nY0D0.a(surfaceH1);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    interfaceC4502nY0D0.zzo();
                }
            }
        }
        if (surface != null) {
            K1();
        } else {
            this.f29174A1 = null;
            InterfaceC3303e1 interfaceC3303e1 = this.f29192g1;
            if (interfaceC3303e1 != null) {
                interfaceC3303e1.a();
            }
        }
        if (iZze == 2) {
            InterfaceC3303e1 interfaceC3303e2 = this.f29192g1;
            if (interfaceC3303e2 != null) {
                interfaceC3303e2.Q(true);
            } else {
                this.f29185Z0.j(true);
            }
        }
    }

    private final boolean D1(C5741xO0 c5741xO0) {
        if (C() || c5741xO0.d() || this.f29179F1 == -9223372036854775807L) {
            return true;
        }
        return this.f29179F1 - (c5741xO0.f34805f - Y0()) <= 100000;
    }

    private final boolean E1(C5741xO0 c5741xO0) {
        return c5741xO0.f34805f < K();
    }

    private final void F1(long j10, long j11, JY0 jy0) {
        InterfaceC5439v0 interfaceC5439v0 = this.f29177D1;
        if (interfaceC5439v0 != null) {
            interfaceC5439v0.c(j10, j11, jy0, f0());
        }
    }

    private final boolean G1(C4880qY0 c4880qY0) {
        if (this.f29192g1 != null) {
            return true;
        }
        Surface surface = this.f29196k1;
        return (surface != null && surface.isValid()) || A1(c4880qY0) || u1(c4880qY0);
    }

    private final Surface H1(C4880qY0 c4880qY0) {
        InterfaceC3303e1 interfaceC3303e1 = this.f29192g1;
        if (interfaceC3303e1 != null) {
            return interfaceC3303e1.zzk();
        }
        Surface surface = this.f29196k1;
        if (surface != null) {
            return surface;
        }
        if (A1(c4880qY0)) {
            return null;
        }
        AbstractC2418Ss0.i(u1(c4880qY0));
        C4054k0 c4054k0 = this.f29197l1;
        if (c4054k0 != null) {
            if (c4054k0.f30661a != c4880qY0.f32661f) {
                I1();
            }
        }
        if (this.f29197l1 == null) {
            this.f29197l1 = C4054k0.b(this.f29181V0, c4880qY0.f32661f);
        }
        return this.f29197l1;
    }

    private final void I1() {
        C4054k0 c4054k0 = this.f29197l1;
        if (c4054k0 != null) {
            c4054k0.release();
            this.f29197l1 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J1, reason: merged with bridge method [inline-methods] */
    public final void x1() {
        this.f29183X0.g(this.f29196k1);
        this.f29199n1 = true;
    }

    private final void K1() {
        C3152cp c3152cp = this.f29174A1;
        if (c3152cp != null) {
            this.f29183X0.f(c3152cp);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    public static int o1(C4880qY0 c4880qY0, JY0 jy0) {
        int i10 = jy0.f19936v;
        int i11 = jy0.f19937w;
        if (i10 != -1 && i11 != -1) {
            String str = jy0.f19929o;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                Pair pairD = GM.d(jy0);
                if (pairD == null) {
                    str = MimeTypes.VIDEO_H265;
                } else {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                        str = MimeTypes.VIDEO_H264;
                    } else if (iIntValue == 1024) {
                        str = MimeTypes.VIDEO_AV1;
                    } else {
                        str = MimeTypes.VIDEO_H265;
                    }
                }
            }
            int i12 = 4;
            switch (str) {
                case "video/3gpp":
                case "video/mp4v-es":
                case "video/av01":
                case "video/x-vnd.on2.vp8":
                    return ((i10 * i11) * 3) / i12;
                case "video/hevc":
                    return Math.max(2097152, ((i10 * i11) * 3) / 4);
                case "video/avc":
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !c4880qY0.f32661f)))) {
                        String str3 = AbstractC4634ob0.f32117a;
                        return ((((i10 + 15) / 16) * ((i11 + 15) / 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    i12 = 8;
                    return ((i10 * i11) * 3) / i12;
            }
        }
        return -1;
    }

    protected static int v1(C4880qY0 c4880qY0, JY0 jy0) {
        int i10 = jy0.f19930p;
        if (i10 == -1) {
            return o1(c4880qY0, jy0);
        }
        List list = jy0.f19932r;
        int size = list.size();
        int length = 0;
        for (int i11 = 0; i11 < size; i11++) {
            length += ((byte[]) list.get(i11)).length;
        }
        return i10 + length;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:102:0x014b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0153  */
    /* JADX WARN: Code duplicated, block: B:105:0x0157  */
    /* JADX WARN: Code duplicated, block: B:107:0x015f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0163  */
    /* JADX WARN: Code duplicated, block: B:110:0x016b  */
    /* JADX WARN: Code duplicated, block: B:111:0x016f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0177  */
    /* JADX WARN: Code duplicated, block: B:114:0x017b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0183  */
    /* JADX WARN: Code duplicated, block: B:117:0x0187  */
    /* JADX WARN: Code duplicated, block: B:119:0x018f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0193  */
    /* JADX WARN: Code duplicated, block: B:122:0x019b  */
    /* JADX WARN: Code duplicated, block: B:123:0x019f  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:131:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:132:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:134:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:135:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:137:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:138:0x01db  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:141:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:149:0x0207  */
    /* JADX WARN: Code duplicated, block: B:150:0x020b  */
    /* JADX WARN: Code duplicated, block: B:152:0x0213  */
    /* JADX WARN: Code duplicated, block: B:153:0x0217  */
    /* JADX WARN: Code duplicated, block: B:155:0x021f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0223  */
    /* JADX WARN: Code duplicated, block: B:158:0x022b  */
    /* JADX WARN: Code duplicated, block: B:159:0x022f  */
    /* JADX WARN: Code duplicated, block: B:161:0x0237  */
    /* JADX WARN: Code duplicated, block: B:162:0x023b  */
    /* JADX WARN: Code duplicated, block: B:164:0x0243  */
    /* JADX WARN: Code duplicated, block: B:165:0x0247  */
    /* JADX WARN: Code duplicated, block: B:167:0x024f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0253  */
    /* JADX WARN: Code duplicated, block: B:170:0x025b  */
    /* JADX WARN: Code duplicated, block: B:171:0x025f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0267  */
    /* JADX WARN: Code duplicated, block: B:174:0x026b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0273  */
    /* JADX WARN: Code duplicated, block: B:177:0x0277  */
    /* JADX WARN: Code duplicated, block: B:179:0x027f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0283  */
    /* JADX WARN: Code duplicated, block: B:182:0x028b  */
    /* JADX WARN: Code duplicated, block: B:183:0x028f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0297  */
    /* JADX WARN: Code duplicated, block: B:186:0x029b  */
    /* JADX WARN: Code duplicated, block: B:188:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:189:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:191:0x02af  */
    /* JADX WARN: Code duplicated, block: B:192:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:194:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:195:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:197:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:198:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:200:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:201:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:203:0x02df  */
    /* JADX WARN: Code duplicated, block: B:204:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:206:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:207:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:209:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:210:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:212:0x0302  */
    /* JADX WARN: Code duplicated, block: B:213:0x0306  */
    /* JADX WARN: Code duplicated, block: B:215:0x030e  */
    /* JADX WARN: Code duplicated, block: B:216:0x0312  */
    /* JADX WARN: Code duplicated, block: B:218:0x031a  */
    /* JADX WARN: Code duplicated, block: B:219:0x031e  */
    /* JADX WARN: Code duplicated, block: B:221:0x0326  */
    /* JADX WARN: Code duplicated, block: B:222:0x032a  */
    /* JADX WARN: Code duplicated, block: B:224:0x0332  */
    /* JADX WARN: Code duplicated, block: B:225:0x0336  */
    /* JADX WARN: Code duplicated, block: B:227:0x033e  */
    /* JADX WARN: Code duplicated, block: B:228:0x0342  */
    /* JADX WARN: Code duplicated, block: B:230:0x034a  */
    /* JADX WARN: Code duplicated, block: B:231:0x034e  */
    /* JADX WARN: Code duplicated, block: B:233:0x0356  */
    /* JADX WARN: Code duplicated, block: B:234:0x035a  */
    /* JADX WARN: Code duplicated, block: B:236:0x0362  */
    /* JADX WARN: Code duplicated, block: B:237:0x0366  */
    /* JADX WARN: Code duplicated, block: B:239:0x036e  */
    /* JADX WARN: Code duplicated, block: B:240:0x0372  */
    /* JADX WARN: Code duplicated, block: B:242:0x037a  */
    /* JADX WARN: Code duplicated, block: B:243:0x037e  */
    /* JADX WARN: Code duplicated, block: B:245:0x0386  */
    /* JADX WARN: Code duplicated, block: B:246:0x038a  */
    /* JADX WARN: Code duplicated, block: B:248:0x0392  */
    /* JADX WARN: Code duplicated, block: B:249:0x0396  */
    /* JADX WARN: Code duplicated, block: B:251:0x039e  */
    /* JADX WARN: Code duplicated, block: B:252:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:254:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:255:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:257:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:258:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:260:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:261:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:263:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:264:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:266:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:267:0x03db  */
    /* JADX WARN: Code duplicated, block: B:269:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:270:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:272:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:273:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:275:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:276:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:278:0x0407  */
    /* JADX WARN: Code duplicated, block: B:279:0x040b  */
    /* JADX WARN: Code duplicated, block: B:281:0x0413  */
    /* JADX WARN: Code duplicated, block: B:282:0x0417  */
    /* JADX WARN: Code duplicated, block: B:284:0x041f  */
    /* JADX WARN: Code duplicated, block: B:285:0x0423  */
    /* JADX WARN: Code duplicated, block: B:287:0x042b  */
    /* JADX WARN: Code duplicated, block: B:288:0x042f  */
    /* JADX WARN: Code duplicated, block: B:290:0x0437  */
    /* JADX WARN: Code duplicated, block: B:291:0x043b  */
    /* JADX WARN: Code duplicated, block: B:293:0x0443  */
    /* JADX WARN: Code duplicated, block: B:294:0x0447  */
    /* JADX WARN: Code duplicated, block: B:296:0x044f  */
    /* JADX WARN: Code duplicated, block: B:297:0x0453  */
    /* JADX WARN: Code duplicated, block: B:299:0x045b  */
    /* JADX WARN: Code duplicated, block: B:300:0x045f  */
    /* JADX WARN: Code duplicated, block: B:302:0x0467  */
    /* JADX WARN: Code duplicated, block: B:303:0x046b  */
    /* JADX WARN: Code duplicated, block: B:305:0x0473  */
    /* JADX WARN: Code duplicated, block: B:306:0x0477  */
    /* JADX WARN: Code duplicated, block: B:308:0x047f  */
    /* JADX WARN: Code duplicated, block: B:309:0x0483  */
    /* JADX WARN: Code duplicated, block: B:311:0x048b  */
    /* JADX WARN: Code duplicated, block: B:312:0x048f  */
    /* JADX WARN: Code duplicated, block: B:314:0x0497  */
    /* JADX WARN: Code duplicated, block: B:315:0x049a  */
    /* JADX WARN: Code duplicated, block: B:317:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:318:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:320:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:321:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:323:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:324:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:327:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:329:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:330:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:332:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:333:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:335:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:336:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:338:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:339:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:341:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:342:0x0500  */
    /* JADX WARN: Code duplicated, block: B:344:0x0508  */
    /* JADX WARN: Code duplicated, block: B:345:0x050c  */
    /* JADX WARN: Code duplicated, block: B:347:0x0514  */
    /* JADX WARN: Code duplicated, block: B:348:0x0518  */
    /* JADX WARN: Code duplicated, block: B:350:0x0520  */
    /* JADX WARN: Code duplicated, block: B:351:0x0524  */
    /* JADX WARN: Code duplicated, block: B:353:0x052c  */
    /* JADX WARN: Code duplicated, block: B:354:0x0530  */
    /* JADX WARN: Code duplicated, block: B:356:0x0538  */
    /* JADX WARN: Code duplicated, block: B:357:0x053c  */
    /* JADX WARN: Code duplicated, block: B:359:0x0544  */
    /* JADX WARN: Code duplicated, block: B:360:0x0548  */
    /* JADX WARN: Code duplicated, block: B:362:0x0550  */
    /* JADX WARN: Code duplicated, block: B:363:0x0554  */
    /* JADX WARN: Code duplicated, block: B:365:0x055c  */
    /* JADX WARN: Code duplicated, block: B:366:0x0560  */
    /* JADX WARN: Code duplicated, block: B:368:0x0568  */
    /* JADX WARN: Code duplicated, block: B:369:0x056c  */
    /* JADX WARN: Code duplicated, block: B:371:0x0574  */
    /* JADX WARN: Code duplicated, block: B:372:0x0578  */
    /* JADX WARN: Code duplicated, block: B:374:0x0580  */
    /* JADX WARN: Code duplicated, block: B:375:0x0584  */
    /* JADX WARN: Code duplicated, block: B:377:0x058c  */
    /* JADX WARN: Code duplicated, block: B:378:0x0590  */
    /* JADX WARN: Code duplicated, block: B:380:0x0598  */
    /* JADX WARN: Code duplicated, block: B:381:0x059c  */
    /* JADX WARN: Code duplicated, block: B:383:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:384:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:386:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:387:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:389:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:390:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:392:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:393:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:395:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:396:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:398:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:399:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:401:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:402:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:404:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:405:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:407:0x0604  */
    /* JADX WARN: Code duplicated, block: B:408:0x0608  */
    /* JADX WARN: Code duplicated, block: B:410:0x0610  */
    /* JADX WARN: Code duplicated, block: B:411:0x0614  */
    /* JADX WARN: Code duplicated, block: B:413:0x061c  */
    /* JADX WARN: Code duplicated, block: B:414:0x0620  */
    /* JADX WARN: Code duplicated, block: B:416:0x0628  */
    /* JADX WARN: Code duplicated, block: B:417:0x062c  */
    /* JADX WARN: Code duplicated, block: B:419:0x0634  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:420:0x0638  */
    /* JADX WARN: Code duplicated, block: B:422:0x0640  */
    /* JADX WARN: Code duplicated, block: B:423:0x0644  */
    /* JADX WARN: Code duplicated, block: B:425:0x064c  */
    /* JADX WARN: Code duplicated, block: B:426:0x0650  */
    /* JADX WARN: Code duplicated, block: B:428:0x0658  */
    /* JADX WARN: Code duplicated, block: B:429:0x065b  */
    /* JADX WARN: Code duplicated, block: B:431:0x0663  */
    /* JADX WARN: Code duplicated, block: B:432:0x0666  */
    /* JADX WARN: Code duplicated, block: B:434:0x066e  */
    /* JADX WARN: Code duplicated, block: B:435:0x0672  */
    /* JADX WARN: Code duplicated, block: B:437:0x067a  */
    /* JADX WARN: Code duplicated, block: B:438:0x067e  */
    /* JADX WARN: Code duplicated, block: B:440:0x0686  */
    /* JADX WARN: Code duplicated, block: B:441:0x068a  */
    /* JADX WARN: Code duplicated, block: B:443:0x0692  */
    /* JADX WARN: Code duplicated, block: B:444:0x0696  */
    /* JADX WARN: Code duplicated, block: B:446:0x069e  */
    /* JADX WARN: Code duplicated, block: B:447:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:449:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:450:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:452:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:453:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:455:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:456:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:458:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:459:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:461:0x06da  */
    /* JADX WARN: Code duplicated, block: B:462:0x06de  */
    /* JADX WARN: Code duplicated, block: B:464:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:465:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:467:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:468:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:470:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:471:0x0702  */
    /* JADX WARN: Code duplicated, block: B:473:0x070a  */
    /* JADX WARN: Code duplicated, block: B:474:0x070e  */
    /* JADX WARN: Code duplicated, block: B:476:0x0716  */
    /* JADX WARN: Code duplicated, block: B:477:0x071a  */
    /* JADX WARN: Code duplicated, block: B:479:0x0722  */
    /* JADX WARN: Code duplicated, block: B:480:0x0726  */
    /* JADX WARN: Code duplicated, block: B:482:0x072e  */
    /* JADX WARN: Code duplicated, block: B:483:0x0731  */
    /* JADX WARN: Code duplicated, block: B:485:0x0739  */
    /* JADX WARN: Code duplicated, block: B:486:0x073c  */
    /* JADX WARN: Code duplicated, block: B:488:0x0744  */
    /* JADX WARN: Code duplicated, block: B:489:0x0747  */
    /* JADX WARN: Code duplicated, block: B:491:0x074f  */
    /* JADX WARN: Code duplicated, block: B:492:0x0752  */
    /* JADX WARN: Code duplicated, block: B:494:0x075a  */
    /* JADX WARN: Code duplicated, block: B:495:0x075d  */
    /* JADX WARN: Code duplicated, block: B:497:0x0765  */
    /* JADX WARN: Code duplicated, block: B:498:0x0768  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:516:0x07a1, B:46:0x008a, B:49:0x0095, B:84:0x0104, B:509:0x078d, B:517:0x07a5), top: B:522:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:500:0x0770  */
    /* JADX WARN: Code duplicated, block: B:501:0x0773  */
    /* JADX WARN: Code duplicated, block: B:503:0x077b  */
    /* JADX WARN: Code duplicated, block: B:504:0x077e  */
    /* JADX WARN: Code duplicated, block: B:506:0x0786  */
    /* JADX WARN: Code duplicated, block: B:507:0x0789  */
    /* JADX WARN: Code duplicated, block: B:509:0x078d A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:516:0x07a1, B:46:0x008a, B:49:0x0095, B:84:0x0104, B:509:0x078d, B:517:0x07a5), top: B:522:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:513:0x0797  */
    /* JADX WARN: Code duplicated, block: B:532:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:540:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:545:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:560:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:570:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:580:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:590:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:600:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00be  */
    /* JADX WARN: Code duplicated, block: B:620:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:630:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:650:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:660:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:680:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00de  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:82:0x0100  */
    /* JADX WARN: Code duplicated, block: B:84:0x0104 A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:516:0x07a1, B:46:0x008a, B:49:0x0095, B:84:0x0104, B:509:0x078d, B:517:0x07a5), top: B:522:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:87:0x010f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0117  */
    /* JADX WARN: Code duplicated, block: B:90:0x011b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0123  */
    /* JADX WARN: Code duplicated, block: B:93:0x0127  */
    /* JADX WARN: Code duplicated, block: B:95:0x012f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0133  */
    /* JADX WARN: Code duplicated, block: B:98:0x013b  */
    /* JADX WARN: Code duplicated, block: B:99:0x013f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    protected static final boolean z1(String str) {
        String str2;
        byte b10;
        String str3;
        byte b11;
        boolean z9 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C3804i0.class) {
            if (!f29172I1) {
                int i10 = Build.VERSION.SDK_INT;
                byte b12 = 28;
                if (i10 <= 28) {
                    String str4 = Build.DEVICE;
                    switch (str4.hashCode()) {
                        case -1339091551:
                            b11 = !str4.equals("dangal") ? (byte) -1 : (byte) 1;
                            break;
                        case -1220081023:
                            b11 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 3;
                            break;
                        case -1220066608:
                            b11 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                            break;
                        case -1012436106:
                            b11 = !str4.equals("oneday") ? (byte) -1 : (byte) 7;
                            break;
                        case -760312546:
                            b11 = !str4.equals("aquaman") ? (byte) -1 : (byte) 0;
                            break;
                        case -64886864:
                            b11 = !str4.equals("magnolia") ? (byte) -1 : (byte) 4;
                            break;
                        case 3415681:
                            b11 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                            break;
                        case 825323514:
                            b11 = !str4.equals("machuca") ? (byte) -1 : (byte) 5;
                            break;
                        default:
                            b11 = -1;
                            break;
                    }
                    switch (b11) {
                        default:
                            if (i10 <= 27 || !"HWEML".equals(Build.DEVICE)) {
                                str2 = Build.MODEL;
                                switch (str2.hashCode()) {
                                    case -349662828:
                                        if (!str2.equals("AFTJMST12")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 6;
                                        }
                                        break;
                                    case -321033677:
                                        if (!str2.equals("AFTKMST12")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 7;
                                        }
                                        break;
                                    case 2006354:
                                        if (!str2.equals("AFTA")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 0;
                                        }
                                        break;
                                    case 2006367:
                                        if (!str2.equals("AFTN")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 1;
                                        }
                                        break;
                                    case 2006371:
                                        if (!str2.equals("AFTR")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 2;
                                        }
                                        break;
                                    case 1785421873:
                                        if (!str2.equals("AFTEU011")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 3;
                                        }
                                        break;
                                    case 1785421876:
                                        if (!str2.equals("AFTEU014")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 4;
                                        }
                                        break;
                                    case 1798172390:
                                        if (!str2.equals("AFTSO001")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 8;
                                        }
                                        break;
                                    case 2119412532:
                                        if (!str2.equals("AFTEUFF014")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 5;
                                        }
                                        break;
                                    default:
                                        b10 = -1;
                                        break;
                                }
                                switch (b10) {
                                    default:
                                        if (i10 <= 26) {
                                            str3 = Build.DEVICE;
                                            switch (str3.hashCode()) {
                                                case -2144781245:
                                                    if (!str3.equals("GIONEE_SWW1609")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 54;
                                                    }
                                                    break;
                                                case -2144781185:
                                                    if (!str3.equals("GIONEE_SWW1627")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 55;
                                                    }
                                                    break;
                                                case -2144781160:
                                                    if (!str3.equals("GIONEE_SWW1631")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 56;
                                                    }
                                                    break;
                                                case -2097309513:
                                                    if (!str3.equals("K50a40")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 74;
                                                    }
                                                    break;
                                                case -2022874474:
                                                    if (!str3.equals("CP8676_I02")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 22;
                                                    }
                                                    break;
                                                case -1978993182:
                                                    if (!str3.equals("NX541J")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 89;
                                                    }
                                                    break;
                                                case -1978990237:
                                                    if (!str3.equals("NX573J")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 90;
                                                    }
                                                    break;
                                                case -1936688988:
                                                    if (!str3.equals("PGN528")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 101;
                                                    }
                                                    break;
                                                case -1936688066:
                                                    if (!str3.equals("PGN610")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 102;
                                                    }
                                                    break;
                                                case -1936688065:
                                                    if (!str3.equals("PGN611")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 103;
                                                    }
                                                    break;
                                                case -1931988508:
                                                    if (!str3.equals("AquaPowerM")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 13;
                                                    }
                                                    break;
                                                case -1885099851:
                                                    if (!str3.equals("RAIJIN")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 116;
                                                    }
                                                    break;
                                                case -1696512866:
                                                    if (!str3.equals("XT1663")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 137;
                                                    }
                                                    break;
                                                case -1680025915:
                                                    if (!str3.equals("ComioS1")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 21;
                                                    }
                                                    break;
                                                case -1615810839:
                                                    if (!str3.equals("Phantom6")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 104;
                                                    }
                                                    break;
                                                case -1600724499:
                                                    if (!str3.equals("pacificrim")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 95;
                                                    }
                                                    break;
                                                case -1554255044:
                                                    if (!str3.equals("vernee_M5")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 130;
                                                    }
                                                    break;
                                                case -1481772737:
                                                    if (!str3.equals("panell_dl")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 97;
                                                    }
                                                    break;
                                                case -1481772730:
                                                    if (!str3.equals("panell_ds")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 98;
                                                    }
                                                    break;
                                                case -1481772729:
                                                    if (!str3.equals("panell_dt")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 99;
                                                    }
                                                    break;
                                                case -1320080169:
                                                    if (!str3.equals("GiONEE_GBL7319")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 52;
                                                    }
                                                    break;
                                                case -1217592143:
                                                    if (!str3.equals("BRAVIA_ATV2")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 18;
                                                    }
                                                    break;
                                                case -1180384755:
                                                    if (!str3.equals("iris60")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 70;
                                                    }
                                                    break;
                                                case -1139198265:
                                                    if (!str3.equals("Slate_Pro")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 118;
                                                    }
                                                    break;
                                                case -1052835013:
                                                    if (!str3.equals("namath")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 87;
                                                    }
                                                    break;
                                                case -993250464:
                                                    if (!str3.equals("A10-70F")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 5;
                                                    }
                                                    break;
                                                case -993250458:
                                                    if (!str3.equals("A10-70L")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 6;
                                                    }
                                                    break;
                                                case -965403638:
                                                    if (!str3.equals("s905x018")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 120;
                                                    }
                                                    break;
                                                case -958336948:
                                                    if (!str3.equals("ELUGA_Ray_X")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 34;
                                                    }
                                                    break;
                                                case -879245230:
                                                    if (!str3.equals("tcl_eu")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 126;
                                                    }
                                                    break;
                                                case -842500323:
                                                    if (!str3.equals("nicklaus_f")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 88;
                                                    }
                                                    break;
                                                case -821392978:
                                                    if (!str3.equals("A7000-a")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 9;
                                                    }
                                                    break;
                                                case -797483286:
                                                    if (!str3.equals("SVP-DTV15")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 119;
                                                    }
                                                    break;
                                                case -794946968:
                                                    if (!str3.equals("watson")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 131;
                                                    }
                                                    break;
                                                case -788334647:
                                                    if (!str3.equals("whyred")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 132;
                                                    }
                                                    break;
                                                case -782144577:
                                                    if (!str3.equals("OnePlus5T")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 91;
                                                    }
                                                    break;
                                                case -575125681:
                                                    if (!str3.equals("GiONEE_CBL7513")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 51;
                                                    }
                                                    break;
                                                case -521118391:
                                                    if (!str3.equals("GIONEE_GBL7360")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 53;
                                                    }
                                                    break;
                                                case -430914369:
                                                    if (!str3.equals("Pixi4-7_3G")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 105;
                                                    }
                                                    break;
                                                case -290434366:
                                                    if (!str3.equals("taido_row")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 121;
                                                    }
                                                    break;
                                                case -282781963:
                                                    if (!str3.equals("BLACK-1X")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 17;
                                                    }
                                                    break;
                                                case -277133239:
                                                    if (!str3.equals("Z12_PRO")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 138;
                                                    }
                                                    break;
                                                case -173639913:
                                                    if (!str3.equals("ELUGA_A3_Pro")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 31;
                                                    }
                                                    break;
                                                case -56598463:
                                                    if (!str3.equals("woods_fn")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 134;
                                                    }
                                                    break;
                                                case 2126:
                                                    if (!str3.equals("C1")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 20;
                                                    }
                                                    break;
                                                case 2564:
                                                    if (!str3.equals("Q5")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 113;
                                                    }
                                                    break;
                                                case 2715:
                                                    if (!str3.equals("V1")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 127;
                                                    }
                                                    break;
                                                case 2719:
                                                    if (!str3.equals("V5")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 129;
                                                    }
                                                    break;
                                                case 3091:
                                                    if (!str3.equals("b5")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 16;
                                                    }
                                                    break;
                                                case 3483:
                                                    if (!str3.equals("mh")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 84;
                                                    }
                                                    break;
                                                case 73405:
                                                    if (!str3.equals("JGZ")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 73;
                                                    }
                                                    break;
                                                case 75537:
                                                    if (!str3.equals("M04")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 79;
                                                    }
                                                    break;
                                                case 75739:
                                                    if (!str3.equals("M5c")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 80;
                                                    }
                                                    break;
                                                case 76779:
                                                    if (!str3.equals("MX6")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 86;
                                                    }
                                                    break;
                                                case 78669:
                                                    if (!str3.equals("P85")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 94;
                                                    }
                                                    break;
                                                case 79305:
                                                    if (!str3.equals("PLE")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 107;
                                                    }
                                                    break;
                                                case 80618:
                                                    if (!str3.equals("QX1")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 115;
                                                    }
                                                    break;
                                                case 88274:
                                                    if (!str3.equals("Z80")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 139;
                                                    }
                                                    break;
                                                case 98846:
                                                    if (!str3.equals("cv1")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 26;
                                                    }
                                                    break;
                                                case 98848:
                                                    if (!str3.equals("cv3")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 27;
                                                    }
                                                    break;
                                                case 99329:
                                                    if (!str3.equals("deb")) {
                                                        b12 = -1;
                                                    }
                                                    break;
                                                case 101481:
                                                    if (!str3.equals("flo")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 49;
                                                    }
                                                    break;
                                                case 1513190:
                                                    if (!str3.equals("1601")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 0;
                                                    }
                                                    break;
                                                case 1514184:
                                                    if (!str3.equals("1713")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 1;
                                                    }
                                                    break;
                                                case 1514185:
                                                    if (!str3.equals("1714")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 2;
                                                    }
                                                    break;
                                                case 2133089:
                                                    if (!str3.equals("F01H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 36;
                                                    }
                                                    break;
                                                case 2133091:
                                                    if (!str3.equals("F01J")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 37;
                                                    }
                                                    break;
                                                case 2133120:
                                                    if (!str3.equals("F02H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 38;
                                                    }
                                                    break;
                                                case 2133151:
                                                    if (!str3.equals("F03H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 39;
                                                    }
                                                    break;
                                                case 2133182:
                                                    if (!str3.equals("F04H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 40;
                                                    }
                                                    break;
                                                case 2133184:
                                                    if (!str3.equals("F04J")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 41;
                                                    }
                                                    break;
                                                case 2436959:
                                                    if (!str3.equals("P681")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 93;
                                                    }
                                                    break;
                                                case 2463773:
                                                    if (!str3.equals("Q350")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 109;
                                                    }
                                                    break;
                                                case 2464648:
                                                    if (!str3.equals("Q427")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 111;
                                                    }
                                                    break;
                                                case 2689555:
                                                    if (!str3.equals("XE2X")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 136;
                                                    }
                                                    break;
                                                case 3154429:
                                                    if (!str3.equals("fugu")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 50;
                                                    }
                                                    break;
                                                case 3284551:
                                                    if (!str3.equals("kate")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 75;
                                                    }
                                                    break;
                                                case 3351335:
                                                    if (!str3.equals("mido")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 85;
                                                    }
                                                    break;
                                                case 3386211:
                                                    if (!str3.equals("p212")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 92;
                                                    }
                                                    break;
                                                case 41325051:
                                                    if (!str3.equals("MEIZU_M5")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 83;
                                                    }
                                                    break;
                                                case 51349633:
                                                    if (!str3.equals("601LV")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 3;
                                                    }
                                                    break;
                                                case 51350594:
                                                    if (!str3.equals("602LV")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 4;
                                                    }
                                                    break;
                                                case 55178625:
                                                    if (!str3.equals("Aura_Note_2")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 15;
                                                    }
                                                    break;
                                                case 61542055:
                                                    if (!str3.equals("A1601")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 7;
                                                    }
                                                    break;
                                                case 65355429:
                                                    if (!str3.equals("E5643")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 30;
                                                    }
                                                    break;
                                                case 66214468:
                                                    if (!str3.equals("F3111")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 42;
                                                    }
                                                    break;
                                                case 66214470:
                                                    if (!str3.equals("F3113")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 43;
                                                    }
                                                    break;
                                                case 66214473:
                                                    if (!str3.equals("F3116")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 44;
                                                    }
                                                    break;
                                                case 66215429:
                                                    if (!str3.equals("F3211")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 45;
                                                    }
                                                    break;
                                                case 66215431:
                                                    if (!str3.equals("F3213")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 46;
                                                    }
                                                    break;
                                                case 66215433:
                                                    if (!str3.equals("F3215")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 47;
                                                    }
                                                    break;
                                                case 66216390:
                                                    if (!str3.equals("F3311")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 48;
                                                    }
                                                    break;
                                                case 76402249:
                                                    if (!str3.equals("PRO7S")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 108;
                                                    }
                                                    break;
                                                case 76404105:
                                                    if (!str3.equals("Q4260")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 110;
                                                    }
                                                    break;
                                                case 76404911:
                                                    if (!str3.equals("Q4310")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 112;
                                                    }
                                                    break;
                                                case 80963634:
                                                    if (!str3.equals("V23GB")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 128;
                                                    }
                                                    break;
                                                case 82882791:
                                                    if (!str3.equals("X3_HK")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 135;
                                                    }
                                                    break;
                                                case 98715550:
                                                    if (!str3.equals("i9031")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 67;
                                                    }
                                                    break;
                                                case 101370885:
                                                    if (!str3.equals("l5460")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 76;
                                                    }
                                                    break;
                                                case 102844228:
                                                    if (!str3.equals("le_x6")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 77;
                                                    }
                                                    break;
                                                case 165221241:
                                                    if (!str3.equals("A2016a40")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 8;
                                                    }
                                                    break;
                                                case 182191441:
                                                    if (!str3.equals("CPY83_I00")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 25;
                                                    }
                                                    break;
                                                case 245388979:
                                                    if (!str3.equals("marino_f")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 82;
                                                    }
                                                    break;
                                                case 287431619:
                                                    if (!str3.equals("griffin")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 60;
                                                    }
                                                    break;
                                                case 307593612:
                                                    if (!str3.equals("A7010a48")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 11;
                                                    }
                                                    break;
                                                case 308517133:
                                                    if (!str3.equals("A7020a48")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 12;
                                                    }
                                                    break;
                                                case 316215098:
                                                    if (!str3.equals("TB3-730F")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 122;
                                                    }
                                                    break;
                                                case 316215116:
                                                    if (!str3.equals("TB3-730X")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 123;
                                                    }
                                                    break;
                                                case 316246811:
                                                    if (!str3.equals("TB3-850F")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 124;
                                                    }
                                                    break;
                                                case 316246818:
                                                    if (!str3.equals("TB3-850M")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 125;
                                                    }
                                                    break;
                                                case 407160593:
                                                    if (!str3.equals("Pixi5-10_4G")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 106;
                                                    }
                                                    break;
                                                case 507412548:
                                                    if (!str3.equals("QM16XE_U")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 114;
                                                    }
                                                    break;
                                                case 793982701:
                                                    if (!str3.equals("GIONEE_WBL5708")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 57;
                                                    }
                                                    break;
                                                case 794038622:
                                                    if (!str3.equals("GIONEE_WBL7365")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 58;
                                                    }
                                                    break;
                                                case 794040393:
                                                    if (!str3.equals("GIONEE_WBL7519")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 59;
                                                    }
                                                    break;
                                                case 835649806:
                                                    if (!str3.equals("manning")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 81;
                                                    }
                                                    break;
                                                case 917340916:
                                                    if (!str3.equals("A7000plus")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 10;
                                                    }
                                                    break;
                                                case 958008161:
                                                    if (!str3.equals("j2xlteins")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 72;
                                                    }
                                                    break;
                                                case 1060579533:
                                                    if (!str3.equals("panell_d")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 96;
                                                    }
                                                    break;
                                                case 1150207623:
                                                    if (!str3.equals("LS-5017")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 78;
                                                    }
                                                    break;
                                                case 1176899427:
                                                    if (!str3.equals("itel_S41")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 71;
                                                    }
                                                    break;
                                                case 1280332038:
                                                    if (!str3.equals("hwALE-H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 62;
                                                    }
                                                    break;
                                                case 1306947716:
                                                    if (!str3.equals("EverStar_S")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 35;
                                                    }
                                                    break;
                                                case 1349174697:
                                                    if (!str3.equals("htc_e56ml_dtul")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 61;
                                                    }
                                                    break;
                                                case 1522194893:
                                                    if (!str3.equals("woods_f")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 133;
                                                    }
                                                    break;
                                                case 1691543273:
                                                    if (!str3.equals("CPH1609")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 23;
                                                    }
                                                    break;
                                                case 1691544261:
                                                    if (!str3.equals("CPH1715")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 24;
                                                    }
                                                    break;
                                                case 1709443163:
                                                    if (!str3.equals("iball8735_9806")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 68;
                                                    }
                                                    break;
                                                case 1865889110:
                                                    if (!str3.equals("santoni")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 117;
                                                    }
                                                    break;
                                                case 1906253259:
                                                    if (!str3.equals("PB2-670M")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 100;
                                                    }
                                                    break;
                                                case 1977196784:
                                                    if (!str3.equals("Infinix-X572")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 69;
                                                    }
                                                    break;
                                                case 2006372676:
                                                    if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 19;
                                                    }
                                                    break;
                                                case 2019281702:
                                                    if (!str3.equals("DM-01K")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 29;
                                                    }
                                                    break;
                                                case 2029784656:
                                                    if (!str3.equals("HWBLN-H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 63;
                                                    }
                                                    break;
                                                case 2030379515:
                                                    if (!str3.equals("HWCAM-H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 64;
                                                    }
                                                    break;
                                                case 2033393791:
                                                    if (!str3.equals("ASUS_X00AD_2")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 14;
                                                    }
                                                    break;
                                                case 2047190025:
                                                    if (!str3.equals("ELUGA_Note")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 32;
                                                    }
                                                    break;
                                                case 2047252157:
                                                    if (!str3.equals("ELUGA_Prim")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 33;
                                                    }
                                                    break;
                                                case 2048319463:
                                                    if (!str3.equals("HWVNS-H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 65;
                                                    }
                                                    break;
                                                case 2048855701:
                                                    if (!str3.equals("HWWAS-H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 66;
                                                    }
                                                    break;
                                                default:
                                                    b12 = -1;
                                                    break;
                                            }
                                            switch (b12) {
                                                default:
                                                    if (str2.hashCode() == -594534941 && str2.equals("JSN-L21")) {
                                                    }
                                                case 0:
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                case 10:
                                                case 11:
                                                case 12:
                                                case 13:
                                                case 14:
                                                case 15:
                                                case 16:
                                                case 17:
                                                case 18:
                                                case 19:
                                                case 20:
                                                case 21:
                                                case 22:
                                                case 23:
                                                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                                                case 25:
                                                case 26:
                                                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                                case 28:
                                                case 29:
                                                case 30:
                                                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                                                case 33:
                                                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                                case 35:
                                                case 36:
                                                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                                                case 39:
                                                case 40:
                                                case 41:
                                                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                                case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                                                case 44:
                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                case 46:
                                                case 47:
                                                case 48:
                                                case 49:
                                                case 50:
                                                case 51:
                                                case 52:
                                                case 53:
                                                case 54:
                                                case 55:
                                                case 56:
                                                case 57:
                                                case 58:
                                                case 59:
                                                case 60:
                                                case 61:
                                                case 62:
                                                case 63:
                                                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                                                case 65:
                                                case 66:
                                                case 67:
                                                case 68:
                                                case 69:
                                                case 70:
                                                case 71:
                                                case 72:
                                                case 73:
                                                case 74:
                                                case 75:
                                                case 76:
                                                case 77:
                                                case 78:
                                                case 79:
                                                case 80:
                                                case 81:
                                                case 82:
                                                case 83:
                                                case 84:
                                                case 85:
                                                case 86:
                                                case 87:
                                                case 88:
                                                case 89:
                                                case 90:
                                                case 91:
                                                case 92:
                                                case 93:
                                                case 94:
                                                case 95:
                                                case 96:
                                                case 97:
                                                case 98:
                                                case 99:
                                                case 100:
                                                case 101:
                                                case 102:
                                                case 103:
                                                case 104:
                                                case 105:
                                                case 106:
                                                case 107:
                                                case 108:
                                                case 109:
                                                case 110:
                                                case 111:
                                                case 112:
                                                case 113:
                                                case 114:
                                                case 115:
                                                case 116:
                                                case 117:
                                                case 118:
                                                case 119:
                                                case 120:
                                                case 121:
                                                case 122:
                                                case 123:
                                                case 124:
                                                case 125:
                                                case 126:
                                                case 127:
                                                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT /* 128 */:
                                                case 129:
                                                case 130:
                                                case 131:
                                                case 132:
                                                case 133:
                                                case 134:
                                                case 135:
                                                case 136:
                                                case 137:
                                                case 138:
                                                case 139:
                                                    z9 = true;
                                                    break;
                                            }
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        z9 = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            z9 = true;
                            break;
                    }
                } else if (i10 <= 27) {
                    str2 = Build.MODEL;
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b10 = -1;
                            } else {
                                b10 = 6;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b10 = -1;
                            } else {
                                b10 = 7;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b10 = -1;
                            } else {
                                b10 = 0;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b10 = -1;
                            } else {
                                b10 = 1;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b10 = -1;
                            } else {
                                b10 = 2;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b10 = -1;
                            } else {
                                b10 = 3;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b10 = -1;
                            } else {
                                b10 = 4;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b10 = -1;
                            } else {
                                b10 = 8;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b10 = -1;
                            } else {
                                b10 = 5;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        default:
                            if (i10 <= 26) {
                                str3 = Build.DEVICE;
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 54;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 55;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 56;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 74;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 22;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 89;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 90;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 101;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 102;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 103;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 13;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 116;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 137;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 21;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 104;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 95;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 130;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 97;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 98;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 99;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals("GiONEE_GBL7319")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 52;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 18;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 70;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 118;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 87;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 5;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 6;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 120;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 34;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 126;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 88;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 9;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 119;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 131;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 132;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 91;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 51;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 53;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 105;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 121;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 17;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 138;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 31;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 134;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 20;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 113;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 127;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 129;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 16;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 84;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 73;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 79;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 80;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 86;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 94;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 107;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 115;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 139;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 26;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 27;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b12 = -1;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 49;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 0;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 1;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 2;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 36;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 37;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 38;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 39;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 40;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 41;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 93;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 109;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 111;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 136;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 50;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 75;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 85;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 92;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 83;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 3;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 4;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 15;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 7;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals("E5643")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 30;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 42;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 43;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 44;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 45;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 46;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 47;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 48;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 108;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 110;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 112;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 128;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 135;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 67;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 76;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 77;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 8;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 25;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 82;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 60;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 11;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 12;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 122;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals("TB3-730X")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 123;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 124;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 125;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 106;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 114;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 57;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 58;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 59;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 81;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 10;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 72;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 96;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 78;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals("itel_S41")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 71;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 62;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 35;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 61;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 133;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 23;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 24;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 68;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 117;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 100;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 69;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 19;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 29;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 63;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 64;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 14;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 32;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 33;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 65;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 66;
                                        }
                                        break;
                                    default:
                                        b12 = -1;
                                        break;
                                }
                                switch (b12) {
                                    default:
                                        if (str2.hashCode() == -594534941) {
                                            break;
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                                    case 25:
                                    case 26:
                                    case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                    case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                                    case 33:
                                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                    case 35:
                                    case 36:
                                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                    case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                                    case 44:
                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                    case 58:
                                    case 59:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case 76:
                                    case 77:
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                    case 87:
                                    case 88:
                                    case 89:
                                    case 90:
                                    case 91:
                                    case 92:
                                    case 93:
                                    case 94:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case 99:
                                    case 100:
                                    case 101:
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                    case 110:
                                    case 111:
                                    case 112:
                                    case 113:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case 120:
                                    case 121:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case 125:
                                    case 126:
                                    case 127:
                                    case IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT /* 128 */:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                        z9 = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z9 = true;
                            break;
                    }
                } else {
                    str2 = Build.MODEL;
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b10 = -1;
                            } else {
                                b10 = 6;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b10 = -1;
                            } else {
                                b10 = 7;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b10 = -1;
                            } else {
                                b10 = 0;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b10 = -1;
                            } else {
                                b10 = 1;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b10 = -1;
                            } else {
                                b10 = 2;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b10 = -1;
                            } else {
                                b10 = 3;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b10 = -1;
                            } else {
                                b10 = 4;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b10 = -1;
                            } else {
                                b10 = 8;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b10 = -1;
                            } else {
                                b10 = 5;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        default:
                            if (i10 <= 26) {
                                str3 = Build.DEVICE;
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 54;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 55;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 56;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 74;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 22;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 89;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 90;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 101;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 102;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 103;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 13;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 116;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 137;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 21;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 104;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 95;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 130;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 97;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 98;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 99;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals("GiONEE_GBL7319")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 52;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 18;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 70;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 118;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 87;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 5;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 6;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 120;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 34;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 126;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 88;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 9;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 119;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 131;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 132;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 91;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 51;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 53;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 105;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 121;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 17;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 138;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 31;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 134;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 20;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 113;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 127;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 129;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 16;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 84;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 73;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 79;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 80;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 86;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 94;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 107;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 115;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 139;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 26;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 27;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b12 = -1;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 49;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 0;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 1;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 2;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 36;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 37;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 38;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 39;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 40;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 41;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 93;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 109;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 111;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 136;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 50;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 75;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 85;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 92;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 83;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 3;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 4;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 15;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 7;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals("E5643")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 30;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 42;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 43;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 44;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 45;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 46;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 47;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 48;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 108;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 110;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 112;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 128;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 135;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 67;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 76;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 77;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 8;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 25;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 82;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 60;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 11;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 12;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 122;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals("TB3-730X")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 123;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 124;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 125;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 106;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 114;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 57;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 58;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 59;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 81;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 10;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 72;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 96;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 78;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals("itel_S41")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 71;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 62;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 35;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 61;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 133;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 23;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 24;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 68;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 117;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 100;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 69;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 19;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 29;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 63;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 64;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 14;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 32;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 33;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 65;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 66;
                                        }
                                        break;
                                    default:
                                        b12 = -1;
                                        break;
                                }
                                switch (b12) {
                                    default:
                                        if (str2.hashCode() == -594534941) {
                                            break;
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                                    case 25:
                                    case 26:
                                    case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                    case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                                    case 33:
                                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                    case 35:
                                    case 36:
                                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                    case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                                    case 44:
                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                    case 58:
                                    case 59:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case 76:
                                    case 77:
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                    case 87:
                                    case 88:
                                    case 89:
                                    case 90:
                                    case 91:
                                    case 92:
                                    case 93:
                                    case 94:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case 99:
                                    case 100:
                                    case 101:
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                    case 110:
                                    case 111:
                                    case 112:
                                    case 113:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case 120:
                                    case 121:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case 125:
                                    case 126:
                                    case 127:
                                    case IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT /* 128 */:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                        z9 = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z9 = true;
                            break;
                    }
                }
                f29173J1 = z9;
                f29172I1 = true;
            }
        }
        return f29173J1;
    }

    @Override // com.google.android.gms.internal.ads.DY0
    protected final List A0(FY0 fy0, JY0 jy0, boolean z9) {
        return SY0.e(B1(this.f29181V0, fy0, jy0, false, false), jy0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5691x0
    public final boolean B(long j10, long j11, long j12, boolean z9, boolean z10) throws LQ0 {
        int iT;
        if (this.f29192g1 != null && this.f29182W0) {
            j11 -= -this.f29178E1;
        }
        if (j10 >= -500000 || z9 || (iT = T(j11)) == 0) {
            return false;
        }
        if (z10) {
            C5997zQ0 c5997zQ0 = this.f18203N0;
            int i10 = c5997zQ0.f35745d + iT;
            c5997zQ0.f35745d = i10;
            c5997zQ0.f35747f += this.f29205t1;
            c5997zQ0.f35745d = i10 + this.f29188c1.size();
        } else {
            this.f18203N0.f35751j++;
            r1(iT + this.f29188c1.size(), this.f29205t1);
        }
        i0();
        InterfaceC3303e1 interfaceC3303e1 = this.f29192g1;
        if (interfaceC3303e1 != null) {
            interfaceC3303e1.Z(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.DY0
    protected final C4124kY0 C0(C4880qY0 c4880qY0, JY0 jy0, MediaCrypto mediaCrypto, float f10) {
        int i10;
        C3678h0 c3678h0;
        Point pointI;
        int i11;
        JY0[] jy0Arr;
        byte b10;
        boolean z9;
        Pair pairD;
        int iO1;
        JY0[] jy0ArrM = M();
        int length = jy0ArrM.length;
        int iV1 = v1(c4880qY0, jy0);
        int i12 = jy0.f19937w;
        int i13 = jy0.f19936v;
        if (length == 1) {
            if (iV1 != -1 && (iO1 = o1(c4880qY0, jy0)) != -1) {
                iV1 = Math.min((int) (iV1 * 1.5f), iO1);
            }
            c3678h0 = new C3678h0(i13, i12, iV1);
            i10 = 35;
        } else {
            int iMax = i12;
            int iMax2 = i13;
            int i14 = 0;
            boolean z10 = false;
            i10 = 35;
            while (i14 < length) {
                JY0 jy0M = jy0ArrM[i14];
                C3470fL0 c3470fL0 = jy0.f19904E;
                if (c3470fL0 != null && jy0M.f19904E == null) {
                    C5507vX0 c5507vX0A = jy0M.a();
                    c5507vX0A.c(c3470fL0);
                    jy0M = c5507vX0A.m();
                }
                if (c4880qY0.f(jy0, jy0M).f17319d != 0) {
                    int i15 = jy0M.f19936v;
                    b10 = -1;
                    if (i15 != -1) {
                        jy0Arr = jy0ArrM;
                        if (jy0M.f19937w != -1) {
                            z9 = false;
                        }
                        z10 |= z9;
                        iMax2 = Math.max(iMax2, i15);
                        iMax = Math.max(iMax, jy0M.f19937w);
                        iV1 = Math.max(iV1, v1(c4880qY0, jy0M));
                    } else {
                        jy0Arr = jy0ArrM;
                    }
                    z9 = true;
                    z10 |= z9;
                    iMax2 = Math.max(iMax2, i15);
                    iMax = Math.max(iMax, jy0M.f19937w);
                    iV1 = Math.max(iV1, v1(c4880qY0, jy0M));
                } else {
                    jy0Arr = jy0ArrM;
                    b10 = -1;
                }
                i14++;
                jy0ArrM = jy0Arr;
            }
            if (z10) {
                StringBuilder sb = new StringBuilder(String.valueOf(iMax2).length() + 44 + String.valueOf(iMax).length());
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(iMax2);
                sb.append("x");
                sb.append(iMax);
                YU.c("MediaCodecVideoRenderer", sb.toString());
                boolean z11 = i12 > i13;
                int i16 = z11 ? i12 : i13;
                int i17 = true != z11 ? i12 : i13;
                int[] iArr = f29171H1;
                int i18 = 0;
                while (true) {
                    if (i18 < 9) {
                        float f11 = i17;
                        float f12 = i16;
                        int i19 = iArr[i18];
                        int i20 = i18;
                        float f13 = i19;
                        if (i19 > i16 && (i11 = (int) (f13 * (f11 / f12))) > i17) {
                            int i21 = i16;
                            int i22 = true != z11 ? i19 : i11;
                            if (true != z11) {
                                i19 = i11;
                            }
                            pointI = c4880qY0.i(i22, i19);
                            float f14 = jy0.f19940z;
                            if (pointI != null) {
                                if (c4880qY0.g(pointI.x, pointI.y, f14)) {
                                    break;
                                }
                            }
                            i18 = i20 + 1;
                            i16 = i21;
                            i17 = i17;
                            z11 = z11;
                        }
                    }
                    pointI = null;
                    break;
                }
                if (pointI != null) {
                    iMax2 = Math.max(iMax2, pointI.x);
                    iMax = Math.max(iMax, pointI.y);
                    C5507vX0 c5507vX0A2 = jy0.a();
                    c5507vX0A2.s0(iMax2);
                    c5507vX0A2.t0(iMax);
                    iV1 = Math.max(iV1, o1(c4880qY0, c5507vX0A2.m()));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iMax2).length() + 35 + String.valueOf(iMax).length());
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(iMax2);
                    sb2.append("x");
                    sb2.append(iMax);
                    YU.c("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            c3678h0 = new C3678h0(iMax2, iMax, iV1);
        }
        String str = c4880qY0.f32658c;
        this.f29189d1 = c3678h0;
        boolean z12 = this.f29184Y0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i13);
        mediaFormat.setInteger("height", i12);
        BW.a(mediaFormat, jy0.f19932r);
        float f15 = jy0.f19940z;
        if (f15 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f15);
        }
        BW.b(mediaFormat, "rotation-degrees", jy0.f19900A);
        C3470fL0 c3470fL1 = jy0.f19904E;
        if (c3470fL1 != null) {
            BW.b(mediaFormat, "color-transfer", c3470fL1.f28265c);
            BW.b(mediaFormat, "color-standard", c3470fL1.f28263a);
            BW.b(mediaFormat, "color-range", c3470fL1.f28264b);
            byte[] bArr = c3470fL1.f28266d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(jy0.f19929o) && (pairD = GM.d(jy0)) != null) {
            BW.b(mediaFormat, Scopes.PROFILE, ((Integer) pairD.first).intValue());
        }
        mediaFormat.setInteger("max-width", c3678h0.f28780a);
        mediaFormat.setInteger("max-height", c3678h0.f28781b);
        BW.b(mediaFormat, "max-input-size", c3678h0.f28782c);
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if (z12) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= i10) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f29175B1));
        }
        Surface surfaceH1 = H1(c4880qY0);
        if (this.f29192g1 != null && !AbstractC4634ob0.r(this.f29181V0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return C4124kY0.b(c4880qY0, mediaFormat, jy0, surfaceH1, null);
    }

    @Override // com.google.android.gms.internal.ads.DY0, com.google.android.gms.internal.ads.AbstractC5995zP0
    protected final void D(long j10, boolean z9, boolean z10) throws LQ0 {
        InterfaceC3303e1 interfaceC3303e1 = this.f29192g1;
        if (interfaceC3303e1 != null && !z9) {
            interfaceC3303e1.Z(true);
        }
        super.D(j10, z9, z10);
        if (this.f29192g1 == null) {
            this.f29185Z0.l();
        }
        if (z9) {
            InterfaceC3303e1 interfaceC3303e2 = this.f29192g1;
            if (interfaceC3303e2 != null) {
                interfaceC3303e2.Q(false);
            } else {
                this.f29185Z0.j(false);
            }
        }
        this.f29204s1 = 0;
    }

    @Override // com.google.android.gms.internal.ads.DY0
    protected final AQ0 D0(C4880qY0 c4880qY0, JY0 jy0, JY0 jy1) {
        int i10;
        int i11;
        AQ0 aq0F = c4880qY0.f(jy0, jy1);
        int i12 = aq0F.f17320e;
        C3678h0 c3678h0 = this.f29189d1;
        c3678h0.getClass();
        if (jy1.f19936v > c3678h0.f28780a || jy1.f19937w > c3678h0.f28781b) {
            i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        if (v1(c4880qY0, jy1) > c3678h0.f28782c) {
            i12 |= 64;
        }
        String str = c4880qY0.f32656a;
        if (i12 != 0) {
            i11 = 0;
            i10 = i12;
        } else {
            i10 = 0;
            i11 = aq0F.f17319d;
        }
        return new AQ0(str, jy0, jy1, i11, i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5995zP0
    protected final void E() {
        this.f29203r1 = 0;
        this.f29202q1 = P().zzb();
        this.f29208w1 = 0L;
        this.f29209x1 = 0;
        InterfaceC3303e1 interfaceC3303e1 = this.f29192g1;
        if (interfaceC3303e1 != null) {
            interfaceC3303e1.zza();
        } else {
            this.f29185Z0.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5995zP0
    protected final void F() {
        if (this.f29203r1 > 0) {
            long jZzb = P().zzb();
            this.f29183X0.d(this.f29203r1, jZzb - this.f29202q1);
            this.f29203r1 = 0;
            this.f29202q1 = jZzb;
        }
        int i10 = this.f29209x1;
        if (i10 != 0) {
            this.f29183X0.e(this.f29208w1, i10);
            this.f29208w1 = 0L;
            this.f29209x1 = 0;
        }
        InterfaceC3303e1 interfaceC3303e1 = this.f29192g1;
        if (interfaceC3303e1 != null) {
            interfaceC3303e1.zzb();
        } else {
            this.f29185Z0.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.DY0
    protected final float F0(float f10, JY0 jy0, JY0[] jy0Arr) {
        C4880qY0 c4880qY0G0;
        float fMax = -1.0f;
        for (JY0 jy1 : jy0Arr) {
            float f11 = jy1.f19940z;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        float f12 = fMax == -1.0f ? -1.0f : fMax * f10;
        if (this.f29206u1 == null || (c4880qY0G0 = g0()) == null) {
            return f12;
        }
        float fH = c4880qY0G0.h(jy0.f19936v, jy0.f19937w);
        return f12 != -1.0f ? Math.max(f12, fH) : fH;
    }

    @Override // com.google.android.gms.internal.ads.DY0, com.google.android.gms.internal.ads.ES0
    public final boolean G() {
        if (!super.G()) {
            return false;
        }
        InterfaceC3303e1 interfaceC3303e1 = this.f29192g1;
        return interfaceC3303e1 == null || interfaceC3303e1.d();
    }

    @Override // com.google.android.gms.internal.ads.DY0
    protected final void G0(String str, C4124kY0 c4124kY0, long j10, long j11) {
        this.f29183X0.b(str, j10, j11);
        this.f29190e1 = z1(str);
        C4880qY0 c4880qY0G0 = g0();
        c4880qY0G0.getClass();
        boolean z9 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(c4880qY0G0.f32657b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : c4880qY0G0.b()) {
                if (codecProfileLevel.profile == 16384) {
                    z9 = true;
                    break;
                }
            }
        }
        this.f29191f1 = z9;
    }

    @Override // com.google.android.gms.internal.ads.DY0, com.google.android.gms.internal.ads.AbstractC5995zP0
    protected final void H() {
        this.f29174A1 = null;
        this.f29179F1 = -9223372036854775807L;
        this.f29199n1 = false;
        this.f29207v1 = true;
        try {
            super.H();
        } finally {
            Y0 y9 = this.f29183X0;
            y9.i(this.f18203N0);
            y9.f(C3152cp.f27221d);
        }
    }

    @Override // com.google.android.gms.internal.ads.DY0
    protected final void H0(String str) {
        this.f29183X0.h(str);
    }

    @Override // com.google.android.gms.internal.ads.DY0, com.google.android.gms.internal.ads.AbstractC5995zP0
    protected final void I() {
        try {
            super.I();
        } finally {
            this.f29193h1 = false;
            this.f29178E1 = -9223372036854775807L;
            I1();
        }
    }

    @Override // com.google.android.gms.internal.ads.DY0
    protected final void I0(Exception exc) {
        YU.f("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f29183X0.j(exc);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5995zP0
    protected final void J() {
        InterfaceC3303e1 interfaceC3303e1 = this.f29192g1;
        if (interfaceC3303e1 == null || !this.f29182W0) {
            return;
        }
        interfaceC3303e1.v();
    }

    @Override // com.google.android.gms.internal.ads.DY0
    protected final AQ0 J0(ZR0 zr0) throws LQ0 {
        AQ0 aq0J0 = super.J0(zr0);
        JY0 jy0 = zr0.f26192b;
        jy0.getClass();
        this.f29183X0.c(jy0, aq0J0);
        return aq0J0;
    }

    @Override // com.google.android.gms.internal.ads.DY0
    protected final void K0(JY0 jy0, MediaFormat mediaFormat) {
        InterfaceC4502nY0 interfaceC4502nY0D0 = d0();
        if (interfaceC4502nY0D0 != null) {
            interfaceC4502nY0D0.d(this.f29200o1);
        }
        mediaFormat.getClass();
        boolean z9 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z9 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z9 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f10 = jy0.f19901B;
        int i10 = jy0.f19900A;
        if (i10 == 90 || i10 == 270) {
            f10 = 1.0f / f10;
            int i11 = integer2;
            integer2 = integer;
            integer = i11;
        }
        this.f29211z1 = new C3152cp(integer, integer2, f10);
        InterfaceC3303e1 interfaceC3303e1 = this.f29192g1;
        if (interfaceC3303e1 == null || !this.f29180G1) {
            this.f29185Z0.e(jy0.f19940z);
        } else {
            C5507vX0 c5507vX0A = jy0.a();
            c5507vX0A.s0(integer);
            c5507vX0A.t0(integer2);
            c5507vX0A.y0(f10);
            JY0 jy0M = c5507vX0A.m();
            int i12 = this.f29194i1;
            List listL = this.f29195j1;
            if (listL == null) {
                listL = AbstractC5931yu0.l();
            }
            interfaceC3303e1.k(1, jy0M, Z0(), i12, listL);
            this.f29194i1 = 2;
        }
        this.f29180G1 = false;
    }

    @Override // com.google.android.gms.internal.ads.DY0
    protected final void M0() {
        InterfaceC3303e1 interfaceC3303e1 = this.f29192g1;
        if (interfaceC3303e1 != null) {
            interfaceC3303e1.zzi();
            long jZ0 = this.f29178E1;
            if (jZ0 == -9223372036854775807L) {
                jZ0 = Z0();
                this.f29178E1 = jZ0;
            }
            this.f29192g1.e(-jZ0);
        } else {
            this.f29185Z0.a(2);
        }
        this.f29180G1 = true;
    }

    @Override // com.google.android.gms.internal.ads.DY0
    protected final boolean N0(long j10, long j11, InterfaceC4502nY0 interfaceC4502nY0, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z9, boolean z10, JY0 jy0) {
        C3804i0 c3804i0;
        long j13;
        interfaceC4502nY0.getClass();
        long jY0 = j12 - Y0();
        int i13 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f29188c1;
            Long l10 = (Long) priorityQueue.peek();
            if (l10 == null || l10.longValue() >= j12) {
                break;
            }
            priorityQueue.poll();
            i13++;
        }
        r1(i13, 0);
        InterfaceC3303e1 interfaceC3303e1 = this.f29192g1;
        if (interfaceC3303e1 != null) {
            if (!z9 || z10) {
                return interfaceC3303e1.f(j12, new C3049c0(this, interfaceC4502nY0, i10, jY0));
            }
            p1(interfaceC4502nY0, i10, jY0);
            return true;
        }
        C5817y0 c5817y0 = this.f29185Z0;
        long jZ0 = Z0();
        C5565w0 c5565w0 = this.f29186a1;
        int iK = c5817y0.k(j12, j10, j11, jZ0, z9, z10, c5565w0);
        if (iK == 0) {
            long jZzc = P().zzc();
            F1(jY0, jZzc, jy0);
            t1(interfaceC4502nY0, i10, jY0, jZzc);
            s1(c5565w0.a());
            return true;
        }
        if (iK != 1) {
            if (iK == 2) {
                q1(interfaceC4502nY0, i10, jY0);
                s1(c5565w0.a());
                return true;
            }
            if (iK != 3) {
                return false;
            }
            p1(interfaceC4502nY0, i10, jY0);
            s1(c5565w0.a());
            return true;
        }
        long jB = c5565w0.b();
        long jA = c5565w0.a();
        if (jB == this.f29210y1) {
            p1(interfaceC4502nY0, i10, jY0);
            j13 = jB;
            c3804i0 = this;
        } else {
            F1(jY0, jB, jy0);
            t1(interfaceC4502nY0, i10, jY0, jB);
            c3804i0 = this;
            j13 = jB;
        }
        c3804i0.s1(jA);
        c3804i0.f29210y1 = j13;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.DY0
    protected final void O0() {
        InterfaceC3303e1 interfaceC3303e1 = this.f29192g1;
        if (interfaceC3303e1 != null) {
            interfaceC3303e1.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.DY0
    protected final void P0(C5741xO0 c5741xO0) {
        if (this.f29191f1) {
            ByteBuffer byteBuffer = c5741xO0.f34806g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        InterfaceC4502nY0 interfaceC4502nY0D0 = d0();
                        interfaceC4502nY0D0.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        interfaceC4502nY0D0.k0(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.DY0, com.google.android.gms.internal.ads.AbstractC5995zP0
    protected final void X(boolean z9, boolean z10) {
        super.X(z9, z10);
        N();
        this.f29183X0.a(this.f18203N0);
        if (!this.f29193h1) {
            if (this.f29195j1 != null && this.f29192g1 == null) {
                C4306m0 c4306m0 = new C4306m0(this.f29181V0, this.f29185Z0);
                c4306m0.a(true);
                long j10 = this.f29187b1;
                c4306m0.c(j10 != -9223372036854775807L ? -j10 : -9223372036854775807L);
                c4306m0.b(P());
                C5313u0 c5313u0D = c4306m0.d();
                c5313u0D.d(1);
                this.f29192g1 = c5313u0D.e(0);
            }
            this.f29193h1 = true;
        }
        int i10 = !z10 ? 1 : 0;
        InterfaceC3303e1 interfaceC3303e1 = this.f29192g1;
        if (interfaceC3303e1 == null) {
            C5817y0 c5817y0 = this.f29185Z0;
            c5817y0.g(P());
            c5817y0.a(i10);
            return;
        }
        interfaceC3303e1.h(new C2924b0(this), AbstractC2272Px0.a());
        InterfaceC5439v0 interfaceC5439v0 = this.f29177D1;
        if (interfaceC5439v0 != null) {
            this.f29192g1.m(interfaceC5439v0);
        }
        if (this.f29196k1 != null && !this.f29198m1.equals(C4816q20.f32548c)) {
            this.f29192g1.j(this.f29196k1, this.f29198m1);
        }
        this.f29192g1.n(this.f29201p1);
        this.f29192g1.l(w0());
        List list = this.f29195j1;
        if (list != null) {
            this.f29192g1.o(list);
        }
        this.f29194i1 = i10;
        W0();
    }

    @Override // com.google.android.gms.internal.ads.DY0, com.google.android.gms.internal.ads.AbstractC5995zP0
    protected final void Y(JY0[] jy0Arr, long j10, long j11, C5637wZ0 c5637wZ0) {
        super.Y(jy0Arr, j10, j11, c5637wZ0);
        AbstractC5270tf abstractC5270tfQ = Q();
        if (abstractC5270tfQ.g()) {
            this.f29179F1 = -9223372036854775807L;
        } else {
            this.f29179F1 = abstractC5270tfQ.o(c5637wZ0.f34594a, new C4891qe()).f32698d;
        }
    }

    @Override // com.google.android.gms.internal.ads.DY0
    protected final boolean b0(C4880qY0 c4880qY0) {
        return G1(c4880qY0);
    }

    @Override // com.google.android.gms.internal.ads.ES0
    public final boolean i(long j10) {
        long jT0 = t0();
        return jT0 == -9223372036854775807L || j10 > jT0 - Y0();
    }

    @Override // com.google.android.gms.internal.ads.DY0
    protected final boolean j0() {
        C4880qY0 c4880qY0G0 = g0();
        if (this.f29192g1 != null && c4880qY0G0 != null) {
            String str = c4880qY0G0.f32656a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.j0();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002a  */
    @Override // com.google.android.gms.internal.ads.DY0
    protected final boolean k0() {
        boolean z9;
        JY0 jy0E0 = e0();
        long j10 = this.f29179F1;
        if (j10 != -9223372036854775807L) {
            if (l0() + j10 + 1 > Long.MAX_VALUE - (Y0() + this.f29179F1)) {
                z9 = true;
            } else {
                z9 = false;
            }
        } else {
            z9 = true;
        }
        return this.f29206u1 == null || this.f29207v1 || (jy0E0 != null && jy0E0.f19931q > 0) || z9 || X0() != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.DY0
    protected final void m0() {
        super.m0();
        this.f29188c1.clear();
        this.f29205t1 = 0;
        this.f29207v1 = false;
    }

    @Override // com.google.android.gms.internal.ads.ES0, com.google.android.gms.internal.ads.GS0
    public final String n() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.DY0
    protected final C4754pY0 o0(Throwable th, C4880qY0 c4880qY0) {
        return new C2798a0(th, c4880qY0, this.f29196k1);
    }

    @Override // com.google.android.gms.internal.ads.DY0
    protected final boolean p0(JY0 jy0) throws LQ0 {
        InterfaceC3303e1 interfaceC3303e1 = this.f29192g1;
        if (interfaceC3303e1 == null || interfaceC3303e1.zze()) {
            return true;
        }
        try {
            interfaceC3303e1.c(jy0);
            return true;
        } catch (C3178d1 e10) {
            throw R(e10, jy0, false, 7000);
        }
    }

    protected final void p1(InterfaceC4502nY0 interfaceC4502nY0, int i10, long j10) {
        Trace.beginSection("skipVideoBuffer");
        interfaceC4502nY0.e(i10, false);
        Trace.endSection();
        this.f18203N0.f35747f++;
    }

    @Override // com.google.android.gms.internal.ads.DY0, com.google.android.gms.internal.ads.ES0
    public final void q(float f10, float f11) throws LQ0 {
        super.q(f10, f11);
        InterfaceC3303e1 interfaceC3303e1 = this.f29192g1;
        if (interfaceC3303e1 != null) {
            interfaceC3303e1.l(f10);
        } else {
            this.f29185Z0.n(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.DY0
    protected final void q0(C5741xO0 c5741xO0) {
        int iR0 = r0(c5741xO0);
        if (Build.VERSION.SDK_INT < 34 || (iR0 & 32) == 0) {
            this.f29205t1++;
        }
    }

    protected final void q1(InterfaceC4502nY0 interfaceC4502nY0, int i10, long j10) {
        Trace.beginSection("dropVideoBuffer");
        interfaceC4502nY0.e(i10, false);
        Trace.endSection();
        r1(0, 1);
    }

    @Override // com.google.android.gms.internal.ads.ES0
    public final void r() {
        InterfaceC3303e1 interfaceC3303e1 = this.f29192g1;
        if (interfaceC3303e1 == null) {
            this.f29185Z0.h();
            return;
        }
        int i10 = this.f29194i1;
        if (i10 == 0 || i10 == 1) {
            this.f29194i1 = 0;
        } else {
            interfaceC3303e1.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.DY0
    protected final int r0(C5741xO0 c5741xO0) {
        return (Build.VERSION.SDK_INT < 34 || this.f29206u1 == null || !E1(c5741xO0) || D1(c5741xO0)) ? 0 : 32;
    }

    protected final void r1(int i10, int i11) {
        C5997zQ0 c5997zQ0 = this.f18203N0;
        c5997zQ0.f35749h += i10;
        int i12 = i10 + i11;
        c5997zQ0.f35748g += i12;
        this.f29203r1 += i12;
        int i13 = this.f29204s1 + i12;
        this.f29204s1 = i13;
        c5997zQ0.f35750i = Math.max(i13, c5997zQ0.f35750i);
    }

    @Override // com.google.android.gms.internal.ads.DY0
    protected final boolean s0(C5741xO0 c5741xO0) {
        boolean z9 = false;
        if (D1(c5741xO0)) {
            return false;
        }
        if (E1(c5741xO0)) {
            if (c5741xO0.e()) {
                return false;
            }
            if (c5741xO0.f()) {
                c5741xO0.a();
                z9 = true;
            }
            if (z9) {
                this.f18203N0.f35745d++;
            }
        }
        return z9;
    }

    protected final void s1(long j10) {
        C5997zQ0 c5997zQ0 = this.f18203N0;
        c5997zQ0.f35752k += j10;
        c5997zQ0.f35753l++;
        this.f29208w1 += j10;
        this.f29209x1++;
    }

    @Override // com.google.android.gms.internal.ads.DY0, com.google.android.gms.internal.ads.ES0
    public final void t(long j10, long j11) throws Throwable {
        InterfaceC3303e1 interfaceC3303e1 = this.f29192g1;
        if (interfaceC3303e1 != null) {
            try {
                interfaceC3303e1.i(j10, j11);
            } catch (C3178d1 e10) {
                throw R(e10, e10.f27314a, false, 7001);
            }
        }
        super.t(j10, j11);
    }

    protected final void t1(InterfaceC4502nY0 interfaceC4502nY0, int i10, long j10, long j11) {
        Trace.beginSection("releaseOutputBuffer");
        interfaceC4502nY0.c(i10, j11);
        Trace.endSection();
        this.f18203N0.f35746e++;
        this.f29204s1 = 0;
        if (this.f29192g1 == null) {
            C3152cp c3152cp = this.f29211z1;
            if (!c3152cp.equals(C3152cp.f27221d) && !c3152cp.equals(this.f29174A1)) {
                this.f29174A1 = c3152cp;
                this.f29183X0.f(c3152cp);
            }
            if (!this.f29185Z0.f() || this.f29196k1 == null) {
                return;
            }
            x1();
        }
    }

    @Override // com.google.android.gms.internal.ads.DY0
    protected final void u0(long j10) {
        super.u0(j10);
        this.f29205t1--;
    }

    protected final boolean u1(C4880qY0 c4880qY0) {
        if (z1(c4880qY0.f32656a)) {
            return false;
        }
        return !c4880qY0.f32661f || C4054k0.a(this.f29181V0);
    }

    @Override // com.google.android.gms.internal.ads.ES0
    public final boolean x() {
        boolean zV0 = v0();
        InterfaceC3303e1 interfaceC3303e1 = this.f29192g1;
        if (interfaceC3303e1 != null) {
            return interfaceC3303e1.U(zV0);
        }
        if (zV0 && d0() == null) {
            return true;
        }
        return this.f29185Z0.i(zV0);
    }

    @Override // com.google.android.gms.internal.ads.DY0, com.google.android.gms.internal.ads.AbstractC5995zP0, com.google.android.gms.internal.ads.InterfaceC6001zS0
    public final void y(int i10, Object obj) throws LQ0 {
        if (i10 == 1) {
            C1(obj);
            return;
        }
        if (i10 == 7) {
            obj.getClass();
            InterfaceC5439v0 interfaceC5439v0 = (InterfaceC5439v0) obj;
            this.f29177D1 = interfaceC5439v0;
            InterfaceC3303e1 interfaceC3303e1 = this.f29192g1;
            if (interfaceC3303e1 != null) {
                interfaceC3303e1.m(interfaceC5439v0);
                return;
            }
            return;
        }
        if (i10 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f29176C1 != iIntValue) {
                this.f29176C1 = iIntValue;
                return;
            }
            return;
        }
        if (i10 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f29200o1 = iIntValue2;
            InterfaceC4502nY0 interfaceC4502nY0D0 = d0();
            if (interfaceC4502nY0D0 != null) {
                interfaceC4502nY0D0.d(iIntValue2);
                return;
            }
            return;
        }
        if (i10 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.f29201p1 = iIntValue3;
            InterfaceC3303e1 interfaceC3303e2 = this.f29192g1;
            if (interfaceC3303e2 != null) {
                interfaceC3303e2.n(iIntValue3);
                return;
            } else {
                this.f29185Z0.m(iIntValue3);
                return;
            }
        }
        if (i10 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(InterfaceC2769Zm.f26298a)) {
                InterfaceC3303e1 interfaceC3303e3 = this.f29192g1;
                if (interfaceC3303e3 == null || !interfaceC3303e3.zze()) {
                    return;
                }
                interfaceC3303e3.b();
                return;
            }
            this.f29195j1 = list;
            InterfaceC3303e1 interfaceC3303e4 = this.f29192g1;
            if (interfaceC3303e4 != null) {
                interfaceC3303e4.o(list);
                return;
            }
            return;
        }
        if (i10 == 14) {
            obj.getClass();
            C4816q20 c4816q20 = (C4816q20) obj;
            if (c4816q20.a() == 0 || c4816q20.b() == 0) {
                return;
            }
            this.f29198m1 = c4816q20;
            InterfaceC3303e1 interfaceC3303e5 = this.f29192g1;
            if (interfaceC3303e5 != null) {
                Surface surface = this.f29196k1;
                surface.getClass();
                interfaceC3303e5.j(surface, c4816q20);
                return;
            }
            return;
        }
        switch (i10) {
            case 16:
                obj.getClass();
                this.f29175B1 = ((Integer) obj).intValue();
                InterfaceC4502nY0 interfaceC4502nY0D1 = d0();
                if (interfaceC4502nY0D1 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.f29175B1));
                    interfaceC4502nY0D1.k0(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.f29196k1;
                C1(null);
                obj.getClass();
                ((C3804i0) obj).y(1, surface2);
                break;
            case 18:
                boolean z9 = this.f29206u1 != null;
                LS0 ls0 = (LS0) obj;
                this.f29206u1 = ls0;
                if (z9 != (ls0 != null)) {
                    y0();
                }
                break;
            default:
                super.y(i10, obj);
                break;
        }
    }

    final /* synthetic */ Surface y1() {
        return this.f29196k1;
    }

    @Override // com.google.android.gms.internal.ads.DY0
    protected final int z0(FY0 fy0, JY0 jy0) {
        boolean z9;
        String str = jy0.f19929o;
        boolean zB = A8.b(str);
        int i10 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (!zB) {
            return IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        Context context = this.f29181V0;
        int i11 = 0;
        boolean z10 = jy0.f19933s != null;
        List listB1 = B1(context, fy0, jy0, z10, false);
        if (z10 && listB1.isEmpty()) {
            listB1 = B1(context, fy0, jy0, false, false);
        }
        if (listB1.isEmpty()) {
            return 129;
        }
        if (!DY0.a1(jy0)) {
            return 130;
        }
        C4880qY0 c4880qY0 = (C4880qY0) listB1.get(0);
        boolean zC = c4880qY0.c(jy0);
        if (!zC) {
            int i12 = 1;
            while (true) {
                if (i12 >= listB1.size()) {
                    z9 = true;
                    break;
                }
                C4880qY0 c4880qY1 = (C4880qY0) listB1.get(i12);
                if (c4880qY1.c(jy0)) {
                    zC = true;
                    z9 = false;
                    c4880qY0 = c4880qY1;
                    break;
                }
                i12++;
            }
        } else {
            z9 = true;
            break;
        }
        int i13 = true != zC ? 3 : 4;
        int i14 = true != c4880qY0.e(jy0) ? 8 : 16;
        int i15 = true != c4880qY0.f32662g ? 0 : 64;
        if (true != z9) {
            i10 = 0;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !AbstractC3300e0.a(context)) {
            i10 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        if (zC) {
            List listB2 = B1(context, fy0, jy0, z10, true);
            if (!listB2.isEmpty()) {
                C4880qY0 c4880qY2 = (C4880qY0) SY0.e(listB2, jy0).get(0);
                if (c4880qY2.c(jy0) && c4880qY2.e(jy0)) {
                    i11 = 32;
                }
            }
        }
        return i13 | i14 | i11 | i15 | i10;
    }
}
