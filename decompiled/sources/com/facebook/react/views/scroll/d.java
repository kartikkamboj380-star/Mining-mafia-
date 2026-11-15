package com.facebook.react.views.scroll;

import android.os.SystemClock;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f15993f = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f15996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f15997d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f15994a = LinearLayoutManager.INVALID_OFFSET;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15995b = LinearLayoutManager.INVALID_OFFSET;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f15998e = -11;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final float a() {
        return this.f15996c;
    }

    public final float b() {
        return this.f15997d;
    }

    public final boolean c(int i10, int i11) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.f15998e;
        boolean z9 = (jUptimeMillis - j10 <= 10 && this.f15994a == i10 && this.f15995b == i11) ? false : true;
        if (jUptimeMillis - j10 != 0) {
            this.f15996c = (i10 - this.f15994a) / (jUptimeMillis - j10);
            this.f15997d = (i11 - this.f15995b) / (jUptimeMillis - j10);
        }
        this.f15998e = jUptimeMillis;
        this.f15994a = i10;
        this.f15995b = i11;
        return z9;
    }
}
