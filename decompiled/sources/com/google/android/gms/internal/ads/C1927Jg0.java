package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1927Jg0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f19967b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f19968a = new ArrayList();

    public final List a() {
        return this.f19968a;
    }

    public final void b(View view, EnumC4644og0 enumC4644og0, String str) {
        C1875Ig0 c1875Ig0;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!f19967b.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        List list = this.f19968a;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                c1875Ig0 = null;
                break;
            }
            c1875Ig0 = (C1875Ig0) it.next();
        } while (c1875Ig0.a().get() != view);
        if (c1875Ig0 == null) {
            list.add(new C1875Ig0(view, enumC4644og0, "Ad overlay"));
        }
    }

    public final void c() {
        this.f19968a.clear();
    }
}
