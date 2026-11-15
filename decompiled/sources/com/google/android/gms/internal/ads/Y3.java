package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.protobuf.DescriptorProtos;
import com.unity3d.services.core.device.MimeTypes;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class Y3 implements I1 {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final byte[] f25460k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final byte[] f25461l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final byte[] f25462m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final byte[] f25463n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final UUID f25464o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final Map f25465p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f25466q0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f25467A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final SparseArray f25468B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f25469C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f25470D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f25471E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f25472F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private long f25473G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f25474H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f25475I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private long f25476J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private long f25477K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private long f25478L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f25479M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f25480N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f25481O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private long f25482P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f25483Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f25484R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int[] f25485S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f25486T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f25487U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f25488V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f25489W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f25490X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private long f25491Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f25492Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2807a4 f25493a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f25494a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f25495b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f25496b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25497c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f25498c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f25499d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f25500d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC5576w5 f25501e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f25502e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final P10 f25503f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f25504f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final P10 f25505g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private byte f25506g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final P10 f25507h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f25508h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final P10 f25509i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private L1 f25510i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final P10 f25511j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final R3 f25512j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final P10 f25513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final P10 f25514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final P10 f25515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final P10 f25516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final P10 f25517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ByteBuffer f25518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f25519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f25520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f25521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f25522t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f25523u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f25524v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f25525w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private X3 f25526x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f25527y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f25528z;

    static {
        int i10 = U3.f23897a;
        f25460k0 = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        String str = AbstractC4634ob0.f32117a;
        f25461l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f25462m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f25463n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f25464o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f25465p0 = Collections.unmodifiableMap(map);
    }

    public Y3() {
        this(new R3(), 2, InterfaceC5576w5.f34470a);
    }

    private static int[] a(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length;
        return length >= i10 ? iArr : new int[Math.max(length + length, i10)];
    }

    private final void c() {
        if (!this.f25525w) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f25495b;
            if (i10 >= sparseArray.size()) {
                L1 l10 = this.f25510i0;
                l10.getClass();
                l10.q();
                this.f25525w = false;
                return;
            }
            if (((X3) sparseArray.valueAt(i10)).f25095W) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final void q(int i10) throws C2817a9 {
        if (this.f25526x != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 32);
        sb.append("Element ");
        sb.append(i10);
        sb.append(" must be in a TrackEntry");
        throw C2817a9.b(sb.toString(), null);
    }

    private final void r(int i10) throws C2817a9 {
        if (this.f25469C) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 26);
        sb.append("Element ");
        sb.append(i10);
        sb.append(" must be in a Cues");
        throw C2817a9.b(sb.toString(), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    private final void s(X3 x10, long j10, int i10, int i11, int i12) {
        byte b10;
        byte[] bArrX;
        int i13;
        int iD;
        C5696x2 c5696x2 = x10.f25094V;
        if (c5696x2 != null) {
            c5696x2.c(x10.f25100a0, j10, i10, i11, i12, x10.f25112k);
        } else {
            String str = x10.f25103c;
            if ("S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str) || "S_TEXT/WEBVTT".equals(str)) {
                if (this.f25484R > 1) {
                    YU.c("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.f25482P;
                    if (j11 == -9223372036854775807L) {
                        YU.c("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        P10 p10 = this.f25514l;
                        byte[] bArrH = p10.H();
                        switch (str) {
                            case "S_TEXT/ASS":
                                b10 = 1;
                                break;
                            case "S_TEXT/SSA":
                                b10 = 2;
                                break;
                            case "S_TEXT/WEBVTT":
                                b10 = 3;
                                break;
                            case "S_TEXT/UTF8":
                                b10 = 0;
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        if (b10 == 0) {
                            bArrX = x(j11, "%02d:%02d:%02d,%03d", 1000L);
                            i13 = 19;
                        } else if (b10 == 1 || b10 == 2) {
                            bArrX = x(j11, "%01d:%02d:%02d:%02d", 10000L);
                            i13 = 21;
                        } else {
                            if (b10 != 3) {
                                throw new IllegalArgumentException();
                            }
                            bArrX = x(j11, "%02d:%02d:%02d.%03d", 1000L);
                            i13 = 25;
                        }
                        System.arraycopy(bArrX, 0, bArrH, i13, bArrX.length);
                        for (int iF = p10.F(); iF < p10.D(); iF++) {
                            if (p10.H()[iF] == 0) {
                                p10.E(iF);
                                x10.f25100a0.b(p10, p10.D());
                                iD = i11 + p10.D();
                            }
                        }
                        x10.f25100a0.b(p10, p10.D());
                        iD = i11 + p10.D();
                    }
                }
                iD = i11;
            } else {
                iD = i11;
            }
            if ((i10 & 268435456) != 0) {
                if (this.f25484R > 1) {
                    this.f25517o.z(0);
                } else {
                    P10 p11 = this.f25517o;
                    int iD2 = p11.D();
                    x10.f25100a0.e(p11, iD2, 2);
                    iD += iD2;
                }
            }
            x10.f25100a0.c(j10, i10, iD, i12, x10.f25112k);
        }
        this.f25479M = true;
    }

    private final void t(J1 j10, int i10) {
        P10 p10 = this.f25507h;
        if (p10.D() >= i10) {
            return;
        }
        if (p10.I() < i10) {
            int I9 = p10.I();
            p10.B(Math.max(I9 + I9, i10));
        }
        j10.I(p10.H(), p10.D(), i10 - p10.D());
        p10.E(i10);
    }

    private final int u(J1 j10, X3 x10, int i10, boolean z9) throws C2817a9 {
        int i11;
        String str = x10.f25103c;
        if ("S_TEXT/UTF8".equals(str)) {
            w(j10, f25460k0, i10);
            int i12 = this.f25494a0;
            v();
            return i12;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            w(j10, f25462m0, i10);
            int i13 = this.f25494a0;
            v();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            w(j10, f25463n0, i10);
            int i14 = this.f25494a0;
            v();
            return i14;
        }
        if (x10.f25095W) {
            x10.f25102b0.getClass();
            int i15 = H1.f19182j;
            P10 p10 = new P10(i10);
            if (j10.H(p10.H(), 0, i10, true)) {
                j10.zzl();
                if (H1.a(p10.Q()) == 1 && p10.C() >= 10) {
                    byte[] bArr = new byte[10];
                    p10.L(bArr, 0, 10);
                    p10.G(0);
                    int iC = H1.c(bArr);
                    if (p10.C() >= iC + 4) {
                        p10.J(iC);
                        if (H1.a(p10.b()) == 2) {
                            C5507vX0 c5507vX0A = x10.f25102b0.a();
                            c5507vX0A.l0("audio/vnd.dts.hd");
                            x10.f25102b0 = c5507vX0A.m();
                        }
                    }
                }
            }
            x10.f25100a0.f(x10.f25102b0);
            x10.f25095W = false;
            c();
        }
        InterfaceC5570w2 interfaceC5570w2 = x10.f25100a0;
        if (!this.f25498c0) {
            if (x10.f25110i) {
                this.f25488V &= -1073741825;
                boolean z10 = this.f25500d0;
                int i16 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                if (!z10) {
                    P10 p11 = this.f25507h;
                    j10.I(p11.H(), 0, 1);
                    this.f25492Z++;
                    if ((p11.H()[0] & 128) == 128) {
                        throw C2817a9.b("Extension bit is set in signal byte", null);
                    }
                    this.f25506g0 = p11.H()[0];
                    this.f25500d0 = true;
                }
                byte b10 = this.f25506g0;
                if ((b10 & 1) == 1) {
                    int i17 = b10 & 2;
                    this.f25488V |= 1073741824;
                    if (!this.f25508h0) {
                        P10 p12 = this.f25515m;
                        j10.I(p12.H(), 0, 8);
                        this.f25492Z += 8;
                        this.f25508h0 = true;
                        P10 p13 = this.f25507h;
                        if (i17 != 2) {
                            i16 = 0;
                        }
                        p13.H()[0] = (byte) (i16 | 8);
                        p13.G(0);
                        interfaceC5570w2.e(p13, 1, 1);
                        this.f25494a0++;
                        p12.G(0);
                        interfaceC5570w2.e(p12, 8, 1);
                        this.f25494a0 += 8;
                    }
                    if (i17 == 2) {
                        if (!this.f25502e0) {
                            P10 p14 = this.f25507h;
                            j10.I(p14.H(), 0, 1);
                            this.f25492Z++;
                            p14.G(0);
                            this.f25504f0 = p14.R();
                            this.f25502e0 = true;
                        }
                        int i18 = this.f25504f0 * 4;
                        P10 p15 = this.f25507h;
                        p15.z(i18);
                        j10.I(p15.H(), 0, i18);
                        this.f25492Z += i18;
                        int i19 = (this.f25504f0 >> 1) + 1;
                        int i20 = (i19 * 6) + 2;
                        ByteBuffer byteBuffer = this.f25518p;
                        if (byteBuffer == null || byteBuffer.capacity() < i20) {
                            this.f25518p = ByteBuffer.allocate(i20);
                        }
                        this.f25518p.position(0);
                        this.f25518p.putShort((short) i19);
                        int i21 = 0;
                        int i22 = 0;
                        while (true) {
                            i11 = this.f25504f0;
                            if (i21 >= i11) {
                                break;
                            }
                            int iH = p15.h();
                            int i23 = iH - i22;
                            if (i21 % 2 == 0) {
                                this.f25518p.putShort((short) i23);
                            } else {
                                this.f25518p.putInt(i23);
                            }
                            i21++;
                            i22 = iH;
                        }
                        int i24 = (i10 - this.f25492Z) - i22;
                        if ((i11 & 1) == 1) {
                            this.f25518p.putInt(i24);
                        } else {
                            this.f25518p.putShort((short) i24);
                            this.f25518p.putInt(0);
                        }
                        P10 p16 = this.f25516n;
                        p16.A(this.f25518p.array(), i20);
                        interfaceC5570w2.e(p16, i20, 1);
                        this.f25494a0 += i20;
                    }
                }
            } else {
                byte[] bArr2 = x10.f25111j;
                if (bArr2 != null) {
                    this.f25513k.A(bArr2, bArr2.length);
                }
            }
            if (!"A_OPUS".equals(x10.f25103c) ? x10.f25108g > 0 : z9) {
                this.f25488V |= 268435456;
                this.f25517o.z(0);
                int iD = (this.f25513k.D() + i10) - this.f25492Z;
                P10 p17 = this.f25507h;
                p17.z(4);
                p17.H()[0] = (byte) ((iD >> 24) & 255);
                p17.H()[1] = (byte) ((iD >> 16) & 255);
                p17.H()[2] = (byte) ((iD >> 8) & 255);
                p17.H()[3] = (byte) (iD & 255);
                interfaceC5570w2.e(p17, 4, 2);
                this.f25494a0 += 4;
            }
            this.f25498c0 = true;
        }
        P10 p18 = this.f25513k;
        int iD2 = i10 + p18.D();
        String str2 = x10.f25103c;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (x10.f25094V != null) {
                AbstractC2418Ss0.i(p18.D() == 0);
                x10.f25094V.b(j10);
            }
            while (true) {
                int i25 = this.f25492Z;
                if (i25 >= iD2) {
                    break;
                }
                int iY = y(j10, interfaceC5570w2, iD2 - i25);
                this.f25492Z += iY;
                this.f25494a0 += iY;
            }
        } else {
            P10 p19 = this.f25505g;
            byte[] bArrH = p19.H();
            bArrH[0] = 0;
            bArrH[1] = 0;
            bArrH[2] = 0;
            int i26 = x10.f25104c0;
            int i27 = 4 - i26;
            while (this.f25492Z < iD2) {
                int i28 = this.f25496b0;
                if (i28 == 0) {
                    int iMin = Math.min(i26, p18.C());
                    j10.I(bArrH, i27 + iMin, i26 - iMin);
                    if (iMin > 0) {
                        p18.L(bArrH, i27, iMin);
                    }
                    this.f25492Z += i26;
                    p19.G(0);
                    this.f25496b0 = p19.h();
                    P10 p110 = this.f25503f;
                    p110.G(0);
                    interfaceC5570w2.b(p110, 4);
                    this.f25494a0 += 4;
                } else {
                    int iY2 = y(j10, interfaceC5570w2, i28);
                    this.f25492Z += iY2;
                    this.f25494a0 += iY2;
                    this.f25496b0 -= iY2;
                }
            }
        }
        if ("A_VORBIS".equals(x10.f25103c)) {
            P10 p111 = this.f25509i;
            p111.G(0);
            interfaceC5570w2.b(p111, 4);
            this.f25494a0 += 4;
        }
        int i29 = this.f25494a0;
        v();
        return i29;
    }

    private final void v() {
        this.f25492Z = 0;
        this.f25494a0 = 0;
        this.f25496b0 = 0;
        this.f25498c0 = false;
        this.f25500d0 = false;
        this.f25502e0 = false;
        this.f25504f0 = 0;
        this.f25506g0 = (byte) 0;
        this.f25508h0 = false;
        this.f25513k.z(0);
    }

    private final void w(J1 j10, byte[] bArr, int i10) {
        int length = bArr.length;
        int i11 = length + i10;
        P10 p10 = this.f25514l;
        if (p10.I() < i11) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i11 + i10);
            p10.A(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, p10.H(), 0, length);
        }
        j10.I(p10.H(), length, i10);
        p10.G(0);
        p10.E(i11);
    }

    private static byte[] x(long j10, String str, long j11) {
        AbstractC2418Ss0.a(j10 != -9223372036854775807L);
        Locale locale = Locale.US;
        int i10 = (int) (j10 / 3600000000L);
        Integer numValueOf = Integer.valueOf(i10);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i11);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11)));
        String str3 = AbstractC4634ob0.f32117a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    private final int y(J1 j10, InterfaceC5570w2 interfaceC5570w2, int i10) {
        P10 p10 = this.f25513k;
        int iC = p10.C();
        if (iC <= 0) {
            return interfaceC5570w2.d(j10, i10, false);
        }
        int iMin = Math.min(i10, iC);
        interfaceC5570w2.b(p10, iMin);
        return iMin;
    }

    private final long z(long j10) throws C2817a9 {
        long j11 = this.f25521s;
        if (j11 != -9223372036854775807L) {
            return AbstractC4634ob0.P(j10, j11, 1000L, RoundingMode.DOWN);
        }
        throw C2817a9.b("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void d(long j10, long j11) {
        this.f25478L = -9223372036854775807L;
        int i10 = 0;
        this.f25480N = 0;
        this.f25512j0.b();
        this.f25493a.a();
        v();
        this.f25469C = false;
        this.f25470D = -9223372036854775807L;
        this.f25471E = -1;
        this.f25472F = -1L;
        this.f25473G = -1L;
        if (!this.f25527y) {
            this.f25468B.clear();
        }
        while (true) {
            SparseArray sparseArray = this.f25495b;
            if (i10 >= sparseArray.size()) {
                return;
            }
            C5696x2 c5696x2 = ((X3) sparseArray.valueAt(i10)).f25094V;
            if (c5696x2 != null) {
                c5696x2.a();
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final boolean e(J1 j10) {
        return new Z3().a(j10);
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void f(L1 l10) {
        if (this.f25499d) {
            l10 = new C5954z5(l10, this.f25501e);
        }
        this.f25510i0 = l10;
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final int g(J1 j10, C3933j2 c3933j2) {
        int i10 = 0;
        this.f25479M = false;
        while (!this.f25479M) {
            if (this.f25512j0.c(j10)) {
                long jZzn = j10.zzn();
                if (this.f25475I) {
                    this.f25477K = jZzn;
                    c3933j2.f30283a = this.f25476J;
                    this.f25475I = false;
                    return 1;
                }
                if (this.f25527y) {
                    long j11 = this.f25477K;
                    if (j11 != -1) {
                        c3933j2.f30283a = j11;
                        this.f25477K = -1L;
                        return 1;
                    }
                }
            } else {
                while (true) {
                    SparseArray sparseArray = this.f25495b;
                    if (i10 >= sparseArray.size()) {
                        return -1;
                    }
                    X3 x10 = (X3) sparseArray.valueAt(i10);
                    x10.b();
                    C5696x2 c5696x2 = x10.f25094V;
                    if (c5696x2 != null) {
                        c5696x2.d(x10.f25100a0, x10.f25112k);
                    }
                    i10++;
                }
            }
        }
        return 0;
    }

    protected final void h(int i10, long j10, long j11) throws C2817a9 {
        L1 l10 = this.f25510i0;
        l10.getClass();
        if (i10 == 160) {
            this.f25490X = false;
            this.f25491Y = 0L;
            return;
        }
        if (i10 == 174) {
            X3 x10 = new X3();
            this.f25526x = x10;
            x10.f25099a = this.f25524v;
            return;
        }
        if (i10 == 183) {
            if (this.f25527y) {
                return;
            }
            r(i10);
            this.f25471E = -1;
            this.f25472F = -1L;
            this.f25473G = -1L;
            return;
        }
        if (i10 == 187) {
            if (this.f25527y) {
                return;
            }
            r(i10);
            this.f25470D = -9223372036854775807L;
            return;
        }
        if (i10 == 19899) {
            this.f25528z = -1;
            this.f25467A = -1L;
            return;
        }
        if (i10 == 20533) {
            q(i10);
            this.f25526x.f25110i = true;
            return;
        }
        if (i10 == 21968) {
            q(i10);
            this.f25526x.f25127z = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f25520r;
            if (j12 != -1 && j12 != j10) {
                throw C2817a9.b("Multiple Segment elements not supported", null);
            }
            this.f25520r = j10;
            this.f25519q = j11;
            return;
        }
        if (i10 == 475249515) {
            if (this.f25527y) {
                return;
            }
            this.f25469C = true;
        } else if (i10 == 524531317 && !this.f25527y) {
            if (this.f25497c && this.f25476J != -1) {
                this.f25475I = true;
            } else {
                l10.o(new C4185l2(this.f25523u, 0L));
                this.f25527y = true;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:318:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x0116 A[EDGE_INSN: B:322:0x0116->B:55:0x0116 BREAK  A[LOOP:2: B:52:0x0103->B:66:0x0177], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0105  */
    /* JADX WARN: Code duplicated, block: B:56:0x011c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0126  */
    /* JADX WARN: Code duplicated, block: B:60:0x0156  */
    /* JADX WARN: Code duplicated, block: B:63:0x016d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0174  */
    /* JADX WARN: Code duplicated, block: B:69:0x0184  */
    /* JADX WARN: Code duplicated, block: B:72:0x0192  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c9  */
    protected final void i(int i10) throws C2817a9 {
        int i11;
        int i12;
        int i13;
        int i14;
        SparseArray sparseArray;
        X3 x10;
        long j10;
        long j11;
        long j12;
        long j13;
        List list;
        int iMin;
        double d10;
        int i15;
        int i16;
        int i17;
        SparseArray sparseArray2;
        long jC;
        V3 v10;
        int i18;
        long jD;
        long jD2;
        long jC2;
        long j14;
        long j15;
        double d11;
        V6 v11;
        C4439n3 c4439n3;
        V6 v6G;
        this.f25510i0.getClass();
        byte b10 = 8;
        long j16 = 0;
        int i19 = 2;
        int i20 = 0;
        if (i10 == 160) {
            if (this.f25480N == 2) {
                X3 x11 = (X3) this.f25495b.get(this.f25486T);
                x11.b();
                if (this.f25491Y > 0 && "A_OPUS".equals(x11.f25103c)) {
                    P10 p10 = this.f25517o;
                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f25491Y).array();
                    p10.A(bArrArray, bArrArray.length);
                }
                int i21 = 0;
                for (int i22 = 0; i22 < this.f25484R; i22++) {
                    i21 += this.f25485S[i22];
                }
                int i23 = 0;
                while (i23 < this.f25484R) {
                    long j17 = this.f25481O + ((long) ((x11.f25107f * i23) / 1000));
                    int i24 = this.f25488V;
                    if (i23 == 0) {
                        if (!this.f25490X) {
                            i24 |= 1;
                        }
                        i11 = 0;
                    } else {
                        i11 = i23;
                    }
                    int i25 = this.f25485S[i11];
                    int i26 = i21 - i25;
                    s(x11, j17, i24, i25, i26);
                    i23 = i11 + 1;
                    i21 = i26;
                }
                this.f25480N = 0;
                return;
            }
            return;
        }
        int i27 = 20;
        if (i10 == 174) {
            X3 x12 = this.f25526x;
            x12.getClass();
            String str = x12.f25103c;
            if (str == null) {
                throw C2817a9.b("CodecId is missing in TrackEntry element", null);
            }
            switch (str.hashCode()) {
                case -2095576542:
                    b10 = str.equals("V_MPEG4/ISO/AP") ? (byte) 6 : (byte) -1;
                    break;
                case -2095575984:
                    b10 = str.equals("V_MPEG4/ISO/SP") ? (byte) 4 : (byte) -1;
                    break;
                case -1985379776:
                    b10 = str.equals("A_MS/ACM") ? (byte) 23 : (byte) -1;
                    break;
                case -1784763192:
                    b10 = str.equals("A_TRUEHD") ? (byte) 18 : (byte) -1;
                    break;
                case -1730367663:
                    b10 = str.equals("A_VORBIS") ? (byte) 12 : (byte) -1;
                    break;
                case -1482641358:
                    b10 = str.equals("A_MPEG/L2") ? (byte) 14 : (byte) -1;
                    break;
                case -1482641357:
                    b10 = str.equals("A_MPEG/L3") ? (byte) 15 : (byte) -1;
                    break;
                case -1373388978:
                    b10 = str.equals("V_MS/VFW/FOURCC") ? (byte) 9 : (byte) -1;
                    break;
                case -933872740:
                    b10 = str.equals("S_DVBSUB") ? (byte) 33 : (byte) -1;
                    break;
                case -538363189:
                    b10 = str.equals("V_MPEG4/ISO/ASP") ? (byte) 5 : (byte) -1;
                    break;
                case -538363109:
                    b10 = str.equals("V_MPEG4/ISO/AVC") ? (byte) 7 : (byte) -1;
                    break;
                case -425012669:
                    b10 = str.equals("S_VOBSUB") ? (byte) 31 : (byte) -1;
                    break;
                case -356037306:
                    b10 = str.equals("A_DTS/LOSSLESS") ? (byte) 21 : (byte) -1;
                    break;
                case 62923557:
                    b10 = str.equals("A_AAC") ? (byte) 13 : (byte) -1;
                    break;
                case 62923603:
                    b10 = str.equals("A_AC3") ? (byte) 16 : (byte) -1;
                    break;
                case 62927045:
                    b10 = str.equals("A_DTS") ? (byte) 19 : (byte) -1;
                    break;
                case 82318131:
                    b10 = str.equals("V_AV1") ? (byte) 2 : (byte) -1;
                    break;
                case 82338133:
                    b10 = str.equals("V_VP8") ? (byte) 0 : (byte) -1;
                    break;
                case 82338134:
                    b10 = str.equals("V_VP9") ? (byte) 1 : (byte) -1;
                    break;
                case 99146302:
                    b10 = str.equals("S_HDMV/PGS") ? (byte) 32 : (byte) -1;
                    break;
                case 444813526:
                    b10 = str.equals("V_THEORA") ? (byte) 10 : (byte) -1;
                    break;
                case 542569478:
                    b10 = str.equals("A_DTS/EXPRESS") ? (byte) 20 : (byte) -1;
                    break;
                case 635596514:
                    b10 = str.equals("A_PCM/FLOAT/IEEE") ? (byte) 26 : (byte) -1;
                    break;
                case 725948237:
                    b10 = str.equals("A_PCM/INT/BIG") ? (byte) 25 : (byte) -1;
                    break;
                case 725957860:
                    b10 = str.equals("A_PCM/INT/LIT") ? (byte) 24 : (byte) -1;
                    break;
                case 738597099:
                    b10 = str.equals("S_TEXT/ASS") ? (byte) 28 : (byte) -1;
                    break;
                case 738614379:
                    b10 = str.equals("S_TEXT/SSA") ? (byte) 29 : (byte) -1;
                    break;
                case 855502857:
                    if (!str.equals("V_MPEGH/ISO/HEVC")) {
                        b10 = -1;
                    }
                    break;
                case 1045209816:
                    b10 = str.equals("S_TEXT/WEBVTT") ? (byte) 30 : (byte) -1;
                    break;
                case 1422270023:
                    b10 = str.equals("S_TEXT/UTF8") ? (byte) 27 : (byte) -1;
                    break;
                case 1809237540:
                    b10 = str.equals("V_MPEG2") ? (byte) 3 : (byte) -1;
                    break;
                case 1950749482:
                    b10 = str.equals("A_EAC3") ? (byte) 17 : (byte) -1;
                    break;
                case 1950789798:
                    b10 = str.equals("A_FLAC") ? (byte) 22 : (byte) -1;
                    break;
                case 1951062397:
                    b10 = str.equals("A_OPUS") ? (byte) 11 : (byte) -1;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
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
                    x12.a(x12.f25105d);
                    x12.f25100a0 = this.f25510i0.b(x12.f25105d, x12.f25106e);
                    this.f25495b.put(x12.f25105d, x12);
                    break;
            }
            this.f25526x = null;
            return;
        }
        long j18 = -9223372036854775807L;
        if (i10 == 183) {
            if (this.f25527y) {
                return;
            }
            r(i10);
            if (this.f25470D == -9223372036854775807L || (i12 = this.f25471E) == -1 || this.f25472F == -1) {
                return;
            }
            SparseArray sparseArray3 = this.f25468B;
            List arrayList = (List) sparseArray3.get(i12);
            if (arrayList == null) {
                arrayList = new ArrayList();
                sparseArray3.put(this.f25471E, arrayList);
            }
            arrayList.add(new V3(this.f25470D, this.f25520r + this.f25472F, this.f25473G, null));
            return;
        }
        if (i10 == 19899) {
            int i28 = this.f25528z;
            if (i28 != -1) {
                long j19 = this.f25467A;
                if (j19 != -1) {
                    if (i28 == 475249515) {
                        this.f25476J = j19;
                        return;
                    }
                    return;
                }
            }
            throw C2817a9.b("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i10 == 25152) {
            q(i10);
            X3 x13 = this.f25526x;
            if (x13.f25110i) {
                if (x13.f25112k == null) {
                    throw C2817a9.b("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                x13.f25114m = new IV0(null, new VT0(AbstractC2504Uj0.f24077a, null, MimeTypes.VIDEO_WEBM, this.f25526x.f25112k.f33975b));
                return;
            }
            return;
        }
        if (i10 == 28032) {
            q(i10);
            X3 x14 = this.f25526x;
            if (x14.f25110i && x14.f25111j != null) {
                throw C2817a9.b("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.f25521s == -9223372036854775807L) {
                this.f25521s = 1000000L;
            }
            long j20 = this.f25522t;
            if (j20 != -9223372036854775807L) {
                this.f25523u = z(j20);
                return;
            }
            return;
        }
        if (i10 == 374648427) {
            SparseArray sparseArray4 = this.f25495b;
            if (sparseArray4.size() == 0) {
                throw C2817a9.b("No valid tracks were found", null);
            }
            boolean z9 = !this.f25497c || this.f25476J == -1;
            int i29 = -1;
            int i30 = -1;
            int i31 = -1;
            int i32 = -1;
            for (int i33 = 0; i33 < sparseArray4.size(); i33++) {
                X3 x15 = (X3) sparseArray4.valueAt(i33);
                int i34 = x15.f25106e;
                if (i34 == 2) {
                    if (x15.f25097Y) {
                        i29 = x15.f25105d;
                    }
                    if (i30 == -1) {
                        i30 = x15.f25105d;
                    }
                } else if (i34 == 1) {
                    if (x15.f25097Y) {
                        i31 = x15.f25105d;
                    }
                    if (i32 == -1) {
                        i32 = x15.f25105d;
                    }
                }
                if (z9) {
                    x15.b();
                    if (!x15.f25095W) {
                        InterfaceC5570w2 interfaceC5570w2 = x15.f25100a0;
                        JY0 jy0 = x15.f25102b0;
                        jy0.getClass();
                        interfaceC5570w2.f(jy0);
                    }
                }
            }
            if (i29 != -1) {
                this.f25474H = i29;
            } else if (i30 != -1) {
                this.f25474H = i30;
            } else if (i31 != -1) {
                this.f25474H = i31;
            } else if (i32 != -1) {
                this.f25474H = i32;
            } else {
                this.f25474H = sparseArray4.size() > 0 ? ((X3) sparseArray4.valueAt(0)).f25105d : -1;
            }
            if (z9) {
                c();
                return;
            }
            return;
        }
        if (i10 != 475249515 || this.f25527y) {
            return;
        }
        int i35 = 0;
        while (true) {
            SparseArray sparseArray5 = this.f25468B;
            if (i35 < sparseArray5.size()) {
                if (((List) sparseArray5.valueAt(i35)).isEmpty()) {
                    i35++;
                } else {
                    if (this.f25523u != -9223372036854775807L) {
                        for (int i36 = 0; i36 < sparseArray5.size(); i36++) {
                            Collections.sort((List) sparseArray5.valueAt(i36));
                        }
                        i13 = -1;
                        this.f25510i0.o(new W3(sparseArray5, this.f25523u, this.f25474H, this.f25520r, this.f25519q));
                    }
                    this.f25527y = true;
                    this.f25469C = false;
                    i14 = 0;
                    while (true) {
                        sparseArray = this.f25495b;
                        if (i14 < sparseArray.size()) {
                            c();
                            return;
                        }
                        x10 = (X3) sparseArray.valueAt(i14);
                        j10 = this.f25523u;
                        j11 = this.f25520r;
                        j12 = j16;
                        j13 = this.f25519q;
                        if (x10.f25106e == i19 || (list = (List) sparseArray5.get(x10.f25105d)) == null || list.isEmpty()) {
                            i17 = i14;
                            sparseArray2 = sparseArray5;
                            i15 = i20;
                        } else {
                            if (list.isEmpty()) {
                                i17 = i14;
                                sparseArray2 = sparseArray5;
                                i15 = i20;
                            } else {
                                iMin = Math.min(list.size(), i27);
                                d10 = 0.0d;
                                i15 = i20;
                                i16 = i13;
                                while (i20 < iMin) {
                                    v10 = (V3) list.get(i20);
                                    if (v10.c() > 10000000) {
                                        break;
                                    }
                                    i18 = i20 + 1;
                                    if (i20 < list.size() - 1) {
                                        V3 v12 = (V3) list.get(i18);
                                        jD = v12.d() + v12.e();
                                        jD2 = v10.d() + v10.e();
                                        jC2 = v12.c() - v10.c();
                                    } else {
                                        jD = j11 + j13;
                                        jD2 = v10.d() + v10.e();
                                        jC2 = j10 - v10.c();
                                    }
                                    j14 = jD - jD2;
                                    int i37 = i14;
                                    SparseArray sparseArray6 = sparseArray5;
                                    long j21 = j13;
                                    j15 = jC2;
                                    if (j15 > j12) {
                                        d11 = j14 / j15;
                                        if (d11 > d10) {
                                            d10 = d11;
                                            i16 = i20;
                                        }
                                    }
                                    i20 = i18;
                                    sparseArray5 = sparseArray6;
                                    i14 = i37;
                                    j13 = j21;
                                }
                                i17 = i14;
                                sparseArray2 = sparseArray5;
                                if (i16 == i13) {
                                    jC = ((V3) list.get(i16)).c();
                                }
                                if (jC != j18) {
                                    JY0 jy1 = x10.f25102b0;
                                    jy1.getClass();
                                    v11 = jy1.f19926l;
                                    c4439n3 = new C4439n3(jC);
                                    if (v11 == null) {
                                        InterfaceC5326u6[] interfaceC5326u6Arr = new InterfaceC5326u6[1];
                                        interfaceC5326u6Arr[i15] = c4439n3;
                                        v6G = new V6(j18, interfaceC5326u6Arr);
                                    } else {
                                        InterfaceC5326u6[] interfaceC5326u6Arr2 = new InterfaceC5326u6[1];
                                        interfaceC5326u6Arr2[i15] = c4439n3;
                                        v6G = v11.g(interfaceC5326u6Arr2);
                                    }
                                    C5507vX0 c5507vX0A = x10.f25102b0.a();
                                    c5507vX0A.j0(v6G);
                                    x10.f25102b0 = c5507vX0A.m();
                                }
                            }
                            jC = j18;
                            if (jC != j18) {
                                JY0 jy2 = x10.f25102b0;
                                jy2.getClass();
                                v11 = jy2.f19926l;
                                c4439n3 = new C4439n3(jC);
                                if (v11 == null) {
                                    InterfaceC5326u6[] interfaceC5326u6Arr3 = new InterfaceC5326u6[1];
                                    interfaceC5326u6Arr3[i15] = c4439n3;
                                    v6G = new V6(j18, interfaceC5326u6Arr3);
                                } else {
                                    InterfaceC5326u6[] interfaceC5326u6Arr4 = new InterfaceC5326u6[1];
                                    interfaceC5326u6Arr4[i15] = c4439n3;
                                    v6G = v11.g(interfaceC5326u6Arr4);
                                }
                                C5507vX0 c5507vX0A2 = x10.f25102b0.a();
                                c5507vX0A2.j0(v6G);
                                x10.f25102b0 = c5507vX0A2.m();
                            }
                        }
                        if (!x10.f25095W) {
                            x10.b();
                            InterfaceC5570w2 interfaceC5570w3 = x10.f25100a0;
                            JY0 jy3 = x10.f25102b0;
                            jy3.getClass();
                            interfaceC5570w3.f(jy3);
                        }
                        i14 = i17 + 1;
                        sparseArray5 = sparseArray2;
                        j16 = j12;
                        i20 = i15;
                        i19 = 2;
                        i27 = 20;
                        j18 = -9223372036854775807L;
                        i13 = -1;
                    }
                }
            }
            i13 = -1;
            this.f25510i0.o(new C4185l2(this.f25523u, 0L));
            this.f25527y = true;
            this.f25469C = false;
            i14 = 0;
            while (true) {
                sparseArray = this.f25495b;
                if (i14 < sparseArray.size()) {
                    c();
                    return;
                }
                x10 = (X3) sparseArray.valueAt(i14);
                j10 = this.f25523u;
                j11 = this.f25520r;
                j12 = j16;
                j13 = this.f25519q;
                if (x10.f25106e == i19) {
                    i17 = i14;
                    sparseArray2 = sparseArray5;
                    i15 = i20;
                } else {
                    if (list.isEmpty()) {
                        i17 = i14;
                        sparseArray2 = sparseArray5;
                        i15 = i20;
                    } else {
                        iMin = Math.min(list.size(), i27);
                        d10 = 0.0d;
                        i15 = i20;
                        i16 = i13;
                        while (i20 < iMin) {
                            v10 = (V3) list.get(i20);
                            if (v10.c() > 10000000) {
                                break;
                                break;
                            }
                            i18 = i20 + 1;
                            if (i20 < list.size() - 1) {
                                V3 v13 = (V3) list.get(i18);
                                jD = v13.d() + v13.e();
                                jD2 = v10.d() + v10.e();
                                jC2 = v13.c() - v10.c();
                            } else {
                                jD = j11 + j13;
                                jD2 = v10.d() + v10.e();
                                jC2 = j10 - v10.c();
                            }
                            j14 = jD - jD2;
                            int i38 = i14;
                            SparseArray sparseArray7 = sparseArray5;
                            long j22 = j13;
                            j15 = jC2;
                            if (j15 > j12) {
                                d11 = j14 / j15;
                                if (d11 > d10) {
                                    d10 = d11;
                                    i16 = i20;
                                }
                            }
                            i20 = i18;
                            sparseArray5 = sparseArray7;
                            i14 = i38;
                            j13 = j22;
                        }
                        i17 = i14;
                        sparseArray2 = sparseArray5;
                        if (i16 == i13) {
                            jC = ((V3) list.get(i16)).c();
                        }
                        if (jC != j18) {
                            JY0 jy4 = x10.f25102b0;
                            jy4.getClass();
                            v11 = jy4.f19926l;
                            c4439n3 = new C4439n3(jC);
                            if (v11 == null) {
                                InterfaceC5326u6[] interfaceC5326u6Arr5 = new InterfaceC5326u6[1];
                                interfaceC5326u6Arr5[i15] = c4439n3;
                                v6G = new V6(j18, interfaceC5326u6Arr5);
                            } else {
                                InterfaceC5326u6[] interfaceC5326u6Arr6 = new InterfaceC5326u6[1];
                                interfaceC5326u6Arr6[i15] = c4439n3;
                                v6G = v11.g(interfaceC5326u6Arr6);
                            }
                            C5507vX0 c5507vX0A3 = x10.f25102b0.a();
                            c5507vX0A3.j0(v6G);
                            x10.f25102b0 = c5507vX0A3.m();
                        }
                    }
                    jC = j18;
                    if (jC != j18) {
                        JY0 jy5 = x10.f25102b0;
                        jy5.getClass();
                        v11 = jy5.f19926l;
                        c4439n3 = new C4439n3(jC);
                        if (v11 == null) {
                            InterfaceC5326u6[] interfaceC5326u6Arr7 = new InterfaceC5326u6[1];
                            interfaceC5326u6Arr7[i15] = c4439n3;
                            v6G = new V6(j18, interfaceC5326u6Arr7);
                        } else {
                            InterfaceC5326u6[] interfaceC5326u6Arr8 = new InterfaceC5326u6[1];
                            interfaceC5326u6Arr8[i15] = c4439n3;
                            v6G = v11.g(interfaceC5326u6Arr8);
                        }
                        C5507vX0 c5507vX0A4 = x10.f25102b0.a();
                        c5507vX0A4.j0(v6G);
                        x10.f25102b0 = c5507vX0A4.m();
                    }
                }
                if (!x10.f25095W) {
                    x10.b();
                    InterfaceC5570w2 interfaceC5570w4 = x10.f25100a0;
                    JY0 jy6 = x10.f25102b0;
                    jy6.getClass();
                    interfaceC5570w4.f(jy6);
                }
                i14 = i17 + 1;
                sparseArray5 = sparseArray2;
                j16 = j12;
                i20 = i15;
                i19 = 2;
                i27 = 20;
                j18 = -9223372036854775807L;
                i13 = -1;
            }
        }
    }

    protected final void j(int i10, long j10) throws C2817a9 {
        boolean z9;
        if (i10 == 240) {
            if (this.f25527y) {
                return;
            }
            r(i10);
            if (this.f25473G == -1) {
                this.f25473G = j10;
                return;
            }
            return;
        }
        if (i10 == 241) {
            if (this.f25527y) {
                return;
            }
            r(i10);
            if (this.f25472F == -1) {
                this.f25472F = j10;
                return;
            }
            return;
        }
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j10).length() + 35);
            sb.append("ContentEncodingOrder ");
            sb.append(j10);
            sb.append(" not supported");
            throw C2817a9.b(sb.toString(), null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 35);
            sb2.append("ContentEncodingScope ");
            sb2.append(j10);
            sb2.append(" not supported");
            throw C2817a9.b(sb2.toString(), null);
        }
        switch (i10) {
            case 131:
                int i11 = (int) j10;
                if (i11 == 1) {
                    q(i10);
                    this.f25526x.f25106e = 2;
                    return;
                }
                if (i11 == 2) {
                    q(i10);
                    this.f25526x.f25106e = 1;
                    return;
                } else if (i11 == 17) {
                    q(i10);
                    this.f25526x.f25106e = 3;
                    return;
                } else if (i11 != 33) {
                    q(i10);
                    this.f25526x.f25106e = -1;
                    return;
                } else {
                    q(i10);
                    this.f25526x.f25106e = 5;
                    return;
                }
            case 136:
                z9 = j10 == 1;
                q(i10);
                this.f25526x.f25097Y = z9;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                this.f25482P = z(j10);
                return;
            case 159:
                q(i10);
                this.f25526x.f25089Q = (int) j10;
                return;
            case 176:
                q(i10);
                this.f25526x.f25115n = (int) j10;
                return;
            case 179:
                if (this.f25527y) {
                    return;
                }
                r(i10);
                this.f25470D = z(j10);
                return;
            case 186:
                q(i10);
                this.f25526x.f25116o = (int) j10;
                return;
            case 215:
                q(i10);
                this.f25526x.f25105d = (int) j10;
                return;
            case 231:
                this.f25478L = z(j10);
                return;
            case 238:
                this.f25489W = (int) j10;
                return;
            case 247:
                if (this.f25527y) {
                    return;
                }
                r(i10);
                this.f25471E = (int) j10;
                return;
            case 251:
                this.f25490X = true;
                return;
            case 16871:
                q(i10);
                this.f25526x.d((int) j10);
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(j10).length() + 30);
                sb3.append("ContentCompAlgo ");
                sb3.append(j10);
                sb3.append(" not supported");
                throw C2817a9.b(sb3.toString(), null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j10).length() + 33);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j10);
                    sb4.append(" not supported");
                    throw C2817a9.b(sb4.toString(), null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(j10).length() + 30);
                sb5.append("EBMLReadVersion ");
                sb5.append(j10);
                sb5.append(" not supported");
                throw C2817a9.b(sb5.toString(), null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j10).length() + 29);
                sb6.append("ContentEncAlgo ");
                sb6.append(j10);
                sb6.append(" not supported");
                throw C2817a9.b(sb6.toString(), null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j10).length() + 36);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j10);
                sb7.append(" not supported");
                throw C2817a9.b(sb7.toString(), null);
            case 21420:
                this.f25467A = j10 + this.f25520r;
                return;
            case 21432:
                int i12 = (int) j10;
                q(i10);
                if (i12 == 0) {
                    this.f25526x.f25126y = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f25526x.f25126y = 2;
                    return;
                } else if (i12 == 3) {
                    this.f25526x.f25126y = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    this.f25526x.f25126y = 3;
                    return;
                }
            case 21680:
                q(i10);
                this.f25526x.f25118q = (int) j10;
                return;
            case 21682:
                q(i10);
                this.f25526x.f25120s = (int) j10;
                return;
            case 21690:
                q(i10);
                this.f25526x.f25119r = (int) j10;
                return;
            case 21930:
                z9 = j10 == 1;
                q(i10);
                this.f25526x.f25096X = z9;
                return;
            case 21938:
                q(i10);
                X3 x10 = this.f25526x;
                x10.f25127z = true;
                x10.f25117p = (int) j10;
                return;
            case 21998:
                q(i10);
                this.f25526x.f25108g = (int) j10;
                return;
            case 22186:
                q(i10);
                this.f25526x.f25092T = j10;
                return;
            case 22203:
                q(i10);
                this.f25526x.f25093U = j10;
                return;
            case 25188:
                q(i10);
                this.f25526x.f25090R = (int) j10;
                return;
            case 30114:
                this.f25491Y = j10;
                return;
            case 30321:
                int i13 = (int) j10;
                q(i10);
                if (i13 == 0) {
                    this.f25526x.f25121t = 0;
                    return;
                }
                if (i13 == 1) {
                    this.f25526x.f25121t = 1;
                    return;
                } else if (i13 == 2) {
                    this.f25526x.f25121t = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.f25526x.f25121t = 3;
                    return;
                }
            case 2352003:
                q(i10);
                this.f25526x.f25107f = (int) j10;
                return;
            case 2807729:
                this.f25521s = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        int i14 = (int) j10;
                        q(i10);
                        if (i14 == 1) {
                            this.f25526x.f25075C = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            this.f25526x.f25075C = 1;
                            return;
                        }
                    case 21946:
                        q(i10);
                        int iC = C3470fL0.c((int) j10);
                        if (iC != -1) {
                            this.f25526x.f25074B = iC;
                            return;
                        }
                        return;
                    case 21947:
                        q(i10);
                        this.f25526x.f25127z = true;
                        int iB = C3470fL0.b((int) j10);
                        if (iB != -1) {
                            this.f25526x.f25073A = iB;
                            return;
                        }
                        return;
                    case 21948:
                        q(i10);
                        this.f25526x.f25076D = (int) j10;
                        return;
                    case 21949:
                        q(i10);
                        this.f25526x.f25077E = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    protected final void k(int i10, double d10) throws C2817a9 {
        if (i10 == 181) {
            q(i10);
            this.f25526x.f25091S = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.f25522t = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                q(i10);
                this.f25526x.f25078F = (float) d10;
                break;
            case 21970:
                q(i10);
                this.f25526x.f25079G = (float) d10;
                break;
            case 21971:
                q(i10);
                this.f25526x.f25080H = (float) d10;
                break;
            case 21972:
                q(i10);
                this.f25526x.f25081I = (float) d10;
                break;
            case 21973:
                q(i10);
                this.f25526x.f25082J = (float) d10;
                break;
            case 21974:
                q(i10);
                this.f25526x.f25083K = (float) d10;
                break;
            case 21975:
                q(i10);
                this.f25526x.f25084L = (float) d10;
                break;
            case 21976:
                q(i10);
                this.f25526x.f25085M = (float) d10;
                break;
            case 21977:
                q(i10);
                this.f25526x.f25086N = (float) d10;
                break;
            case 21978:
                q(i10);
                this.f25526x.f25087O = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        q(i10);
                        this.f25526x.f25122u = (float) d10;
                        break;
                    case 30324:
                        q(i10);
                        this.f25526x.f25123v = (float) d10;
                        break;
                    case 30325:
                        q(i10);
                        this.f25526x.f25124w = (float) d10;
                        break;
                }
                break;
        }
    }

    protected final void l(int i10, String str) throws C2817a9 {
        if (i10 == 134) {
            q(i10);
            this.f25526x.f25103c = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                q(i10);
                this.f25526x.f25101b = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                q(i10);
                this.f25526x.e(str);
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.f25524v = Objects.equals(str, "webm");
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append("DocType ");
        sb.append(str);
        sb.append(" not supported");
        throw C2817a9.b(sb.toString(), null);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x02af  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:114:0x02be  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c0 A[PHI: r1
      0x02c0: PHI (r1v14 int) = (r1v0 int), (r1v20 int) binds: [B:109:0x02ad, B:114:0x02be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:116:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c7  */
    protected final void m(int i10, int i11, J1 j10) throws C2817a9 {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j11;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = i10;
        int i24 = 2;
        int i25 = 1;
        int i26 = 0;
        if (i23 != 161 && i23 != 163) {
            if (i23 == 165) {
                if (this.f25480N != 2) {
                    return;
                }
                X3 x10 = (X3) this.f25495b.get(this.f25486T);
                if (this.f25489W != 4 || !"V_VP9".equals(x10.f25103c)) {
                    j10.n(i11);
                    return;
                }
                P10 p10 = this.f25517o;
                p10.z(i11);
                j10.I(p10.H(), 0, i11);
                return;
            }
            if (i23 == 16877) {
                q(i10);
                X3 x11 = this.f25526x;
                if (x11.c() != 1685485123 && x11.c() != 1685480259) {
                    j10.n(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                x11.f25088P = bArr;
                j10.I(bArr, 0, i11);
                return;
            }
            if (i23 == 16981) {
                q(i10);
                byte[] bArr2 = new byte[i11];
                this.f25526x.f25111j = bArr2;
                j10.I(bArr2, 0, i11);
                return;
            }
            if (i23 == 18402) {
                byte[] bArr3 = new byte[i11];
                j10.I(bArr3, 0, i11);
                q(i10);
                this.f25526x.f25112k = new C5444v2(1, bArr3, 0, 0);
                return;
            }
            if (i23 == 21419) {
                P10 p11 = this.f25511j;
                Arrays.fill(p11.H(), (byte) 0);
                j10.I(p11.H(), 4 - i11, i11);
                p11.G(0);
                this.f25528z = (int) p11.Y();
                return;
            }
            if (i23 == 25506) {
                q(i10);
                byte[] bArr4 = new byte[i11];
                this.f25526x.f25113l = bArr4;
                j10.I(bArr4, 0, i11);
                return;
            }
            if (i23 != 30322) {
                StringBuilder sb = new StringBuilder(String.valueOf(i23).length() + 15);
                sb.append("Unexpected id: ");
                sb.append(i23);
                throw C2817a9.b(sb.toString(), null);
            }
            q(i10);
            byte[] bArr5 = new byte[i11];
            this.f25526x.f25125x = bArr5;
            j10.I(bArr5, 0, i11);
            return;
        }
        int i27 = 8;
        if (this.f25480N == 0) {
            C2807a4 c2807a4 = this.f25493a;
            this.f25486T = (int) c2807a4.b(j10, false, true, 8);
            this.f25487U = c2807a4.c();
            this.f25482P = -9223372036854775807L;
            this.f25480N = 1;
            this.f25507h.z(0);
        }
        X3 x12 = (X3) this.f25495b.get(this.f25486T);
        if (x12 == null) {
            j10.n(i11 - this.f25487U);
            this.f25480N = 0;
            return;
        }
        x12.b();
        if (this.f25480N == 1) {
            t(j10, 3);
            P10 p12 = this.f25507h;
            int i28 = (p12.H()[2] & 6) >> 1;
            if (i28 == 0) {
                this.f25484R = 1;
                int[] iArrA = a(this.f25485S, 1);
                this.f25485S = iArrA;
                iArrA[0] = (i11 - this.f25487U) - 3;
            } else {
                t(j10, 4);
                int i29 = (p12.H()[3] & 255) + 1;
                this.f25484R = i29;
                int[] iArrA2 = a(this.f25485S, i29);
                this.f25485S = iArrA2;
                if (i28 == 2) {
                    int i30 = (i11 - this.f25487U) - 4;
                    int i31 = this.f25484R;
                    Arrays.fill(iArrA2, 0, i31, i30 / i31);
                } else {
                    if (i28 == 1) {
                        int i32 = 0;
                        int i33 = 0;
                        int i34 = 4;
                        while (true) {
                            i19 = this.f25484R - 1;
                            if (i32 >= i19) {
                                break;
                            }
                            this.f25485S[i32] = 0;
                            while (true) {
                                i20 = i34 + 1;
                                t(j10, i20);
                                int i35 = p12.H()[i34] & 255;
                                int[] iArr = this.f25485S;
                                i21 = iArr[i32] + i35;
                                iArr[i32] = i21;
                                if (i35 != 255) {
                                    break;
                                } else {
                                    i34 = i20;
                                }
                            }
                            i33 += i21;
                            i32++;
                            i34 = i20;
                        }
                        this.f25485S[i19] = ((i11 - this.f25487U) - i34) - i33;
                    } else {
                        if (i28 != 3) {
                            throw C2817a9.b("Unexpected lacing value: 2", null);
                        }
                        int i36 = 0;
                        int i37 = 0;
                        int i38 = 4;
                        while (true) {
                            int i39 = this.f25484R - 1;
                            if (i36 >= i39) {
                                i13 = i24;
                                i14 = i25;
                                i15 = i26;
                                this.f25485S[i39] = ((i11 - this.f25487U) - i38) - i37;
                                break;
                            }
                            this.f25485S[i36] = i26;
                            int i40 = i38 + 1;
                            t(j10, i40);
                            if (p12.H()[i38] == 0) {
                                throw C2817a9.b("No valid varint length mask found", null);
                            }
                            int i41 = i26;
                            while (true) {
                                if (i26 >= i27) {
                                    i16 = i24;
                                    i17 = i25;
                                    i18 = i27;
                                    j11 = 0;
                                    break;
                                }
                                i18 = i27;
                                int i42 = i25 << (7 - i26);
                                if ((p12.H()[i38] & i42) != 0) {
                                    i40 += i26;
                                    t(j10, i40);
                                    int i43 = i38 + 1;
                                    int i44 = p12.H()[i38] & 255 & (~i42);
                                    int i45 = i24;
                                    j11 = i44;
                                    i16 = i45;
                                    int i46 = i43;
                                    while (i46 < i40) {
                                        j11 = (j11 << i18) | ((long) (p12.H()[i46] & 255));
                                        i25 = i25;
                                        i46++;
                                        i26 = i26;
                                    }
                                    i17 = i25;
                                    int i47 = i26;
                                    if (i36 <= 0) {
                                        break;
                                    }
                                    j11 -= (1 << ((i47 * 7) + 6)) - 1;
                                    break;
                                }
                                i26++;
                                i27 = i18;
                            }
                            if (j11 < -2147483648L || j11 > 2147483647L) {
                                throw C2817a9.b("EBML lacing sample size out of range.", null);
                            }
                            int[] iArr2 = this.f25485S;
                            int i48 = (int) j11;
                            if (i36 != 0) {
                                i48 += iArr2[i36 - 1];
                            }
                            iArr2[i36] = i48;
                            i37 += i48;
                            i36++;
                            i38 = i40;
                            i26 = i41;
                            i24 = i16;
                            i27 = i18;
                            i25 = i17;
                        }
                    }
                    this.f25481O = this.f25478L + z((p12.H()[i15] << 8) | (p12.H()[i14] & 255));
                    if (x12.f25106e == i14) {
                        i22 = 1;
                    } else if (i23 == 163) {
                        i22 = i15;
                    } else if ((p12.H()[i13] & 128) == 128) {
                        i23 = 163;
                        i22 = 1;
                    } else {
                        i22 = i15;
                        i23 = 163;
                    }
                    this.f25488V = i22;
                    this.f25480N = i13;
                    this.f25483Q = i15;
                    i12 = 163;
                }
            }
            i13 = 2;
            i14 = 1;
            i15 = 0;
            this.f25481O = this.f25478L + z((p12.H()[i15] << 8) | (p12.H()[i14] & 255));
            if (x12.f25106e == i14) {
                i22 = 1;
            } else if (i23 == 163) {
                i22 = i15;
            } else if ((p12.H()[i13] & 128) == 128) {
                i23 = 163;
                i22 = 1;
            } else {
                i22 = i15;
                i23 = 163;
            }
            this.f25488V = i22;
            this.f25480N = i13;
            this.f25483Q = i15;
            i12 = 163;
        } else {
            i12 = 163;
        }
        if (i23 == i12) {
            while (true) {
                int i49 = this.f25483Q;
                if (i49 >= this.f25484R) {
                    this.f25480N = 0;
                    return;
                }
                int iU = u(j10, x12, this.f25485S[i49], false);
                X3 x13 = x12;
                s(x13, this.f25481O + ((long) ((this.f25483Q * x12.f25107f) / 1000)), this.f25488V, iU, 0);
                this.f25483Q++;
                x12 = x13;
            }
        } else {
            while (true) {
                int i50 = this.f25483Q;
                if (i50 >= this.f25484R) {
                    return;
                }
                int[] iArr3 = this.f25485S;
                iArr3[i50] = u(j10, x12, iArr3[i50], true);
                this.f25483Q++;
            }
        }
    }

    Y3(R3 r10, int i10, InterfaceC5576w5 interfaceC5576w5) {
        this.f25520r = -1L;
        this.f25521s = -9223372036854775807L;
        this.f25522t = -9223372036854775807L;
        this.f25523u = -9223372036854775807L;
        this.f25470D = -9223372036854775807L;
        this.f25471E = -1;
        this.f25472F = -1L;
        this.f25473G = -1L;
        this.f25474H = -1;
        this.f25476J = -1L;
        this.f25477K = -1L;
        this.f25478L = -9223372036854775807L;
        this.f25512j0 = r10;
        r10.a(new T3(this, null));
        this.f25501e = interfaceC5576w5;
        this.f25468B = new SparseArray();
        this.f25497c = 1 == ((i10 & 1) ^ 1);
        this.f25499d = (i10 & 2) == 0;
        this.f25493a = new C2807a4();
        this.f25495b = new SparseArray();
        this.f25507h = new P10(4);
        this.f25509i = new P10(ByteBuffer.allocate(4).putInt(-1).array());
        this.f25511j = new P10(4);
        this.f25503f = new P10(AbstractC4034jq0.f30572a);
        this.f25505g = new P10(4);
        this.f25513k = new P10();
        this.f25514l = new P10();
        this.f25515m = new P10(8);
        this.f25516n = new P10();
        this.f25517o = new P10();
        this.f25485S = new int[1];
        this.f25525w = true;
    }

    public Y3(InterfaceC5576w5 interfaceC5576w5, int i10) {
        this(new R3(), 0, interfaceC5576w5);
    }
}
