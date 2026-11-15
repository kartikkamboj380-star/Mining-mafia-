package N4;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;

/* JADX INFO: renamed from: N4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0822d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bundle f3655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bundle f3656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f3657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f3658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f3659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f3660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f3661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f3662i;

    public AbstractC0822d(Context context, String str, Bundle bundle, Bundle bundle2, boolean z9, Location location, int i10, int i11, String str2, String str3) {
        this.f3654a = str;
        this.f3655b = bundle;
        this.f3656c = bundle2;
        this.f3657d = context;
        this.f3658e = z9;
        this.f3659f = i10;
        this.f3660g = i11;
        this.f3661h = str2;
        this.f3662i = str3;
    }

    public String a() {
        return this.f3654a;
    }

    public Context b() {
        return this.f3657d;
    }

    public Bundle c() {
        return this.f3655b;
    }

    public String d() {
        return this.f3662i;
    }
}
