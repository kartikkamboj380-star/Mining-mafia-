package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class JY0 {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ int f19899P = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f19900A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final float f19901B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final byte[] f19902C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f19903D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C3470fL0 f19904E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f19905F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f19906G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f19907H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f19908I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f19909J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f19910K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f19911L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f19912M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int f19913N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f19914O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f19917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19922h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19923i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f19924j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f19925k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final V6 f19926l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f19927m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f19928n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f19929o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f19930p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f19931q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f19932r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final IV0 f19933s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f19934t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f19935u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f19936v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f19937w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f19938x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f19939y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f19940z;

    static {
        new JY0(new C5507vX0());
        String str = AbstractC4634ob0.f32117a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(35, 36);
        Integer.toString(36, 36);
    }

    /* synthetic */ JY0(C5507vX0 c5507vX0, byte[] bArr) {
        this(c5507vX0);
    }

    public static String e(JY0 jy0) {
        String str;
        int i10;
        int i11;
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(jy0.f19915a);
        sb.append(", mimeType=");
        sb.append(jy0.f19929o);
        String str2 = jy0.f19928n;
        if (str2 != null) {
            sb.append(", container=");
            sb.append(str2);
        }
        int i12 = jy0.f19924j;
        if (i12 != -1) {
            sb.append(", bitrate=");
            sb.append(i12);
        }
        String str3 = jy0.f19925k;
        if (str3 != null) {
            sb.append(", codecs=");
            sb.append(str3);
        }
        IV0 iv0 = jy0.f19933s;
        if (iv0 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i13 = 0; i13 < iv0.f19566d; i13++) {
                UUID uuid = iv0.a(i13).f24293b;
                if (uuid.equals(AbstractC2504Uj0.f24078b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(AbstractC2504Uj0.f24079c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(AbstractC2504Uj0.f24081e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(AbstractC2504Uj0.f24080d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(AbstractC2504Uj0.f24077a)) {
                    linkedHashSet.add(GatewayException.GATEWAY_RESPONSE_DEPTH_UNIVERSAL);
                } else {
                    String string = uuid.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 10);
                    sb2.append("unknown (");
                    sb2.append(string);
                    sb2.append(")");
                    linkedHashSet.add(sb2.toString());
                }
            }
            sb.append(", drm=[");
            AbstractC2054Ls0.b(sb, linkedHashSet, ",");
            sb.append(']');
        }
        int i14 = jy0.f19936v;
        if (i14 != -1 && (i11 = jy0.f19937w) != -1) {
            sb.append(", res=");
            sb.append(i14);
            sb.append("x");
            sb.append(i11);
        }
        int i15 = jy0.f19938x;
        if (i15 != -1 && (i10 = jy0.f19939y) != -1) {
            sb.append(", decRes=");
            sb.append(i15);
            sb.append("x");
            sb.append(i10);
        }
        float f10 = jy0.f19901B;
        int i16 = AbstractC4046jw0.f30593a;
        double d10 = f10;
        if (Math.copySign((-1.0d) + d10, 1.0d) > 0.001d && d10 != 1.0d && (!Double.isNaN(d10) || !Double.isNaN(1.0d))) {
            sb.append(", par=");
            Object[] objArr = {Float.valueOf(f10)};
            String str4 = AbstractC4634ob0.f32117a;
            sb.append(String.format(Locale.US, "%.3f", objArr));
        }
        C3470fL0 c3470fL0 = jy0.f19904E;
        if (c3470fL0 != null && (c3470fL0.e() || c3470fL0.f())) {
            sb.append(", color=");
            sb.append(c3470fL0.g());
        }
        float f11 = jy0.f19940z;
        if (f11 != -1.0f) {
            sb.append(", fps=");
            sb.append(f11);
        }
        int i17 = jy0.f19905F;
        if (i17 != -1) {
            sb.append(", maxSubLayers=");
            sb.append(i17);
        }
        int i18 = jy0.f19906G;
        if (i18 != -1) {
            sb.append(", channels=");
            sb.append(i18);
        }
        int i19 = jy0.f19907H;
        if (i19 != -1) {
            sb.append(", sample_rate=");
            sb.append(i19);
        }
        String str5 = jy0.f19918d;
        if (str5 != null) {
            sb.append(", language=");
            sb.append(str5);
        }
        List list = jy0.f19917c;
        if (!list.isEmpty()) {
            sb.append(", labels=[");
            AbstractC2054Ls0.b(sb, AbstractC2786Zu0.c(list, YX0.f25630a), ",");
            sb.append("]");
        }
        int i20 = jy0.f19919e;
        if (i20 != 0) {
            sb.append(", selectionFlags=[");
            String str6 = AbstractC4634ob0.f32117a;
            ArrayList arrayList = new ArrayList();
            if ((i20 & 1) != 0) {
                arrayList.add(BuildConfig.FLAVOR);
            }
            if ((i20 & 2) != 0) {
                arrayList.add("forced");
            }
            AbstractC2054Ls0.b(sb, arrayList, ",");
            sb.append("]");
        }
        int i21 = jy0.f19920f;
        if (i21 != 0) {
            sb.append(", roleFlags=[");
            int i22 = i21 & 32768;
            String str7 = AbstractC4634ob0.f32117a;
            ArrayList arrayList2 = new ArrayList();
            if ((i21 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i21 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i21 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i21 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i21 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i21 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i21 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i21 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i21 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                arrayList2.add("sign");
            }
            if ((i21 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i21 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i21 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i21 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i21 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i21 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if (i22 != 0) {
                arrayList2.add("auxiliary");
            }
            AbstractC2054Ls0.b(sb, arrayList2, ",");
            sb.append("]");
        }
        if ((i21 & 32768) != 0) {
            sb.append(", auxiliaryTrackType=");
            int i23 = jy0.f19921g;
            String str8 = AbstractC4634ob0.f32117a;
            if (i23 == 0) {
                str = "undefined";
            } else if (i23 == 1) {
                str = "original";
            } else if (i23 == 2) {
                str = "depth-linear";
            } else if (i23 == 3) {
                str = "depth-inverse";
            } else {
                if (i23 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final C5507vX0 a() {
        return new C5507vX0(this, null);
    }

    public final JY0 b(int i10) {
        C5507vX0 c5507vX0 = new C5507vX0(this, null);
        c5507vX0.l(i10);
        return new JY0(c5507vX0);
    }

    public final int c() {
        int i10;
        int i11 = this.f19936v;
        if (i11 == -1 || (i10 = this.f19937w) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final boolean d(JY0 jy0) {
        List list = this.f19932r;
        int size = list.size();
        List list2 = jy0.f19932r;
        if (size != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && JY0.class == obj.getClass()) {
            JY0 jy0 = (JY0) obj;
            int i11 = this.f19914O;
            if ((i11 == 0 || (i10 = jy0.f19914O) == 0 || i11 == i10) && this.f19919e == jy0.f19919e && this.f19920f == jy0.f19920f && this.f19921g == jy0.f19921g && this.f19922h == jy0.f19922h && this.f19923i == jy0.f19923i && this.f19930p == jy0.f19930p && this.f19934t == jy0.f19934t && this.f19936v == jy0.f19936v && this.f19937w == jy0.f19937w && this.f19938x == jy0.f19938x && this.f19939y == jy0.f19939y && this.f19900A == jy0.f19900A && this.f19903D == jy0.f19903D && this.f19905F == jy0.f19905F && this.f19906G == jy0.f19906G && this.f19907H == jy0.f19907H && this.f19908I == jy0.f19908I && this.f19909J == jy0.f19909J && this.f19910K == jy0.f19910K && this.f19911L == jy0.f19911L && this.f19913N == jy0.f19913N && Float.compare(this.f19940z, jy0.f19940z) == 0 && Float.compare(this.f19901B, jy0.f19901B) == 0 && Objects.equals(this.f19915a, jy0.f19915a) && Objects.equals(this.f19916b, jy0.f19916b) && this.f19917c.equals(jy0.f19917c) && Objects.equals(this.f19925k, jy0.f19925k) && Objects.equals(this.f19928n, jy0.f19928n) && Objects.equals(this.f19929o, jy0.f19929o) && Objects.equals(this.f19918d, jy0.f19918d) && Arrays.equals(this.f19902C, jy0.f19902C) && Objects.equals(this.f19926l, jy0.f19926l) && Objects.equals(this.f19904E, jy0.f19904E) && Objects.equals(this.f19933s, jy0.f19933s) && d(jy0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f19914O;
        if (i10 != 0) {
            return i10;
        }
        String str = this.f19915a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f19916b;
        int iHashCode2 = ((((iHashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f19917c.hashCode();
        String str3 = this.f19918d;
        int iHashCode3 = ((((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f19919e) * 31) + this.f19920f) * 31) + this.f19921g) * 31) + this.f19922h) * 31) + this.f19923i) * 31;
        String str4 = this.f19925k;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        V6 v10 = this.f19926l;
        int iHashCode5 = iHashCode4 + (v10 == null ? 0 : v10.hashCode());
        String str5 = this.f19928n;
        int iHashCode6 = ((iHashCode5 * 961) + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f19929o;
        int iHashCode7 = ((((((((((((((((((((((((((((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f19930p) * 31) + ((int) this.f19934t)) * 31) + this.f19936v) * 31) + this.f19937w) * 31) + this.f19938x) * 31) + this.f19939y) * 31) + Float.floatToIntBits(this.f19940z)) * 31) + this.f19900A) * 31) + Float.floatToIntBits(this.f19901B)) * 31) + this.f19903D) * 31) + this.f19905F) * 31) + this.f19906G) * 31) + this.f19907H) * 31) + this.f19908I) * 31) + this.f19909J) * 31) + this.f19910K) * 31) + this.f19911L) * 31) - 1) * 31) - 1) * 31) + this.f19913N;
        this.f19914O = iHashCode7;
        return iHashCode7;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f19904E);
        String str = this.f19915a;
        int length = String.valueOf(str).length();
        String str2 = this.f19916b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f19928n;
        int length3 = String.valueOf(str3).length();
        String str4 = this.f19929o;
        int length4 = String.valueOf(str4).length();
        String str5 = this.f19925k;
        int length5 = String.valueOf(str5).length();
        int i10 = this.f19924j;
        int length6 = String.valueOf(i10).length();
        String str6 = this.f19918d;
        int length7 = String.valueOf(str6).length();
        int i11 = this.f19936v;
        int length8 = String.valueOf(i11).length();
        int i12 = this.f19937w;
        int length9 = String.valueOf(i12).length();
        float f10 = this.f19940z;
        int length10 = String.valueOf(f10).length();
        int length11 = strValueOf.length();
        int i13 = this.f19906G;
        int length12 = String.valueOf(i13).length();
        int i14 = this.f19907H;
        StringBuilder sb = new StringBuilder(length + 9 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2 + length6 + 2 + length7 + 3 + length8 + 2 + length9 + 2 + length10 + 2 + length11 + 4 + length12 + 2 + String.valueOf(i14).length() + 2);
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i10);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i11);
        sb.append(", ");
        sb.append(i12);
        sb.append(", ");
        sb.append(f10);
        sb.append(", ");
        sb.append(strValueOf);
        sb.append("], [");
        sb.append(i13);
        sb.append(", ");
        sb.append(i14);
        sb.append("])");
        return sb.toString();
    }

    private JY0(C5507vX0 c5507vX0) {
        boolean z9;
        String str;
        this.f19915a = c5507vX0.n();
        String strD = AbstractC4634ob0.D(c5507vX0.q());
        this.f19918d = strD;
        if (c5507vX0.p().isEmpty() && c5507vX0.o() != null) {
            this.f19917c = AbstractC5931yu0.m(new MZ0(strD, c5507vX0.o()));
            this.f19916b = c5507vX0.o();
        } else if (c5507vX0.p().isEmpty() || c5507vX0.o() != null) {
            if (!c5507vX0.p().isEmpty() || c5507vX0.o() != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= c5507vX0.p().size()) {
                        z9 = false;
                        break;
                    } else {
                        if (((MZ0) c5507vX0.p().get(i10)).f20865b.equals(c5507vX0.o())) {
                            z9 = true;
                            break;
                        }
                        i10++;
                    }
                }
            } else {
                z9 = true;
                break;
            }
            AbstractC2418Ss0.i(z9);
            this.f19917c = c5507vX0.p();
            this.f19916b = c5507vX0.o();
        } else {
            this.f19917c = c5507vX0.p();
            List listP = c5507vX0.p();
            Iterator it = listP.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((MZ0) listP.get(0)).f20865b;
                    break;
                }
                MZ0 mz0 = (MZ0) it.next();
                if (TextUtils.equals(mz0.f20864a, strD)) {
                    str = mz0.f20865b;
                    break;
                }
            }
            this.f19916b = str;
        }
        this.f19919e = c5507vX0.r();
        AbstractC2418Ss0.j(c5507vX0.t() == 0 || (c5507vX0.s() & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f19920f = c5507vX0.s();
        this.f19921g = c5507vX0.t();
        int iU = c5507vX0.u();
        this.f19922h = iU;
        int iV = c5507vX0.v();
        this.f19923i = iV;
        this.f19924j = iV != -1 ? iV : iU;
        this.f19925k = c5507vX0.w();
        this.f19926l = c5507vX0.x();
        this.f19927m = null;
        this.f19928n = c5507vX0.y();
        this.f19929o = c5507vX0.z();
        this.f19930p = c5507vX0.B();
        this.f19931q = c5507vX0.C();
        this.f19932r = c5507vX0.D() == null ? Collections.EMPTY_LIST : c5507vX0.D();
        IV0 iv0E = c5507vX0.E();
        this.f19933s = iv0E;
        this.f19934t = c5507vX0.F();
        this.f19935u = c5507vX0.G();
        this.f19936v = c5507vX0.H();
        this.f19937w = c5507vX0.I();
        this.f19938x = c5507vX0.J();
        this.f19939y = c5507vX0.K();
        this.f19940z = c5507vX0.L();
        this.f19900A = c5507vX0.M() == -1 ? 0 : c5507vX0.M();
        this.f19901B = c5507vX0.N() == -1.0f ? 1.0f : c5507vX0.N();
        this.f19902C = c5507vX0.O();
        this.f19903D = c5507vX0.P();
        this.f19904E = c5507vX0.Q();
        this.f19905F = c5507vX0.R();
        this.f19906G = c5507vX0.S();
        this.f19907H = c5507vX0.T();
        this.f19908I = c5507vX0.U();
        this.f19909J = c5507vX0.V() == -1 ? 0 : c5507vX0.V();
        this.f19910K = c5507vX0.W() != -1 ? c5507vX0.W() : 0;
        this.f19911L = c5507vX0.X();
        this.f19912M = c5507vX0.Y();
        if (c5507vX0.Z() != 0 || iv0E == null) {
            this.f19913N = c5507vX0.Z();
        } else {
            this.f19913N = 1;
        }
    }
}
