package com.google.android.gms.ads.nativead;

import B4.l;
import B4.o;
import B4.u;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeAd {

    public static abstract class a {
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected Map f16880a;

        public abstract Drawable a();

        public abstract double b();

        public abstract Uri c();
    }

    public interface c {
        void a(NativeAd nativeAd);
    }

    public abstract void a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract b f();

    public abstract List g();

    public abstract l h();

    public abstract String i();

    public abstract u j();

    public abstract Double k();

    public abstract String l();

    public abstract void m(o oVar);

    protected abstract Object n();

    @KeepForSdk
    protected abstract void recordEvent(@NonNull Bundle bundle);
}
