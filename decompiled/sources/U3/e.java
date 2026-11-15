package U3;

import android.content.Context;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.W;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private W f5916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private W f5917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private W f5918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private W f5919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private W f5920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private W f5921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private W f5922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private W f5923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private W f5924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private W f5925j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private W f5926k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private W f5927l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private W f5928m;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5929a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.BORDER_RADIUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BORDER_TOP_LEFT_RADIUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.BORDER_TOP_RIGHT_RADIUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.BORDER_BOTTOM_LEFT_RADIUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.BORDER_BOTTOM_RIGHT_RADIUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d.BORDER_TOP_START_RADIUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d.BORDER_TOP_END_RADIUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[d.BORDER_BOTTOM_START_RADIUS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[d.BORDER_BOTTOM_END_RADIUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[d.BORDER_START_START_RADIUS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[d.BORDER_START_END_RADIUS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[d.BORDER_END_START_RADIUS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[d.BORDER_END_END_RADIUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f5929a = iArr;
        }
    }

    public e() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    private final k a(l lVar, l lVar2, l lVar3, l lVar4, float f10, float f11) {
        float fB = lVar.b() + lVar3.b();
        float fA = lVar.a() + lVar2.a();
        float fB2 = lVar2.b() + lVar4.b();
        float fA2 = lVar3.a() + lVar4.a();
        float fMin = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float fMin2 = fB > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.min(f11 / fB, 1.0f) : 0.0f;
        float fMin3 = fA > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.min(f10 / fA, 1.0f) : 0.0f;
        float fMin4 = fB2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.min(f11 / fB2, 1.0f) : 0.0f;
        if (fA2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fMin = Math.min(f10 / fA2, 1.0f);
        }
        return new k(new l(lVar.a() * Math.min(fMin3, fMin2), lVar.b() * Math.min(fMin3, fMin2)), new l(lVar2.a() * Math.min(fMin4, fMin3), lVar2.b() * Math.min(fMin4, fMin3)), new l(lVar3.a() * Math.min(fMin, fMin2), lVar3.b() * Math.min(fMin, fMin2)), new l(lVar4.a() * Math.min(fMin, fMin4), lVar4.b() * Math.min(fMin, fMin4)));
    }

    public final W b(d property) {
        Intrinsics.checkNotNullParameter(property, "property");
        switch (a.f5929a[property.ordinal()]) {
            case 1:
                return this.f5916a;
            case 2:
                return this.f5917b;
            case 3:
                return this.f5918c;
            case 4:
                return this.f5919d;
            case 5:
                return this.f5920e;
            case 6:
                return this.f5921f;
            case 7:
                return this.f5922g;
            case 8:
                return this.f5923h;
            case 9:
                return this.f5924i;
            case 10:
                return this.f5925j;
            case 11:
                return this.f5926k;
            case 12:
                return this.f5927l;
            case 13:
                return this.f5928m;
            default:
                throw new p129m8.k();
        }
    }

    public final boolean c() {
        return (this.f5916a == null && this.f5917b == null && this.f5918c == null && this.f5919d == null && this.f5920e == null && this.f5921f == null && this.f5922g == null && this.f5923h == null && this.f5924i == null && this.f5925j == null && this.f5926k == null && this.f5927l == null && this.f5928m == null) ? false : true;
    }

    public final k d(int i10, Context context, float f10, float f11) {
        Intrinsics.checkNotNullParameter(context, "context");
        l lVar = new l(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (i10 == 0) {
            W w10 = this.f5925j;
            if (w10 == null && (w10 = this.f5921f) == null && (w10 = this.f5917b) == null) {
                w10 = this.f5916a;
            }
            l lVar2 = w10 != null ? new l(w10, f10, f11) : lVar;
            W w11 = this.f5927l;
            if (w11 == null && (w11 = this.f5922g) == null && (w11 = this.f5918c) == null) {
                w11 = this.f5916a;
            }
            l lVar3 = w11 != null ? new l(w11, f10, f11) : lVar;
            W w12 = this.f5926k;
            if (w12 == null && (w12 = this.f5923h) == null && (w12 = this.f5919d) == null) {
                w12 = this.f5916a;
            }
            l lVar4 = w12 != null ? new l(w12, f10, f11) : lVar;
            W w13 = this.f5928m;
            if (w13 == null && (w13 = this.f5924i) == null && (w13 = this.f5920e) == null) {
                w13 = this.f5916a;
            }
            if (w13 != null) {
                lVar = new l(w13, f10, f11);
            }
            return a(lVar2, lVar3, lVar4, lVar, f10, f11);
        }
        if (i10 != 1) {
            throw new IllegalArgumentException("Expected?.resolved layout direction");
        }
        if (com.facebook.react.modules.i18nmanager.a.f14969a.a().d(context)) {
            W w14 = this.f5927l;
            if (w14 == null && (w14 = this.f5922g) == null && (w14 = this.f5918c) == null) {
                w14 = this.f5916a;
            }
            l lVar5 = w14 != null ? new l(w14, f10, f11) : lVar;
            W w15 = this.f5925j;
            if (w15 == null && (w15 = this.f5921f) == null && (w15 = this.f5917b) == null) {
                w15 = this.f5916a;
            }
            l lVar6 = w15 != null ? new l(w15, f10, f11) : lVar;
            W w16 = this.f5928m;
            if (w16 == null && (w16 = this.f5924i) == null && (w16 = this.f5920e) == null) {
                w16 = this.f5916a;
            }
            l lVar7 = w16 != null ? new l(w16, f10, f11) : lVar;
            W w17 = this.f5926k;
            if (w17 == null && (w17 = this.f5923h) == null && (w17 = this.f5919d) == null) {
                w17 = this.f5916a;
            }
            if (w17 != null) {
                lVar = new l(w17, f10, f11);
            }
            return a(lVar5, lVar6, lVar7, lVar, f10, f11);
        }
        W w18 = this.f5927l;
        if (w18 == null && (w18 = this.f5922g) == null && (w18 = this.f5917b) == null) {
            w18 = this.f5916a;
        }
        l lVar8 = w18 != null ? new l(w18, f10, f11) : lVar;
        W w19 = this.f5925j;
        if (w19 == null && (w19 = this.f5921f) == null && (w19 = this.f5918c) == null) {
            w19 = this.f5916a;
        }
        l lVar9 = w19 != null ? new l(w19, f10, f11) : lVar;
        W w20 = this.f5928m;
        if (w20 == null && (w20 = this.f5923h) == null && (w20 = this.f5919d) == null) {
            w20 = this.f5916a;
        }
        l lVar10 = w20 != null ? new l(w20, f10, f11) : lVar;
        W w21 = this.f5926k;
        if (w21 == null && (w21 = this.f5924i) == null && (w21 = this.f5920e) == null) {
            w21 = this.f5916a;
        }
        if (w21 != null) {
            lVar = new l(w21, f10, f11);
        }
        return a(lVar8, lVar9, lVar10, lVar, f10, f11);
    }

    public final void e(d property, W w10) {
        Intrinsics.checkNotNullParameter(property, "property");
        switch (a.f5929a[property.ordinal()]) {
            case 1:
                this.f5916a = w10;
                return;
            case 2:
                this.f5917b = w10;
                return;
            case 3:
                this.f5918c = w10;
                return;
            case 4:
                this.f5919d = w10;
                return;
            case 5:
                this.f5920e = w10;
                return;
            case 6:
                this.f5921f = w10;
                return;
            case 7:
                this.f5922g = w10;
                return;
            case 8:
                this.f5923h = w10;
                return;
            case 9:
                this.f5924i = w10;
                return;
            case 10:
                this.f5925j = w10;
                return;
            case 11:
                this.f5926k = w10;
                return;
            case 12:
                this.f5927l = w10;
                return;
            case 13:
                this.f5928m = w10;
                return;
            default:
                throw new p129m8.k();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.b(this.f5916a, eVar.f5916a) && Intrinsics.b(this.f5917b, eVar.f5917b) && Intrinsics.b(this.f5918c, eVar.f5918c) && Intrinsics.b(this.f5919d, eVar.f5919d) && Intrinsics.b(this.f5920e, eVar.f5920e) && Intrinsics.b(this.f5921f, eVar.f5921f) && Intrinsics.b(this.f5922g, eVar.f5922g) && Intrinsics.b(this.f5923h, eVar.f5923h) && Intrinsics.b(this.f5924i, eVar.f5924i) && Intrinsics.b(this.f5925j, eVar.f5925j) && Intrinsics.b(this.f5926k, eVar.f5926k) && Intrinsics.b(this.f5927l, eVar.f5927l) && Intrinsics.b(this.f5928m, eVar.f5928m);
    }

    public int hashCode() {
        W w10 = this.f5916a;
        int iHashCode = (w10 == null ? 0 : w10.hashCode()) * 31;
        W w11 = this.f5917b;
        int iHashCode2 = (iHashCode + (w11 == null ? 0 : w11.hashCode())) * 31;
        W w12 = this.f5918c;
        int iHashCode3 = (iHashCode2 + (w12 == null ? 0 : w12.hashCode())) * 31;
        W w13 = this.f5919d;
        int iHashCode4 = (iHashCode3 + (w13 == null ? 0 : w13.hashCode())) * 31;
        W w14 = this.f5920e;
        int iHashCode5 = (iHashCode4 + (w14 == null ? 0 : w14.hashCode())) * 31;
        W w15 = this.f5921f;
        int iHashCode6 = (iHashCode5 + (w15 == null ? 0 : w15.hashCode())) * 31;
        W w16 = this.f5922g;
        int iHashCode7 = (iHashCode6 + (w16 == null ? 0 : w16.hashCode())) * 31;
        W w17 = this.f5923h;
        int iHashCode8 = (iHashCode7 + (w17 == null ? 0 : w17.hashCode())) * 31;
        W w18 = this.f5924i;
        int iHashCode9 = (iHashCode8 + (w18 == null ? 0 : w18.hashCode())) * 31;
        W w19 = this.f5925j;
        int iHashCode10 = (iHashCode9 + (w19 == null ? 0 : w19.hashCode())) * 31;
        W w20 = this.f5926k;
        int iHashCode11 = (iHashCode10 + (w20 == null ? 0 : w20.hashCode())) * 31;
        W w21 = this.f5927l;
        int iHashCode12 = (iHashCode11 + (w21 == null ? 0 : w21.hashCode())) * 31;
        W w22 = this.f5928m;
        return iHashCode12 + (w22 != null ? w22.hashCode() : 0);
    }

    public String toString() {
        return "BorderRadiusStyle(uniform=" + this.f5916a + ", topLeft=" + this.f5917b + ", topRight=" + this.f5918c + ", bottomLeft=" + this.f5919d + ", bottomRight=" + this.f5920e + ", topStart=" + this.f5921f + ", topEnd=" + this.f5922g + ", bottomStart=" + this.f5923h + ", bottomEnd=" + this.f5924i + ", startStart=" + this.f5925j + ", startEnd=" + this.f5926k + ", endStart=" + this.f5927l + ", endEnd=" + this.f5928m + ")";
    }

    public e(W w10, W w11, W w12, W w13, W w14, W w15, W w16, W w17, W w18, W w19, W w20, W w21, W w22) {
        this.f5916a = w10;
        this.f5917b = w11;
        this.f5918c = w12;
        this.f5919d = w13;
        this.f5920e = w14;
        this.f5921f = w15;
        this.f5922g = w16;
        this.f5923h = w17;
        this.f5924i = w18;
        this.f5925j = w19;
        this.f5926k = w20;
        this.f5927l = w21;
        this.f5928m = w22;
    }

    public /* synthetic */ e(W w10, W w11, W w12, W w13, W w14, W w15, W w16, W w17, W w18, W w19, W w20, W w21, W w22, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : w10, (i10 & 2) != 0 ? null : w11, (i10 & 4) != 0 ? null : w12, (i10 & 8) != 0 ? null : w13, (i10 & 16) != 0 ? null : w14, (i10 & 32) != 0 ? null : w15, (i10 & 64) != 0 ? null : w16, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : w17, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : w18, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : w19, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : w20, (i10 & 2048) != 0 ? null : w21, (i10 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 ? null : w22);
    }
}
