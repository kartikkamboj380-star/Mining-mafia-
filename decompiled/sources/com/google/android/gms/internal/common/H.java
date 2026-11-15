package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f36208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f36209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F f36210c;

    private H(F f10, boolean z9, A a10, int i10) {
        this.f36210c = f10;
        this.f36209b = z9;
        this.f36208a = a10;
    }

    public static H a(A a10) {
        return new H(new F(a10), false, z.f36235b, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public final H b() {
        return new H(this.f36210c, true, this.f36208a, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public final Iterable c(CharSequence charSequence) {
        return new E(this, charSequence);
    }

    public final List d(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itA = this.f36210c.a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (itA.hasNext()) {
            arrayList.add((String) itA.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    final /* synthetic */ Iterator e(CharSequence charSequence) {
        return this.f36210c.a(this, charSequence);
    }

    final /* synthetic */ A f() {
        return this.f36208a;
    }

    final /* synthetic */ boolean g() {
        return this.f36209b;
    }
}
