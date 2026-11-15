package com.facebook.react.views.text;

import android.text.Spannable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f16236k = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Spannable f16237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f16239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f16240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f16241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f16242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f16243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f16244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f16245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f16246j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a(Spannable text, int i10, int i11, int i12, int i13) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new l(text, i10, false, i11, i12, i13);
        }

        private a() {
        }
    }

    public l(Spannable text, int i10, boolean z9, float f10, float f11, float f12, float f13, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f16237a = text;
        this.f16238b = i10;
        this.f16239c = z9;
        this.f16240d = f10;
        this.f16241e = f11;
        this.f16242f = f12;
        this.f16243g = f13;
        this.f16244h = i11;
        this.f16245i = i12;
        this.f16246j = i13;
    }

    public final boolean a() {
        return this.f16239c;
    }

    public final int b() {
        return this.f16238b;
    }

    public final int c() {
        return this.f16246j;
    }

    public final float d() {
        return this.f16243g;
    }

    public final float e() {
        return this.f16240d;
    }

    public final float f() {
        return this.f16242f;
    }

    public final float g() {
        return this.f16241e;
    }

    public final Spannable h() {
        return this.f16237a;
    }

    public final int i() {
        return this.f16244h;
    }

    public final int j() {
        return this.f16245i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Spannable text, int i10, boolean z9, int i11, int i12, int i13) {
        this(text, i10, z9, -1.0f, -1.0f, -1.0f, -1.0f, i11, i12, i13);
        Intrinsics.checkNotNullParameter(text, "text");
    }
}
