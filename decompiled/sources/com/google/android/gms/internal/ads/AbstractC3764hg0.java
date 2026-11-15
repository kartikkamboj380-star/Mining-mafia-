package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.UUID;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3764hg0 {
    public static AbstractC3764hg0 e(C3889ig0 c3889ig0, C4014jg0 c4014jg0) {
        AbstractC3640gh0.a();
        return new C4266lg0(c3889ig0, c4014jg0, UUID.randomUUID().toString());
    }

    public abstract void a();

    public abstract void b(View view);

    public abstract void c();

    public abstract void d(View view, EnumC4644og0 enumC4644og0, String str);
}
