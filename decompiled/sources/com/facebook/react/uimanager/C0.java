package com.facebook.react.uimanager;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class C0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f15318e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f15319f = {1, 2, 4, 8, 16, 32, 64, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, 2048};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f15320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f15321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f15323d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b() {
            return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
        }

        private a() {
        }
    }

    public C0(float f10, float[] spacing) {
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        this.f15320a = f10;
        this.f15321b = spacing;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x000c  */
    public final float a(int i10) {
        float f10;
        if (i10 != 4 && i10 != 5) {
            switch (i10) {
                case 9:
                case 10:
                case 11:
                    f10 = Float.NaN;
                    break;
                default:
                    f10 = this.f15320a;
                    break;
            }
        } else {
            f10 = Float.NaN;
        }
        int i11 = this.f15322c;
        if (i11 != 0) {
            int[] iArr = f15319f;
            if ((iArr[i10] & i11) != 0) {
                return this.f15321b[i10];
            }
            if (this.f15323d) {
                char c10 = (i10 == 1 || i10 == 3) ? (char) 7 : (char) 6;
                if ((iArr[c10] & i11) != 0) {
                    return this.f15321b[c10];
                }
                if ((i11 & iArr[8]) != 0) {
                    return this.f15321b[8];
                }
            }
        }
        return f10;
    }

    public final float b(int i10) {
        return this.f15321b[i10];
    }

    public final boolean c(int i10, float f10) {
        int i11;
        if (L.a(this.f15321b[i10], f10)) {
            return false;
        }
        this.f15321b[i10] = f10;
        if (com.facebook.yoga.g.a(f10)) {
            i11 = (~f15319f[i10]) & this.f15322c;
        } else {
            i11 = f15319f[i10] | this.f15322c;
        }
        this.f15322c = i11;
        int[] iArr = f15319f;
        this.f15323d = ((iArr[8] & i11) == 0 && (iArr[7] & i11) == 0 && (iArr[6] & i11) == 0 && (i11 & iArr[9]) == 0) ? false : true;
        return true;
    }

    public C0() {
        this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f15318e.b());
    }

    public C0(float f10) {
        this(f10, f15318e.b());
    }
}
