package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f16204b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static e f16205c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p074h3.a f16206a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            e eVar = e.f16205c;
            if (eVar != null) {
                return eVar;
            }
            e eVar2 = new e(p074h3.a.f44757c.c(), null);
            e.f16205c = eVar2;
            return eVar2;
        }

        private a() {
        }
    }

    public /* synthetic */ e(p074h3.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public static final e c() {
        return f16204b.a();
    }

    public final Typeface d(String fontFamilyName, int i10, AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        return this.f16206a.d(fontFamilyName, i10, assetManager);
    }

    private e(p074h3.a aVar) {
        this.f16206a = aVar;
    }
}
