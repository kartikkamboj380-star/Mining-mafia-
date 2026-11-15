package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ht0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3790ht0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3664gt0 f29127a;

    private C3790ht0(InterfaceC3664gt0 interfaceC3664gt0) {
        AbstractC1743Fs0 abstractC1743Fs0 = C1691Es0.f18579b;
        this.f29127a = interfaceC3664gt0;
    }

    public static C3790ht0 a(final AbstractC1743Fs0 abstractC1743Fs0) {
        return new C3790ht0(new InterfaceC3664gt0() { // from class: com.google.android.gms.internal.ads.et0
            @Override // com.google.android.gms.internal.ads.InterfaceC3664gt0
            public final /* synthetic */ Iterator a(C3790ht0 c3790ht0, CharSequence charSequence) {
                return new C2730Ys0(c3790ht0, charSequence, abstractC1743Fs0);
            }
        });
    }

    public static C3790ht0 b(Pattern pattern) {
        final C2003Ks0 c2003Ks0 = new C2003Ks0(pattern);
        AbstractC2418Ss0.f(!((C1951Js0) c2003Ks0.a("")).f20013a.matches(), "The pattern may not match the empty string: %s", c2003Ks0);
        return new C3790ht0(new InterfaceC3664gt0() { // from class: com.google.android.gms.internal.ads.ct0
            @Override // com.google.android.gms.internal.ads.InterfaceC3664gt0
            public final /* synthetic */ Iterator a(C3790ht0 c3790ht0, CharSequence charSequence) {
                return new C2782Zs0(c3790ht0, charSequence, c2003Ks0.a(charSequence));
            }
        });
    }

    public static C3790ht0 c(int i10) {
        final int i11 = 4000;
        return new C3790ht0(new InterfaceC3664gt0(i11) { // from class: com.google.android.gms.internal.ads.dt0
            @Override // com.google.android.gms.internal.ads.InterfaceC3664gt0
            public final /* synthetic */ Iterator a(C3790ht0 c3790ht0, CharSequence charSequence) {
                return new C2910at0(c3790ht0, charSequence, 4000);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Iterator f(CharSequence charSequence) {
        return this.f29127a.a(this, charSequence);
    }

    public final Iterable d(CharSequence charSequence) {
        charSequence.getClass();
        return new C3036bt0(this, charSequence);
    }

    public final List e(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itF = f(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itF.hasNext()) {
            arrayList.add((String) itF.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
