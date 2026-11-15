package com.google.android.gms.ads;

import H4.C0609j1;
import L4.p;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C0609j1 f16811a;

    protected a() {
        C0609j1 c0609j1 = new C0609j1();
        this.f16811a = c0609j1;
        c0609j1.j("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public a a(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
            StringBuilder sb = new StringBuilder(str2.length() + 108);
            sb.append("Value ");
            sb.append(str2);
            sb.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
            p.f(sb.toString());
        }
        this.f16811a.q(str, str2);
        return e();
    }

    public a b(String str, List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
                    StringBuilder sb = new StringBuilder(str2.length() + 108);
                    sb.append("Value ");
                    sb.append(str2);
                    sb.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
                    p.f(sb.toString());
                }
            }
            this.f16811a.q(str, TextUtils.join(",", list));
        }
        return e();
    }

    public a c(String str) {
        this.f16811a.g(str);
        return e();
    }

    public a d(Class cls, Bundle bundle) {
        C0609j1 c0609j1 = this.f16811a;
        c0609j1.i(cls, bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            c0609j1.k("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return e();
    }

    protected abstract a e();

    public a f(String str) {
        this.f16811a.t(str);
        return e();
    }

    public a g(String str) {
        Preconditions.checkNotNull(str, "Content URL must be non-null.");
        Preconditions.checkNotEmpty(str, "Content URL must be non-empty.");
        int length = str.length();
        Preconditions.checkArgument(length <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING), Integer.valueOf(str.length()));
        this.f16811a.l(str);
        return e();
    }

    public a h(List list) {
        if (list == null) {
            p.f("neighboring content URLs list should not be null");
            return e();
        }
        this.f16811a.m(list);
        return e();
    }

    public a i(String str) {
        this.f16811a.o(str);
        return e();
    }

    public final a j(Bundle bundle) {
        this.f16811a.h(bundle);
        return e();
    }

    public final a k(String str) {
        this.f16811a.j(str);
        return e();
    }

    public final a l(boolean z9) {
        this.f16811a.p(z9);
        return e();
    }

    public final a m(boolean z9) {
        this.f16811a.s(z9);
        return e();
    }
}
